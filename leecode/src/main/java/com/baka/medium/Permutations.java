package com.baka.medium;
//く__,.ヘヽ.　　　　/　,ー､ 〉
//        　　　　　＼ ', !-─‐-i　/　/´
//        　　　 　 ／｀ｰ'　　　 L/／｀ヽ､
//        　　 　 /　 ／,　 /|　 ,　 ,　　　 ',     ？？？？？？？？
//        　　　ｲ 　/ /-‐/　ｉ　L_ ﾊ ヽ!　 i       ？BUG哪来的呢？
//        　　　 ﾚ ﾍ 7ｲ｀ﾄ　 ﾚ'ｧ-ﾄ､!ハ|　 |         ？？？？？？？   
//        　　　　 !,/7 '0'　　 ´0iソ| 　 |　　　
//        　　　　 |.从"　　_　　 ,,,, / |./ 　 |
//        　　　　 ﾚ'| i＞.､,,__　_,.イ / 　.i 　|
//        　　　　　 ﾚ'| | / k_７_/ﾚ'ヽ,　ﾊ.　|
//        　　　　　　 | |/i 〈|/　 i　,.ﾍ |　i　|
//        　　　　　　.|/ /　ｉ： 　 ﾍ!　　＼　|
//        　　　 　 　 kヽ>､ﾊ 　 _,.ﾍ､ 　 /､!
//        　　　　　　 !'〈//｀Ｔ´', ＼ ｀'7'ｰr'
//        　　　　　　 ﾚ'ヽL__|___i,___,ンﾚ|ノ
//        　　　　　 　　　ﾄ-,/　|___./
//        　　　　　 　　　'ｰ'　　!_,.:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: design
 * @Package: com.baka.medium
 * @ClassName: Permutations
 * @Description: 给定一个没有重复数字的序列，返回其所有可能的全排列。
 * @Author: 唐朝
 * @CreateDate: 2019/1/9 20:32
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/1/9 20:32
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        //字典序法需要按照顺序执行排列
        if (nums.length ==1 ) {
            List<List<Integer>> list = new ArrayList<>();
            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(nums[0]);
            list.add(list1);
            return list;
        }
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        while (true) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int num : nums) {
                arrayList.add(num);
            }
            list.add(arrayList);
            int j;
            int index=0;
            for (j = nums.length-2; j >=0 ; j--) {
                if (nums[j]<nums[j+1]){
                    index=j;
                    //从右开始找到第一个非递增的数
                    break;

                }else if (j == 0) {
                    return list;
                }
            }
            for (j = nums.length-1; j >=0 ; j--) {
                if (nums[j]>nums[index]){
                    //找到第一个比非递增的数大的数
                    break;
                }
            }
            swap(nums,index,j);
            Reverse(nums,index+1);
        }
    }

    /**
     * 将i位后的数字逆序排列
     *
     * @param num
     * @param i
     */
    public static void Reverse(int[] num, int i) {
        int k = i;
        int j = num.length - 1;
        while (k < j) {
            swap(num, k, j);
            k++;
            j--;
        }
    }

    /**
     * 交换nums的i和j位置
     *
     * @param nums
     * @param i
     * @param j
     */
    public static void swap(int[] nums, int i, int j) {
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int []nums={1};
        List<List<Integer>> permute = permute(nums);
        System.out.println(permute);
    }
}

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
import java.util.List;

/**
 * @ProjectName: design
 * @Package: com.baka.medium
 * @ClassName: Subsets
 * @Description: 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
                    说明：解集不能包含重复的子集。
 * @Author: 唐朝
 * @CreateDate: 2018/12/30 10:45
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/12/30 10:45
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Subsets {
    /**
     * 位运算,所有位置分为0,1，即有或无，所有组合就是集合的情况，恰好正是二进制数的情况
     * @param nums
     * @return
     */
    public static List<List<Integer>> subsets(int[] nums) {
        if (nums == null) {
            return null;
        }
        List<List<Integer>> list=new ArrayList<>();
        int size=nums.length;
        int subsize= (int) Math.pow(2,size);
        for (int i = 0; i < subsize; i++) {
            List<Integer> temp=new ArrayList<>();
            int a=i;
            for(int k=0;k<size;k++) {
                if((a&1)==1) {
                    temp.add(nums[k]);
                }
                a=a>>1;
            }
            list.add(temp);
        }
        return list;
    }

    public static void main(String[] args) {
        int[]num={1,2,3};
        List<List<Integer>> list = subsets(num);
        System.out.println(list);
    }
}

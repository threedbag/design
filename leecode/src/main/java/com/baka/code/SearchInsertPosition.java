package com.baka.code;
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


/**
 * @ProjectName: design
 * @Package: com.baka.code
 * @ClassName: SearchInsertPosition
 * @Description: 搜索插入位置
 * @Author: 唐朝
 * @CreateDate: 2018/11/30 14:50
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/11/30 14:50
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        if (target <= nums[0]) {
            return 0;
        }
        int i = nums.length / 2;
        while (true){
            if (target == nums[i]) {
                return i;
            }
            if (target < nums[i]) {
                if (target>nums[i-1]){
                    return i;
                }
                i--;
            }
            if (target > nums[i]) {
                if (target<nums[i+1]){
                    return i+1;
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 6,  9};
        System.out.println(searchInsert(nums, 9));
    }
}

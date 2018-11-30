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

import java.util.Arrays;

/**
 * @ProjectName: design
 * @Package: com.baka.code
 * @ClassName: MaximumSubarray
 * @Description: 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * @Author: 唐朝
 * @CreateDate: 2018/11/30 17:01
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/11/30 17:01
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        if (nums.length==1) {
            return nums[0];
        }
        int sum=0;
        //Integer.MIN_VALUE是Integer最小的边界值
        int sumin=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (sum>= 0) {
                sum+=nums[i];
            }else {
                sum=nums[i];
            }
            if (sum>sumin){
                sumin=sum;
            }
        }
        return sumin;
    }

    public static void main(String[] args) {
        int[]nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}

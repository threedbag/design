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
 * @ClassName: RemoveElement
 * @Description: java类作用描述
 * @Author: 唐朝
 * @CreateDate: 2018/11/30 11:46
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/11/30 11:46
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if (nums == null||nums.length==0) {
            return 0;
        }
        int out=0;
        for (int i = 0; i < nums.length-out; i++) {
            if (nums[i]==val){
                nums[i]=nums[nums.length-1-out];
                nums[nums.length-1-out]=val;
                out++;
                i--;
            }
        }
        return nums.length-out;
    }

    public static void main(String[] args) {
        int[] nums={0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));
        System.out.println(Arrays.toString(nums));
    }
}

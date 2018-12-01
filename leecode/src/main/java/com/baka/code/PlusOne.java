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
 * @ClassName: PlusOne
 * @Description: 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
                    最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
                    你可以假设除了整数 0 之外，这个整数不会以零开头。
 * @Author: 唐朝
 * @CreateDate: 2018/12/1 20:56
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/12/1 20:56
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        digits[digits.length-1]+=1;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i]=0;
                digits[i-1]+=1;
            }else {
                return digits;
            }
        }
        if (digits[0]==10){
            int[] ints = new int[digits.length + 1];
            ints[0]=1;
            System.out.println(Arrays.toString(ints));
            return ints;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits={9,9,9,9};

        System.out.println(plusOne(digits));
    }
}

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
 * @ClassName: PowerofTwo
 * @Description: 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 * @Author: 唐朝
 * @CreateDate: 2018/12/12 20:22
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/12/12 20:22
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class PowerofTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n==0){
            return false;
        }
        if (n%2==0){
            if (isPowerOfTwo(n/2)){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

    /**
     * 使用&的特殊使用方法
     * 只有0和2的幂与自己少一的数与为0
     * @param n
     * @return
     */
    public static boolean isPowerOfTwoBest(int n){
        if (n>0&&(n&(n-1))==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwoBest(2));
    }
}

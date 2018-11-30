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
 * @ClassName: PerfectNumber
 * @Description: 对于一个正整数，如果它和除了它自身以外的所有正因子之和相等，我们称它为“完美数”。
给定一个正整数n，如果他是完美数
第一个完全数是6，第二个完全数是28，第三个完全数是496，后面的完全数还有8128、33550336
 * @Author: 唐朝
 * @CreateDate: 2018/11/29 14:27
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/11/29 14:27
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

public class PerfectNumber {
    public static boolean checkPerfectNumber(int num) {
// 一个数如果恰好等于它的因子之和 , 这个数就称为 ”完数 ”.
// 例如 6 = 1+2+3。编程找出 编程找出 1000以内的所有完数 。(现场演示并讲解思路)
        if (num == 1) {
            return false;
        }
        int sum=1;

        for (int i = 2; i < num / (i-1); i++) {
            if (num<sum) {
                return false;
            }
            if (num%i == 0) {
                sum=sum+i+num/i;
            }
        }
        return num == sum;
    }

    public static boolean checkPerfectNumber2(int num) {
        if (num == 1) {
            return false;
        }
        int sum=1;
        for(int i = 2;  i*i < num; i++){
            if(num % i == 0){
                sum += i + num/i;
            }
            if(sum > num){
                return false;
            }
        }
        return sum==num;

    }
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if(checkPerfectNumber2(i)){
                System.out.println(i);
            }
        }
    }
}

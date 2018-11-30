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
 * @ClassName: CountAndSay
 * @Description: 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。
 * @Author: 唐朝
 * @CreateDate: 2018/11/30 15:57
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/11/30 15:57
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class CountAndSay {
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }else {
            String s = countAndSay(n - 1);
            char[] chars = s.toCharArray();
            StringBuilder sb=new StringBuilder();
            for (int j = 0; j < chars.length; j++) {
                for (int i = j; i < chars.length; i++) {
                    if (chars[i]==chars[j]){
                        if (i+1>=chars.length){
                            sb.append(i-j+1);
                            sb.append(chars[j]);
                            j=i+1;
                            break;
                        }
                    }else {
                        sb.append(i-j);
                        sb.append(chars[j]);
                        j=i-1;
                        break;
                    }
                }
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(8));
    }
}

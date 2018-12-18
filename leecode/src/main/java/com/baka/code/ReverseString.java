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
 * @ClassName: ReverseString
 * @Description: 编写一个函数，其作用是将输入的字符串反转过来。
 * @Author: 唐朝
 * @CreateDate: 2018/12/18 11:41
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/12/18 11:41
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ReverseString {
    /**
     * 直接遍历数组对换，循环只需要执行一半，时间也将变为一半,就不写了
     * @param s
     * @return
     */
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            builder.append(chars[i]);
        }
        return builder.toString();
    }
}

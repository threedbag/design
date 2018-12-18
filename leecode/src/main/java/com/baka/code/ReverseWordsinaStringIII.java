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
 * @ClassName: ReverseWordsinaStringIII
 * @Description: 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * @Author: 唐朝
 * @CreateDate: 2018/12/18 11:50
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/12/18 11:50
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ReverseWordsinaStringIII {

    /**
     * StringBuilder有自己的反转API
     * @param s
     * @return
     */
    public static String reverseWords(String s) {
        String[] split = s.split("\\s+");
        for (int j = 0; j < split.length; j++) {
            char[] chars = split[j].toCharArray();
            for (int i = 0; i < chars.length/2; i++) {
                char c=chars[i];
                chars[i]=chars[chars.length-1-i];
                chars[chars.length-1-i]=c;
            }
            split[j]=new String(chars);
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < split.length-1; i++) {
            builder.append(split[i]+" ");
        }
        builder.append(split[split.length-1]);
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}

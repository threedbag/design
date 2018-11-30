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
 * @ClassName: LengthOfLastWord
 * @Description: 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
                    如果不存在最后一个单词，请返回 0 。
 * @Author: 唐朝
 * @CreateDate: 2018/11/30 18:50
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/11/30 18:50
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        try{
        String[] strings = s.split(" ");
        int length = strings[strings.length - 1].length();
        return length;
        }catch (Exception e){
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" "));
    }
}

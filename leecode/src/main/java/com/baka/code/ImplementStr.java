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
 * @ClassName: ImplementStr
 * @Description: java类作用描述
 * @Author: 唐朝
 * @CreateDate: 2018/11/30 14:26
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/11/30 14:26
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ImplementStr {
    public int strStr(String haystack, String needle) {
        if (needle == null||needle.length()==0) {
            return 0;
        }
        int i = haystack.indexOf(needle);
        return i;
    }

    public int strStr2(String haystack, String needle) {
        if (needle == null||needle.length()==0) {
            return 0;
        }
        char[] hay = haystack.toCharArray();
        char[] need = needle.toCharArray();
        for (int i = 0; i < hay.length-need.length+1; i++) {
            for (int j = 0; j < need.length; j++) {
                if (need[j]!=hay[i+j]){
                    break;
                }
                if (j+1 == need.length) {
                    return i;
                }
            }
        }
        return -1;
    }
}

package com.baka.other;
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

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: design
 * @Package: com.baka.other
 * @ClassName: AllSubStrings
 * @Description: 求出字符串中所有以start，end结尾的子串
 * @Author: 唐朝
 * @CreateDate: 2019/1/8 20:22
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/1/8 20:22
 * @UpdateRemark: 阿里测试题
 * @Version: 1.0
 */
public class AllSubStrings {
    public static List<String> allSubstrings(String s,String start,String stop){
        int startlen = start.length();
        ArrayList<Integer> startArray = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int index = s.indexOf(start, i);
            startArray.add(index);
            i+=startlen+index-1;
        }
        System.out.println(startArray.toString());
        int stoplen = stop.length();
        ArrayList<Integer> stopArray = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int index = s.indexOf(stop, i);
            stopArray.add(index);
            i+=stoplen+index-1;
        }
        System.out.println(stopArray.toString());
        ArrayList<String> list = new ArrayList<>();
        for (Integer startInt : startArray) {
            for (Integer stopInt : stopArray) {
                if (stopInt>startInt+startlen-1){
                    list.add(s.substring(startInt,stopInt+stoplen));
                }
            }
        }
        System.out.println(list.toString());
        return list;
    }

    public static void main(String[] args) {
        allSubstrings("abbcdaaaabcd","ab","bc");
    }
}

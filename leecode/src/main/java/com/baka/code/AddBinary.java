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

import java.util.ArrayList;

/**
 * @ProjectName: design
 * @Package: com.baka.code
 * @ClassName: AddBinary
 * @Description: 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * @Author: 唐朝
 * @CreateDate: 2019/1/11 9:44
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/1/11 9:44
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        char[] charsL;
        char[] charsS;
        if (a.length() > b.length()) {
            charsL = a.toCharArray();
            charsS = b.toCharArray();
        } else {
            charsL = b.toCharArray();
            charsS = a.toCharArray();
        }
        ArrayList<String> add = new ArrayList<>();
        int addMax = 0;
        for (int i = 0; i < charsS.length; i++) {
            Integer s = Integer.valueOf(charsS[charsS.length-1-i]+"");
            Integer l = Integer.valueOf(charsL[charsL.length-1-i]+"");
            int sum = l + s + addMax;
            if (sum>=2){
                addMax=1;
                sum-=2;
            }else {
                addMax=0;
            }
            add.add(sum+"");
        }
        for (int i =charsS.length ; i <charsL.length ; i++) {
            Integer l = Integer.valueOf(charsL[charsL.length-1-i] + "");
            int sum=l+addMax;
            if (sum>=2){
                addMax=1;
                sum-=2;
            }else {
                addMax=0;
            }
            add.add(sum+"");
        }
        if (addMax!=0){
            add.add(addMax+"");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = add.size() - 1; i >= 0; i--) {
            sb.append(add.get(i));
        }
        return sb.toString();
    }

    public String addBinpary2(String a,String b){
        int indexa = a.length()-1;
        int indexb = b.length()-1;
        StringBuilder sb = new StringBuilder();
        int extra=0;
        for (; indexa>=0&&indexb>=0; indexa--,indexb--) {
            int sum = a.charAt(indexa) - '0' + b.charAt(indexb) - '0' + extra;
            if (sum>=2){
                extra=1;
                sum-=2;
            }else {
                extra=0;
            }
            sb.append(sum);
        }
        while (indexa>=0){
            int sum=a.charAt(indexa)-'0'+extra;
            if (sum>=2){
                extra=1;
                sum-=2;
            }else {
                extra=0;
            }
            sb.append(sum);
            indexa--;
        }
        while (indexb>=0){
            int sum=b.charAt(indexb)-'0'+extra;
            if (sum>=2){
                extra=1;
                sum-=2;
            }else {
                extra=0;
            }
            sb.append(sum);
            indexb--;
        }
        if (extra==1){
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}

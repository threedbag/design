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
import java.util.List;

/**
 * @ProjectName: design
 * @Package: com.baka.code
 * @ClassName: PascalsTriangle
 * @Description: 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * @Author: 唐朝
 * @CreateDate: 2019/2/3 13:34
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/2/3 13:34
 * @UpdateRemark: 杨辉三角
 * @Version: 1.0
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listAll = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            if (i+1 != 1) {
                list.add(1);
                List<Integer> listRow = listAll.get(listAll.size() - 1);
                for (int j = 0; j <listRow.size()-1 ; j++) {
                    list.add(listRow.get(j)+listRow.get(j+1));
                }
            }
            list.add(1);
            listAll.add(list);
        }
        return listAll;
    }
}

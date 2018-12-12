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

import java.util.HashSet;
import java.util.Set;

/**
 * @ProjectName: design
 * @Package: com.baka.code
 * @ClassName: ContainsDuplicate
 * @Description: java类作用描述
 * @Author: 唐朝
 * @CreateDate: 2018/12/12 20:10
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/12/12 20:10
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ContainsDuplicate {
    /**
     * 通过set不可重复，也可通过排序后比较
     * @param nums
     * @return
     */
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int num : nums) {
            boolean add = set.add(num);
            if (!add){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums={1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

}

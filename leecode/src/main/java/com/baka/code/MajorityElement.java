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

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ProjectName: design
 * @Package: com.baka.code
 * @ClassName: MajorityElement
 * @Description: j给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 n/2 的元素。
 * @Author: 唐朝
 * @CreateDate: 2018/12/12 16:07
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/12/12 16:07
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MajorityElement {
    /**
     * 摩尔投票算法解决只有2个数中超过一半的
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int num = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i]) {
                count++;
            }else {
                count--;
                //因为只有count--才会导致count到等于0，所以放在count下就好了，比放在外面节省很长的时间
                if (count == 0) {
                    num=nums[i+1];
                }
            }
        }
        return num;
    }
}

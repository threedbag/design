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
 * @ClassName: LinkedListCycle
 * @Description: 给定一个链表，判断链表中是否有环。
 * @Author: 唐朝
 * @CreateDate: 2018/12/5 18:59
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/12/5 18:59
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class LinkedListCycle {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * 哈希表方法
     */
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        Set<ListNode> hash = new HashSet<>();
        while (true) {
            if (hash.add(head)) {
                head = head.next;
                if (head == null) {
                    return false;
                }
            } else {
                return true;
            }
        }
    }

    /**
     * 双指针
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        try {
            ListNode fast=head.next;
            ListNode low=head;
            while (fast!=low){
                if (low == null||fast==null) {
                    return false;
                }
                low=low.next;
                fast=fast.next.next;
            }
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }
}

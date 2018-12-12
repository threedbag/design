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
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ProjectName: design
 * @Package: com.baka.code
 * @ClassName: IntersectionofTwoLinkedLists
 * @Description: java类作用描述
 * @Author: 唐朝
 * @CreateDate: 2018/12/6 16:09
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/12/6 16:09
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class IntersectionofTwoLinkedLists {
    /**
     * 时间太长，没理解题目的意思
     *
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Map<ListNode, Integer> map = new HashMap<>();
        ListNode newNode = headA;
        int i = 1;
        while (newNode != null) {
            map.put(newNode, i);
            newNode = newNode.next;
            i++;
        }
        ListNode node = headB;
        while (node != null) {
            if (map.get(node) != null) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    /**
     * 如果2个节点相等相交后，之后应该都一样，所以先由长的链表先走到一样长度才判断
     *
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode nodeA = headA;
        int lenthA = 0;
        ListNode nodeB = headB;
        int lenthB = 0;
        //先获取他们的长度
        while (nodeA != null) {
            lenthA++;
            nodeA = nodeA.next;
        }
        while (nodeB != null) {
            lenthB++;
            nodeB=nodeB.next;
        }
        nodeA=headA;
        nodeB=headB;
        //将2个链表放到同一起跑线
        if (lenthA>lenthB){
            for (int i = 0; i <lenthA-lenthB ; i++) {
                nodeA=nodeA.next;
            }
        }else {
            for (int i = 0; i < lenthB-lenthA; i++) {
                nodeB=nodeB.next;
            }
        }
        //比较寻找开始交错的节点
        while (nodeA!=null){
            if (nodeB== nodeA) {
                return nodeA;
            }else {
                nodeA=nodeA.next;
                nodeB=nodeB.next;
            }
        }
        return null;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

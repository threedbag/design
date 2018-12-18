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
 * @ClassName: LowestCommonAncestorofaBinarySearchTree
 * @Description: java类作用描述
 * @Author: 唐朝
 * @CreateDate: 2018/12/18 10:30
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/12/18 10:30
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class LowestCommonAncestorofaBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode newroot = root;
        while (true) {
            if (p == newroot) {
                return p;
            }
            if (q == newroot) {
                return q;
            }
            if ((p.val < newroot.val && q.val > newroot.val) || (q.val < newroot.val && p.val > newroot.val)) {
                return newroot;
            } else {
                if (p.val < newroot.val) {
                    newroot = newroot.left;
                } else {
                    newroot = newroot.right;
                }
            }
        }
    }
}

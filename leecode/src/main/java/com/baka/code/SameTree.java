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
 * @ClassName: SameTree
 * @Description: java类作用描述
 * @Author: 唐朝
 * @CreateDate: 2019/1/15 18:52
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/1/15 18:52
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SameTree {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else {
            try {
                if (p.val != q.val) {
                    return false;
                } else {
                    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
                }
            } catch (NullPointerException e) {
                return false;
            }
        }
    }
}

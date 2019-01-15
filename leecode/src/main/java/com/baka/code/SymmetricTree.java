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
 * @ClassName: SymmetricTree
 * @Description: 给定一个二叉树，检查它是否是镜像对称的。
 * @Author: 唐朝
 * @CreateDate: 2019/1/15 19:22
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/1/15 19:22
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return isSymme(root.left, root.right);
        }
    }

    private boolean isSymme(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else {
            if (p == null || q == null || p.val != q.val) {
                return false;
            } else {
                return isSymme(p.left, q.right) && isSymme(p.right, q.left);
            }
        }
    }
}

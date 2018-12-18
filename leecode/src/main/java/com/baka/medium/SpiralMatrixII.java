package com.baka.medium;
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
 * @Package: com.baka.medium
 * @ClassName: SpiralMatrixII
 * @Description: 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 * @Author: 唐朝
 * @CreateDate: 2018/12/18 14:36
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/12/18 14:36
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SpiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int[][] ints = new int[n][n];
        //计数器
        int count=1;
        //圈数
        int round=0;

        while (count <= n * n) {

            for (int i = round; i < n - round; i++) {
                ints[round][i] = count++;
            }
            for (int i = round + 1; i < n - round; i++) {
                ints[i][n - round - 1] = count++;
            }
            for (int i = n - round - 2; i >= round; i--) {
                ints[n - round - 1][i] = count++;
            }
            for (int i = n -round - 2; i > round; i--) {
                ints[i][round] = count++;
            }

            round++;
        }
        return ints;
    }

    public static void main(String[] args) {
        int[][] ints = generateMatrix(3);
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}

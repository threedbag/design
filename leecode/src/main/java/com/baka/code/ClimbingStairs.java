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
 * @ClassName: ClimbingStairs
 * @Description: 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
                    每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * @Author: 唐朝
 * @CreateDate: 2018/12/1 21:25
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/12/1 21:25
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ClimbingStairs {
    //最后一步爬一个台阶的可能加上最后一步爬俩台阶的可能

    /**
     * 递归个数太多导致超时
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }else if (n<=0){
            return 1;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
    public static int climbStairs2(int n) {
        if (n ==1) {
            return 1;
        }else if (n==2){
            return 2;
        }
        int[] ints = new int[n];

        ints[0]=1;
        ints[1]=2;
        for (int i = 2; i < ints.length; i++) {
            ints[i]=ints[i-1]+ints[i-2];
        }
        return ints[n-1];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs2(44));
    }
}

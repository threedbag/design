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
import java.util.Stack;

/**
 * @ProjectName: design
 * @Package: com.baka.code
 * @ClassName: MinStack
 * @Description: 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
                    push(x) -- 将元素 x 推入栈中。
                    pop() -- 删除栈顶的元素。
                    top() -- 获取栈顶元素。
                    getMin() -- 检索栈中的最小元素。
 * @Author: 唐朝
 * @CreateDate: 2018/12/5 19:41
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/12/5 19:41
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MinStack {
/**
 *  会超时
    private Stack<Integer> stack;

    public MinStack() {
        stack=new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        Integer min=stack.peek();
        for (Integer integer : stack) {
            if (min>integer){
                min=integer;
            }
        }
        return min;
    }
 勉强合格
 */
    private List<Integer> list;

    public MinStack() {
        list=new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public void pop() {
        list.remove(list.size()-1);
    }

    public int top() {
        return list.get(list.size()-1);
    }

    public int getMin() {
        Integer min=list.get(0);
        for (Integer integer : list) {
            if (integer<min){
                min=integer;
            }
        }
        return min;
    }
}

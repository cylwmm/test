import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main03 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String count = br.readLine(); // 代金卷的数量
        String[] coupons = br.readLine().trim().split(" ");// 代金卷 数组
        Stack<Integer> stackL = new Stack<>(); // 左栈
        Stack<Integer> stackR = new Stack<>(); // 右栈
        for (String coupon : coupons) { // 先将所有的优惠卷都压入左栈
            stackL.push(Integer.parseInt(coupon));
        }

        int res = 0;

        while (!stackL.isEmpty()) { // 循环至到左栈为空

            Integer popL = stackL.pop();

            if (stackR.isEmpty()) {
                stackR.push(popL);
            } else {
                while (!stackR.isEmpty() && stackR.peek().equals(popL)) {
                    popL = stackR.pop() + 1;
                    res++;
                }
                stackR.push(popL);
            }

        }

        System.out.println(res);

    }

}
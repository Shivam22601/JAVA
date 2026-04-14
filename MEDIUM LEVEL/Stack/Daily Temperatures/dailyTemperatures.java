import java.util.*;
public class dailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int idx = stack.pop();
                ans[idx] = i - idx;
            }
            stack.push(i);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        dailyTemperatures dt = new dailyTemperatures();
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dt.dailyTemperatures(T);
        System.out.println(Arrays.toString(result));
    }
}

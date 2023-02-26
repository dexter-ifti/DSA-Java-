import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class TrappingRainWater {
    public static int maxWater(int[] height) {
       Stack <Integer> stack = new Stack<>();
       int n = height.length;
       int ans = 0;

       for (int i = 0; i < n; i++) {
        while ((!stack.isEmpty()) && (height[stack.peek()] < height[i])) {
            int pop_height = height[stack.peek()];
            stack.pop();
            if (stack.isEmpty()) {
                break;
            }
            int distance = i - stack.peek() - 1;
            int min_height = Math.min(height[stack.peek()], height[i]) - pop_height;

            ans += distance * min_height;
        }

        stack.push(i);
       }

       return ans;
        
    }

    public static void main(String args[]) {
       int arrr[] = {3, 0, 2, 0, 4};
       System.out.println(maxWater(arrr));
    }
}

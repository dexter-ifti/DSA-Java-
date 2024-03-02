import java.util.Arrays;

public class Solution {
  public static void main(String[] args) {
        // Write your code here.
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(frogJump_M(n-1, height, dp, k));
        System.out.println(frogJump_T(n, height, dp, k));
    }
    // Memoization
    static int frogJump_M(int n, int[] h, int[] dp, int k){
        if(n == 0) return 0;
        if (dp[n] != -1) {
            return  dp[n];
        }
        int minSteps = Integer.MAX_VALUE;
        for(int j = 1; j <= k; j++){
            if(n - j >= 0){
                int jump = find(n-j, h, dp, k) + Math.abs(h[n]-h[n-j]);
                minSteps = Math.min(jump, minSteps); 
            }
        }
        return dp[n]= minSteps;
    }
  // Tabulation
  static int frogJump_T(int n, int[] h, int[] dp, int k){
        if(n == 0) return 0;
        dp[0] = 0;
        int minSteps = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
          
          for(int j = 1; j <= k; j++){
              if(i - j >= 0){
                  int jump = dp[i-j] + Math.abs(h[i]-h[i-j]);
                  minSteps = Math.min(jump, minSteps); 
                  
              }
          }
          dp[i] = minSteps;
        }
        return dp[n-1];
    }
}

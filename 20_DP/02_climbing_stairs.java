import java.util.*;
public static void main(String[] args){
    int[] dp = new int[n+1];
    Arrays.fill(dp, -1);
    System.out.println(climbStairs(n, dp));
    System.out.println(climbingStairs_1(n, dp));
    System.out.println(climbStairs_2(n));
}
// Memoization TC - O(n), SC - O(n)
int climbStairs(int n, int[] dp){
        if(n <= 2) return n;
        
        if(n <= 0) return 0;

        if(dp[n] != -1) return dp[n];

        return dp[n] = cs(n-1, dp) + cs(n-2, dp);
    }
// tabulation  TC - O(n), SC - O(n)
int climbingStairs_1(int n, int[] dp){
        dp[1] = 1;
        if(n >= 2) dp[2] = 2;
        if(n <= 2) return dp[n];
        
        if(n <= 0) return 0;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
// Space Optimization TC - O(n) SC - O(1)
public int climbStairs_2(int n) {
        if(n <= 0) return 0;
        int prev = 1;
        int prev2 = 1;
        for(int i = 2; i <= n; i++){
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
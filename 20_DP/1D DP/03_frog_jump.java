import java.util.*;
public static void main(String[] args){
    int n = 5;
    int[] dp = new int[n+1];
    Arrays.fill(dp, -1);
    int height[] = {10, 20, 30, 10};
    System.out.println(frogJump(n-1, height));
    System.out.println(frogJump_M(n-1, height, dp));
    System.out.println(frogJump_T(n, height, dp));
}
// Recursion
 static int frogJump(int ind, int[] h){
    if(ind == 0) return 0;
        int left = f(ind-1, h) + Math.abs(h[ind] - h[ind-1]);
        int right = Integer.MAX_VALUE;
        if(ind > 1) right = f(ind-2, h) + Math.abs(h[ind] - h[ind-2]);
        return Math.min(left, right);
 }

// Memoization
static int frogJump_M(int ind, int[] h, int[] dp){
    if(ind == 0) return 0;
    if (dp[ind] != -1) {
        return dp[ind];
    }
    int left = f(ind-1, h, dp) + Math.abs(h[ind] - h[ind-1]);
    int right = Integer.MAX_VALUE;
    if(ind > 1) right = f(ind-2, h, dp) + Math.abs(h[ind] - h[ind-2]);
    return dp[ind] = Math.min(left, right);
}

// Tabulation
static int frogJump_T(int n, int[] h, int[] dp){
    if(n == 0) return 0;
    dp[0] = 0;
    for(int i = 1; i < n; i++){
        int fs = dp[i-1] + Math.abs(h[i] - h[i-1]);
        int ss = Integer.MAX_VALUE;
        if(i > 1) ss = dp[i-2] + Math.abs(h[i] - h[i-2]);
        dp[i] = Math.min(fs, ss);
    }
    return dp[n-1];
}
// Space Optimization
static int frogJump_S(int n, int[] h){
    if(n == 0) return 0;
    int prev = 0;
    int prev2 = 0;
    for(int i = 1; i < n; i++){
        int fs = prev + Math.abs(h[i] - h[i-1]);
        int ss = Integer.MAX_VALUE;
        if(i > 1) ss = prev2 + Math.abs(h[i] - h[i-2]);
        int curr = Math.min(fs, ss);
        prev2 = prev;
        prev  = curr;
    }
    return prev;
}

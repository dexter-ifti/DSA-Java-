import java.util.*;
public static void main(String[] args){
    int n = 5;
    int[] dp = new int[n+1];
    Arrays.fill(dp, -1);
    System.out.println(fibonacci(n, dp));
    System.out.println(fibonacci_1(n, dp));
    System.out.println(fibonacci_2(n));
}

// Memoization TC - O(n), SC - O(n)
int fibonacci(int n, int[] dp){
    if(n <= 1) return n;
    if(dp[n] != -1) return dp[n];
    dp[n] = fibonacci(n-1, dp) + fibonacci(n-2, dp);
    return dp[n];
}
// tabulation TC - O(n), SC - O(n)
int fibonacci_1(int n, int[] dp){
    dp[0] = 0; 
    if(n > 0) dp[1] = 1;
    if(n <= 1) return dp[n];
    for(int i = 2; i <= n; i++){
        dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];
}
// space optimization TC - O(n), SC - O(1)
int fibonacci_2(int n){
    int prev2 = 0;
    int prev = 1;
    for(int i = 2; i <= n; i++){
        int curr = prev + prev2;
        prev2 = prev;
        prev = curr;
    }
    return prev;
}


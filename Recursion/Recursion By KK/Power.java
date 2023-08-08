// Question -  write a recursive program in java to find power of number ?
// Time Complexity: O(N)
// Space Complexity: O(1)
public class Power {
    public static long pow(int X, int N) {
		//Write your code here
		return helper(X, 1, N);
	}
	public static long helper(int X, int prod, int N) {
		if(N == 0) {
			return prod;
		} 
		return helper(X, prod * X, --N);
	}
    public static void main(String[] args) {
		System.out.println(pow(2, 3));
	}
}

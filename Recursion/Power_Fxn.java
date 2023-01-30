public class Power_Fxn {
    public static void main(String[] args) {
         System.out.println(power(2, 10));
         System.out.println(optimizedPowwer(2, 10));
    }
    public static int power(int x, int n) {
        if(n == 0)
        {
            return 1;
        }
        return x * power(x, n-1);
    }    
    
    public static int optimizedPowwer(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPowwer(x, n/2);
        int halfPowerSq = halfPower * halfPower ;
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }    
}

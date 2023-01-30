public class Basics {
    public static void main(String args[]) {
            printNto1(10);
            print1toN(10);
            System.out.println(factorial(5));
            System.out.println(sumOfN(10));
            System.out.println(fibonacci(5));
            int arr[] = {8, 3, 6, 5, 10, 2, 5, 3};
            firstOccurance(arr, 0, 5);
            System.out.println(lastOccurance(arr, 0, 5));
            System.out.println(power(2, 10));
            System.out.println(optimizedPowwer(2, 10));
            String str = "appnnacollege" ;
            removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
            System.out.println(tilingProblem(4));
            System.out.println(friendsPairing(3));
            printBinString(3, 0, "");
    } 

  public static void printNto1(int n) {
        if(n == 1)
        {
            System.out.println(n);
            return;
        }
        System.out.print(n+ " ");
        printNto1(n-1);
    }    
    
    public static void print1toN(int n)
    {
        if(n == 1)
        {
            System.out.print(n+" ");
            return;
        }
        print1toN(n-1);
        System.out.print(n+" ");
    }    
    
    public static int factorial(int n) 
    {
        if (n == 0 || n == 1) 
        {
            return 1;    
        }
        factorial(n-1);
        int fact = n * factorial(n-1);
        return fact;
    }    
    
    public static int sumOfN(int n) 
    {
        if (n == 1) 
        {
            return 1;    
        }
        sumOfN(n-1);
        int sumN = n + sumOfN(n-1);
        return sumN;
    }
    
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n ;
        }
        // int fibNm1 = n-2 + fibonacci(n-3);
        int fibN = fibonacci(n-1) + fibonacci(n-2);
        return fibN;
    }    
    
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length-1) {
            return true;
        }
        if(arr[i] > arr[i+1] )
        {
            return false ;
        }
        return isSorted(arr, i+1); 
    }    
    
    public static int firstOccurance(int arr[], int i, int key) {
        if (i == arr.length) {
            System.out.println("Not Found");
            return -1;
        }
        if (arr[i] == key) {
            System.out.println("Found at "+i);
            return i;
        }
        return firstOccurance(arr, i+1, key);
    }    
    
    public static int lastOccurance(int arr[], int i, int key)
    {
        if (i == arr.length) 
        {
            return -1;
        }
        int isFound = lastOccurance(arr, i+1, key);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
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
    
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return ;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            removeDuplicate(str, idx+1, newStr, map);
        }
        else
        {
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }    
    
    public static int tilingProblem(int n) { // 2 x n (Floor Size)
        //Base Case
        if (n == 0 || n == 1) {
            return 1;
        } 
        // Kaam
        // Vertical Choice
        int fnm1 = tilingProblem(n-1);
        // Horizontal Choice
        int fnm2 = tilingProblem(n-2);

        int totways = fnm1 + fnm2;
        return totways;
    }    
    
    public static int friendsPairing(int n)
    {
        if (n == 1 || n == 2) {
            return n ;
        }
        // Choice
        // Single
        int fnm1 = friendsPairing(n-1);

        // Pairing
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2 ;

        // totWays
        int totWays = fnm1 + pairWays ;
        return totWays;
    }    
    
    public static void printBinString(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinString(n-1, 0, str+"0");

        if (lastPlace == 0) {
            printBinString(n-1, 1, str+"1");
        }
    }
}  

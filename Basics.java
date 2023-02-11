import java.util.*;

public class Basics {
    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {

            // System.out.println("Enter Number : ");
            // int n = sc.nextInt();
            // int num1 = sc.nextInt();
            // int num2 = sc.nextInt();
            // product(4,3);
            // System.out.println(Binomial(3,2));
            // System.out.println(isPrime(4));
            // primesInRang(20);
            // binTodec(101);
            // decTobin(5);
            // numberSystem(8,67);
            // int arr[] = {2,4,6,8,10,12,14,16,18,20};
            // int key = 18 ;

            // int index = linearSearch(arr, key);
            // if(index == -1){
            // System.out.println("Not Found");
            // }else{
            // System.out.println("Key Found at index :: " +index);
            // }
            // System.out.println("The key found at : "+binarySearch(arr, 12));

            // int index = binarySearch(arr, 14, start, end, mid);
            // if(index == mid){
            // System.out.println("Key found at : "+mid);
            // }else{
            // System.out.println("key not found");
            // }
            // reverse(arr);
            // for(int element : arr){
            // System.out.print(element+" ");
            // }
            // int numbers[] = {-2,-3,-1,-5,-4};
            // printPairs(numbers);
            // subarraySum2(numbers);
            // kadanes(numbers);
            // int prices[] = {7, 1, 5, 3, 6, 4};
            // System.out.println(buyAndSellStocks(prices));
            // int arr[] = {5, 4, 1, 3, 2};
            // int arr[] = {1, 2, 3, 4, 5, 6};
            // int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
            // countingsort(arr);
            // printArr(arr);
            // int mat[][] = new int[4][4];
            // for (int i = 0; i < mat.length; i++) {
            //     for (int j = 0; j < mat[0].length; j++) {
            //         mat[i][j] = sc.nextInt();
            //     }
            // }
            // for(int i = 0 ; i < mat.length ; i++){
            // for(int j = 0 ; j < mat[0].length ; j++){
            // System.out.println("Enter Elemeents ");
            // System.out.print(mat[i][j]+ " ");
            // }
            // System.out.println();
            // }
            // search(mat, 6);
            // System.out.println(getLargest_Smallest(mat));
            // int mat[][] = { {1, 2, 3, 4},
            //                 {5, 6, 7, 8},
            //                 {9, 10, 11, 12},
            //                 {13, 14, 15, 16}};
            // spiralMatrix(mat);
            // System.out.println(diagonalSum(mat));
            // int matrix[][] = {{10, 20, 30, 40},
            //                   {15, 25, 35, 45},
            //                   {27, 29, 37, 48},
            //                   {32, 33, 39, 50}};
            // int key = 33;
            // staircaseSearch(matrix, key);
            // String str = "reacecar";
            // isPalindrome(str);
            // String path = "WNEENESENNN" ;
            // System.out.println(getShortestPath(path));
            // String str = "hi, i am taha iftihar" ;
            // System.out.println(toUpperCase(str));
            //    String str = "aaaaaabbbbbbbbbbbbbcccccccddd";
            //    System.out.println(compress(str));
            // even_odd(2);
            // even_odd(5);
            // even_odd(3);
            // even_odd(8);
            // System.out.println(getBit(10, 3));
            // System.out.println(setBit(10, 2));
            // System.out.println(clearBit(10, 2));
            // System.out.println(updateBit(10, 2, 1));
            // System.out.println(clearIBit(15, 2));
            // System.out.println(clearBitsInRange(10, 2, 4));
            // System.out.println(check_Power_2(8));
            // System.out.println(count_set_bits(10));
            // System.out.println(fast_expo(5, 4));
            // swap(5, 7);
            // add_one(6);
            // add_one(-4);
            // add_one(0);
            // upper_lower();
            // printNto1(10);
            // print1toN(10);
            // System.out.println(factorial(5));
            // System.out.println(sumOfN(10));
            // System.out.println(fibonacci(5));
            // int arr[] = {8, 3, 6, 5, 10, 2, 5, 3};
            // firstOccurance(arr, 0, 5);
            // System.out.println(lastOccurance(arr, 0, 5));
            // System.out.println(power(2, 10));
            // System.out.println(optimizedPowwer(2, 10));
            // String str = "appnnacollege" ;
            // removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
            // System.out.println(tilingProblem(4));
            // System.out.println(friendsPairing(3));
            // printBinString(3, 0, "");
            // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
            // allOccurance(arr, 2, 0);
            // String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            // printDigit(1234, digits);
            // System.out.println();
            // String str = "abcde" ;
            // System.out.println(length(str));
            // String str = "abcab";
            // int n = str.length();
            // System.out.println(countSubstrs(str, 0, n-1, n));
            // int n = 4;
            // towerOfHanoi(n, "A", "B", "C");
            // int arr[] = {6, 3, 9, 5, 2, 8, -2};
            // mergeSort(arr, 0, arr.length-1);
            // quickSort(arr, 0, arr.length-1);
            // printArr(arr);
            // int arr[] = {4, 5, 6, 7, 0, 1, 2};
            // int idx = sarch(arr, 0, 0, arr.length-1);
            // System.out.println(idx);
            String arr[] = {"sun", "earth", "mars", "mercury"};
            String a[] = mergeSort(arr, 0, arr.length - 1);
            for (String i : a) {
                System.out.print(i+ " ");
            }

        }
    }

    public static void product(int a, int b) {
        int product = a * b;
        System.out.println(product);
    }

    public static int factorial(int n, int m) {
        if (n == 0 || n == 1) {
            return 1;
        } else {

            int fact = n * factorial(n - 1);
            return fact;
        }
    }

    public static int Binomial(int n, int r) {
        int x = factorial(n);
        int y = factorial(r);
        int z = factorial(n - r);
        int a = x / (y * z);
        return a;
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;

            }
        }

        return true;
    }

    public static void primesInRang(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void binTodec(int binNum) {
        int mynum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) (Math.pow(2, pow)));

            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + mynum + " = " + decNum);
    }

    public static void decTobin(int decNum) {
        int mynum = decNum;
        int pow = 0;
        int binNum = 0;
        while (decNum > 0) {
            int reminder = decNum % 2;
            binNum = binNum + (reminder * (int) (Math.pow(10, pow)));

            pow++;
            decNum /= 2;
        }
        System.out.println("Binary form of " + mynum + " is = " + binNum);
    }

    public static void numberSystem(int r, int n) {
        int pow = 0;
        int num = 0;
        int mynum = n;

        while (n > 0) {
            int lastDigit = n % 10;
            num = num + (lastDigit * (int) Math.pow(r, pow));

            pow++;
            n /= 10;
        }
        System.out.println("Decimal of " + mynum + " is = " + num);
    }

    public static void array() {
        int[][] flats;
        // = {2, 3, 4, 4, 3};//= new int[8];
        flats = new int[2][5];
        // marks[] = new int[5];

        flats[0][0] = 44;
        flats[0][1] = 53;
        flats[0][2] = 78;
        flats[0][3] = 19;
        flats[0][4] = 76;

        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static int getLargest_Smallest(int arr[]) {
        int largest = Integer.MIN_VALUE; // -Infinity
        int smallest = Integer.MAX_VALUE; // +Infinity
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= largest) {
                largest = arr[i];
            }
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("The Smallest number is : " + smallest);
        return largest;

    }

    public static int binarySearch(int arr[], int key) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return -1;
    }

    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printPairs(int arr[]) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + tp);
    }

    public static void printSubarrays(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = " + ts);
    }

    public static void subarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum sum : " + maxSum);
    }

    public static void subarraySum2(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void kadanes(int numbers[]) {
        int cs = 00;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            cs += numbers[i];
            ms = Math.max(ms, cs);
            if (cs < 0) {
                cs = 0;
            }
        }
        System.out.println("Max SubarraySum is : " + ms);
    }

    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice;// today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void bubbleSort(int arr[]) {
        boolean swapped;
        for (int turn = 0; turn < arr.length; turn++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void countingsort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static boolean search(int mat[][], int key) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == key) {
                    System.out.println("key found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Not Found");
        return false;
    }

    public static int getLargest_Smallest(int mat[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] > largest) {
                    largest = mat[i][j];
                }
                if (mat[i][j] < smallest) {
                    smallest = mat[i][j];
                }
            }
        }
        System.out.println("Smallest element is " + smallest);
        return largest;
    }

    public static void spiralMatrix(int mat[][]) {
        int startRow = 0 ;
        int startCol = 0 ;
        int endRow = mat.length-1;
        int endCol = mat[0].length-1 ;

        while(startRow <= endRow && startCol <= endCol){
            // TOP
            for(int j = startCol ; j <= endCol ; j++){
                System.out.print(mat[startRow][j]+ " ");
            }
            // RIGHT
            for(int i = startRow+1 ; i <= endRow ; i++){
                System.out.print(mat[i][endCol]+ " ");
            }
            // BOTTOM
            for(int j = endCol-1; j>= startCol ; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(mat[endRow][j]+ " ");

            }
            // LEFT
            for(int i = endRow -1 ; i >= startRow+1 ; i--){
                if(startCol == endCol){
                    break ;
                }
                System.out.print(mat[i][startCol]+ " ");
            }

            startCol++ ;
            startRow++ ;
            endCol--;
            endRow--;
        }
    }
    
    public static int diagonalSum(int mat[][]) {
        // BRUTE FORCE --------->O(n^2)
        // int sum = 0 ;
        // for(int i = 0 ; i < mat.length ; i++){
        //     for(int j = 0 ; j < mat[0].length ; j++){
        //         if(i == j){
        //             sum += mat[i][j] ;
        //         }else if((i + j) == mat.length-1){
        //             sum += mat[i][j] ;
        //         }
        //     }
        // }
        // return sum ;

        // OPTIMIZED APPROACH ----->O(n)
        int sum = 0 ;
        for(int i = 0 ; i < mat.length ; i++){
        //    Primary Diagonal
            sum += mat[i][i] ;
            // Secondary Diagonal
            if(i != mat.length-1-i){
                sum += mat[i][mat[0].length-1-i];
            }
        }
        return sum;
    }    

    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0 ;;
        int col = matrix[0].length-1 ;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("key found at (" +row + ","+ col + ")");
                return true ;
            }else if(key < matrix[row][col]){
                col -- ;
            }else {
                row++ ;   
            }
        }
        System.out.println("key not found");
        return false ;
    }
    
    public static boolean isPalindrome(String str) {
        
        for(int i = 0 ; i < str.length()/2 ; i++){
            
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println("Not Palindrome");
                return false;
            }
        }        
        System.out.println("String is Palindrome");
        return true ;
    }
    
    public static float getShortestPath(String path) {
        int x = 0;
        int y = 0;
        for(int i = 0 ; i < path.length() ; i++){
        char dir = path.charAt(i);
        // South
        if(dir == 'S'){
            y-- ;
        }
        // North
        else if(dir == 'N'){
            y++ ;
        }
        // East
        else if(dir == 'E'){
            x++ ;
        }
        // West
        else{
            x-- ;
        }

        }
        int X2 = x*x ;
        int Y2 = y*y ;
        return (float)Math.sqrt(X2 + Y2);
    }    
  
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder(""); 
    
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1 ; i < str.length() ; i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++ ;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }   
    
    public static String stringCompression(String str) {
        String newStr = "";

        for(int i=0; i<str.length(); i++) {
            Integer count = 1;

            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }

            newStr += str.charAt(i);
            newStr = count > 1 ? newStr + count.toString() : newStr;
        }

        return newStr;
    }
   
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");

        for(int i = 0 ; i < str.length(); i++){
            Integer count = 1 ;


            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++ ;
                i++ ;
            }

            sb.append(str.charAt(i));
            if(count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.toString() ;
    }   

    public static void even_odd(int n) {
        int bitMask = 1 ;
        if((n & bitMask) == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }

    public static int getBit(int n, int i) {
        int bitMask = 1 << i ;
        if((n & bitMask) == 0){
            return 0;
        }else {
            return 1;
        }
    }
    
    public static int setBit(int n , int i) {
        int bitMask = 1 << i ;
        return n | bitMask ;
    }    
    
    public static int clearBit(int n , int i) {
        int bitMask = ~(1 << i) ;
        return n & bitMask ;
    }    
    
    public static int updateBit(int n, int i, int newBit) {
        // if(newBit == 0){
        //     return clearBit(n, i);
        // }else{
        //     return setBit(n, i);
        // }
        n = clearBit(n, i);
        int BitMask = newBit << i ;
        return n | BitMask ;
        

    }    

    public static int clearIBit(int n , int i) {
        int bitMask = (~0) << i ;
        return n & bitMask ;
    }

    public static int clearBitsInRange(int n, int i, int j) {
        int a = ((~0) << (j+1));
        int b = (1 << i) - 1 ;
        int bitMask = a | b ;
        return n & bitMask ;
    }
    
    public static boolean check_Power_2(int n) {
        // int bitMask = n & (n-1) ;
        // if(bitMask == 0){
        //     System.out.println(n+" is Power of 2");
        //     return true ;
        // }else {
        //     System.out.println(n+" is not Power of 2");
        //     return false;
        // }
        return (n & (n-1)) == 0 ;
    }    
    
    public static int count_set_bits(int n) {
        int count = 0 ;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++ ;
            }
            n = n >> 1 ;
        }
        return count;
    }
 
    public static int fast_expo(int a, int n) {
        int ans = 1;
        
        while (n > 0) {
            if ((n & 1) != 0) {
                ans *= a ;
            }
            a *= a ;
            n = n >> 1 ;
        }
        return ans ;
    }    
    
    public static void swap(int a, int b) {
        System.out.println("Before Swapping a = "+a +" & b = "+b);
        // Method - 1
        a = a ^ b ;
        b = a ^ b ;
        a = a ^ b ;
        // Method - 2
        // a = a + b;
        // b = a - b;
        // a = a - b;

        System.out.println("After Swapping a = "+a +" & b = "+b);
    }    
    
    public static void add_one(int n ) {
        System.out.println(n+ " + 1 = " + -~n);
    }    
    
    public static void upper_lower() {
        for(char ch = 'A' ; ch <= 'Z' ; ch ++){
            System.out.print((char)(ch | ' '));
        }
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
    
    public static void allOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i+ " ");
        }
        allOccurance(arr, key, i+1);
    }    
    
    public static void printDigit(int number, String digits[]) {
        if (number == 0) {
            return;
        }

        int lastDigit = number % 10 ;
        printDigit(number/10, digits);
        System.out.print(digits[lastDigit]+ " ");
    }    

    public static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return length(str.substring(1)) + 1 ;
    }

    public static int countSubstrs(String str, int i, int j, int n) {
        if (n == 1) {
            return 1 ;
        }
        if (n <= 0) {
            return 0;
        }

        int res = countSubstrs(str, i+1, j, n-1) + countSubstrs(str, i, j-1, n-1) - countSubstrs(str, i+1, j-1, n-2);
        
        if (str.charAt(i) == str.charAt(j)) {
            res++ ;
        }
        return res;
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer desk " + n + " from " + src + " to " + dest);
            return ;
        }
        // transfer top n-1 from src to helper using dest as 'helper'

        towerOfHanoi(n-1, src, helper, dest);

        // transfer nth from src dest

        System.out.println("transfer dest " + n + " from " + src + " to" + helper);

        // transfer n-1 from helper to dest using src as 'helper'
        
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);    //Right Side
        mergeSort(arr, mid+1, ei); //Left Side

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // idx for first sorted part
        int j = mid + 1; // idx for second sorted part
        int k = 0; // idx for temp

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for leftover element of 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // for leftover element of 2nd sorted part 
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for(k = 0 , i = si; k < temp.length; k++ , i++){
            arr[i] = temp[k];
        }
    }
    
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return ;
        }        
        // pivot variable stores correct idx for pivot element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }    
   
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1 ; //makes space for elements smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // place pivot at correct poition 
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[ei] = temp;//pivot's position need to change so (pivot = temp) won't work 

        return i ;
    }

    public static int sarch(int arr[], int si, int tar, int ei) {
        if (si > ei) {
            return -1;
        }
        // kaam
        int mid = si + (ei - si)/2 ;
        if (tar == arr[mid]) {
            return mid ;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a :: Left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return sarch(arr, si, tar, mid-1);
            }
            // right
            else{
                return sarch(arr, mid+1, tar, ei);
            }
        }
        // mid on L2
        else{
            // case c : right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return sarch(arr, mid+1, tar, ei);
            }
            // case d : left 
            else{
                return sarch(arr, si, tar, mid-1);
            }
        }
    }

    public static String[] mergeSort(String[] arr, int lo, int hi){
        if (lo == hi) {
            String A[] = { arr[lo] };
            return A;
        }

        int mid = lo + (hi - lo) / 2;

        String arr1[] = mergeSort(arr, lo, mid);
        String arr2[] = mergeSort(arr, mid+1, hi);

        String arr3[] = merge(arr1, arr2);
        return arr3;

    }
    public static String[] merge(String arr1[], String arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m + n];

        int idx = 0 ;
        int i = 0 ;
        int j = 0 ;

        while (i < m && j < n) {
            if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
             arr3[idx] = arr1[i];
             i++;
             idx++;   
            }
            else{
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }
            while (i < m) {
                arr3[idx] = arr1[i];
                i++;
                idx++;
            }
            while (j < n) {
                arr3[idx] = arr2[j];
                j++ ;
                idx++;
            }
        }
        return arr3;
    }
    static boolean isAlphabeticallySmaller(String str1, String str2){
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }
}
// binary

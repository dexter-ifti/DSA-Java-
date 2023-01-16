import java.util.*;
public class Basics{
    public static void main(String args[]){

            try (Scanner sc = new Scanner(System.in)){

                // System.out.println("Enter Number : ");
                // int n = sc.nextInt();
                //    int num1 = sc.nextInt();
                //    int num2 = sc.nextInt();
                //    product(4,3);
                //    System.out.println(Binomial(3,2));
                // System.out.println(isPrime(4));
                // primesInRang(20);
                // binTodec(101);
                // decTobin(5);
                // numberSystem(8,67);
                int arr[] = {2,4,6,8,10,12,14,16,18,20};
                // int key = 18 ;

                // int index = linearSearch(arr, key);
                // if(index == -1){
                //     System.out.println("Not Found");
                // }else{
                //     System.out.println("Key Found at index :: " +index);
                // }
                System.out.println("The key found at : "+binarySearch(arr, 12));
                
                //     int index = binarySearch(arr, 14, start, end, mid);
                // if(index == mid){
                //     System.out.println("Key found at : "+mid);
                // }else{
                //     System.out.println("key not found");
                // }
            }
    }
    public static void product(int a , int b){
       int product = a * b ;
       System.out.println(product);
    }
    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{

        int fact = n * factorial(n-1);
        return fact;
        }
    }
    public static int Binomial(int n , int r){
        int x = factorial(n);
        int y = factorial(r);
        int z = factorial(n-r);
        int a = x/(y*z);
        return a;
    } 
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }

        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                return false;
                    
            }
        }

        return true;
    }
    public static void primesInRang(int n){
        for(int i = 2 ; i <= n ;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void binTodec(int binNum){
        int mynum = binNum ;
        int pow = 0;
        int decNum = 0 ;

        while (binNum > 0){
            int lastDigit = binNum % 10 ;
            decNum = decNum + (lastDigit *(int) (Math.pow(2,pow)));

            pow ++ ;
            binNum = binNum / 10 ;
        }
        System.out.println("Decimal of "+mynum + " = "+ decNum);
    }
    public static void decTobin(int decNum){
        int mynum = decNum ;
        int pow = 0;
        int binNum = 0 ;
        while(decNum > 0){
            int reminder = decNum % 2;
            binNum = binNum + (reminder*(int)(Math.pow(10,pow)));

            pow++;
            decNum /= 2;
        }
        System.out.println("Binary form of "+mynum +" is = " +binNum);
    }
    public static void numberSystem(int r, int n){
        int pow = 0;
        int num = 0 ;
        int mynum = n ;

        while (n > 0){
            int lastDigit = n % 10 ;
            num = num + (lastDigit*(int)Math.pow(r,pow));

            pow++;
            n /= 10 ; 
        }
        System.out.println("Decimal of " +mynum +" is = " +num);
    }
    public static void array() {
        int [][]flats ;
        // = {2, 3, 4, 4, 3};//= new int[8];
    flats = new int[2][5];
    //  marks[] = new int[5];

    flats[0][0] = 44;
    flats[0][1] = 53;
    flats[0][2] = 78;
    flats[0][3] = 19;
    flats[0][4] = 76;

   for(int i = 0 ; i < flats.length ; i++){
    for(int j = 0 ; j < flats[i].length ; j++){
        System.out.print(flats[i][j] + " ");
    }
    System.out.println();
}
        
    }
    public static int linearSearch(int arr[] , int key) {
        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] == key) {
                return i;
            }
        }
        
        return -1 ;
    }
    public static int getLargest_Smallest(int arr[]) {
        int largest = Integer.MIN_VALUE ; // -Infinity
        int smallest = Integer.MAX_VALUE; // +Infinity
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] >= largest){
                largest = arr[i] ;
            }
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("The Smallest number is : "+smallest);
        return largest ;

    }
    public static int binarySearch(int arr[], int key) {
       
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if(arr[mid] == key){
                return mid ; 
            }
            if(arr[mid] > key){
                end = mid - 1 ;
            }else{
                start = mid + 1 ;
            }
        
        }

        return -1 ;
    }
}
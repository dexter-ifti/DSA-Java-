import java.util.*;
public class Fxn_Assignment{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Numbers :: ");
            int a = sc.nextInt();
            // int b = sc.nextInt();
            // int c = sc.nextInt();
            // avg(a,b,c);

            // if(isPalindrome(a)){

            //     System.out.println(a+ " is a Palindrome");
            // }else{

            //     System.out.println(a+ " is not a Palidrome");
            // }
            sumDigit(a);
        }

    }
    public static void avg(int num1,int num2,int num3){
        int average = (num1 + num2 + num3 )/3 ;

        System.out.println("Average of entered number is "+average);
    }
    public static boolean isEven(int num){
        if (num % 2 == 0){
            return true;
        }else{
            return false ;
        }
    }
    public static boolean isPalindrome(int num) {
        int palindrome = num ;
        int reverse = 0 ;
        
        while(palindrome != 0){

            int reminder = palindrome % 10 ;
            
            reverse = reverse * 10 + reminder;
            
            palindrome /= 10 ;
            
        }
            if(num == reverse){
                return true ;
            }
        return false ;
        
    }
    public static void sumDigit(int num) {
        int sumOfDigit = 0 ;
        int number = num ;
        while(num != 0){
            
            int reminder = num % 10 ;
            
            sumOfDigit = sumOfDigit + reminder ;

            num /=10 ;

            
        }
        System.out.println("Sum of digits of "+number + " is "+sumOfDigit);
    }
}
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){

            System.out.print("Enter Number :: ");
            int a = sc.nextInt();
            if(isPalindrome(a)){
                System.out.println(a+ " is a Palindrome");
            }else{
                
                System.out.println(a+ " is not a Palidrome");
            }
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
    
}

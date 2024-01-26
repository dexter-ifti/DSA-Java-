import java.util.*;
public class Rverse_Given_Number{
    public static void main(String args[]){

        int reverse = 0 ;
       for (int number = 584928 ;number > 0 ;){
        int last_digit = number % 10 ;
         reverse = reverse * 10 + last_digit ;
         number /= 10 ;
       }
        
        System.out.println(reverse);
    }
}

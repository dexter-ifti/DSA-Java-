import java.util.*;
public class Print_Reverse_Number{
    public static void main(String args[]){

        
       for (int number = 584928 ;number > 0 ;){
        int last_digit = number % 10 ;
        System.out.print(last_digit + " ");
        number /= 10 ;
       }
        
        System.out.println();
    }
}
import java.util.*;
public class Divisibility_Check{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        // if(num % 5 == 0 && num % 3 == 0){
        //     System.out.println("Number is divisible by 5 & 3");
        // }else{
        //     System.out.println("Not Divisible");
        // }
        if(num % 5 == 0){
            if(num % 3 == 0){
                System.out.println("Number is divisible by 5 & 3");
            }
            else{
                System.out.println("Not Divisible");

            }

            
        }
        else{

                System.out.println("Not Divisible");
        }
    }
}
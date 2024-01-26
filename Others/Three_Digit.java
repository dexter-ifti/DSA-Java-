import java.util.*;
public class Three_Digit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        if(num > 9 && num < 100){
            System.out.println(num + " is a two digit number");
        }else if(num > 99 && num < 1000){
            System.out.println(num +" is a three digit nmbr");
        }else{
            System.out.println("It is Higher digit number");
        }
    }
}
import java.util.*;
public class Using_Break{
    public static void main(String args[]){

       do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number : ");
            int n = sc.nextInt();
            if(n % 10 == 0){
             break;
            }

       }
        while (true);

            System.out.println("Yhi to nhi krna tha");

    }
}
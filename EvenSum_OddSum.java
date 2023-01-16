import java.util.*;
public class EvenSum_OddSum{
    public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            int choice,evensum = 0,oddsum = 0;
            do{
            System.out.println("Enter number : ");
            int n = sc.nextInt();
                if(n % 2 == 0){
                    evensum += n;
                }else{
                    oddsum += n ;
                }

                System.out.println("Do you want to continue press 1 otherwise 0");
                choice = sc.nextInt();
            }while(choice == 1);

            System.out.println("evensum = "+evensum);
            System.out.println("oddsum = "+oddsum);

    }
}
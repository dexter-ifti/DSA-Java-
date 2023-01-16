import java.util.*;
public class PrimeNumber{
    public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number : ");
            int n = sc.nextInt();
            for(int i = 2 ; i <=Math.sqrt(n) ; i++){
                if(n % i == 0){
                    System.out.println("Number is not Prime");
                    break;
                }else{

                    System.out.println("Number is Prime");
                    break;
                }
            }

    }
}
 import java.util.*;
public class FactorialFxn{
    public static void main(String args[]){
         System.out.println(factorial(7));
         System.out.println(Binomial(3,2));
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
}     

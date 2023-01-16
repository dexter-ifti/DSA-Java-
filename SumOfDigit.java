public class SumOfDigit {
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

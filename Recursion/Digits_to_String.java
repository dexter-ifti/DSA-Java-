public class Digits_to_String{
    public static void main(String[] args) {
        String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        printDigit(1234, digits);
        System.out.println();
    }
    public static void printDigit(int number, String digits[]) {
        if (number == 0) {
            return;
        }

        int lastDigit = number % 10 ;
        printDigit(number/10, digits);
        System.out.print(digits[lastDigit]+ " ");
    } 
}
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void anagrams(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        if (str1.length() == str2.length()) {

            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if (Arrays.equals(ch1, ch2)) {

                System.out.println(str1 + " and " + str2 + " are Angrams");
            } else {
                System.out.println(str1 + " and " + str2 + " are not Angrams");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not Angrams");
        }
    }
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Your Strings: ");
			String str1 = sc.next();
			String str2 = sc.next();
			anagrams(str1, str2);
		}
    }
}

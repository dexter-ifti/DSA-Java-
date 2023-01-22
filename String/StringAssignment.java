import java.util.Arrays;
import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // System.out.println("Enter Your String : ");
            // String str = sc.nextLine();
            // int count = 0 ;
            // for(int i = 0 ; i < str.length() ; i++){
            // if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
            // str.charAt(i) == 'o' || str.charAt(i) == 'u'){
            // count++ ;
            // }
            // }
            // System.out.println(count);

            System.out.print("Enter Your Strings: ");
            String str1 = sc.next();
            String str2 = sc.next();
            anagrams(str1, str2);
        }
        // String str = "TahaIftihar" ;
        // String str1 = "ApnaCollege" ;
        // String str2 = "TahaIftihar" ;
        // System.out.println(str.equals(str1) + " " + str.equals(str2));
        // boolean taha = str == str2 ? true : false ;
        // System.out.println(taha);

        // String str3 = "ApnaCollege".replace("l", "");
        // System.out.println(str3);

    }

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
}

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // String str = "a,b,c,d";
            // String str2 = new String("xyz");

            // String str3 = sc.next(); //for one word input
            // String str4 = sc.nextLine(); //for a sentence input

            // System.out.println(str);
            // System.out.println(str2);
            // System.out.println(str3);
            // System.out.println(str4);

            // String fullName = "taha iftikhar";
            // System.out.println(fullName.length()); //here length is a function 

            // CONCATENATION
            String firstName = "taha" ;
            String lastName = "iftikhar" ;
            String fullName = firstName + " " + lastName ;
            // System.out.println(fullName);
            printLettrs(fullName);
        }
    }
    public static void printLettrs(String str) {
        for(int i = 0 ; i < str.length() ; i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    
    
}

import java.util.*;

public class Generate_Binary_Numbers {

   private static void printBinaryNumbers(int n) {
    if (n == 0) {
        return;
    }
    Queue<String> q = new LinkedList<String>();
    q.add("1");

    
    while (n-- > 0) {
        String curr = q.peek();
        q.remove();
        System.out.print(curr + " ");
        
        String s2 = curr;

        q.add(curr + "0");
        q.add(s2 + "1");
    }
    System.out.println();
   }
    
   
    public static void main(String[] args) {
      printBinaryNumbers(5);
      System.out.println("------------------------------------------------------------");
      printBinaryNumbers(10);
    }
}

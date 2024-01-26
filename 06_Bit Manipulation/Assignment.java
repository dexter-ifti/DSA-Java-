public class Assignment{
  
      public static void main(String args[]) {
            // swap(5, 7);
            // add_one(6);
            // add_one(-4);
            // add_one(0);
            //upper_lower();
      }
     public static void swap(int a, int b) {
        System.out.println("Before Swapping a = "+a +" & b = "+b);
        // Method - 1
        a = a ^ b ;
        b = a ^ b ;
        a = a ^ b ;
        // Method - 2
        // a = a + b;
        // b = a - b;
        // a = a - b;

        System.out.println("After Swapping a = "+a +" & b = "+b);
    }    
    
    public static void add_one(int n ) {
        System.out.println(n+ " + 1 = " + -~n);
    }    
    
    public static void upper_lower() {
      for(char ch = 'A' ; ch <= 'Z' ; ch ++){
            System.out.print((char)(ch | ' '));
        }
    }    
}

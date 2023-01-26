public class BitOperations {   
   public static void main(String args[]) {          
             // even_odd(2);
            // even_odd(5);
            // even_odd(3);
            // even_odd(8);
            // System.out.println(getBit(10, 3));
            // System.out.println(setBit(10, 2));
            // System.out.println(clearBit(10, 2));
            //System.out.println(updateBit(10, 2, 1));
            // System.out.println(clearIBit(15, 2));
            // System.out.println(clearBitsInRange(10, 2, 4));
            // System.out.println(check_Power_2(8));
            // System.out.println(count_set_bits(10));
            // System.out.println(fast_expo(5, 4));
            
    } 

   public static void even_odd(int n) {
        int bitMask = 1 ;
        if((n & bitMask) == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }

    public static int getBit(int n, int i) {
        int bitMask = 1 << i ;
        if((n & bitMask) == 0){
            return 0;
        }else {
            return 1;
        }
    }
    
    public static int setBit(int n , int i) {
        int bitMask = 1 << i ;
        return n | bitMask ;
    }    
   
    public static int clearBit(int n , int i) {
        int bitMask = ~(1 << i) ;
        return n & bitMask ;
    }    
    
    public static int updateBit(int n, int i, int newBit) {
        // if(newBit == 0){
        //     return clearBit(n, i);
        // }else{
        //     return setBit(n, i);
        // }
        n = clearBit(n, i);
        int BitMask = newBit << i ;
        return n | BitMask ;
    } 
   
    public static int clearIBit(int n , int i) {
        int bitMask = (~0) << i ;
        return n & bitMask ;
    }

    public static int clearBitsInRange(int n, int i, int j) {
        int a = ((~0) << (j+1));
        int b = (1 << i) - 1 ;
        int bitMask = a | b ;
        return n & bitMask ;
    }
    
    public static boolean check_Power_2(int n) {
        // int bitMask = n & (n-1) ;
        // if(bitMask == 0){
        //     System.out.println(n+" is Power of 2");
        //     return true ;
        // }else {
        //     System.out.println(n+" is not Power of 2");
        //     return false;
        // }
        return (n & (n-1)) == 0 ;
    }    
    
    public static int count_set_bits(int n) {
        int count = 0 ;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++ ;
            }
            n = n >> 1 ;
        }
        return count;
    }
    public static int fast_expo(int a, int n) {
        int ans = 1;
        
        while (n > 0) {
            if ((n & 1) != 0) {
                ans *= a ;
            }
            a *= a ;
            n = n >> 1 ;
        }
        return ans ;
    }    
}

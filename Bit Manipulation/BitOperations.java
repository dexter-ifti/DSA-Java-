   public static void main(String args[]) {          
             // even_odd(2);
            // even_odd(5);
            // even_odd(3);
            // even_odd(8);
            // System.out.println(getBit(10, 3));
            // System.out.println(setBit(10, 2));
            // System.out.println(clearBit(10, 2));
            //System.out.println(updateBit(10, 2, 1));
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
        int bitMask = ~(i << i) ;
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

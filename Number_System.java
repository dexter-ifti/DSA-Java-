 public static void binTodec(int binNum){
        int mynum = binNum ;
        int pow = 0;
        int decNum = 0 ;

        while (binNum > 0){
            int lastDigit = binNum % 10 ;
            decNum = decNum + (lastDigit *(int) (Math.pow(2,pow)));

            pow ++ ;
            binNum = binNum / 10 ;
        }
        System.out.println("Decimal of "+mynum + " = "+ decNum);
    }
    public static void decTobin(int decNum){
        int mynum = decNum ;
        int pow = 0;
        int binNum = 0 ;
        while(decNum > 0){
            int reminder = decNum % 2;
            binNum = binNum + (reminder*(int)(Math.pow(10,pow)));

            pow++;
            decNum /= 2;
        }
        System.out.println("Binary form of "+mynum +" is = " +binNum);
    }
    public static void numberSystem(int r, int n){
        int pow = 0;
        int num = 0 ;
        int mynum = n ;

        while (n > 0){
            int lastDigit = n % 10 ;
            num = num + (lastDigit*(int)Math.pow(r,pow));

            pow++;
            n /= 10 ; 
        }
        System.out.println("Decimal of " +mynum +" is = " +num);
    }
public class SubarraySum {
                        //Brute Force Method
    public static void subarraySum(int numbers[]) { 
        int maxSum  =  Integer.MIN_VALUE ;
        int currSum = 0 ;

        for(int i = 0 ; i < numbers.length ; i++){
            for(int j = i ; j < numbers.length ; j++){
                currSum  = 0 ;
                for(int k = i ; k <= j ; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum ;
                }
            }
        }
        System.out.println("Maximum sum : "+maxSum);
    }   
                                // Prefix Array Method 
    public static void subarraySum2(int numbers[]) {
        int currSum = 0 ;
        int maxSum = Integer.MIN_VALUE ;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0] ;

        for(int i = 1 ; i < numbers.length ; i++){
            prefix[i] = prefix[i-1] + numbers[i] ;
        }
        for(int i = 0 ; i < numbers.length ; i++){
            for(int j = i ; j < numbers.length ; j++){
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
            
                if(maxSum < currSum){
                    maxSum = currSum ;
                }
            }
        }
        System.out.println("max sum = "+maxSum);
    }    
                            // Kadanes Algorithm 
    public static void kadanes(int numbers[]) {
        int cs = 00 ;
        int ms = Integer.MIN_VALUE ;
       
        for(int i = 0 ; i < numbers.length ; i++){
            cs += numbers[i];
            ms = Math.max(ms, cs);
            if(cs < 0){
                cs = 0 ;
            }
        }
        System.out.println("Max SubarraySum is : "+ms);
    }    
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        subarraySum(numbers);
        subarraySum2(numbers);
        kadanes(numbers);
    }
}

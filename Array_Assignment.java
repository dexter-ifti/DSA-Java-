public class Array_Assignment {
    public static boolean ques1(int arr[]) {
        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    return true ;
                }
            }
        }
        return false ;
    }
    // Ques 2  , Three Functions
    public static int search(int arr[], int target) {
        // min will have index of minimum element of arr
        int min = minSearch(arr);

        // find in sorted left
        if(arr[min] <= target && target <= arr[arr.length-1]){
            return search(arr, min, arr.length-1, target);
        }
        // find in sorted right
        else{
            return search(arr, 0, min, target);
        }
    }
    public static int search(int[] arr, int left, int right, int target) {
        int l = left ;
        int r = right ;

        while (l <= r){
            int mid = l + (r-l)/2 ;
            if(arr[mid] == target){
                return mid ;
            }
            else if (arr[mid] > target){
                r = mid - 1 ;
            }
            else{
                l = mid + 1 ;
            }
        }
        return -1 ;
    }
    public static int minSearch(int arr[]) {
        int left = 0 ;
        int right = arr.length-1;

        while(left < right){
            int mid = left +(right - left)/2 ;
            if(mid > 0 && arr[mid-1] > arr[mid]){
                return mid ;
            }else if(arr[left] <= arr[mid] && arr[mid] > arr[right]){
                left = mid + 1;
            }else{
                right = mid - 1 ;
            }
        }
        return left ; 
    }

                //   ques 3 - Buy And Sell Stockes
    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE ;
        int maxProfit = 0 ;
                    
        for(int i = 0 ; i < prices.length; i++){
            if(buyPrice < prices[i]){ // profit
                int profit = prices[i] - buyPrice ;//today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i] ;
            }   
        }
        return maxProfit ;
    } 
     
        //    Ques 4 And Ques 5 Remaining 
                
    public static void main(String[] args) {
        // int arr[] = {4,5,6,7,0,1,2} ;
        // System.out.println(search(arr, 0));
        int prices [] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(prices));
    }
}

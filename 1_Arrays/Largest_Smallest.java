public class Largest_Smallest {
    public static int getLargest_Smallest(int arr[]) {
        int largest = Integer.MIN_VALUE ; // -Infinity
        int smallest = Integer.MAX_VALUE; // +Infinity
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] >= largest){
                largest = arr[i] ;
            }
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("The Smallest number is : "+smallest);
        return largest ;

    }
    public static void main(String[] args) {
        int arr[] = {2,12,14,4,20,6,8,1,16,18,};
        System.out.println("The largest number is : "+getLargest_Smallest(arr));
    }
}

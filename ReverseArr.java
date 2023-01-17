public class ReverseArr {
    public static void reverse(int arr[]) {
        int start = 0 ;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start] ;
            arr[start] = arr[end] ;
            arr[end] = temp ;
            start ++;
            end -- ;
        }
    }    
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16,18,20};
        reverse(arr);
        for(int element : arr){
            System.out.print(element+" ");
        }
    }
}

// import java.util.Arrays;
// import java.util.Collections;

public class Sortings {
    public static void bubbleSort(int arr[]) {
        boolean swapped;
        for(int turn = 0 ; turn < arr.length ; turn ++){
            swapped = false;
            for(int j = 0 ; j < arr.length - 1 - turn ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                    swapped = true ;
                }
            }
            if(!swapped){
                break ;
            }
        }
    }    
    public static void selectionSort(int arr[]) {
        for(int i = 0 ; i < arr.length - 1 ; i++){
            int minPos = i ;
            for(int j = i+1; j < arr.length ; j++){
                if(arr[minPos]  > arr[j]){
                    minPos = j ;
                }
            }
            // swap
            int temp = arr[minPos] ;
            arr[minPos] = arr[i];
            arr[i] = temp ;
        }
    } 
    public static void insertionSort(int arr[]) {
        for(int i = 1 ; i < arr.length; i++){
            int curr = arr[i] ;
            int prev = i-1 ;
            // finding out the correct position to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev-- ;
            }
            // insertion
            arr[prev+1] = curr;
        }
    }       
    public static void countingsort(int arr[]) {
        int largest = Integer.MIN_VALUE ;
        for(int i = 0 ; i < arr.length ; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1] ;
        for(int i = 0 ; i < arr.length ; i ++){
            count[arr[i]]++ ;
        }
        int j = 0 ;
        for(int i = 0 ; i < count.length ; i++){
            while(count[i] > 0){
                arr[j] = i ;
                j++ ;
                count[i]-- ;
            }
        }
    }   
    public static void printArr(int arr[]) {
        for(int i : arr){
            System.out.print(i+ " ");
        }
        System.out.println();

    }  
    public static void main(String[] args) {
        // int arr[] = {5, 4, 1, 3, 2};
        // int arr[] = {1, 2, 3, 4, 5, 6};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // printArr(arr);
        // Arrays.sort(arr,0,4);
        // Integer array[] = {4,33,56,76,2,8,1};
        // Arrays.sort(array,Collections.reverseOrder());
        int A[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingsort(A);
        printArr(A);
    } 
}

public class Sorting_Assignment {
    public static void bubbleSort(int arr[]) {

        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void selectionSort(int arr[]) {
       for(int i = 0 ; i < arr.length ; i++){
            int minPos = i;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[minPos] < arr[j]){
                    minPos = j ;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp ;
       } 
    }

    public static void insertionSort(int arr[]) {
        for(int i = 1 ; i < arr.length ; i++){
            int curr = arr[i];
            int prev = i-1 ;
            while(prev >= 0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr ;
        }
    }

    public static void countingsort(int arr[]) {
        int largest = Integer.MIN_VALUE ;
        for(int i = 0 ; i < arr.length ; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i = 0 ; i < arr.length ; i++){
            count[arr[i]]++ ;
        }
        int j = 0 ;
        for(int i = count.length-1 ; i >= 0 ; i--){
            while(count[i] > 0){
                arr[j] = i ;
                j++ ; 
                count[i]-- ;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 1, 3, 8, 7, 4, 5, 3, 1 };
        // bubbleSort(arr);
        selectionSort(arr);
        // insertionSort(arr);
        // countingsort(arr);
        printArr(arr);
    }
}

public class First_Last_Occurance {
    public static int firstOccurance(int arr[], int i, int key) {
        if (i == arr.length) {
            System.out.println("Not Found");
            return -1;
        }
        if (arr[i] == key) {
            System.out.println("Found at "+i);
            return i;
        }
        return firstOccurance(arr, i+1, key);
    }    
    
    public static int lastOccurance(int arr[], int i, int key)
    {
        if (i == arr.length) 
        {
            return -1;
        }
        int isFound = lastOccurance(arr, i+1, key);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }    
    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 5, 10, 2, 5, 3};
        firstOccurance(arr, 0, 5);
        System.out.println(lastOccurance(arr, 0, 5));
    }
}

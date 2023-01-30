public class Find_Key_All_Occurance {
    public static void allOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i+ " ");
        }
        allOccurance(arr, key, i+1);
    } 
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        allOccurance(arr, 2, 0);
    }
}

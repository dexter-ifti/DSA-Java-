import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {4, 3, 99, 35, 2, 65, 29, 54};
        // arr = sort(arr);
        // System.out.println(Arrays.toString(arr));
        sort_in_Place(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sort(int arr[]){
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length/2;

        int left[] = sort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int left[], int right[]){
        int i = 0; int j = 0; int k = 0;
        int mix[] = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k++] = left[i++];
            } else{
                mix[k++] = right[j++];
            }
        }
        while (i < left.length) {
            mix[k++] = left[i++]; 
        }

        while (j < right.length) {
            mix[k++] = right[j++]; 
        }
        return mix;
    }



    public static void sort_in_Place(int arr[], int s, int e){
        if (e - s == 1) {
            return;
        }

        int mid = s + (e-s)/2;

        sort_in_Place(arr, s, mid);
        sort_in_Place(arr, mid, e);

        merge_in_place(arr, s, mid, e);
    }

    public static void merge_in_place(int arr[], int s, int mid, int e){
        int i = s; int j = mid; int k = 0;
        int mix[] = new int[e-s];

        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else{
                mix[k++] = arr[j++];
            }
        }
        while (i < mid) {
            mix[k++] = arr[i++]; 
        }

        while (j < e) {
            mix[k++] = arr[j++]; 
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}

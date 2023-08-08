import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1, 75, 4, 5, 9, 6, 75, 75, 46, 34, 28, 75};
        // System.out.println(findLast(arr, 28, arr.length-1));
        // findAll(arr, 75, 0);
        // System.out.println(list);
        System.out.println(findAllIndex(arr, 75, 0));
    }

    static boolean ls(int arr[], int index, int target) {
        if(index == arr.length) {
            return false;
        }
        return arr[index] == target || ls(arr, index+1, target); 
    }

    static int findIndex(int arr[], int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        else if(arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index+1);
    }

    static int findLast(int arr[], int target, int index) {
        if(index == 0) {
            return -1;
        }
        else if (arr[index] == target) {
            return index;
        }
        else {
            return findLast(arr, target, --index);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    // static void findAll(int[] arr, int target, int index) {
    //     if(index == arr.length){
    //         return;
    //     }
    //     if(arr[index] == target) {
    //         list.add(index);
    //     }
    //     findAll(arr, target, index + 1);
    // }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1);
    }
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index+1);
        
        list.addAll(ansFromBelowCalls);
        
        return list;
    }
}

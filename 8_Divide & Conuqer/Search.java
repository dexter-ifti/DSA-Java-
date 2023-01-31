 public static void main (String args[]){
    int arr[] = {4, 5, 6, 7, 0, 1, 2};
    int idx = sarch(arr, 0, 0, arr.length-1);
    System.out.println(idx);
 }

public static int sarch(int arr[], int si, int tar, int ei) {
        if (si > ei) {
            return -1;
        }
        // kaam
        int mid = si + (ei - si)/2 ;
        if (tar == arr[mid]) {
            return mid ;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a :: Left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return sarch(arr, si, tar, mid-1);
            }
            // right
            else{
                return sarch(arr, mid+1, tar, ei);
            }
        }
        // mid on L2
        else{
            // case c : right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return sarch(arr, mid+1, tar, ei);
            }
            // case d : left 
            else{
                return sarch(arr, si, tar, mid-1);
            }
        }
    }

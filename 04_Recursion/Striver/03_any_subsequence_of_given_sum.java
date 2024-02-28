import java.util.*;
public class 03_any_subsequence_of_given_sum {
    static boolean printS(int ind, ArrayList<Integer> ds, int s, int sum , int arr[], int n){
        if(ind == n){
            if(s == sum){
                for(int it: ds){
                    System.out.print(it+" ");
                }
                System.out.println();
                return true;
            }
            else return false;
        }
        ds.add(arr[ind]);
        s += arr[ind];
        
        if(printS(ind+1, ds, s, sum, arr, n)) return true;
        
        s -= arr[ind];
        
        ds.remove(ds.size()-1);
        
        if(printS(ind+1, ds, s, sum, arr, n)) return true;
        
        return false;
    }
    public static void main(String args[]) {
      int arr[] = {1,2,1};
      int n = 3;
      int sum = 2;
      ArrayList<Integer> ds = new ArrayList<>();
      boolean s = printS(0, ds, 0, sum, arr, n);
    }
}

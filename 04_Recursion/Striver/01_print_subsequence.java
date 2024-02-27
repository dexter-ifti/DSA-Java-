import java.util.*;
public class Main
{
    static void printF(int ind, ArrayList<Integer> ds, int[] arr, int n){
        if(ind == n){
            for(int it : ds){
                System.out.print(it+" ");
            }
            if(ds.size() == 0) System.out.print("{}");
            System.out.println();
            return;
        }
        // not pick condition , this element is not be added to the subsequence
        printF(ind+1, ds, arr, n);
        
        // pick condition , this element is added to the subsequence
        ds.add(arr[ind]);
        printF(ind+1, ds, arr, n);
        ds.remove(ds.size()-1);
    }
	public static void main(String[] args) {
		int[] arr = {3,1,2};
		int n = 3;
		ArrayList<Integer> ds = new ArrayList<>();
		printF(0, ds, arr, n);
	}
}

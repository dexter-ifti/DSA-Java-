import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = a.length-1; i >= 0; i--) {
            if(a[i] > max){
                list.add(a[i]);
            }
            max = Math.max(max, a[i]);
        }
        Collections.sort(list);
        return list;
    }
}

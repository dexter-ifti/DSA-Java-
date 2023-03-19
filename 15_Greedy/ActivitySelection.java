import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 00, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // if the activities were not sorted according to end time
        int activity[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }
        // lamda Fxn
        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        int prevEnd = end[0];

        for (int i = 0; i < end.length; i++) {
            if (start[i] >= prevEnd) {
                ans.add(i);
                prevEnd = end[i];
            }
        }

        System.out.println(ans.size());

        // print As
        for (int i = 0; i < ans.size(); i++) {
            // System.out.print(start[ans.get(i)] + "-" + end[ans.get(i)] + "\t");
            System.out.print("A" + ans.get(i)+ " ");
        }
        System.out.println();
    }
}
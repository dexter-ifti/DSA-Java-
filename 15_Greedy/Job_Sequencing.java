import java.util.ArrayList;
import java.util.Collections;

public class Job_Sequencing {
    static class Job {
        int id;
        int deadline;
        int profit;

        public Job(int id, int deadline, int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        int jobInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        Collections.sort(jobs, (a, b) -> b.profit - a.profit);
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(jobs.get(0).id);
        int time = 1;
        for (int i = 1; i < jobs.size(); i++) {
            Job j = jobs.get(i);
            if (time < j.deadline) {
                ans.add(j.id);
                time++;
            }
        }

        System.out.println("Max Jobs = " + ans.size());
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+ " ");
        }
        System.out.println();
    }
}

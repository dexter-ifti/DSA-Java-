public class Tiling {
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
    public static int tilingProblem(int n) { // 2 x n (Floor Size)
        //Base Case
        if (n == 0 || n == 1) {
            return 1;
        } 
        // Kaam
        // Vertical Choice
        int fnm1 = tilingProblem(n-1);
        // Horizontal Choice
        int fnm2 = tilingProblem(n-2);

        int totways = fnm1 + fnm2;
        return totways;
    }    
}

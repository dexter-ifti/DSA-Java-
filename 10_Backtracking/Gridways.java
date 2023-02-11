 public class GridWays{
   public sttatic void main(String args)
   {
     int n = 3;
    int m = 3 ;
    System.out.println(gridWays(0, 0, n, m));
   }
  public static int gridWays(int i, int j, int n, int m) {
        // Base case
        if (i == n - 1 && j == m - 1) { // condn for last cell
            return 1;
        } else if (i == n || j == n) // boundry cross condn ;
        {
            return 0;
        }

        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);

        return w1 + w2;
    }
 }  

                        // Time Complexity: O(n), 
                        // where n is the length of the given string.
                        // Auxiliary Space: O(n)
import java.util.Arrays;

public class Smallest_String 
{
    public static char[] lexo_small(int n, int k) 
    {
        char arr[] = new char[n];

        Arrays.fill(arr, 'a');

        for (int i = n-1; i >= 0; i--) 
        {
            k -= i;

            if (k >= 0) 
            {
                if (k >= 26) 
                {
                    arr[i] = 'z';
                    k -= 26;
                } else 
                {
                    arr[i] = (char)(k + 97 - 1);
                    k -= arr[i] - 'a' + 1;
                }
            } 
            else 
            {
                break;
            }
            k += i;
        }
        return arr;
    }
    public static void main(String[] args) {
        int n = 5, k = 42;
        char arr[] = lexo_small(n, k);
        System.out.println(new String(arr));
    }
}

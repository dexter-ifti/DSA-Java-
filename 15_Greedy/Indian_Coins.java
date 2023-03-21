import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Indian_Coins {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("Total coins used = " + countOfCoins);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+ " ");
        }
        System.out.println();
    }



// this is brute force 
    public static int change(int value) {
        int twoK = value / 2000;
        value %= 2000;
        int fiveH = value / 500;
        value %= 500;
        int hundred = value / 100;
        value %= 100;
        int fifty = value / 50;
        value %= 50;
        int twenty = value / 20;
        value %= 20;
        int ten = value / 10;
        value %= 10;
        int five = value / 5;
        value %= 5;
        int two = value / 2;
        value %= 2;
        int one = value / 1;
        value %= 1;

        return twoK + fiveH + hundred + fifty + twenty + ten + five + two + one; 
    }
   
}

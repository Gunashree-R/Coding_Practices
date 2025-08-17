import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int maxp = 0;
        int minp = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            minp = Math.min(minp, prices[i]);
            maxp = Math.max(maxp, prices[i] - minp);
        }

        return maxp;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s1 = new Solution();

        int n = sc.nextInt(); //  read n first
        int[] prices = new int[n]; //  create array after reading n

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.println(s1.maxProfit(prices)); //  pass array
    }
}

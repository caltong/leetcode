package sort;

import java.util.Arrays;

public class Q1833 {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for (int cost : costs) {
            if (coins >= cost) {
                count += 1;
                coins -= cost;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Q1833 q1833 = new Q1833();
        int res = q1833.maxIceCream(new int[]{1, 3, 2, 4, 1}, 7);
        System.out.println(res);
    }
}

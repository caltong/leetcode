package binarysearch;

import java.util.Arrays;

public class Q1011 {
    public int shipWithinDays(int[] weights, int D) {
        int left = Arrays.stream(weights).max().orElse(0);
        int right = Arrays.stream(weights).sum();
        while (left < right) {
            int mid = (left + right) / 2;
            int need = 1;
            int cur = 0;
            for (int weight : weights) {
                if (cur + weight > mid) {
                    need += 1;
                    cur = 0;
                }
                cur += weight;
            }
            if (need <= D) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Q1011 q1011 = new Q1011();
        int res = q1011.shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5);
        System.out.println(res);
    }
}

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution2208 {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            pq.offer((double) num);
        }
        int res = 0;
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double sum2 = 0.0;
        while (sum2 < sum / 2) {
            double x = pq.poll();
            sum2 += x / 2;
            pq.offer(x / 2);
            res++;
        }
        return res;
    }
}

public class MinimumOperationsToHalveArraySum {
    public static void main(String[] args) {
        int res = new Solution2208().halveArray(new int[]{5, 19, 8, 1});
        System.out.println(res);
    }
}

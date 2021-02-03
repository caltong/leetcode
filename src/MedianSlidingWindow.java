import java.util.Arrays;

class Solution480 {
    public double[] medianSlidingWindow(int[] nums, int k) {
        SlideWindow480 slideWindow480 = new SlideWindow480(nums, k);
        double[] ans = new double[nums.length - k + 1];
        ans[0] = slideWindow480.getMedian();
        for (int i = 1; i <= nums.length - k; i++) {
            slideWindow480.moveRight(nums[i - 1], nums[i + k - 1]);
            ans[i] = slideWindow480.getMedian();
        }
        return ans;
    }
}

class SlideWindow480 {
    int[] sub;
    int k;

    SlideWindow480(int[] nums, int k) {
        this.k = k;
        sub = new int[k];
        for (int i = 0; i < k; i++) {
            sub[i] = nums[i];
        }
        Arrays.sort(sub);
    }

    public double getMedian() {
        if (k % 2 == 1) {
            return sub[k / 2];
        } else {
            return 0.5 * sub[k / 2] + 0.5 * sub[k / 2 - 1];
        }
    }

    public void moveRight(int pre, int next) {
        int preIndex = find(pre);
        if (next < pre) {
            while (preIndex > 0 && sub[preIndex - 1] > next) {
                sub[preIndex] = sub[preIndex - 1];
                preIndex--;
            }
            sub[preIndex] = next;
        } else if (pre < next) {
            while (preIndex < sub.length - 1 && sub[preIndex + 1] < next) {
                sub[preIndex] = sub[preIndex + 1];
                preIndex++;
            }
            sub[preIndex] = next;
        }
    }

    private int find(int target) {
        int left = 0;
        int right = sub.length;
        int pivot;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (sub[pivot] == target) return pivot;
            if (target < sub[pivot]) right = pivot - 1;
            else left = pivot + 1;
        }
        return 0;
    }
}


public class MedianSlidingWindow {
    public static void main(String[] args) {
        Solution480 solution480 = new Solution480();
        double[] res = solution480.medianSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        System.out.println(Arrays.toString(res));
    }
}

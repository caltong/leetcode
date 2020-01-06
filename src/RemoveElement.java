import javax.sound.sampled.SourceDataLine;
import java.util.Arrays;

class Solution27 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                j--;
            } else {
                i++;
            }
        }
        return j + 1;
    }
}

public class RemoveElement {
    public static void main(String[] args) {
        Solution27 sol = new Solution27();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(sol.removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }
}

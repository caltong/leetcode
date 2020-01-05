import java.util.Arrays;

class Solution26 {
    public int removeDuplicates(int[] nums) {
        int p = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[p]!=nums[i]){
                p+=1;
                nums[p] = nums[i];
            }
        }
        return p + 1;
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        Solution26 sol = new Solution26();
        int[] sample = {1, 1, 2, 3, 3, 4, 5, 5};
        System.out.println(sol.removeDuplicates(sample));
        System.out.println(Arrays.toString(sample));
    }

}

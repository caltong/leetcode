class SolutionInterview0803 {
    public int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) {
                return i;
            }
        }
        return -1;
    }
}

public class FindMagicIndex {
    public static void main(String[] args) {
        SolutionInterview0803 solutionInterview0803 = new SolutionInterview0803();
        int res = solutionInterview0803.findMagicIndex(new int[]{1, 1, 1});
        System.out.println(res);
    }
}

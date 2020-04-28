import java.util.Arrays;

class SolutionInterview56 {
    public int[] singleNumbers(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum = sum ^ num;
        }
        int firstOneFromRight = (-sum) & sum;
        int[] res = new int[2];
        for (int num : nums) {
            if ((num & firstOneFromRight) == firstOneFromRight) {
                res[0] = res[0] ^ num;
            } else {
                res[1] = res[1] ^ num;
            }
        }
        return res;
    }
}

public class SingleNumbers {
    public static void main(String[] args) {
        SolutionInterview56 solutionInterview56 = new SolutionInterview56();
        int[] res = solutionInterview56.singleNumbers(new int[]{1, 2, 10, 4, 1, 4, 3, 3});
        System.out.println(Arrays.toString(res));
    }

}

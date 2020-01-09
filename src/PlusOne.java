import java.lang.reflect.Array;
import java.util.Arrays;

class Solution66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}

public class PlusOne {
    public static void main(String[] args) {
        Solution66 sol = new Solution66();
        System.out.println(Arrays.toString(sol.plusOne(new int[]{8, 9, 9, 9})));
    }
}

import java.util.ArrayList;
import java.util.List;

class Solution60 {
    public String getPermutation(int n, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integers.add(i + 1);
        }
        while (k > 0) {
            int step = factorial(n - 1);
            n -= 1;
            int a = k / step + 1;
            k = k % step;
            stringBuilder.append(integers.get(a - 1));
            integers.remove(a - 1);
        }
        return stringBuilder.toString();
    }

    private Integer factorial(Integer number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}

public class GetPermutation {
    public static void main(String[] args) {
        Solution60 solution60 = new Solution60();
        String res = solution60.getPermutation(3, 3);
        System.out.println(res);
    }
}

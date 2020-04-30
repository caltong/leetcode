import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution202 {
    public boolean isHappy(int n) {
        Set<Integer> buff = new HashSet<>();
        while (!buff.contains(n)) {
            buff.add(n);
            int newN = 0;
            while (n != 0) {
                newN += Math.pow(n % 10, 2);
                n = n / 10;
            }
            n = newN;
            if (n == 1) {
                return true;
            }
        }
        return false;
    }
}

public class IsHappy {
    public static void main(String[] args) {
        Solution202 solution202 = new Solution202();
        boolean res = solution202.isHappy(19);
        System.out.println(res);
    }
}

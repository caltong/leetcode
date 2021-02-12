import java.util.LinkedList;
import java.util.List;

class Solution1018 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> res = new LinkedList<>();
        int pre = 0;
        for (int a : A) {
            pre = (pre * 2 + a) % 10;
            if (pre == 0 || pre == 5) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}


public class PrefixesDivBy5 {
    public static void main(String[] args) {
        Solution1018 solution1018 = new Solution1018();
        List<Boolean> res = solution1018.prefixesDivBy5(new int[]{0, 1, 1});
        System.out.println(res);
    }
}

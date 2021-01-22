import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Solution989 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new LinkedList<>();
        int n = A.length;
        for (int i = n - 1; i >= 0 || K > 0; --i, K /= 10) {
            if (i >= 0) {
                K += A[i];
            }
            res.add(K % 10);
        }
        Collections.reverse(res);
        return res;
    }
}

public class AddToArrayForm {
    public static void main(String[] args) {
        Solution989 solution989 = new Solution989();
        List<Integer> res = solution989.addToArrayForm(new int[]{9,9,9,9,9,9,9,9,9,9}, 1);
        System.out.println(res);
    }
}

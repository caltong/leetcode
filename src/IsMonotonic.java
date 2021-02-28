class Solution896 {
    public boolean isMonotonic(int[] A) {
        boolean inc = false;
        boolean dec = false;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] < A[i]) {
                inc = true;
                if (dec) {
                    return false;
                }
            } else if (A[i - 1] > A[i]) {
                dec = true;
                if (inc) {
                    return false;
                }
            }
        }
        return true;
    }
}

public class IsMonotonic {
    public static void main(String[] args) {
        Solution896 solution896 = new Solution896();
        boolean res = solution896.isMonotonic(new int[]{1, 2, 2, 3});
        System.out.println(res);
    }
}

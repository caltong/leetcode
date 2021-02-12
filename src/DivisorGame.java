class Solution1025 {
    public boolean divisorGame(int N) {
        return N % 2 == 0;
    }
}

public class DivisorGame {
    public static void main(String[] args) {
        Solution1025 solution1025 = new Solution1025();
        boolean res = solution1025.divisorGame(3);
        System.out.println(res);
    }
}

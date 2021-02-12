class Solution657 {
    public boolean judgeCircle(String moves) {
        int[] nowPosition = new int[]{0, 0};
        int len = moves.length();
        for (int i = 0; i < len; i++) {
            if (moves.charAt(i) == 'U') {
                nowPosition[1] += 1;
            } else if (moves.charAt(i) == 'D') {
                nowPosition[1] -= 1;
            } else if (moves.charAt(i) == 'L') {
                nowPosition[0] -= 1;
            } else if (moves.charAt(i) == 'R') {
                nowPosition[0] += 1;
            }
        }
        return nowPosition[0] == 0 && nowPosition[1] == 0;
    }
}


public class JudgeCircle {
    public static void main(String[] args) {
        Solution657 solution657 = new Solution657();
        boolean res = solution657.judgeCircle("LLRR");
        System.out.println(res);
    }
}

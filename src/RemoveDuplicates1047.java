class Solution1047 {
    public String removeDuplicates(String S) {
        StringBuilder stringBuilder = new StringBuilder();
        int p = -1;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (p >= 0 && stringBuilder.charAt(p) == c) {
                stringBuilder.deleteCharAt(p);
                p -= 1;
            } else {
                stringBuilder.append(c);
                p += 1;
            }
        }
        return stringBuilder.toString();
    }
}

public class RemoveDuplicates1047 {
    public static void main(String[] args) {
        Solution1047 solution1047 = new Solution1047();
        String res = solution1047.removeDuplicates("abbaca");
        System.out.println(res);
    }
}

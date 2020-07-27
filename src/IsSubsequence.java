class Solution392 {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        int sp = 0;
        for (int i = 0; i < tLen; i++) {
            if (sp==s.length()){
                return true;
            }
            if (s.charAt(sp) == t.charAt(i)) {
                sp++;
            }
        }
        return sp == sLen;
    }
}

public class IsSubsequence {
    public static void main(String[] args) {
        Solution392 solution392 = new Solution392();
        boolean res = solution392.isSubsequence("abc", "ahbgdc");
        System.out.println(res);
    }
}

class Solution58 {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i = i - 1;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            i = i - 1;
            len = len + 1;
        }
        return len;
    }
}

public class LengthOfLastWord {
    public static void main(String[] args) {
        Solution58 sol = new Solution58();
        System.out.println(sol.lengthOfLastWord("hello world "));
    }
}

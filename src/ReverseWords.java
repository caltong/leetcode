class Solution557 {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int length = s.length();
        StringBuilder oneWord = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) != ' ') {
                oneWord.append(s.charAt(i));
            } else {
                res.append(oneWord.reverse().toString());
                res.append(' ');
                oneWord = new StringBuilder();
            }
        }
        res.append(oneWord.reverse());
        return res.toString();
    }
}

public class ReverseWords {
    public static void main(String[] args) {
        Solution557 solution557 = new Solution557();
        String res = solution557.reverseWords("Let's take LeetCode contest");
        System.out.println(res);
    }
}

class Solution28 {
    public int strStr(String haystack, String needle) {
//        for (int i = 0; i <= (haystack.length() - needle.length()); i++) {
//            if (haystack.substring(i, i + needle.length()).equals(needle)) {
//                return i;
//            }
//        }
        return haystack.indexOf(needle);
    }
}

public class StrStr {
    public static void main(String[] args) {
        Solution28 sol = new Solution28();
        System.out.println(sol.strStr("hello", "ll"));
    }
}

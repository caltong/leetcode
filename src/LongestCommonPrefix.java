class Solution14 {
    String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String reg = strs[0];
        for (String str : strs) {
            while (!str.startsWith(reg)) {
                if (reg.length() == 1) {
                    return "";
                }
                reg = reg.substring(0, reg.length() - 1);
            }
        }
        return reg;
    }
}


public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        System.out.println(sol.longestCommonPrefix(new String[]{"a"}));
    }
}

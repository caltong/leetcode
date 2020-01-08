import java.util.ArrayList;

class Solution38 {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 0; i < n - 1; i++) {
            s = getString(s);
        }
        return s;
    }

    public String getString(String s) {
        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        s = s + "0";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt += 1;
            } else {
                sb.append(Integer.toString(cnt));
                cnt = 1;
                sb.append(Character.toString(s.charAt(i)));
            }
        }
        return sb.toString();
    }
}

public class CountAndSay {
    public static void main(String[] args) {
        Solution38 sol = new Solution38();
        System.out.println(sol.getString("1"));
        System.out.println(sol.countAndSay(5));
    }
}

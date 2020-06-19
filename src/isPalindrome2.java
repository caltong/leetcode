import java.util.ArrayList;
import java.util.List;

class Solution125 {
    public boolean isPalindrome(String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                list.add(Character.toLowerCase(s.charAt(i)));
            } else if (Character.isDigit(s.charAt(i))) {
                list.add(s.charAt(i));
            }
        }
        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i) != list.get(list.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

public class isPalindrome2 {
    public static void main(String[] args) {
        Solution125 solution125 = new Solution125();
        boolean res = solution125.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(res);
    }
}

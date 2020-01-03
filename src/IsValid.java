import java.util.Stack;

class Solution20 {
    boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (st.size() == 0) {
                st.push(aChar);
            } else if (pair(st.peek(), aChar)) {
                st.pop();
            }else{
                st.push(aChar);
            }
        }
        return st.size() == 0;
    }

    private boolean pair(Character first, Character last) {
        if (first.equals('(')) {
            if (last.equals(')')) {
                return true;
            }
        }
        if (first.equals('[')) {
            if (last.equals(']')) {
                return true;
            }
        }
        if (first.equals('{')) {
            if (last.equals('}')) {
                return true;
            }
        }
        return false;
    }
}

public class IsValid {
    public static void main(String[] args) {
        Solution20 sol = new Solution20();
        System.out.println(sol.isValid("([]{})"));
    }
}

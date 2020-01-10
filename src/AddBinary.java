class Solution67 {
    public String addBinary(String a, String b) {
        int carry = 0;
        int currentA = 0;
        int currentB = 0;
        StringBuilder result = new StringBuilder();
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            if (i >= 0) {
                currentA = Character.getNumericValue(a.charAt(i));
            } else {
                currentA = 0;
            }
            if (j >= 0) {
                currentB = Character.getNumericValue(b.charAt(j));
            } else {
                currentB = 0;
            }
            if ((carry + currentA + currentB) >= 2) {
                result.insert(0, (carry + currentA + currentB) % 2);
                carry = 1;
            } else if ((carry + currentA + currentB) < 2) {
                result.insert(0, carry + currentA + currentB);
                carry = 0;
            }
        }
        if (carry == 1) {
            return result.insert(0, 1).toString();
        } else {
            return result.toString();
        }
    }
}

public class AddBinary {
    public static void main(String[] args) {
        Solution67 sol = new Solution67();
        System.out.println(sol.addBinary("1010", "1011"));
    }
}

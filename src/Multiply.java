class Solution43 {
    public String multiply(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        if (i < j) {
            return multiply(num2, num1);
        }
        String ans = "";
        while (j >= 0) {
            StringBuilder sb = new StringBuilder();
            int add = 0;
            for (int k = i; k >= 0; k--) {
                if (num2.charAt(j) - '0' == 0) {
                    sb.append('0');
                    break;
                }
                int result = (num1.charAt(k) - '0') * (num2.charAt(j) - '0') + add;
                sb.append(result % 10);
                add = result / 10;
            }
            if (add != 0) {
                sb.append(add);
            }
            sb.reverse();
            for (int k = 0; k < num2.length() - j - 1; k++) {
                sb.append("0");
            }
            ans = this.add(ans, sb.toString());
            j--;
        }
        return ans;
    }

    private String add(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int add = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            sb.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        sb.reverse();
        return sb.toString();
    }
}

public class Multiply {
    public static void main(String[] args) {
        Solution43 solution43 = new Solution43();
        String res = solution43.multiply("9", "9");
        System.out.println(res);
    }
}

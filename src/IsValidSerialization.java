class Solution331 {
    public boolean isValidSerialization(String preorder) {
        int n = preorder.length();
        int i = 0;
        int empty = 1;
        while (i < n) {
            if (empty <= 0) {
                return false;
            } else if (preorder.charAt(i) == ',') {
                i++;
            } else if (preorder.charAt(i) == '#') {
                i++;
                empty--;
            } else {
                while (i < n && preorder.charAt(i) != ',') {
                    i++;
                }
                empty++;
            }
        }
        return empty == 0;
    }
}

public class IsValidSerialization {
    public static void main(String[] args) {
        Solution331 solution331 = new Solution331();
        boolean res = solution331.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#");
        System.out.println(res);
    }
}

package math;

import java.util.Arrays;
import java.util.Comparator;

public class Q179 {
    public String largestNumber(int[] nums) {
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                for (int i = 0; i < o1.length() + o2.length(); i++) {
                    char c1 = s1.charAt(i);
                    char c2 = s2.charAt(i);
                    if (c1 != c2) {
                        return -(c1 - c2);
                    }
                }
                return 0;
            }
        });
        if (strings[0].equals("0")) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : strings) {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Q179 q179 = new Q179();
        String res = q179.largestNumber(new int[]{0, 0});
        System.out.println(res);
    }
}

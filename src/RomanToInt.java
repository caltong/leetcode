import java.util.HashMap;

class Solution13 {
    private HashMap<Character, Integer> map = new HashMap<Character, Integer>();

    Solution13() {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    int romanToInt(String s) {
        StringBuilder temp = new StringBuilder(s);
        int result = 0;
        while (temp.length() != 0) {
            if (temp.length() >= 2) {
                if (map.get(temp.charAt(0)) < map.get(temp.charAt(1))) {
                    result += (map.get(temp.charAt(1)) - map.get(temp.charAt(0)));
                    temp.deleteCharAt(0);
                    temp.deleteCharAt(0);
                } else {
                    result += map.get(temp.charAt(0));
                    temp.deleteCharAt(0);
                }
            } else {
                result += map.get(temp.charAt(0));
                temp.deleteCharAt(0);
            }
        }
        return result;
    }
}

public class RomanToInt {
    public static void main(String[] args) {
        Solution13 solution = new Solution13();
//        System.out.println(solution);
        System.out.println(solution.romanToInt("MCMXCIV"));

    }
}

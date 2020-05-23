import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution76 {
    public String minWindow(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (tMap.containsKey(t.charAt(i))) {
                tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
            } else {
                tMap.put(t.charAt(i), 1);
            }
        }
        int left = 0;
        int right = 0;
        int resLeft = -1;
        int resRight = s.length();
        while (right < s.length()) {
            if (sMap.containsKey(s.charAt(right))) {
                sMap.put(s.charAt(right), sMap.get(s.charAt(right)) + 1);
            } else {
                sMap.put(s.charAt(right), 1);
            }
            right += 1;
            while (isContains(sMap, tMap) && left <= right) {
                if (resRight - resLeft > right - left) {
                    resRight = right;
                    resLeft = left;
                }
                sMap.put(s.charAt(left), sMap.get(s.charAt(left)) - 1);
                if (sMap.get(s.charAt(left)) == 0) {
                    sMap.remove(s.charAt(left));
                }
                left += 1;
            }
        }
        return resLeft == -1 ? "" : s.substring(resLeft, resRight);
    }

    private boolean isContains(Map<Character, Integer> s, Map<Character, Integer> t) {
        Set<Character> tKeySet = t.keySet();
        for (Character key : tKeySet) {
            if (!s.containsKey(key) || t.get(key) > s.get(key)) {
                return false;
            }
        }
        return true;
    }
}

public class MinWindow {
    public static void main(String[] args) {
        Solution76 solution76 = new Solution76();
        String res = solution76.minWindow("ADOBECODEBANC", "ABC");
        System.out.println(res);
    }
}

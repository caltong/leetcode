import java.util.HashMap;
import java.util.Map;

class Solution567 {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            Integer count = map.getOrDefault(s1.charAt(i), 0);
            map.put(s1.charAt(i), count + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            //右侧加入
            char c = s2.charAt(i);
            Integer count = map.getOrDefault(c, 0);
            if (count == 1) {
                map.remove(c);
            } else {
                map.put(c, count - 1);
            }
            //左侧移除
            if (i >= s1.length()) {
                char a = s2.charAt(i - s1.length());
                count = map.getOrDefault(a, 0);
                if (count == -1) {
                    map.remove(a);
                } else {
                    map.put(a, count + 1);
                }
            }
            //判断
            if (map.keySet().size() == 0) {
                return true;
            }
        }
        return false;
    }
}

public class CheckInclusion {
    public static void main(String[] args) {
        Solution567 solution567 = new Solution567();
        boolean res = solution567.checkInclusion("adc", "dcda");
        System.out.println(res);
    }
}

import java.util.HashSet;
import java.util.Set;

class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelsSet = new HashSet<>();

        for (int i = 0; i < jewels.length(); i++) {
            jewelsSet.add(jewels.charAt(i));
        }

        int res = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewelsSet.contains(stones.charAt(i))) {
                res += 1;
            }
        }
        return res;
    }
}

public class JewelsAndStones {
    public static void main(String[] args) {
        int res = new Solution771().numJewelsInStones("aA", "aAAbbbb");
        System.out.println(res);
    }
}

class Solution424 {
    public int characterReplacement(String s, int k) {
        int[] num = new int[26];
        int n = s.length();
        int maxn = 0;
        int left = 0, right = 0;
        while (right < n) {
            num[s.charAt(right) - 'A']++;
            maxn = Math.max(maxn, num[s.charAt(right) - 'A']);
            if (right - left + 1 - maxn > k) {
                num[s.charAt(left) - 'A']--;
                left++;
            }
            right++;
        }
        return right - left;
    }
}

public class CharacterReplacement {
    public static void main(String[] args) {
        Solution424 solution424 = new Solution424();
        int res = solution424.characterReplacement("ABAB", 2);
        System.out.println(res);
    }
}

class Solution191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}


public class HammingWeight {
    public static void main(String[] args) {
        Solution191 solution191 = new Solution191();
        int i = solution191.hammingWeight(11);
        System.out.println(i);
    }
}

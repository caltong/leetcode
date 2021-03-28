class Solution190 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;
    }
}

public class ReverseBits {
    public static void main(String[] args) {
        Solution190 solution190 = new Solution190();
        int i = solution190.reverseBits(43261596);
        System.out.println(i);
    }
}

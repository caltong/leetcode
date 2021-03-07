class SolutionOffer43 {
    public int countDigitOne(int n) {
        int digit = 1;
        int low = 0;
        int current = n % 10;
        int high = n / 10;
        int res = 0;
        while (high != 0 || current != 0) {
            if (current == 0) {
                res += high * digit;
            } else if (current == 1) {
                res += high * digit + low + 1;
            } else {
                res += (high + 1) * digit;
            }
            low += current * digit;
            current = high % 10;
            high = high / 10;
            digit = digit * 10;
        }
        return res;
    }
}

public class CountDigitOne {
    public static void main(String[] args) {
        SolutionOffer43 solutionOffer43 = new SolutionOffer43();
        int res = solutionOffer43.countDigitOne(12);
        System.out.println(res);
    }
}

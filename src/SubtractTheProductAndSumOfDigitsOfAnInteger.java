class Solution1281 {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        return product - sum;
    }
}

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        int res = new Solution1281().subtractProductAndSum(234);
        System.out.println(res);
    }
}

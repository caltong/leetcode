class Solution7 {
    int reverse(int x) {
        long temp = 0;
        while (x != 0) {
            temp = temp * 10 + x % 10;
            x = x / 10;
        }
        if ((int) temp != temp) {
            return 0;
        } else {
            return (int) temp;
        }
    }
}

public class Reverse {
    public static void main(String[] args) {
        Solution7 re = new Solution7();
        System.out.println(re.reverse(-2023226469));

    }
}

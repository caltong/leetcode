class Solution860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i : bills) {
            if (i == 5) {
                five += 1;
            } else if (i == 10) {
                if (five == 0) {
                    return false;
                } else {
                    five -= 1;
                    ten += 1;
                }
            } else if (i == 20) {
                if (ten < 1 || five < 1) {
                    if (five < 3) {
                        return false;
                    } else {
                        five -= 3;
                    }
                } else {
                    five -= 1;
                    ten -= 1;
                }
            }
        }
        return true;
    }
}

public class LemonadeChange {
    public static void main(String[] args) {
        Solution860 solution = new Solution860();
        boolean res1 = solution.lemonadeChange(new int[]{5, 5, 5, 10, 20});
        System.out.println(res1);
        boolean res2 = solution.lemonadeChange(new int[]{5, 5, 10, 10, 20});
        System.out.println(res2);
    }
}

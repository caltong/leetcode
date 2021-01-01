class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int pre = -1;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                if (pre < 0) {
                    count += i / 2;
                } else {
                    count += (i - pre - 2) / 2;
                }
                if (count >= n) {
                    return true;
                }
                pre = i;
            }
        }
        if (pre < 0) {
            count += (flowerbed.length + 1) / 2;
        } else {
            count += (flowerbed.length - pre - 1) / 2;
        }
        return count >= n;
    }
}

public class CanPlaceFlowers {
    public static void main(String[] args) {
        Solution605 solution605 = new Solution605();
        System.out.println(solution605.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    }
}

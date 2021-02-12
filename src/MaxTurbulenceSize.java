class Solution978 {
    public int maxTurbulenceSize(int[] arr) {
        int len = arr.length;
        if (len == 1) {
            return 1;
        } else if (len == 2 && arr[0] != arr[1]) {
            return 2;
        } else if (len == 2) {
            return 1;
        }
        int start = 0;
        int end = 2;
        int maxLen = 1;
        if (arr[0] != arr[1]) {
            maxLen = 2;
        }
        while (end < len) {
            if ((arr[end - 2] != arr[end - 1]) && (arr[end - 1] != arr[end]) && ((arr[end - 1] < arr[end]) != (arr[end - 2] < arr[end - 1]))) {
                maxLen = Math.max(maxLen, end - start + 1);
                end += 1;
            } else {
                start = end - 1;
                end += 1;
            }
        }
        return maxLen;
    }
}

public class MaxTurbulenceSize {
    public static void main(String[] args) {
        Solution978 solution978 = new Solution978();
        int res = solution978.maxTurbulenceSize(new int[]{1, 2, 3, 4});
        System.out.println(res);
    }
}

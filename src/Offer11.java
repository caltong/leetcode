class SolutionOffer11 {
    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (numbers[mid] < numbers[high]) {
                high = mid;
            } else if (numbers[high] < numbers[mid]) {
                low = mid + 1;
            } else {
                high -= 1;
            }
        }
        return numbers[low];
    }
}


public class Offer11 {
    public static void main(String[] args) {
        SolutionOffer11 solutionOffer11 = new SolutionOffer11();
        int res = solutionOffer11.minArray(new int[]{3, 4, 5, 1, 2});
        System.out.println(res);
    }
}

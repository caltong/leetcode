import java.util.*;

class Solution56 {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        for (int[] ints : intervals) {
            if (list.size() == 0 || ints[0] > list.get(list.size() - 1)[1]) {
                list.add(ints);
            } else {
                list.get(list.size() - 1)[1] = Math.max(ints[1], list.get(list.size() - 1)[1]);
            }
        }

        return list.toArray(new int[list.size()][2]);
    }
}

public class Merge2 {
    public static void main(String[] args) {
        Solution56 solution56 = new Solution56();
        int[][] result = solution56.merge(new int[][]{{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}});
        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}

import java.util.*;

class Solution2500 {
    public int deleteGreatestValue(int[][] grid) {
        List<PriorityQueue<Integer>> queueList = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
            queueList.add(queue);
            for (int j = 0; j < grid[i].length; j++) {
                queueList.get(i).add(grid[i][j]);
            }
        }
        int res = 0;
        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < queueList.size(); j++) {
                max = Math.max(max, queueList.get(j).poll());
            }
            res += max;
        }

        return res;
    }
}

public class DeleteGreatestValueInEachRow {
    public static void main(String[] args) {
        int res = new Solution2500().deleteGreatestValue(new int[][]{{1, 2, 4}, {3, 3, 1}});
        System.out.println(res);
    }
}

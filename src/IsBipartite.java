import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution785 {
    private static final int UNCOLORED = 0;
    private static final int RED = 1;
    private static final int GREEN = 2;
    private int[] color;

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        color = new int[n];
        Arrays.fill(color, UNCOLORED);
        for (int i = 0; i < n; i++) {
            if (color[i] == UNCOLORED) {
                Queue<Integer> queue = new LinkedList<>();
                color[i] = RED;
                queue.add(i);
                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    int nextColor = color[node] == RED ? GREEN : RED;
                    for (int next : graph[node]) {
                        if (color[next] == UNCOLORED) {
                            queue.add(next);
                            color[next] = nextColor;
                        } else if (color[next] != nextColor) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}

public class IsBipartite {
    public static void main(String[] args) {
        Solution785 solution785 = new Solution785();
        boolean res = solution785.isBipartite(new int[][]{{1, 3}, {0, 2}, {1, 3}, {0, 2}});
        System.out.println(res);
    }
}

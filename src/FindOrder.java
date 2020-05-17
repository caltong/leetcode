import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution210 {
    private List<List<Integer>> edges;
    private int[] visited;
    private Stack<Integer> result = new Stack<>();
    private boolean invalid = false;


    public int[] findOrder(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<>(numCourses);
        visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            edges.get(pre[1]).add(pre[0]);
        }
        for (int i = 0; i < numCourses && !invalid; i++) {
            if (visited[i] == 0) {
                dfs(i);
            }
        }
        if (invalid) {
            return new int[0];
        }
        int[] res = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            res[i] = result.pop();
        }
        return res;
    }

    private void dfs(int u) {
        visited[u] = 1;
        for (int v : edges.get(u)) {
            if (visited[v] == 0) {
                dfs(v);
                if (invalid) {
                    return;
                }
            } else if (visited[v] == 1) {
                invalid = true;
            }
        }
        visited[u] = 2;
        result.push(u);
    }
}

public class FindOrder {
    public static void main(String[] args) {
        Solution210 solution210 = new Solution210();
        int[] res = solution210.findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}});
        System.out.println(Arrays.toString(res));
    }
}
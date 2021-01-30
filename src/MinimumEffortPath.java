import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution1631 {
    public int minimumEffortPath(int[][] heights) {
        int row = heights.length;
        int col = heights[0].length;
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int id = i * col + j;
                if (i > 0) {
                    edges.add(new int[]{id - col, id, Math.abs(heights[i - 1][j] - heights[i][j])});
                }
                if (j > 0) {
                    edges.add(new int[]{id - 1, id, Math.abs(heights[i][j - 1] - heights[i][j])});
                }
            }
        }
        edges.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
        UnionFind1631 unionFind = new UnionFind1631(row * col);
        int ans = 0;
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];
            unionFind.union(from, to);
            if (unionFind.find(0) == unionFind.find(row * col - 1)) {
                ans = weight;
                break;
            }
        }
        return ans;
    }
}

class UnionFind1631 {
    int[] parent;
    int n;

    UnionFind1631(int n) {
        this.n = n;
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public int find(int a) {
        if (parent[a] != a) {
            parent[a] = parent[parent[a]];
            return find(parent[a]);
        } else {
            return a;
        }
    }

    public void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);
        parent[pa] = pb;
    }
}

public class MinimumEffortPath {
    public static void main(String[] args) {
        Solution1631 solution1631 = new Solution1631();
        int res = solution1631.minimumEffortPath(new int[][]{{1, 2, 2}, {3, 8, 2}, {5, 3, 5}});
        System.out.println(res);
    }
}

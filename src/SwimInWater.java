import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution778 {
    public int swimInWater(int[][] grid) {
        int N = grid.length;
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i > 0) {
                    int[] edge = new int[]{(i - 1) * N + j, i * N + j, Math.max(grid[i - 1][j], grid[i][j])};
                    edges.add(edge);
                }
                if (j > 0) {
                    int[] edge = new int[]{i * N + j - 1, i * N + j, Math.max(grid[i][j - 1], grid[i][j])};
                    edges.add(edge);
                }
            }
        }
        edges.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
        UnionFind778 unionFind = new UnionFind778(N * N);
        for (int i = 0; i < edges.size(); i++) {
            int[] edge = edges.get(i);
            unionFind.union(edge[0], edge[1]);
            if (unionFind.find(0) == unionFind.find(N * N - 1)) {
                return edge[2];
            }
        }
        return -1;
    }
}

class UnionFind778 {
    int[] parent;
    int n;

    UnionFind778(int n) {
        this.n = n;
        parent = new int[this.n];
        for (int i = 0; i < this.n; i++) {
            parent[i] = i;
        }
    }

    public int find(int a) {
        if (a != parent[a]) {
            parent[a] = parent[parent[a]];
            return find(parent[a]);
        } else {
            return parent[a];
        }
    }

    public void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);
        parent[pa] = pb;
    }
}

public class SwimInWater {
    public static void main(String[] args) {
        Solution778 solution778 = new Solution778();
        int res = solution778.swimInWater(new int[][]{{0, 2}, {1, 3}});
        System.out.println(res);
    }
}

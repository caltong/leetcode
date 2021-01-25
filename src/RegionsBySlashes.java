import java.util.HashSet;
import java.util.Set;

class Solution959 {
    public int regionsBySlashes(String[] grid) {
        int N = grid.length;
        UnionFind959 unionFind = new UnionFind959(N * N * 4);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                char c = grid[i].charAt(j);
                if (c == '\\') {
                    unionFind.union(4 * (N * i + j), 4 * (N * i + j) + 1);
                    unionFind.union(4 * (N * i + j) + 2, 4 * (N * i + j) + 3);

                } else if (c == '/') {
                    unionFind.union(4 * (N * i + j), 4 * (N * i + j) + 3);
                    unionFind.union(4 * (N * i + j) + 1, 4 * (N * i + j) + 2);
                } else {
                    unionFind.union(4 * (N * i + j), 4 * (N * i + j) + 1);
                    unionFind.union(4 * (N * i + j) + 1, 4 * (N * i + j) + 2);
                    unionFind.union(4 * (N * i + j) + 2, 4 * (N * i + j) + 3);
                }
                if (i > 0) {
                    unionFind.union(4 * (N * (i - 1) + j) + 2, 4 * (N * i + j));
                }
                if (j > 0) {
                    unionFind.union(4 * (N * i + j - 1) + 1, 4 * (N * i + j) + 3);
                }
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N * N * 4; i++) {
            set.add(unionFind.find(i));
        }
        return set.size();
    }
}

class UnionFind959 {
    int n;
    int[] parent;

    UnionFind959(int n) {
        this.n = n;
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);
        parent[pa] = pb;
    }

    public int find(int a) {
        if (parent[a] != a) {
            parent[a] = parent[parent[a]];
            return find(parent[a]);
        } else {
            return parent[a];
        }
    }
}


public class RegionsBySlashes {
    public static void main(String[] args) {
        Solution959 solution959 = new Solution959();
        int res = solution959.regionsBySlashes(new String[]{" /", "/ "});
        System.out.println(res);
    }
}

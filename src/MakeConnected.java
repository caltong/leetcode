import java.util.HashSet;
import java.util.Set;

class Solution1319 {
    public int makeConnected(int n, int[][] connections) {
        UnionFind1319 unionFind = new UnionFind1319(n);
        for (int[] connection : connections) {
            unionFind.union(connection[0], connection[1]);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(unionFind.find(i));
        }
        int need = n - 1;
        int needMore = set.size() - 1;
        int now = connections.length;
        if (now >= need) {
            return needMore;
        } else {
            return -1;
        }
    }
}

class UnionFind1319 {
    int n;
    int[] parent;

    UnionFind1319(int n) {
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

public class MakeConnected {
    public static void main(String[] args) {
        Solution1319 solution1319 = new Solution1319();
        int res = solution1319.makeConnected(6, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}});
        System.out.println(res);
    }
}

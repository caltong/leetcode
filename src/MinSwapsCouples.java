import java.util.HashSet;
import java.util.Set;

class Solution765 {
    public int minSwapsCouples(int[] row) {
        UnionFind765 unionFind = new UnionFind765(row.length / 2);
        for (int i = 0; i < row.length; i += 2) {
            unionFind.union(row[i] / 2, row[i + 1] / 2);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < row.length / 2; i++) {
            set.add(unionFind.find(i));
        }
        return row.length / 2 - set.size();
    }
}

class UnionFind765 {
    int[] parent;
    int n;

    UnionFind765(int n) {
        this.n = n;
        parent = new int[this.n];
        for (int i = 0; i < this.n; i++) {
            parent[i] = i;
        }
    }

    public int find(int a) {
        int pa = parent[a];
        if (pa != a) {
            parent[a] = parent[parent[a]];
            return find(parent[a]);
        } else {
            return pa;
        }
    }

    public void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);
        parent[pa] = pb;
    }
}

public class MinSwapsCouples {
    public static void main(String[] args) {
        Solution765 solution765 = new Solution765();
        int res = solution765.minSwapsCouples(new int[]{3, 2, 0, 1});
        System.out.println(res);
    }
}

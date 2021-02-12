import java.util.HashSet;
import java.util.Set;

class Solution1579 {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        UnionFind1579 unionFindCommonA = new UnionFind1579(n);
        UnionFind1579 unionFindCommonB = new UnionFind1579(n);
        int count = 0;
        for (int[] edge : edges) {
            if (edge[0] == 3) {
                int pa = unionFindCommonA.find(edge[1]);
                int pb = unionFindCommonA.find(edge[2]);
                if (pa == pb) {
                    count++;
                } else {
                    unionFindCommonA.union(edge[1], edge[2]);
                    unionFindCommonB.union(edge[1], edge[2]);
                }
            }
        }
        for (int[] edge : edges) {
            if (edge[0] == 1) {
                int pa = unionFindCommonA.find(edge[1]);
                int pb = unionFindCommonA.find(edge[2]);
                if (pa == pb) {
                    count++;
                } else {
                    unionFindCommonA.union(edge[1], edge[2]);
                }
            } else if (edge[0] == 2) {
                int pa = unionFindCommonB.find(edge[1]);
                int pb = unionFindCommonB.find(edge[2]);
                if (pa == pb) {
                    count++;
                } else {
                    unionFindCommonB.union(edge[1], edge[2]);
                }
            }
        }
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        for (int i = 1; i < n + 1; i++) {
            setA.add(unionFindCommonA.find(i));
            setB.add(unionFindCommonB.find(i));
        }
        if (setA.size() != 1 || setB.size() != 1) {
            return -1;
        } else {
            return count;
        }
    }
}

class UnionFind1579 {
    int[] parent;
    int n;

    //index 从1开始
    public UnionFind1579(int n) {
        this.n = n + 1;
        this.parent = new int[this.n];
        for (int i = 0; i < this.n; i++) {
            parent[i] = i;
        }
        parent[0] = 1;
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

public class MaxNumEdgesToRemove {
    public static void main(String[] args) {
        Solution1579 solution1579 = new Solution1579();
        int res = solution1579.maxNumEdgesToRemove(4, new int[][]{{3, 1, 2}, {3, 2, 3}, {1, 1, 3}, {1, 2, 4}, {1, 1, 2}, {2, 3, 4}});
        System.out.println(res);
    }
}

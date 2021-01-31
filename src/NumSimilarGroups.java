import java.util.HashSet;
import java.util.Set;

class Solution839 {
    public int numSimilarGroups(String[] strs) {
        UnionFind839 unionFind = new UnionFind839(strs.length);
        for (int i = 0; i < strs.length; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                int pi = unionFind.find(i);
                int pj = unionFind.find(j);
                if (pi != pj) {
                    if (isSimilar(strs[i], strs[j])) {
                        unionFind.union(i, j);
                    }
                }
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < strs.length; i++) {
            set.add(unionFind.find(i));
        }
        return set.size();
    }

    private boolean isSimilar(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        } else {
            Integer first = null;
            Integer second = null;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    if (first == null) {
                        first = i;
                    } else if (second == null) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }
            if (first == null && second == null) {
                return true;
            } else if (first == null || second == null) {
                return false;
            }
            if (a.charAt(first) == b.charAt(second) && a.charAt(second) == b.charAt(first)) {
                return true;
            } else {
                return false;
            }
        }
    }
}

class UnionFind839 {
    int[] parent;
    int n;

    UnionFind839(int n) {
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

public class NumSimilarGroups {
    public static void main(String[] args) {
        Solution839 solution839 = new Solution839();
        int res = solution839.numSimilarGroups(new String[]{"tars", "rats", "arts", "star"});
        System.out.println(res);
    }
}

import java.util.Arrays;

class Solution684 {
    public int[] findRedundantConnection(int[][] edges) {
        int[] parents = new int[edges.length + 1];
        for (int i = 0; i < parents.length; i++) {
            parents[i] = i;
        }
        for (int[] edge : edges) {
            if (find(parents, edge[0]) != find(parents, edge[1])) {
                union(parents, edge[0], edge[1]);
            } else {
                return edge;
            }
        }
        return new int[0];
    }

    private void union(int[] parents, int index1, int index2) {
        parents[find(parents, index1)] = find(parents, index2);
    }

    private int find(int[] parents, int index) {
        if (parents[index] != index) {
            parents[index] = find(parents, parents[index]);
        }
        return parents[index];
    }
}

public class FindRedundantConnection {
    public static void main(String[] args) {
        Solution684 solution684 = new Solution684();
        int[] res = solution684.findRedundantConnection(new int[][]{{1, 2}, {1, 3}, {2, 3}});
        System.out.println(Arrays.toString(res));
    }
}

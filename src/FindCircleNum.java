class Solution547 {
    public int findCircleNum(int[][] isConnected) {
        //dfs
        int provinces = isConnected.length;
        boolean[] visited = new boolean[provinces];
        int circles = 0;
        for (int i = 0; i < provinces; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, provinces, i);
                circles += 1;
            }
        }
        return circles;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int provinces, int i) {
        for (int j = 0; j < provinces; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(isConnected, visited, provinces, j);
            }
        }
    }
}

public class FindCircleNum {
    public static void main(String[] args) {
        Solution547 solution547 = new Solution547();
        int res = solution547.findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});
        System.out.println(res);
    }
}

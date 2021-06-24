package hash;

import utils.StringToList;

import java.util.*;

public class Q149 {
    public int maxPoints(int[][] points) {
        int max = 0;
        for (int[] pointA : points) {
            Map<Double, Integer> map = new HashMap<>();
            for (int[] pointB : points) {
                if (pointA[0] == pointB[0] && pointA[1] == pointB[1]) {
                    continue;
                }
                Double k = 1.0 * (pointA[1] - pointB[1]) / (pointA[0] - pointB[0]);
                Integer count = map.getOrDefault(k, 0);
                map.put(k, count + 1);
            }
            for (Double key : map.keySet()) {
                Integer count = map.get(key);
                if (count >= max) {
                    max = count;
                }
            }
        }
        return max + 1;
    }

    public static void main(String[] args) {
        Q149 q149 = new Q149();
        int[][] points = StringToList.twoD("[[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]");
        int res = q149.maxPoints(points);
        System.out.println(res);
    }
}

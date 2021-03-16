package utils;

import java.util.Arrays;

/**
 * 将力扣复制过来的字符串数组转化成数组对象
 */
public class StringToList {
    static int[] oneD(String s) {
        //去掉首尾中括号
        String substring = s.substring(1, s.length() - 1);
        String[] split = substring.split(",");
        int[] res = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            res[i] = Integer.parseInt(split[i]);
        }
        return res;
    }

    static int[][] twoD(String s) {
        int col = 0;
        int i = 0;
        //获取列数
        while (true) {
            if (s.charAt(i) == ',') {
                col += 1;
            } else if (s.charAt(i) == ']') {
                break;
            }
            i++;
        }
        col += 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (Character.isDigit(c) || c == ',') {
                stringBuilder.append(c);
            }
        }
        String[] split = stringBuilder.toString().split(",");
        int[][] res = new int[split.length / col][col];
        for (int j = 0; j < split.length; j++) {
            res[j / col][j % col] = Integer.parseInt(split[j]);
        }
        return res;
    }


    public static void main(String[] args) {
        int[] oneD = StringToList.oneD("[1,2,3,4,5]");
        System.out.println(Arrays.toString(oneD));

        int[][] twoD = StringToList.twoD("[[1,2,3],[8,9,4],[7,6,5]]");
        for (int[] row : twoD) {
            System.out.println(Arrays.toString(row));
        }
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return new ArrayList<>(Collections.singletonList(1));
        } else if (rowIndex == 1) {
            return new ArrayList<>(Arrays.asList(1, 1));
        }
        List<Integer> pre = new ArrayList<>(Arrays.asList(1, 1));
        List<Integer> now = new ArrayList<>();
        int row = 2;
        while (row <= rowIndex) {
            now.add(1);
            for (int i = 1; i < row; i++) {
                now.add(pre.get(i - 1) + pre.get(i));
            }
            now.add(1);
            pre.clear();
            pre.addAll(now);
            now.clear();
            row += 1;
        }
        return pre;
    }
}

public class GetRow {
    public static void main(String[] args) {
        Solution119 solution119 = new Solution119();
        List<Integer> res = solution119.getRow(3);
        System.out.println(res);
    }
}

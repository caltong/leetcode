import java.util.Deque;
import java.util.LinkedList;

class Solution150 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> deque = new LinkedList<>();
        for (String token : tokens) {
            if ("+".equals(token)) {
                Integer right = deque.pollFirst();
                Integer left = deque.pollFirst();
                deque.addFirst(left + right);
            } else if ("-".equals(token)) {
                Integer right = deque.pollFirst();
                Integer left = deque.pollFirst();
                deque.addFirst(left - right);
            } else if ("*".equals(token)) {
                Integer right = deque.pollFirst();
                Integer left = deque.pollFirst();
                deque.addFirst(left * right);
            } else if ("/".equals(token)) {
                Integer right = deque.pollFirst();
                Integer left = deque.pollFirst();
                deque.addFirst(left / right);
            } else {
                deque.addFirst(Integer.parseInt(token));
            }
        }
        return deque.pollFirst();
    }
}

public class EvalRPN {
    public static void main(String[] args) {
        Solution150 solution150 = new Solution150();
        int res = solution150.evalRPN(new String[]{"4","13","5","/","+"});
        System.out.println(res);
    }
}

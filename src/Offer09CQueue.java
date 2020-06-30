import java.util.Stack;

class CQueue {
    Stack<Integer> primary;
    Stack<Integer> secondary;

    public CQueue() {
        primary = new Stack<>();
        secondary = new Stack<>();
    }

    public void appendTail(int value) {
        primary.add(value);
    }

    public int deleteHead() {
        if (primary.size() == 0) {
            return -1;
        }
        while (primary.size() != 0) {
            secondary.add(primary.pop());
        }
        int res = secondary.pop();
        while (secondary.size() != 0) {
            primary.add(secondary.pop());
        }
        return res;
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */

public class Offer09CQueue {
    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(3);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
    }
}

import java.util.Stack;

class MyQueue232 {
    Stack<Integer> forward;
    Stack<Integer> backward;

    /**
     * Initialize your data structure here.
     */
    public MyQueue232() {
        forward = new Stack<>();
        backward = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        if (forward.isEmpty() && backward.isEmpty()) {
            backward.add(x);
        } else if (forward.isEmpty()) {
            backward.add(x);
        } else {
            while (!forward.isEmpty()) {
                backward.add(forward.pop());
            }
            backward.add(x);
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (backward.isEmpty()) {
            return forward.pop();
        } else {
            while (!backward.isEmpty()) {
                forward.add(backward.pop());
            }
            return forward.pop();
        }
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (backward.isEmpty()) {
            return forward.peek();
        } else {
            while (!backward.isEmpty()) {
                forward.add(backward.pop());
            }
            return forward.peek();
        }
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return forward.isEmpty() && backward.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */


public class MyQueue {
    public static void main(String[] args) {
        MyQueue232 myQueue232 = new MyQueue232();
        myQueue232.push(1);
        myQueue232.push(2);
        System.out.println(myQueue232.peek());
        System.out.println(myQueue232.pop());
        System.out.println(myQueue232.empty());
    }
}

import java.util.*;

class MyHashSet705 {
    List[] list;
    int capacity = 16;
    int load = 0;

    /**
     * Initialize your data structure here.
     */
    public MyHashSet705() {
        list = new LinkedList[capacity];
        Arrays.fill(list, new LinkedList<Integer>());
    }

    public void add(int key) {
        if (load + 1 > capacity * 0.75) {
            capacity = capacity << 1;
            List[] newList = new List[capacity];
            Arrays.fill(newList, new LinkedList<Integer>());
            for (int i = 0; i < list.length; i++) {
                List<Integer> linkedList = list[i];
                for (int originKey : linkedList) {
                    int index = originKey & (capacity - 1);
                    List<Integer> newLinedList = newList[index];
                    newLinedList.add(originKey);
                }
            }
            list = newList;
        }

        int index = key & (capacity - 1);
        List<Integer> linkedList = list[index];
        for (Integer element : linkedList) {
            if (element == key) {
                return;
            }
        }
        linkedList.add(key);
        load += 1;
    }

    public void remove(int key) {
        int index = key & (capacity - 1);
        List<Integer> linkedList = list[index];
        boolean contains = linkedList.contains(key);
        if (contains) {
            linkedList.remove((Integer) key);
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        int index = key & (capacity - 1);
        List<Integer> linkedList = this.list[index];
        if (linkedList.size() == 0) {
            return false;
        } else {
            for (Integer element : linkedList) {
                if (element == key) {
                    return true;
                }
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */

public class MyHashSet {
    public static void main(String[] args) {
        MyHashSet705 myHashSet705 = new MyHashSet705();
        for (int i = 0; i < 100; i++) {
            myHashSet705.add(i);
        }
        System.out.println(myHashSet705.contains(100));
    }
}

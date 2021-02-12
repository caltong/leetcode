/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

import utils.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution133 {
    Map<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        if (map.containsKey(node)) {
            return map.get(node);
        }
        Node cloneNode = new Node(node.val);
        map.put(node, cloneNode);
        for (Node neighbors : node.neighbors) {
            cloneNode.neighbors.add(cloneGraph(neighbors));
        }
        return cloneNode;
    }
}

public class CloneGraph {
    public static void main(String[] args) {
        Solution133 solution133 = new Solution133();
        Node node = new Node(1, new ArrayList<>());
        node.neighbors.add(new Node(2));
        node.neighbors.add(new Node(3));
        Node node1 = solution133.cloneGraph(node);
        System.out.println(node1);
    }
}

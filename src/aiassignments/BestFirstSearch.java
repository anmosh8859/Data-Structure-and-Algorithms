package aiassignments;

import java.util.*;

public class BestFirstSearch {
    private static class Node {
        int value;
        List<Node> neighbors;

        Node(int value) {
            this.value = value;
            this.neighbors = new ArrayList<>();
        }

        void addNeighbor(Node neighbor) {
            neighbors.add(neighbor);
        }
    }

    private static class QueueNode implements Comparable<QueueNode> {
        Node node;
        int priority;

        QueueNode(Node node, int priority) {
            this.node = node;
            this.priority = priority;
        }

        @Override
        public int compareTo(QueueNode other) {
            return Integer.compare(priority, other.priority);
        }
    }

    public static void main(String[] args) {
        // Create a graph
        Node nodeA = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(4);
        Node nodeE = new Node(5);
        Node nodeF = new Node(6);

        nodeA.addNeighbor(nodeB);
        nodeA.addNeighbor(nodeC);
        nodeB.addNeighbor(nodeD);
        nodeC.addNeighbor(nodeE);
        nodeD.addNeighbor(nodeF);
        nodeE.addNeighbor(nodeF);

        Node result = bestFirstSearch(nodeA, 6);
        if (result != null) {
            System.out.println("Node found: " + result.value);
        } else {
            System.out.println("Node not found.");
        }
    }

    public static Node bestFirstSearch(Node start, int target) {
        Queue<QueueNode> queue = new PriorityQueue<>();
        Set<Node> visited = new HashSet<>();

        queue.add(new QueueNode(start, heuristic(start, target)));

        while (!queue.isEmpty()) {
            QueueNode queueNode = queue.poll();
            Node node = queueNode.node;

            if (node.value == target) {
                return node;
            }

            visited.add(node);

            for (Node neighbor : node.neighbors) {
                if (!visited.contains(neighbor)) {
                    queue.add(new QueueNode(neighbor, heuristic(neighbor, target)));
                }
            }
        }

        return null;
    }

    private static int heuristic(Node node, int target) {
        return Math.abs(node.value - target);
    }
}


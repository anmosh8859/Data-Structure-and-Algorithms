package graph;

public class GraphDriver {
    public static void driver() {
        Graph graph = new Graph(6);

        // Add edges between vertices
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);


        System.out.print("BFS TRAVERSAL");
        graph.BFS(0);
//        graph.DFS(0);
    }
}

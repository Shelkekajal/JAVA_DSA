import java.util.*; // Import Java utility package for ArrayList, Queue, LinkedList, etc.

public class g3 {
    // Nested static class to represent an edge in the graph
    public static class Edge {
        int src;   // source vertex
        int dest;  // destination vertex
        int wt;    // weight of the edge

        // Constructor to initialize an edge
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // Function to create a sample graph
    static void createGraph(ArrayList<Edge>[] graph) {
        // Initialize each index of graph with an empty ArrayList
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to represent the graph (undirected)
        graph[0].add(new Edge(0, 1, 1)); // edge 0--1
        graph[0].add(new Edge(0, 2, 1)); // edge 0--2

        graph[1].add(new Edge(1, 0, 1)); // edge 1--0
        graph[1].add(new Edge(1, 3, 1)); // edge 1--3

        graph[2].add(new Edge(2, 0, 1)); // edge 2--0
        graph[2].add(new Edge(2, 4, 1)); // edge 2--4

        graph[3].add(new Edge(3, 1, 1)); // edge 3--1
        graph[3].add(new Edge(3, 4, 1)); // edge 3--4
        graph[3].add(new Edge(3, 5, 1)); // edge 3--5

        graph[4].add(new Edge(4, 2, 1)); // edge 4--2
        graph[4].add(new Edge(4, 3, 1)); // edge 4--3
        graph[4].add(new Edge(4, 5, 1)); // edge 4--5

        graph[5].add(new Edge(5, 3, 1)); // edge 5--3
        graph[5].add(new Edge(5, 4, 1)); // edge 5--4
        graph[5].add(new Edge(5, 6, 1)); // edge 5--6

        graph[6].add(new Edge(6, 5, 1)); // edge 6--5
    }

    // Breadth First Search traversal
    public static void bfs(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();      // queue for BFS
        boolean vis[] = new boolean[graph.length];  // visited array to track visited nodes

        q.add(0); // Start BFS from source vertex = 0

        // Loop until queue becomes empty
        while (!q.isEmpty()) {
            int curr = q.remove(); // Dequeue current node

            // Process node if not already visited
            if (!vis[curr]) {
                System.out.print(curr + " "); // Print the node
                vis[curr] = true;             // Mark it as visited

                // Add all unvisited neighbors of current node to the queue
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i); // Get each edge
                    q.add(e.dest);              // Add destination vertex to queue
                }
            }
        }
    }

    // Depth First Search traversal (recursive)
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        System.out.print(curr + " "); // Visit and print current node
        vis[curr] = true;             // Mark current node as visited

        // Visit all unvisited neighbors recursively
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i); // Get each edge
            if (!vis[e.dest]) {          // If neighbor not visited
                dfs(graph, e.dest, vis); // Recursive DFS call
            }
        }
    }

    // Main function
    public static void main(String args[]) {
        int V = 7; // Total number of vertices in the graph

        // Create an array of ArrayLists to represent adjacency list
        @SuppressWarnings("unchecked") 
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph); // Build the graph

        System.out.println("DFS Traversal:");
        dfs(graph, 0, new boolean[V]); // Perform DFS starting from node 0

        System.out.println("\nBFS Traversal:");
        bfs(graph); // Perform BFS starting from node 0
    }
}

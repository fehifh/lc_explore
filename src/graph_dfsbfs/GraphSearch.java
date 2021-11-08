package graph_dfsbfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphSearch {
    private Graph g;

    private boolean[] visited;

    private boolean[] discovered;

    /** Constructor: an instance to search graph */
    public GraphSearch(Graph g){
        this.g=g;
        visited = new boolean[g.numNodes()];
        discovered = new boolean[g.numNodes()];
    }

    public void do_dfs_rec(int n){
        System.out.println("\nDoing dfs recursively...");
        dfs_rec(n);
        clearMarks();
        System.out.println("\n\n");
    }

    public void do_dfs_ite(int n){
        System.out.println("\nDoing dfs iteratively...");
        dfs_ite(n);
        clearMarks();
        System.out.println("\n\n");
    }

    public void do_bfs_ite(int n){
        System.out.println("\nDoing bfs iteratively...");
        bfs_ite(n);
        clearMarks();
        System.out.println("\n\n");
    }

    /** Depth first search: recursively
     * Visit every node that is reachable along a path of unvisited
     * nodes starting at a node n, in a depth first order.
     */
    private void dfs_rec(int n){
        visit(n);
        for(int nb: g.neighbors(n)){
            if(!visited[nb]){
                dfs_rec(nb);
            }
        }
    }
    /** Depth first search: iteratively
     * Visit every node that is reachable along a path of unvisited
     * nodes starting at a node n, in a depth first order.
     */
    private void dfs_ite(int n){
        Stack<Integer> st = new Stack<>();
        discovered[n] = true;
        st.push(n);
        // loop invariant:
        // every node to be visited is reachable along an unvisited path from some node in s
        // do not push the node into the stack if it is already discovered
        while(!st.empty()){
            n=st.pop();
            if(!visited[n]){
                visit(n);
                for(int nb: g.neighbors(n)){
                    if(!discovered[nb]){
                        discovered[nb] = true;
                        st.push(nb);
                    }
                }
            }
        }
    }

    /** Breadth first search: iteratively
     * Visit every node that is reachable along a path of unvisited
     * nodes starting at a node n, in a breadth first order.
     */
    private void bfs_ite(int n){
        Queue<Integer> q = new LinkedList<>();
        discovered[n]=true;
        q.add(n);
        while(!q.isEmpty()){
            n=q.poll();
            if(!visited[n]){
                visit(n);
                for(int nb: g.neighbors(n)){
                    if(!discovered[nb]){
                        discovered[nb] = true;
                        q.add(nb);
                    }
                }
            }
        }
    }

    /** Mark node n visited, and print it. */
    private void visit(int n){
        visited[n]=true;
        System.out.print(n+" ");
    }

    /** Make all nodes unvisited and undiscovered */
    private void clearMarks(){
        Arrays.fill(visited,false);
        Arrays.fill(discovered, false);
    }

    public static void main(String[] args){
        Edge[] edges = new Edge[]{
           new Edge(1,2),   new Edge(1,5),new Edge(1,7),
                new Edge(2,3),new Edge(2,5),
                new Edge(3,5),
                new Edge(4,5),new Edge(4,6),
                new Edge(7,5),new Edge(7,8)
        };
        Graph g1 = new ListGraph(9,edges);
        g1.print();

        Graph g2 = new MatrixGraph(9,edges);
        g2.print();

        GraphSearch s1 = new GraphSearch(g1);
        GraphSearch s2 = new GraphSearch(g2);

        s1.do_bfs_ite(1);
        s1.do_dfs_ite(1);
        s1.do_dfs_rec(1);

    }
}

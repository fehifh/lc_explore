package graph_dfsbfs;

import java.util.List;

public interface Graph {
    /** The number of nodes in the graph */
    int numNodes();

    /** Return a list of neighbors of u.
     * Precondition: 0<=u< number of nodes.
     * @param u
     * @return
     */
    List<Integer> neighbors(int u);

    /** Print the graph to stdout. */
    void print();
}

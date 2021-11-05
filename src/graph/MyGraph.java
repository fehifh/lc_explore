package graph;

public interface MyGraph <VL,EL>{
    /* vertex operations */

    /** The number of vertices in the graph. */
    int numVertices();

    /** Whether vertex v is in the graph. */
    boolean hasVertex(VL v);

    /** Add vertex v to the graph.
     * Throw VertexAlreadyInGraph if v is already in the graph.
     */
    void addVertex(VL v);

    /* edge operations */

    /** The number of edges in the graph. */
    int numEdges();

    /** The label on the edge from vertex v1 to vertex v2.
     * Throw EdgeNotInGraph if there is no edge between those vertices, or
     * if either vertex is not in the graph.
     */
    EL edgeLabel(VL v1, VL v2);

    /** Whether the graph has vertices v1 and v2 and an edge from v1 to v2.*/
    boolean hasEdge(VL v1,  VL v2);

    /** Add an edge with label e from vertex v1 to vertex v2.
     * Throw VertexNotInGraph if there is no vertex v1 or v2.
     * Throw EdgeAlreadyInGraph if there is already an edge between those vertices.
     */
    void addEdge(VL v1, EL e, VL v2 );
}

package graph;

import java.util.LinkedList;

public class ListGraph<VL, EL> implements WGraph<VL, EL> {
    class Vertex{
        VL label;
        LinkedList<Edge> outgoing = new LinkedList<>();

        /** Constructor: a vertex with label label. */
        Vertex(VL label){
            this.label = label;
            outgoing = new LinkedList<>();
        }
    }

    class Edge {
        EL label;
        VL to;

        /** Constructor: an edge with label label and going to to. */
        Edge(EL label, VL to){
            this.label = label;
            this.to = to;
        }
    }

    /** The vertices of the graph */
    LinkedList<Vertex> vertices;

    /** Constructor: An empty adjacency list */
    public ListGraph() {
        vertices = new LinkedList<>();
    }

    /* vertex operations */

    /** The number of vertices in the graph. */
    @Override
    public int numVertices(){
        return vertices.size();
    }

    /** Whether vertex v is in the graph. */
    @Override
    public boolean hasVertex(VL v){
        for(Vertex u: vertices){
            if (u.label.equals(v)) return true;
        }
        return false;
    }

    /** Add vertex v to the graph.
     * Throw VertexAlreadyInGraph if v is already in the graph.
     */
    @Override
    public void addVertex(VL v){
        if(hasVertex(v)) throw new VertexAlreadyInGraph(v.toString());
        Vertex u = new Vertex(v);
        vertices.addFirst(u);
    }

    /* edge operations */

    /** The number of edges in the graph. */
    @Override
    public int numEdges(){
        int e = 0;
        for (Vertex v: vertices) {
            e += v.outgoing.size();
        }
        return e;
    }

    /** The label on the edge from vertex v1 to vertex v2.
     * Throw EdgeNotInGraph if there is no edge between those vertices, or
     * if either vertex is not in the graph.
     */
    @Override
    public EL edgeLabel(VL v1, VL v2){
        for (Vertex v: vertices){
            if(v.label.equals(v)){
                // v1 is in the graph
                for(Edge e: v.outgoing){
                    // v2 is adjacent to v1
                    if(e.to.equals(v2)) return e.label;
                }
            }
            // v2 is not adjacent to v1
            throw new EdgeNotInGraph(v1.toString(), v2.toString());
        }
        throw new EdgeNotInGraph(v1.toString(), v2.toString());
    }

    /** Whether the graph has vertices v1 and v2 and an edge from v1 to v2.*/
    @Override
    public boolean hasEdge(VL v1, VL v2){
        try {
            edgeLabel(v1, v2);
        } catch (EdgeNotInGraph e){
            return false;
        }
        return true;
    }

    /** Add an edge with label e from vertex v1 to vertex v2.
     * Throw VertexNotInGraph if there is no vertex v1 or v2.
     * Throw EdgeAlreadyInGraph if there is already an edge between those vertices.
     */
    @Override
    public void addEdge(VL v1, EL e, VL v2 ){
        for (Vertex v: vertices) {
            if (v.label.equals(v1)){
                // v1 is in the graph
                for (Edge f: v.outgoing){
                    // v2 is already adjacent to v1
                    if(f.to.equals(v2))
                        throw new EdgeAlreadyInGraph(v1.toString(), f.label.toString(),v2.toString());
                }
                // v2 is not already adjacent to v1; make it so
                checkInGraph(v2);
                v.outgoing.add(new Edge(e,v2));
                return;
            }
        }
        throw new VertexNotInGraph(v1.toString());
    }

    private void checkInGraph(VL v){
        if(!hasVertex(v)) throw new VertexNotInGraph(v.toString());
    }

    /** Return a list conatining, for each vertex, a list of its outgoing edges.*/
    @Override
    public String toString(){
        String s="";
        for(Vertex v: vertices){
            s+=v.label + ": ";
            for(Edge e: v.outgoing){
                s += "[" + e.label + "]" + e.to + ";";
            }
            s += "\n";
        }
        return s;
    }

    public static void main(String[] args){
        WGraph<String, Integer> g = new ListGraph<>();
        g.addVertex("a");
        g.addVertex("b");
        g.addVertex("c");
        g.addVertex("d");
        g.addVertex("e");
        g.addEdge("a",5,"c");
        g.addEdge("b",2, "a");
        g.addEdge("c", -3, "d");
        g.addEdge("b", 1, "c");
        g.addEdge("b", 4, "d");
        System.out.println(g);
    }

}

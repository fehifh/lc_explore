package graph;

public class VertexNotInGraph extends RuntimeException{

    String v;

    public VertexNotInGraph(String v){
        this.v = v;
    }

    @Override
    public String toString(){
        return "Vertex" + v + "is not in the graph";
    }
}

package graph;

public class VertexAlreadyInGraph extends RuntimeException{

    String v;

    public VertexAlreadyInGraph(String v){
        this.v=v;
    }

    @Override
    public String toString(){
        return "Vertex" + v + "is already in the graph";
    }

}

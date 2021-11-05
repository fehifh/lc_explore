package graph;

public class EdgeNotInGraph extends RuntimeException{


    String v1, v2;

    public EdgeNotInGraph(String v1, String v2){
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public String toString(){
        return "Edge from" + v1 + "to" + v2 + "is not in the graph";
    }
}

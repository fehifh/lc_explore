package graph;

public class EdgeAlreadyInGraph extends RuntimeException{

    String v1, v2, e;

    public EdgeAlreadyInGraph(String v1, String e, String v2){
        this.v1=v1;
        this.v2=v2;
        this.e=e;
    }

    @Override
    public String toString(){
        return "Edge with label"+e+"from"+v1+"to"+v2+"is already in the graph";
    }

}

package graph_dfsbfs;

public class Edge {
    public int from;
    public int to;
    public Edge(int i, int j){
        from=i;
        to=j;
    }

    @Override
    public String toString(){
        return "("+from+", "+to+")";
    }
}

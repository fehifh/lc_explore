package graph_dfsbfs;

import java.util.LinkedList;
import java.util.List;

public class MatrixGraph implements Graph{
    private boolean[][] matrix;

    /** Constructor: A graph with n nodes number 0..n-1 and edges given by edges.
     * Precondition: edges is not null.
     * @return
     */
    public MatrixGraph(int numNodes, Edge[] edges){
        matrix = new boolean[numNodes][numNodes];
        for(Edge e: edges){
            matrix[e.from][e.to]=true;
        }
    }
    @Override
    public int numNodes(){
        return matrix.length;
    }

    @Override
    public List<Integer> neighbors(int u){
        List<Integer> neighbors = new LinkedList<>();
        for(int i=0; i<matrix.length; i++){
            if(matrix[u][i]){
                neighbors.add(i);
            }
        }
        return neighbors;
    }

    @Override
    public void print(){
        System.out.println("Adjacency matrix");
        int v = matrix.length;
        /* Maximum number of characters needed to display a node label */
        int width=(int) Math.ceil(Math.log10(v));
        String heading=String.format("%"+width+"s","")+" ";
        for(int c=0;c<matrix.length;c++){
            heading += pad(width,c)+" ";
        }
        System.out.println(heading);

        for(int r=0;r<matrix.length;r++){
            String row = pad(width,r) + " ";
            for(int c=0;c<matrix.length;c++){
                row += pad(width,matrix[r][c]?1:0)+" ";
            }
            System.out.println(row);
        }
    }

    private static String pad(int width, int i){
        return String.format("%"+width+"d",i);
    }
}

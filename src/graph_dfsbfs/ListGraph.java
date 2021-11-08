package graph_dfsbfs;

import java.util.LinkedList;
import java.util.List;

public class ListGraph implements Graph{
    private class Node{
        int value;
        List<Node> neighbors;

        Node(int value){
            this.value = value;
            neighbors = new LinkedList<Node>();
        }
    }

    private Node[] nodes;

    /** Constructor: a graph with n nodes, whose labels are 0..n-1,
     * and with edges between them.
     * Precondition: edges is not null, and it has no duplicate edges.
     */
    public ListGraph(int n, Edge[] edges){
        nodes=new Node[n];
        for(int i=0;i<n;i++){
            nodes[i]=new Node(i);
        }
        for(Edge e:edges){
            nodes[e.from].neighbors.add(nodes[e.to]);
        }
    }
    @Override
    public int numNodes(){
        return nodes.length;
    }

    @Override
    public List<Integer> neighbors(int u){
        List<Integer> neighbors = new LinkedList<>();
        for(Node n: nodes[u].neighbors){
            neighbors.add(n.value);
        }
        return neighbors;
    }

    @Override
    public void print(){
        System.out.println("Adjacency list");
        for(int i=0;i<nodes.length;i++){
            String row = i + " -> [ ";
            for(Node node: nodes[i].neighbors){
                row += node.value + " ";
            }
            System.out.println(row+"]");
        }
    }
}

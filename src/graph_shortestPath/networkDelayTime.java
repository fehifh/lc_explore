package graph_shortestPath;

import java.util.*;

public class networkDelayTime {
    public static int networkDelayTime(int[][] times, int n, int k) {
        // settled set
        LinkedList<Integer> S = new LinkedList<>();
        // frontier set
        PriorityQueue<Integer> F = new PriorityQueue<>();
        // distance hashmap
        HashMap<Integer,Integer> dSF = new HashMap<>();
        // backpointer hashmap
        HashMap<Integer,Integer> bkSF = new HashMap<>();
        // initialization
        dSF.put(k,0);
        bkSF.put(k,null);
        F.offer(k);
        while(!F.isEmpty()){
            // the minimum node
            int f = F.poll();
            S.add(f);
            for(int[] edge: times){
                // for each neighbor of f
                if(edge[0]==f){
                    int w = edge[1];
                    int dw= edge[2] + dSF.get(f);
                    // if w is not in S or F
                    if(!dSF.containsKey(w)){
                        // add w to F
                        F.add(w);
                        // add w to distance hashmap and backpointer hashmap
                        dSF.put(w,dw);
                        bkSF.put(w,f);
                        System.out.println("dSF and bkSF update: node - "+ w + ", d - "+ dSF.get(w) + ", bk - "+bkSF.get(w));
                    }
                    //if a shorter path is found
                    else if (dSF.get(w) > dw){
                        dSF.replace(w,dw);
                        bkSF.replace(w,f);

                        System.out.println("dSF and bkSF update: node - "+ w + ", d - "+ dSF.get(w) + ", bk - "+bkSF.get(w));
                    }
                }
            }

        }
        if(dSF.size()<n){
            return -1;
        }
        var max = new Object() {
            int max = 0;
        };
        dSF.forEach((key,value) -> {
           System.out.println("node:"+key+"    "+"distance:"+ value);
           if(max.max<value)max.max= value;
        });
        return max.max;
    }

    public static void main(String[] args){
        int[][] times1 = new int[][]{
                new int[]{
                  2,1,1
                },
                new int[]{
                        2,3,1
                },
                new int[]{
                        3,4,1
                }
        };

        int aws1 = networkDelayTime(times1,4,2);
        System.out.println("aws1: "+aws1);

        int[][] times2 = new int[][]{
                new int[]{
                        1,2,1
                }
        };


        int aws2 = networkDelayTime(times2,2,1);
        System.out.println("aws2: "+aws2);

        int[][] times3 = new int[][]{
                new int[]{
                        1,2,1
                }
        };

        int aws3 = networkDelayTime(times3,2,2);
        System.out.println("aws3: "+aws3);
//[[4,2,76],[1,3,79],[3,1,81],[4,3,30],[2,1,47],[1,5,61],[1,4,99],[3,4,68],[3,5,46],[4,1,6],[5,4,7],[5,3,44],[4,5,19],[2,3,13],[3,2,18],[1,2,0],[5,1,25],[2,5,58],[2,4,77],[5,2,74]]
//        5
//        3
// Expected : 59
    }
}

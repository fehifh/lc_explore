package stack;

import java.util.Stack;

public class Solution2 {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ans= new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while((!s.isEmpty()) && temperatures[i]>=temperatures[s.peek()]) {s.pop();}
            ans[i]= s.isEmpty()?0:s.peek()-i;
            s.push(i);
        }
        return ans;
    }

    public static void main(String[] args){
        int[] a= dailyTemperatures(new int[]{89,62,70,58,47,47,46,76,100,70});
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}

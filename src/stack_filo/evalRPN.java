package stack_filo;

import java.util.Stack;

public class evalRPN {
    public static int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();
        for(String t: tokens){
            int op2=0;
            int op1=0;

            if(t.equals("+")) {
                if(!s.isEmpty()) op2=Integer.parseInt(s.pop());
                if(!s.isEmpty()) op1=Integer.parseInt(s.pop());
                s.push(Integer.toString(op1+op2));
            }
            else if(t.equals("-")){
                if(!s.isEmpty()) op2=Integer.parseInt(s.pop());
                if(!s.isEmpty()) op1=Integer.parseInt(s.pop());
                s.push(Integer.toString(op1-op2));
            }
            else if(t.equals("*")){
                if(!s.isEmpty()) op2=Integer.parseInt(s.pop());
                if(!s.isEmpty()) op1=Integer.parseInt(s.pop());
                s.push(Integer.toString(op1*op2));
            }
            else if(t.equals("/")){
                if(!s.isEmpty()) op2=Integer.parseInt(s.pop());
                if(!s.isEmpty()) op1=Integer.parseInt(s.pop());
                s.push(Integer.toString(op1/op2));
            }
            else s.push(t);
        }
        return s.isEmpty()?0:Integer.parseInt(s.pop());
    }

    public static void main(String[] args){
        int ans= evalRPN(new String[] { "2","1","+","3","*"});
        System.out.println(ans);
    }
}

package stack_filo;

import java.util.ArrayList;

class MinStack {
    private ArrayList<Integer> data;
    private int min;
    public MinStack() {
        data = new ArrayList<>();
    }

    public void push(int val) {
        data.add(val);
    }

    public void pop() {
        assert data!=null;
        data.remove(data.size()-1);
    }

    public int top() {
        assert data!=null;
        return data.get(data.size()-1);
    }

    public int getMin() {
        assert data!=null;
        int min = data.get(0);
        for(int i=0;i<data.size();i++){
            if(data.get(i)<min) min=data.get(i);
        }
        return min;
    }

    public void print(){
        for(int i=0;i<data.size();i++){
            System.out.println("The stack is:");
            System.out.println(data.get(i));
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
package stack;

import java.util.ArrayList;
import java.util.List;

class MinStack {
    private List<Integer> data;
    private int min;
    public MinStack() {
        data = new ArrayList<>();
    }

    public void push(int val) {
        data.add(val);
    }

    public void pop() {
        assert data!=null;
        data.remove(1);
    }

    public int top() {
        assert data!=null;
        data.get(1);
    }

    public int getMin() {
        assert data!=null;
        data.get(
        )
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
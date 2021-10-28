package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyCircularQueue {
    private List<Integer> data;
    private int head;
    private int tail;
    private int size;

    public int size(){
        return data.size();
    }
    public MyCircularQueue(int k) {
        data=new LinkedList<>();
        size=k;
        head=-1;
        tail=-1;
    }

    public boolean enQueue(int value) {
        if(isFull()) return false;
        if(isEmpty()){
            head=0;
            tail=0;
            data.add(value);
            return true;
        }
        if(head==0 && tail<size-1){
            data.add(value);
            tail++;
            return true;
        }
        if(tail==size-1){
            data.add(0,value);
            tail=0;
            return true;
        }
        if(tail<=head){
            data.add(tail+1,value);
            tail++;
            return true;
        }
        return false;
    }

    public boolean deQueue() {
        if(isEmpty())return false;
        if(head==tail){
            data.set(head,null);
            head=-1;
            tail=-1;
            return true;
        }
        data.remove(head);
        head++;
        return true;
    }

    public int Front() {
        if(isEmpty()) return -1;
        return data.get(head);
    }

    public int Rear() {
        if(isEmpty()) return -1;
        return data.get(tail);
    }

    public boolean isEmpty() {
        return tail==-1 && tail==-1;
    }

    public boolean isFull() {
        if(head==0 && tail==size-1) return true;
        if(head==tail+1) return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
package linkedList;

public class MyLinkedList {
    //MyLinkedList() Initializes the MyLinkedList object.
    //int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
    //void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
    //void addAtTail(int val) Append a node of value val as the last element of the linked list.
    //void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. If index equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
    //void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
    private Node head;
    private int size;
    private class Node {
        int val;
        Node next;
        Node(int val,Node next) {
            this.val = val;
            this.next = next;
        }
    }
    public MyLinkedList() {
    }

    public int size(){
        return size;
    }
    public int get(int index) {
        if(index<0 || index>size-1) return -1;
        else{
            Node n=head;
            for(int i=0; i<index;i++){
                n=n.next;
            }
            return n.val;
        }
    }

    public void addAtHead(int val) {
        if(head==null){
            head=new Node(val,null);
        }
        else{
            Node n=new Node(val,head);
            head=n;
        }
        size++;
    }

    public void addAtTail(int val) {
         Node n=head;
         while(n.next!=null){
             n=n.next;
         }
         n.val=val;
         size++;
    }

    public void addAtIndex(int index, int val) {
        if(index>0 && index<size){
            Node n=head;
            for (int i = 0; i < index-1; i++) {
                n = n.next;
            }
            Node addNode=new Node(val,n.next);
            n.next=addNode;
            size++;
        }
        else if (index==0){
            Node addNode = new Node(val,head);
            head=addNode;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if(index>0 && index<=size-1){
            Node n=head;
            for(int i=0;i<index-1;i++){
                n = n.next;
            }
            Node newNextNode=n.next.next;
            n.next.next=null;
            n.next=newNextNode;
            size--;
        }
        else if (index==0 && size==1){
            head=null;
            size--;
        }
    }
}


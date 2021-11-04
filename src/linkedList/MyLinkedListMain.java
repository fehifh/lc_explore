package linkedList;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList myLinkedList= new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        System.out.println(myLinkedList.size());
        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
        myLinkedList.get(1);              // return 2
        System.out.println(myLinkedList.get(1));
        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
        myLinkedList.get(1);              // return 3
        System.out.println(myLinkedList.get(1));
    }
}
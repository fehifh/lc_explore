//package hashTable1;
//
//import java.util.LinkedList;
//
//public class MyHashSet1 {
//    private hashTable2.Bucket[] bucketArray;
//    private int keyRange;
//
//    public MyHashSet1() {
//        this.keyRange = 769;
//        this.bucketArray = new hashTable2.Bucket[this.keyRange];
//        for (int i = 0; i < this.keyRange; ++i)
//            this.bucketArray[i] = new hashTable2.Bucket();
//    }
//    protected int _hash(int key) {
//        return (key % this.keyRange);
//    }
//
//
//    public void add(int key) {
//        int bucketIndex = this._hash(key);
//        this.bucketArray[bucketIndex].insert(key);
//    }
//
//    public void remove(int key) {
//        int bucketIndex = this._hash(key);
//        this.bucketArray[bucketIndex].delete(key);
//    }
//
//    public boolean contains(int key) {
//        int bucketIndex = this._hash(key);
//        return this.bucketArray[bucketIndex].exists(key);
//    }
//}
//
//
//class Bucket {
//    private LinkedList<Integer> container;
//
//    public Bucket() {
//        container = new LinkedList<Integer>();
//    }
//
//    public void insert(Integer key) {
//        int index = this.container.indexOf(key);
//        if (index == -1) {
//            this.container.addFirst(key);
//        }
//    }
//
//    public void delete(Integer key) {
//        this.container.remove(key);
//    }
//
//    public boolean exists(Integer key) {
//        int index = this.container.indexOf(key);
//        return (index != -1);
//    }
//}
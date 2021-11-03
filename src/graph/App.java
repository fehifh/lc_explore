package graph;

public class App {
    public static void main(String[] args) throws Exception {
        UnionFind uf = new UnionFind(10);
        // 1-2-5-6-7 3-8-9 4
        uf.union(1, 2);
        uf.union(2, 5);
        uf.union(5, 6);
        uf.union(6, 7);
        uf.union(3, 8);
        uf.union(8, 9);
        System.out.println(uf.connected(1, 5)); // true
        System.out.println(uf.connected(5, 7)); // true
        System.out.println(uf.connected(4, 9)); // false
        // 1-2-5-6-7 3-8-9-4
        uf.union(9, 4);
        System.out.println(uf.connected(4, 9)); // true

        UnionFind2 uf2 = new UnionFind2(10);
        // 1-2-5-6-7 3-8-9 4
        uf2.union(1, 2);
        uf2.union(2, 5);
        uf2.union(5, 6);
        uf2.union(6, 7);
        uf2.union(3, 8);
        uf2.union(8, 9);
        System.out.println(uf.connected(1, 5)); // true
        System.out.println(uf.connected(5, 7)); // true
        System.out.println(uf.connected(4, 9)); // false
        // 1-2-5-6-7 3-8-9-4
        uf2.union(9, 4);
        System.out.println(uf.connected(4, 9)); // true
    }
}

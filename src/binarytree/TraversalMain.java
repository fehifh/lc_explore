package binarytree;

import java.util.ArrayList;
import java.util.List;

public class TraversalMain {

    public static void main(String[] args) {

        TreeNode n1=new TreeNode(2);
        n1.left = new TreeNode(1);
        n1.right=new TreeNode(3);
        List<Integer> al=new ArrayList<>();
        al= TraversalRecursive.preorderTraversal(n1);
        System.out.println(al);

        al= TraversalIterative.preorderTraversal(n1);
        System.out.println(al);

    }
}

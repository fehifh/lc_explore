package binarytree;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TreeNode n1=new TreeNode(2);
        n1.left = new TreeNode(1);
        n1.right=new TreeNode(3);
        List<Integer> al=new ArrayList<>();
        al=Solution.preorderTraversal(n1);
        System.out.println(al);
    }
}

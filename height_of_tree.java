import java.util.*;


public class BinaryTree {

    static Scanner sc = null;

    public static class Node {
        int data;
        Node right = null;
        Node left = null;

        Node(int data) {
            this.data = data;
        };
    }


    int height(Node root) {
        if (root == null)
            return 0;

        return Math.max(height(root.right), height(root.left)) + 1;
    }


    public static void main(String[] args) {
        sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        Node root = new Node(7);
        Node l = new Node(2);
        Node ll = new Node(0);
        Node r = new Node(1);
        Node lr = new Node(4);
        root.left = l;
        l.left = ll;
        l.right = lr;
        root.right = r;

        System.out.println(bt.height(root));
    }

}

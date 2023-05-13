package Trees;

import java.util.*;

public class TreeB {

  static class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static class Binarytree {

    static int idx = -1;

    public static Node buildtree(int nodes[]) {
      idx++;
      if (nodes[idx] == -1) {
        return null;
      }
      Node newnode = new Node(nodes[idx]);
      newnode.left = buildtree(nodes); //recursive call
      newnode.right = buildtree(nodes); //recursive call
      return newnode;
    }

    public static void preorder(Node root) { //preorder treversal
      if (root == null) {
        return;
      }
      System.out.print(root.data + " ");
      preorder(root.left);
      preorder(root.right);
    }

    public static void inorder(Node root) { //inorder treversal
      if (root == null) {
        return;
      }
      inorder(root.left);
      System.out.print(root.data + " ");
      inorder(root.right);
    }

    public static void postorder(Node root) { //postorder treversal
      if (root == null) {
        return;
      }
      postorder(root.left);
      postorder(root.right);
      System.out.print(root.data + " ");
    }

    public static void levelorder(Node root) { //levelorder traversal**
      if (root == null) {
        return;
      }
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null);

      while (!q.isEmpty()) {
        Node currNode = q.remove();
        //check the currunt node empty or not!
        if (currNode == null) {
          System.out.println();
          if (q.isEmpty()) {
            break;
          } else {
            q.add(null);
          }
        } else {
          System.out.print(currNode.data + " ");
          if (currNode.left == null) {
            q.add(currNode.left);
          }
          if (currNode.right == null) {
            q.add(currNode.right);
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    Binarytree tree = new Binarytree();
    Node root = tree.buildtree(nodes);

    // System.out.println(root.data);

    // tree.preorder(root);
    // tree.inorder(root);
    // tree.postorder(root);
    tree.levelorder(root);
  }
}

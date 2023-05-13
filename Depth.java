package Trees;

public class Depth {
    static class Node{
        int data;
        Node left;
        Node right;
         Node(int data){
            this.data = data;
            this.left  = null;
            this.right = null;
         }
    }
    public static int  depth(Node root){
        if(root == null){
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);

        int so= Math.max(left, right);
        return 1+so;
    }
    public static void main(String[] args) {
        Node root =new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        
        System.out.println(depth(root));
        
    }
    
}

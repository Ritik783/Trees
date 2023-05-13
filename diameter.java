package Trees;

public class diameter {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this. data=  data;
            this.left = null;
            this.right = null;
        }
        public static int height(Node root) {
            if (root == null) {
              return 0;
            }
            int leftheight = height(root.left);
            int rightheight = height(root.right);
        
            return Math.max(leftheight, rightheight) + 1;
          }
          //first approch
          public static int diameter1(Node root){
            if(root == null){
                return 0;
            }
            int leftdiametre = diameter1(root.left);
            int leftheight = height(root.left);
            int rightdiametre = diameter1(root.right);
            int rightheight = height(root.right);
    
            int selfheight = leftheight+rightheight+1;
            return Math.max(Math.max(rightdiametre, leftdiametre), selfheight);
        }
        //second approch
       static class info{
            int height;
            int diam;
            info(int height, int diam){
                this .height = height;
                this.diam = diam;
            }
        }
        public static info diameter(Node root){
            // if(root == null){
            //     return -1;
            // }
            info leftinfo = diameter(root.left);
            info rightinfo = diameter(root.right);

            int diam=Math.max(leftinfo.height+rightinfo.height+1,Math.max(leftinfo.diam, rightinfo.diam));
            int finalheight = Math.max(leftinfo.height,rightinfo.height)+1;

            return new info(finalheight, diam);
    }
}
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(diameter(root).diam);
        
    }
}

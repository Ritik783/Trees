package Trees;

import java.util.*;

import org.w3c.dom.Node;

public class TopViewoftree {
    static class info{
        Node node;
        int hd;
        info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topview(Node root ){
        Queue<info> q= new LinkedList<>();
        HashMap<Node,Integer> map = new HashMap<>();
        int min=0;
        int max=0;
        q.add(info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break ;
                }
                else{
                    q.add(null);
                }
            }else{
                
            }
        }
    }
    public static void main(String[] args) {
        
    }
}

import java.util.*;

public class level_order_traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root!=null){
            q.add(root);
        }
        while(!q.isEmpty()){
            int x = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<x;i++){
                TreeNode temp = q.poll();
                l.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            ls.add(l);
        }
        return ls;
        
    }
    
}

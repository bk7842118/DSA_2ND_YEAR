import java.util.*;

public class max_depth_of_binary_tree {
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return 1+Math.max(left,right);
        
    }
}

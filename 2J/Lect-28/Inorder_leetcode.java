import java.util.*;

public class Inorder_leetcode {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        print(root, ans);
        return ans;
    }

    public void print(TreeNode root, List<Integer> ans) {
        if (root == null) return; 
           
            print(root.left, ans);
            ans.add(root.val);
            print(root.right, ans);
        
    } 
}

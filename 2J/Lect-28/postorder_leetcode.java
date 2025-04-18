import java.util.*;;

public class postorder_leetcode {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        print(root, ans);
        return ans;
    }

    public void print(TreeNode root, List<Integer> ans) {
        if (root == null) return; 
           
            print(root.left, ans);
            print(root.right, ans);
            ans.add(root.val);
        
    }
}

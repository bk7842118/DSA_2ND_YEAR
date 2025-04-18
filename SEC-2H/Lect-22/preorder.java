import java.util.*;;

public class preorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        print(root, ans);
        return ans;
    }

    public void print(TreeNode root, List<Integer> ans) {
        if (root == null) return; 
            ans.add(root.val);
            print(root.left, ans);
            print(root.right, ans);
           
        
    }
}

import java.util.*;
class binarytree{
    class treenode {
 		int val;
 		treenode left;
 	    treenode right;
 	    treenode(int val){
 	        this.val=val;
 	    }
 
 	}
 	treenode root;
 	Scanner sc=new Scanner(System.in);
 	binarytree(){
 	    root=createtree();
 	}
 	public treenode createtree(){
 		int x = sc.nextInt();
 		treenode newnode = new treenode(x);
 		boolean left = sc.nextBoolean();
 		if (left == true) {
 			newnode.left = createtree();
 		}
 
 		boolean right = sc.nextBoolean();
 		if (right == true) {
 			newnode.right = createtree();
 		}
 		return newnode;
 
 	}
 	   public void inorder(){
 	        System.out.println("inorder"+" ");
 	       inorderprint(root);
 	       System.out.println();
 	   }
 	    public void inorderprint(treenode root) {
        if (root == null) return; 
           
           inorderprint(root.left);
           System.out.print(root.val+"  ");
           inorderprint(root.right);
        
    }
    public void preorder(){
       System.out.println("preorder"+" ");
       preorderprint(root);
       System.out.println();
   }
    public void preorderprint(treenode root) {
      if (root == null) return; 
      
      System.out.print(root.val+"  ");
      preorderprint(root.left);
      preorderprint(root.right);
   
}
public void levelorder(){
    System.out.println("levelorder"+" ");
    levelorderprint(root);
}
public void levelorderprint(treenode root) {
    List<List<Integer>> ls = new ArrayList<>();
    Queue<treenode> q = new LinkedList<>();
    if(root!=null){
        q.add(root);
    }
    while(!q.isEmpty()){
        int x = q.size();
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<x;i++){
            treenode temp = q.poll();
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
    System.out.println( ls);  
}
}

public class Implementation_of_tree {
    public static void main(String[] args) {
        binarytree t1=new binarytree();
        t1.inorder();
        t1.preorder();
        t1.levelorder();
    }
}

package InvertBinaryTree;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public TreeNode invertTree(TreeNode root) {
		if (root==null)
			return null;
		else{
		invert(root);
		return root;
		}
    }

	private void invert(TreeNode root) {
		// TODO Auto-generated method stub
		if(root.left==null && root.right==null){
			root.left=null;
			root.right=null;
		}
		else if(root.left==null && root.right!=null)
	       {
	    	   root.left=root.right;
	       	   root.right=null;
	       	   invert(root.left);
	       }
	       else if(root.right==null && root.left!=null){
	    	   root.right=root.left;
	    	   root.left=null;
	    	   invert(root.right);
	       }
	       else
	       {
	    	   TreeNode temp=new TreeNode(0);
	    	   temp=root.left;
	    	   root.left=root.right;
	    	   root.right=temp;
	    	   invert(root.left);
	    	   invert(root.right);
	       }
	}
}

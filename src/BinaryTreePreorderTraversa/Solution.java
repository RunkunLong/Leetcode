package BinaryTreePreorderTraversa;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        preorder(root,result);
        return result;
    }

	private void preorder(TreeNode root, List<Integer> result) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		result.add(root.val);
		preorder(root.left, result);
		preorder(root.right, result);
	}


}

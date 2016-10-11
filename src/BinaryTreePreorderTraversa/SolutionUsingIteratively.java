package BinaryTreePreorderTraversa;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SolutionUsingIteratively {
	public List<Integer> preorderTraversal(TreeNode root){
		List<Integer> result=new ArrayList<Integer>();
		Stack<TreeNode> temp=new Stack<>();
		while(root!=null || !temp.isEmpty()){
			while(root!=null){
				result.add(root.val);
				temp.push(root);
				root=root.left;
			}
			root=temp.pop();
			root=root.right;
		}
		return result;
	}
}

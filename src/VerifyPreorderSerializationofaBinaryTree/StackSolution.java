package VerifyPreorderSerializationofaBinaryTree;

import java.util.Stack;

public class StackSolution {
	public boolean isValidSerialization(String preorder) {
		if(preorder==null)
			return false;
		Stack<String> result=new Stack<>();
		String[] temp=preorder.split(",");
		for(int i=0;i<temp.length;i++){
			String curr=temp[i];
			while(curr.equals("#") && !result.isEmpty() && result.peek().equals("#")){
				result.pop();
				if(result.isEmpty())
					return false;
				result.pop();
			}
			result.push(curr);
		}
		return result.size()==1 && result.peek().equals("#");
	}
}

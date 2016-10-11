package VerifyPreorderSerializationofaBinaryTree;

import javax.xml.crypto.NodeSetData;

public class Solution {
	 public boolean isValidSerialization(String preorder) {
		 int nonleaves=0;
		 int leaves=0;
		 int i=0;
		 String[] tree=preorder.split(",");
		 for(i=0;i<tree.length && nonleaves+1 !=leaves;i++)
			 if(tree[i].equals("#"))leaves++;
			 else nonleaves++;
		 return nonleaves+1== leaves && i==tree.length;
	 }
}

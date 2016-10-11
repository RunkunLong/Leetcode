package RerverseString;

public class Solution {
	public String reverseString(String s) {
		char[] temp=s.toCharArray();
		int l=temp.length;
		char[] result=new char[l];
		for(int i=l-1,j=0;i>=0;i--,j++)
			result[j]=temp[i];
		return new String(result);
    }
}

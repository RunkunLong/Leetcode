package ProductofArrayExceptSelf;

public class Solution {
	public int[] productExceptSelf(int[] nums) {
		if(nums.length==1 || nums==null)
			return nums;
        int l=nums.length;
        int[] left=new int [l];
        left[0]=1;
        int[] right=new int[l];
        right[l-1]=1;
        for(int i=1;i<l;i++)
        	left[i]=left[i-1]*nums[i-1];
        for(int j=l-2;j>=0;j--)
        	right[j]=right[j+1]*nums[j+1];
        int[] result=new int[l];
        for(int k=0;k<l;k++)
        	result[k]=left[k]*right[k];
        return result;
        	
    }
}

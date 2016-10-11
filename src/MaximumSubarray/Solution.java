package MaximumSubarray;

public class Solution {
   	public int maxSubArray(int[] nums) {
		int l=nums.length;
		// the compare array stores two value.
		// compare[0] stores the value of the maximum continuous subarray
		// compare[1] stores the value of current valid subarray
		// which valid means the sum of the subarray is nonnegative 
		int []compare=new int[]{0,0};
		int negCount=0;
		int max=nums[0];
		for(int i=0;i<l;i++){
			if(nums[i]<0)
				negCount++;
			max=Math.max(max,nums[i]);					
		}
		for(int j=l-1;j>=0;j--)
		{
			if(nums[j]>0)
				compare[1]=compare[1]+nums[j]; 
			else
				compare[1]=Math.max(0, compare[1]+nums[j]);
			compare[0]=Math.max(compare[0], compare[1]); 
		}
		if(negCount==l)
			return max;
		else
			return compare[0];
}
}
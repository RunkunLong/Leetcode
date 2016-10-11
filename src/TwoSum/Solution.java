package TwoSum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        int l=nums.length;
        for(int i=0;i<l;i++)
        	for(int j=i+1;j<l;j++)
        		if(target==nums[i]+nums[j]){
        			result[0]=i;
        			result[1]=j;
        		}
        return result;
    }
}

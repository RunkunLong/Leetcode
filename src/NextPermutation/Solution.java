package NextPermutation;

import java.util.Arrays;

public class Solution {
	public void nextPermutation(int[] nums) {
        NextPermutation(nums, nums.length-1, 0);
    }
	private void NextPermutation(int[] nums,int start,int end) {
		boolean swap=false;
        if(nums.length==1)
        	return;
        else if(swap==false && start>end){
        	int i=start;
        	int j=i-1;
        	while(j>=end){
        		if(nums[j]<nums[i]){
        			nums[j]^=nums[i];
        			nums[i]^=nums[j];
        			nums[j]^=nums[i];
        			swap=true;
        			Arrays.sort(nums, j+1, nums.length);  			
        			return;
        		}
        		if(nums[j]==nums[i]){
        			NextPermutation(nums, nums.length, j+1);
        			return;
        		}
        	j--;
        	}  
        	start=start-1;
        	NextPermutation(nums, start, end);
        	return;
        }
        else {
			Arrays.sort(nums,0,nums.length);
			return;
		}
	}
}

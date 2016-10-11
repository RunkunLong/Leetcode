package JumpGame;

public class Solution {
    public boolean canJump(int[] nums) {
    	if(nums.length<=1)
    		return true;
    	if(nums.length!=1 && nums[0]==0)
    	    return false;
        int maxindex=0;
        for(int i=0;i<nums.length-1;i++){
        	maxindex=Math.max(maxindex, i+nums[i]);
        	if(maxindex<=i)
        		return false;
        }
        return true;
      
    }
}
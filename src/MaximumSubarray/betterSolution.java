package MaximumSubarray;

public class betterSolution {
	public class Solution {
	    /**
	     * Assumptions
	     * input of any size
	     * inputs are integers
	     * sums don't lead to integer overflow
	     */
	    public int maxSubArray(int[] nums) {
	        if ( nums.length == 0 ) { return 0; }
	        int sum = nums[0];
	        int maxSum = sum;
	        for ( int i = 1; i < nums.length; i++ ) {
	            if ( sum > 0 ) {
	                sum += nums[i];
	            } else {
	                sum = nums[i];
	            }
	            maxSum = Math.max(maxSum, sum);
	        }
	        return maxSum;
	    }
	}
}

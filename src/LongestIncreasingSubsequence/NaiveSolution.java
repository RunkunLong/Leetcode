package LongestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.Collections;

public class NaiveSolution {
	public int lengthOfLIS(int[] nums) {
	    ArrayList<Integer> dp = new ArrayList<>(nums.length);
	    for (int num : nums) {
	        if (dp.size() == 0 || dp.get(dp.size()-1) < num) dp.add(num);
	        else {
	            int i = Collections.binarySearch(dp, num);
	            dp.set((i<0) ? -i-1 : i, num);
	        }
	    }
	    return dp.size();
	}
}

package SearchInsertPosition;

import java.util.Arrays;

// this solution is rather tricky using the java built-in binary search function
public class TrickySolution {
	 public int searchInsert(int[] nums, int target) {
	        int i=Arrays.binarySearch(nums, target);
	        if(i<0) return -(i+1);
	        else return i;
	    }
}

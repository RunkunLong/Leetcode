package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class hashmapsolution {
	 public int[] twoSum(int[] nums, int target) {
	 Map<Integer, Integer> map =new HashMap<Integer, Integer>();
	 int length=nums.length;
	 for(int i=0;i<length;i++){
		 int j=target-nums[i];
		 if(map.containsKey(j))
			 return new int[]{map.get(j),i};
			 map.put(nums[i],i);
	 }
	 
	 throw new IllegalArgumentException("No two sum solution");
	 }
	 
}
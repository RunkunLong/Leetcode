package Permutations;

import java.util.List;
import java.util.ArrayList;

public class Solution {
	  public List<List<Integer>> permute(int[] nums) {
	
	        return create(nums,nums.length-1);
	        
	    }

	private List<List<Integer>> create(int[] nums,int index) {
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		if(nums==null || nums.length==0)
			return null;
		if(index==0){
			List<Integer> temp=new ArrayList<Integer>();
			temp.add(nums[0]);
			result.add(temp);
			return result;
		}
		
		List<List<Integer>> outer=new ArrayList<List<Integer>>(create(nums, index-1));
		int outerl=create(nums, index-1).size();
		for(int i=0;i<outerl;i++){
			List<Integer> inner=new ArrayList<Integer>(outer.get(i));
			List<Integer> first=new ArrayList<Integer>(inner);
			first.add(nums[index]);
			result.add(first);
			int innerl=inner.size();
			for(int j=0;j<innerl;j++){
				List<Integer> transfer=new ArrayList<Integer>(inner);
				transfer.add(j, nums[index]);
				result.add(transfer);
			}
		}
		return result;
		
	}
}

package SuperPow;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int superPow(int a, int[] b) {
    	if(a==0 || b==null ||b.length==0 || a==1337)
    		return 0;
		if(b.length==1 && b[0]==0)
			return 1;
		if(a==1)
			return 1;
		if(a>1337)
			a=a%1337;
    	List<Integer> loop=pattern(a);
        int length=loop.size();
        int index= findindex(length,b);
        if(index==0)
        	return 0;
        else
        	return loop.get(index-1);
        
    }

	private int findindex(int length, int[] b) {
		// TODO Auto-generated method stub

		int index=0;
		for(int i=0;i<b.length;i++){
			index=(index*10+b[i])%length;
		}
		return index;
	}

	private List<Integer> pattern(int c) {
		// TODO Auto-generated method stub
        List<Integer> result =new ArrayList<Integer>();
        boolean[] set=new boolean[1337];
        int i=c%1337;
        while(!set[i]){
        	set[i]=true;
        	result.add(i);
        	i=(i*c)%1337;
        }
        return result;
		
	}
}

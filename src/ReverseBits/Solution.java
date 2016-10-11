package ReverseBits;



public class Solution {
	public int reverseBits(int n) {
        int result=0;
        for(int i=0;i<31;i++){
        	if((n&1)==1){
        		result<<=1;
        		result=result+1;
        	}
        	else
        		result<<=1;
        	n>>=1;
        		
        }
		return result;

    }
}

package GasStation;

public class Solution {
	 public int canCompleteCircuit(int[] gas, int[] cost) {
		 	if(gas.length==1){
		 		if(gas[0]>=cost[0])
		 			return 0;
		 		else 
		 			return -1;
		 	}
	       	for(int i=0;i<gas.length;i++){
	       		int currentg=0;
	       		int currentc=0;
	       		int j=i;
	       		if(gas[j]>=cost[j]){
	       			while(currentg>=currentc){
	       				currentg+=gas[j];
		       			currentc+=cost[j];
		       			j++;
	       			if(j==gas.length)
	       				j=0;
	       			if(j==i && currentg-currentc>=0)
	       				return i;
	       			if(j==i && currentg-currentc<0)
	       				return -1;
	       			}
	       			if(j==0)
	       				i=gas.length-1;
	       			else
	       				i=j-1;
	       		}
	       	}
	       	return -1;
	    }
}

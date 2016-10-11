package GasStation;

public class NeatSolution {
	 public int canCompleteCircuit(int[] gas, int[] cost) {
	      int start=gas.length, end=0, sum=0;
	      do {
	          if (sum>0) { 
	              sum  = sum+gas[end]-cost[end];
	              end++;
	          } else {
	              start--;
	              sum = sum + gas[start]-cost[start];
	          }
	      } while (start!=end);
	      return sum>=0? start: -1;
	 }
}

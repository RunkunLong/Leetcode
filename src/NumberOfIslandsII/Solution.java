package NumberOfIslandsII;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.print.attribute.standard.DateTimeAtCompleted;


public class Solution {
	 class Point {
		      int x;
		      int y;
		      Point() { x = 0; y = 0; }
		      Point(int a, int b) { x = a; y = b; }
		      public void set(int i,int j){
		    	  this.x=i;
		    	  this.y=j;
		      }
		      
		  }
    /**
     * @param n an integer
     * @param m an integer
     * @param operators an array of point
     * @return an integer array
     */
	    public List<Integer> numIslands2(int n, int m, Point[] operators) {
	        // Write your code here
	        if(operators==null)
	    		return new ArrayList<>();
	    	int[][] graph=new int[n][m];
	    	for(int i=0;i<n;i++)
	    		for(int j=0;j<m;j++)
	    			graph[i][j]=0;
	    	List<Integer> result=new ArrayList<Integer>();
	    	int newIslands=0;
	    	for(int k=0;k<operators.length;k++){
	    		HashSet<Integer>count=new HashSet<Integer>();
	    		//int value=0;
	    		int idx=operators[k].x;
	    		int idy=operators[k].y;
	    		if(idx-1>=0 && graph[idx-1][idy]!=0)
	    			count.add(graph[idx-1][idy]);
	    		if(idx+1<graph.length && graph[idx+1][idy]!=0)
	    			count.add(graph[idx+1][idy]);
	    		if(idy-1>=0 && graph[idx][idy-1]!=0)
	    			count.add(graph[idx][idy-1]);
	    		if(idy+1<graph[0].length && graph[idx][idy+1]!=0)
	    			count.add(graph[idx][idy+1]);
	    		/*
	    		 * The hashset stores the values of the four 
	    		 * sibling cells of current location.
	    		 * If it only contains '0', a new island appears.
	    		 */
	    		newIslands++;
	    		if(count.isEmpty()){
	    			graph[idx][idy]=newIslands;
	    			if(result.isEmpty())
	    				result.add(1);
	    			else
	    				result.add(result.get(result.size()-1)+1);
	    		}
	    		else{
	    			int[] value=new int[count.size()];
	    			int i=0;
	    			for(Integer val:count)
	    				value[i++]=val;
	    			result.add(result.get(result.size()-1)-count.size()+1);
	    			graph[idx][idy]=newIslands;
	    			update(idx,idy,graph,value[0]);
	    		
	    		}  	
	    	
	    }
	    	return result;
	    }
		private void update(int idx, int idy, int[][] graph, int value) {
			if(idx<0 || idx >graph.length-1 || idy<0 || idy>graph[0].length-1 || graph[idx][idy]==value|| graph[idx][idy]==0)
				return;
			graph[idx][idy]=value;
			update(idx-1, idy, graph, value);
			update(idx+1, idy, graph, value);
			update(idx, idy-1, graph, value);
			update(idx, idy+1, graph, value);		
		}
}



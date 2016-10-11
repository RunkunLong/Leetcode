package UniquePaths;

public class Solution {
    public int uniquePaths(int m, int n) {
    	if(m==0 || n==0)
    		return 0;
    	if(m==1 || n==1)
    		return 1;
        int[][] graph=new int[m][n];
        int l=graph[0].length-1;
		int w=graph.length-1;
        search(graph,0,0,l,w);
        return graph[0][0];
    }

	private void search(int[][] graph, int m, int n,int l,int w) {
		// TODO Auto-generated method stub
		if(graph[m][n]!=0)
			return;
		
		if(m==w){
			graph[m][n]=1;
			return;
		}
		if(n==l){
			graph[m][n]=1;
			return;
		}
		search(graph, m+1, n,l,w);
		search(graph, m, n+1,l,w);
		graph[m][n]=graph[m+1][n]+graph[m][n+1];
		
	}
}

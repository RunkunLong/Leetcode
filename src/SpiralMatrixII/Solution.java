package SpiralMatrixII;

public class Solution {
   	public int[][] generateMatrix(int n) {
		if(n==0)
			return new int[0][0];
        int[][] result=new int[n][n];
        int N=n*n;
        String direction=new String("right");
        DFS(result,0,0,1,N,direction,n);
        return result;
      
    }

	private static void DFS(int[][] result, int i, int j,int start,int end, String direction, int length) {
	// TODO Auto-generated method stub
	if (length==0) {
		return;
	}
	if(length==1){
		result[i][j]=start;
		return;
	}
	int lend=i+length-1;
	int wend=j+length-1;
	int lstart=i;
	int wstart=j;
	while(direction.equals("right")){
		result[i][j]=start;
		j++;
		start++;
		if(j>lend){
			direction=new String("down");
			j--;
			i++;
		}
	}
	while(direction.equals("down")){
		result[i][j]=start;
		i++;
		start++;
		if(i>wend){
			direction=new String("left");
			i--;
			j--;		
		}
	}

	while(direction.equals("left")){
		result[i][j]=start;
		j--;
		start++;
		if(j<lstart){
			direction=new String("up");
			j++;
			i--;		
		}
	}
	
	while(direction.equals("up")){
		if(i==wstart && j==lstart){
		    direction=new String("right");
		    break;
		}
			
		result[i][j]=start;
		i--;
		start++;
		
	}
	DFS(result,lstart+1,wstart+1,start,end,direction,length-2);
}
}
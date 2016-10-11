package Candy;

public class Solution {
    public int candy(int[] ratings) {
        int[] candy=new int[ratings.length];
        for (int i=0;i<candy.length;i++)
            candy[i]=1;
        for (int j=1;j<candy.length;j++){
            if(ratings[j]>ratings[j-1] && candy[j]<=candy[j-1])
                candy[j]=candy[j-1]+1;
        }
        for (int k=candy.length-2;k>=0;k--){
            if(ratings[k]>ratings[k+1] && candy[k]<=candy[k+1])
                candy[k]=candy[k+1]+1;
        }
        int sum=0;
        for(int i=0;i<candy.length;i++)
            sum+=candy[i];
        return sum;
    }
}

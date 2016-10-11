package RangeSumQueryMutable;

import javax.print.attribute.standard.NumberUpSupported;

public class NumArray {
	int n;
	int[] segmentT;
public NumArray(int[] nums) {
		n=nums.length;
        segmentT=new int[2*n];
        for(int i=n,j=0;i<2*n;i++,j++)
        	segmentT[i]=nums[j];
        for(int k=n-1;k>0;k--)
        	segmentT[k]=segmentT[2*k]+segmentT[2*k+1];
        
    }

    void update(int i, int val) {

    	int iupdate=i+n;
    	segmentT[iupdate]=val;
    	for(int temp=iupdate/2;temp>=1;temp=temp/2)
    		segmentT[temp]=segmentT[2*temp]+segmentT[2*temp+1];
    	
        
    }

    public int sumRange(int i, int j) {
        int sum=0;
        int l=i+n;
        int r=j+n;
        while(l<=r){
        if(l%2==1){
        	sum+=segmentT[l];
        	l++;
        	}
        if(r%2==0){
        	sum+=segmentT[r];
        	r--;
        	}
        l/=2;
        r/=2;
        
        }
        return sum;
    }
}

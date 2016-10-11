package IntersectionOfTwoArray;



public class Solution {
	  public int[] intersection(int[] nums1, int[] nums2) {
	        int l1=nums1.length;
	        int l2=nums2.length;
	        int[] overlap=new int[1000000];
	        for(int i=0;i<1000000;i++)
	        	overlap[i]=0;
	        for(int j=0;j<l1;j++){
	        	if(overlap[nums1[j]]==0)
	        		overlap[nums1[j]]=1;
	        }
	        for(int k=0;k<l2;k++){
	        	if(overlap[nums2[k]]==1)
	        		overlap[nums2[k]]=2;
	        }
	        int counter=0;
	        for(int i=0;i<1000000;i++)
	        	if(overlap[i]==2)
	        		counter++;
	        int[] result=new int[counter];
	        int temp=0;
	        for(int i=0;i<1000000;i++){
	        	if(overlap[i]==2){
	        		result[temp]=i;
	        		temp++;
	        	}
	        }
	        return result;
	    }

}

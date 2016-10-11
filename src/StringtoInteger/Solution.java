package StringtoInteger;

public class Solution {
    public int myAtoi(String str) {
        char[] transfer=str.toCharArray();
        StringBuffer nums=new StringBuffer();
        for(int i=0;i<transfer.length;i++){
            if(transfer[i]<='9' && transfer[i]>='0')
                nums.append(transfer[i]);
            else
            	continue;
        }
        String nums2=nums.toString();
        return Integer.parseInt(nums2);
    }
}

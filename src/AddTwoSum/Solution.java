package AddTwoSum;

public class Solution {
    public int getSum(int a, int b) {

        int ans;
        while(b!=0)
        {
            //ֱ��û�н�λ
           ans=a^b;
           b=(a&b)<<1;
           a=ans;
        }
        return a;
   }
}

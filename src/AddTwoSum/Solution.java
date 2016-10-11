package AddTwoSum;

public class Solution {
    public int getSum(int a, int b) {

        int ans;
        while(b!=0)
        {
            //直到没有进位
           ans=a^b;
           b=(a&b)<<1;
           a=ans;
        }
        return a;
   }
}

package DifferentWaystoAddParentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        char[] cin = input.toCharArray();
        int n = cin.length;
        List<Integer>[][] h = new List[n][n];
        dfs(0, n - 1, cin, h);
        return h[0][n - 1];
    }
    
    //Actually this is a DP programming
    
    private void dfs(int st, int ed, char[] cin, List<Integer>[][] h) {
    //	For example, for h[2][6], it stored all the results of different 
    //  calculation started from 2 and ended at 6. The for loop ensures 
    //  that when it is done, every calculations results have been stored.
    //  That's the reason why h[st][ed]!=null we can just end with return 
    //  statement since we just need to extract the result in that array 
    //  for further calculating.
    	
    	
        if (h[st][ed] != null) return;
        
        h[st][ed] = new ArrayList();
        boolean isNum = true;
        for (int i = st + 1; i < ed; i++)
            if (cin[i] == '+' || cin[i] == '-' || cin[i] == '*') {
                isNum = false;
                dfs(st, i - 1, cin, h);
                dfs(i + 1, ed, cin, h);
                char op = cin[i];
                for (int a : h[st][i - 1])
                    for (int b : h[i + 1][ed])
                        h[st][ed].add(cal(a, b, op));
            }
        
        if (isNum)
            h[st][ed].add(Integer.valueOf(String.valueOf(cin, st, ed - st + 1)));
    }
    
    private int cal(int a, int b, char op) {
        switch (op) {
            case '+' : return a + b;
            case '-' : return a - b;
            case '*' : return a * b;
            default : return 0;
        }
    }
}

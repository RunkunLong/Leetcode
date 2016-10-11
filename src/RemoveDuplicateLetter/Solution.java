package RemoveDuplicateLetter;

public class Solution {
    public String removeDuplicateLetters(String s) {
        boolean[] visit=new boolean[26];
        for(int k=0;k<26;k++){
        	visit[k]=false;
        }
        int[] alphbet=new int[26];
        for(int i=0;i<s.length();i++){
            alphbet[((int)s.charAt(i))-97]++;
        }
        
        StringBuilder result=new StringBuilder();
        result.append(0);
        for(int j=0;j<s.length();j++){
        	int t=((int)s.charAt(j))-97;
        	alphbet[t]--;
        	if(visit[t]==true)
        		continue;       	
        	while(t<(int)result.charAt(result.length()-1)-'a' && alphbet[(int)result.charAt(result.length()-1)-'a']!=0){
        			char temp=result.charAt(result.length()-1);
        			visit[((int)temp)-97]=false; 
        			result.deleteCharAt(result.length()-1);
        		}
        		result.append(s.charAt(j));
        		visit[t]=true;
        	           
        }
        result.deleteCharAt(0);
        return result.toString();
    }
}

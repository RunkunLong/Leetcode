package ValidPalindrome;


public class Solution {
	 public boolean isPalindrome(String s) {
	        char[] check=s.toCharArray();
	        boolean result=true;
	        int l=check.length;
	        int i=0;
	        int j=l-1;
	        while(result && i<j){
	        	if(isValid(check[i])==false){
	        		i++;
	        		continue;
	        	}
	    
	        	if(isValid(check[j])==false){
	        		j--;
	        		continue;
	        	}
	        	result=isSame(check[i],check[j]);	        	
	        	i++;
	        	j--;
	    }
	        return result;
}

	private boolean isSame(char c, char d) {
		 if ((c >= '0' && c <= '9') || (d >= '0' && d <= '9')){
		        return c == d;
		 } else {
		        return c == d || Math.abs(c - d) == 'a' - 'A';
		    }
	}

	private boolean isValid(char c) {
		 if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <='Z') || (c >= '0' && c <= '9')){
		        return true;
		    }
		return false;
	}
}

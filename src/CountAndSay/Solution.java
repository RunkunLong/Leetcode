package CountAndSay;



public class Solution {
	public String countAndSay(int n) {
		if (n == 1)
			return Integer.toString(1);
		return generate(countAndSay(n-1));
	}
	
	private String generate(String s) {
		if (s.length() == 1)
			return "1" + s;
		String res = "";
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != s.charAt(i+1)) {
				res += Integer.toString(count) + s.charAt(i);
				count = 1;
			} else {
				count++;
			}
		}
		res += Integer.toString(count) + s.charAt(s.length()-1);
		return res;
		
		
	}
}

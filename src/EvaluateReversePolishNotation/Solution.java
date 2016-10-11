package EvaluateReversePolishNotation;

import java.util.Stack;

public class Solution {
////	public static void main(String[] args)
//	{
//		String[] test=new String[3];
//		test[0]="0";
//		test[1]="3";
//		test[2]="-";
//		
//        int output=evalRPN(test);
//        System.out.println(output);
////	}
	 public int evalRPN(String[] tokens) {
		 Stack<Integer> cal = new Stack<Integer>();
		 int n=tokens.length;
		 for(int i=0;i<n;i++)
		 {
			 String current=tokens[i];
			 // four operation in the stack
			 if(current.equals("+"))
			 {
				 int operand1=cal.pop();
				 int operand2=cal.pop();
				 cal.push(operand1+operand2);			 
			 }
			 else if(current.equals("-"))
			 {
				 int operand1=cal.pop();
				 int operand2=cal.pop();
				 cal.push(operand2-operand1);				 
			 }
			 else if(current.equals("*"))
			 {
				 int operand1=cal.pop();
				 int operand2=cal.pop();
				 cal.push(operand1*operand2);				 
			 }
			 else if(current.equals("/"))
			 {
				 int operand1=cal.pop();
				 int operand2=cal.pop();
				 cal.push(operand2/operand1);				 
			 }
			 else 
				 cal.push(Integer.parseInt(current));				 
		 }
		 return cal.pop();
	    }

}

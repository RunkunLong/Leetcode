package PascalTriangleTwo;

import java.awt.Dialog.ModalExclusionType;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void main(String[] args){
		System.out.println(getRow(2));
	}
    public static List<Integer> getRow(int rowIndex) {
    	if(rowIndex==0){
    		List<Integer> myList = new ArrayList<Integer>();
    		myList.add(1);
    		return myList;}
    	else
    	{
    		List<Integer> myList = new ArrayList<Integer>();
    		myList.add(1);
    		for (int i=1;i<rowIndex/2+1;i++)
    		{
    			int fractions=1;
    			int denominator=1;
    			while(i>0)
    			{
    				fractions=fractions*(rowIndex-i+1);
    				denominator=denominator*i;
    				i--;
    			}
    			int temp=fractions/denominator;
    			myList.add(temp);
    		}
    		if(rowIndex%2==0)
    		{
    			int size1=myList.size();
    			while(size1-2>=0)
    			{
    				myList.add(myList.get(size1-2));
    				size1--;
    			}
    		}
    		if(rowIndex%2!=0)
    		{
    			int size2=myList.size();
    			while(size2-1>=0)
    			{
    				myList.add(myList.get(size2-1));
    				size2--;
    			}

    		} 
    		return myList;
    	}
}
}

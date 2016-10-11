package ImplementStackusingQueues;

import java.util.LinkedList;
import java.util.Queue;

import javax.xml.transform.Templates;

public class MyStack {
	Queue stack=new LinkedList<Integer>();
	  // Push element x onto stack.
    public void push(int x) {
        stack.offer(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
    	 Queue<Integer> temp=new LinkedList<Integer>();
    	    int counter=0;
    	    while(!stack.isEmpty()){
    	    temp.add((Integer) stack.poll());
    	    counter++;
    	        
    	    }
    	    while(counter>1)
    	    {
    	    
    	        stack.add(temp.poll());
    	        counter--;
    	    }
    }
    	    

    // Get the top element.
  
    // Get the top element.
    public int top() {
        Queue<Integer> temp=new LinkedList<Integer>();
        int counter=0;
        while(!stack.isEmpty()){
        temp.add((Integer) stack.poll());
        counter++;
            
        }
        while(counter>1)
        {
        
            stack.add(temp.poll());
            counter--;
        }
        int topInteger=temp.poll();
        stack.add(topInteger);
        return topInteger;
        
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}
    

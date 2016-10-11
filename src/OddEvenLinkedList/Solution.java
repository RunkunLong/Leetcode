package OddEvenLinkedList;

import java.awt.List;

public class Solution {
	public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
        	return head;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode Even=head.next;
        ListNode temp=head.next.next;
        while(true){
        	odd.next=temp;
        	if(odd.next==null){
        		break;
        	}
        	odd=odd.next;
        	even.next=temp.next;
        	if(even.next==null){
        		break;
        	}
        	even=even.next;
        	temp=temp.next.next;       	
        	}  
        	odd.next=Even;
        	even.next=null;
        	return head;
        }
  }
    


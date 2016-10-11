package LinkedListCycle;

import OddEvenLinkedList.ListNode;

public class Solution {
public boolean hasCycle(ListNode head){
	ListNode collector=new ListNode(1000000);
	ListNode traverse=head;
	boolean isCycle=false;
	while(traverse!=null){
		traverse=head.next;
		if(traverse==collector){
			isCycle=true;
			break;
		}
		head.next=collector;
		head=traverse;			
	}
	return isCycle;
}
}

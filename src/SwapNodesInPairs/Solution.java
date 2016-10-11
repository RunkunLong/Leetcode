package SwapNodesInPairs;

public class Solution {
	 public ListNode swapPairs(ListNode head) {
		   	if(head==null)
		   		return null;
	        ListNode result=head;
	        while(head.next!=null){
	        	ListNode first=head;
	        	ListNode second=head.next;
	        	int temp=first.val;
	        	first.val=second.val;
	        	second.val=temp;
	        	head=head.next.next;
	        	if(head==null)
	        		break;
	        }
	        return result;
	    }
}
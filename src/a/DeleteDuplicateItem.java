package a;

public class DeleteDuplicateItem {
	
	static class ListNode{
		int data;
		ListNode next;
		public ListNode(int data) {
			this.data = data;
		}
	}
	public static void main(String args[]) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(2);
		node.next.next.next = new ListNode(3);
		node.next.next.next.next = new ListNode(4);
		
		ListNode ans = removeDuplicats(node);
		
	}
	
	static ListNode removeDuplicats(ListNode node) {
		ListNode temp = node;
		ListNode ans;
		if(node.next==null) {
			return node;
		}else {
			ListNode curr = node.next;
			while(curr!=null) {
				if(temp.data==curr.data) {
					curr = curr.next;
					temp.next=curr;
				}else {
					temp = temp.next;
					curr = curr.next;
				}
			}
		}
		
		return node;
	}
	
	
}

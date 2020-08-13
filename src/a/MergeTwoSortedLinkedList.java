package a;

public class MergeTwoSortedLinkedList {
	
	static class SinglyLinkedListNode{
		int data;
		SinglyLinkedListNode next;
		public SinglyLinkedListNode(int data) {
			this.data = data;
		}
	}
	
	public static void main(String args[]) {
		SinglyLinkedListNode node1 = new SinglyLinkedListNode(1);
		node1.next = new SinglyLinkedListNode(2);
		node1.next.next = new SinglyLinkedListNode(3);
		SinglyLinkedListNode node2 = new SinglyLinkedListNode(3);
		node2.next = new SinglyLinkedListNode(4);
		SinglyLinkedListNode ans = mergeLists(node1, node2);
	}
	
	static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		SinglyLinkedListNode ans = null;
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        if(head1.data>head2.data){
            ans.data = head2.data;
            ans.next = mergeLists(head1,head2.next);
        }else{
            ans.data = head1.data;
            ans.next = mergeLists(head1.next, head2);
        }
        return ans;
    }

}

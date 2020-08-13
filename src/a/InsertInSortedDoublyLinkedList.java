package a;

public class InsertInSortedDoublyLinkedList {
	
	public static void main(String[] args) {
		DoublyLinkedListNode head = new DoublyLinkedListNode(1);
		head.next = new DoublyLinkedListNode(2);
		head.next.prev = head;
		head.next.next = new DoublyLinkedListNode(4);
		head.next.next.prev = head.next;
		head.next.next.next = new DoublyLinkedListNode(10);
		head.next.next.next.prev = head.next.next;
		
		DoublyLinkedListNode node = sortedInsert(head, 5);
		node = sortedInsert(head, 15);
	}
	
	static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
		DoublyLinkedListNode node = new DoublyLinkedListNode(data);
		if(head == null){
            return node;
        }else if(data <= head.data){
        	node.next = head;
        	head.prev = node;
        	return node;
        }else {
        	DoublyLinkedListNode rest = sortedInsert(head.next, data);
        	head.next = rest;
        	rest.prev = head;
        	return head;
        }

    }

	static class DoublyLinkedListNode{
		int data;
		DoublyLinkedListNode prev, next;
		public DoublyLinkedListNode(int data) {
			this.data = data;
		}
	}
}

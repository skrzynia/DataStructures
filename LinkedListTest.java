class ListNode{
	int key;
	ListNode next;
	
	ListNode(int key){
		this.key = key;
		next = null;
	}
}


public class LinkedListTest {

	static void lTraversal(ListNode node) {
		
		if(node == null)
			return;
		
		System.out.print(node.key + " ");
		lTraversal(node.next);
	}
	
	static void backLTraversal(ListNode node) {
		if(node == null)
			return;
		
		backLTraversal(node.next);
		System.out.print(node.key + " ");
	}
	
	
	public static void main(String[] args) {
		
		ListNode n = new ListNode(1);
		n.next = new ListNode(2);
		n.next.next = new ListNode(5);
		
		System.out.print("Traversal: ");
		lTraversal(n);
		System.out.println();
		System.out.print("BackTraversal: ");
		backLTraversal(n);
		
	}
}

package prac.SLL;

class NodeSLL {
	int data;
	NodeSLL next;
}

public class SinglyLinkedList {
	NodeSLL root = null;
	
	void insert(int val) {
		if (root == null) {
			root = new NodeSLL();
			root.data = val;
			root.next = null;
		} else {
			NodeSLL temp = root;
			while (temp.next !=null) {
				temp = temp.next;
			}
			temp.next = new NodeSLL();
			temp.next.data = val;
			temp.next.next = null;
		}
	}
	
	NodeSLL deleteNodeWithValue(NodeSLL root, int val) {
		if (root == null) {
			System.out.println("List empty");
			return null;
		} else {
			NodeSLL temp = root;
			NodeSLL prev = null, next = null;
			while (temp != null) {
				next = temp.next;
				if (temp.data == val) {
					if (temp == root) {
						root = temp.next;
					} else {
						prev.next = next;
					}
					break;
				}
				prev = temp;
				temp = next;
			}
		}
		
		return root;
	}
	
	void display(NodeSLL r) {
		System.out.println("\nDisplaying Linked list elements:");
		if (r == null) {
			System.out.println("Empty list");
		} else {
			NodeSLL temp = r;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}
	
	void reverse(NodeSLL r) {
		if (r == null) {
			System.out.println("Empty list");
		} else {
			NodeSLL temp = root;
			NodeSLL prev = null;
			NodeSLL next = null;
			
			while(temp != null) {
				/*next = temp.next;
				prev = temp;
				
				temp = next.next;
				next.next = prev;
				
				if (prev == root) {
					prev.next = null; 
				} else {
					
				}*/
				
				next = temp.next;
				temp.next = prev;
				prev = temp;
				temp = next;
				
				
			}
			
			root = prev;
			
			//prev = temp.next;
			///prev.next = temp;
			//temp.next = 
			//r 
			//-> n -> n-> n-> n -> NULL
		}
	}
	
	public NodeSLL mergeSortedList(NodeSLL root1, NodeSLL root2) {
		NodeSLL sortedRoot = new NodeSLL();
		NodeSLL sortedNode = sortedRoot;
		NodeSLL temp1 = root1, temp2 = root2;
		while (temp1 != null && temp2 != null) {
			if (temp1.data < temp2.data) {
				sortedNode.next = temp1;
				temp1 = temp1.next;
			} else {
				sortedNode.next = temp2;
				temp2 = temp2.next;
			}
			sortedNode = sortedNode.next;
		}
		if (temp1 == null) {
			sortedNode.next = temp2;
		} else {
			sortedNode.next = temp1;
		}
		
		return sortedRoot.next ;
	}
	
}

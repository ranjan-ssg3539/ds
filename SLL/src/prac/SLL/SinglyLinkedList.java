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
	
	void display(NodeSLL r) {
		if (r == null) {
			System.out.println("Empty list");
		} else {
			NodeSLL temp = r;
			while (temp != null) {
				System.out.println(temp.data);
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
			
			prev = temp.next;
			prev.next = temp;
			//temp.next = 
			//r 
			//-> n -> n-> n-> n -> NULL
		}
	}
	
}
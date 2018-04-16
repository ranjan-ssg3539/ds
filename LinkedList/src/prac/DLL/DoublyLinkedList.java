package prac.DLL;

class NodeDLL {
	int val;
	NodeDLL next;
	NodeDLL prev;
}
public class DoublyLinkedList {
	NodeDLL root, end;
	void insert(int val) {
		NodeDLL node = new NodeDLL();
		// just like that
		end = node;
		node.val = val;
		if (root == null) {
			root = node;
			node.prev = null;
			node.next = null;
		} else {
			NodeDLL temp = root;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			node.next = null;
			node.prev = temp;
		}
		String hupm = "";
	}
	
	void display(NodeDLL sss) {
		if (sss == null) {
			System.out.println("Empty list");
		} else {
			System.out.println("\nList elements:");
			NodeDLL temp = sss;
			while (temp != null) {
				System.out.print(temp.val + " ");
				temp = temp.next;
			}
		}
	}
	
	void displayEnd(NodeDLL sss) {
		if (sss == null) {
			System.out.println("Empty list");
		} else {
			System.out.println("\nList elements:");
			NodeDLL temp = sss;
			while (temp != null) {
				System.out.print(temp.val + " ");
				temp = temp.prev;
			}
		}
	}
}

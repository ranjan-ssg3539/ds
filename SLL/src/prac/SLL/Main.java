package prac.SLL;

public class Main {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.insert(1);sll.insert(2);sll.insert(3);sll.insert(4);
		sll.display(sll.root);
		
		sll.reverse(sll.root);
		
		sll.display(sll.root);

	}

}

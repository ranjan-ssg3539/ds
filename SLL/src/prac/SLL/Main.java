package prac.SLL;

public class Main {

	public static void main(String[] args) {
		/*SinglyLinkedList sll = new SinglyLinkedList();
		SinglyLinkedList sll2 = new SinglyLinkedList();
		sll.insert(1);sll.insert(5);sll.insert(9);sll.insert(14);
		
		sll2.insert(2);sll2.insert(3);sll2.insert(10);sll2.insert(15);
		sll.display(sll.root);
		sll2.display(sll2.root);*/
		
		/*NodeSLL mergedRoot = sll.mergeSortedList(sll.root, sll2.root);
		sll.display(mergedRoot);*/
		//sll.reverse(sll.root);
		//sll.display(sll.root);
		
		
		SinglyLinkedList sll3 = new SinglyLinkedList();
		sll3.insert(1);sll3.insert(2);sll3.insert(3);sll3.insert(4);
		sll3.display(sll3.root);
		sll3.display(sll3.deleteNodeWithValue(sll3.root, 2));
		

	}

}

package prac.queues;

/*
 * Method 1 (By making enQueue operation costly)
 * 
 * enQueue(q, x)
 * 1) While stack1 is not empty, push everything from satck1 to stack2.
 * 2) Push x to stack1 (assuming size of stacks is unlimited).
 * 3) Push everything back to stack1.
 * 
 * dnQueue(q)
 * 1) If stack1 is empty then error
 * 2) Pop an item from stack1 and return it
*/

import java.util.Stack;

public class QueueUsingStack1 {
	Stack<Integer> s1, s2;
	int top = -1;
	QueueUsingStack1() {
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
	}
	
	void enqueue(int val) {
		// pop all existing from s1 and push into s2
		while (! s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(val);
		while (! s2.isEmpty()) {
			s1.push(s2.pop());
		}
		top ++;
	}
	
	void dequeue() {
		s1.pop();
		top --;
	}
	
	void display() {
		System.out.println("The queue elements are:");
		for (int i = top; i >= 0; i--) {
			System.out.print(s1.get(i) + " ");
		}
	}

}

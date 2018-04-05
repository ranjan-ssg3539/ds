package prac.stacks;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue1 {
	Queue<Integer> q1,q2;
	
	StackUsingQueue1() {
		q1 = new LinkedList<Integer>();
		q1.add(1);
		q2 = new LinkedList<Integer>();
	}
	
	void push(int val) {
		q2.add(val);
		
		int q1Size = q1.size();
		
		for (int i =0; i < q1Size; i++) {
			q2.add(q1.remove());
		}
		
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}
	
	void display() {
		System.out.println("The stack elements are:");
		//Collections.reverse(q1);
		List l = q;
		for (Integer integer : q1) {
			System.out.println(integer);
		}
	}

}

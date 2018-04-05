package prac.stacks;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Employee {
	String name;
	int id;
	
}

public class StackMain {

	public static void main(String[] args) {
		/*Stack s = new Stack(3);
		s.push(1);s.push(2);s.push(3);
		s.display();*/
		
		/*LinkedList q1 = new LinkedList();
		q1.add(1);q1.add(2);q1.add(3);q1.add(4);
		q1.remove();*/
		
		//StackUsingQueue1 sq = new StackUsingQueue1();
		//sq.push(2);sq.push(3);
		
		
		//sq.display();
		List<String> l1 = new LinkedList<String>();
		l1.add("a");l1.add("b");l1.add("c");
		//display(l1);
		changeMe(l1);
		display(l1);
		

	}
	
	static void changeMe(List l) {
		//l.add("d");
		//l.add("e");
		l = new ArrayList<>();
		l.add("zzz");
	}
	
	static void display(List<String> l) {
		for (String string : l) {
			System.out.println(string);
		}
	}

}

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

public class MainStack {

	public static void main(String[] args) {
		/*Stack s = new Stack(3);
		s.push(1);s.push(2);s.push(3);
		s.display();*/
		
		StackUsingQueue1 sq = new StackUsingQueue1();
		sq.push(1);sq.push(2);sq.push(3);
		sq.display();
		sq.pop();
		sq.push(4);
		sq.display();
	}

}

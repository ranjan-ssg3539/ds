package prac.stacks;

public class Stack {
	int top = -1;
	int arr[];
	int limit;
	public Stack(int limit) {
		this.limit = limit;
		arr = new int[limit];
	}
	void push(int val) {
		if (top == limit - 1) {
			System.out.println("Stack full");
		} else {
			arr[++top] = val;
		}
	}
	
	void pop() {
		if (top == -1) {
			System.out.println("Stack empty");
		} else {
			System.out.println("Element " + arr[top -- ] + "popped out");
		}
	}
	
	void display() {
		if (top == -1) {
			System.out.println("Empty stack");
		} else {
			System.out.println("Stasdk elements:");
			for (int i = 0 ; i <= top; i++) {
				System.out.println(arr[i]);
			}
		}
	
	}

}

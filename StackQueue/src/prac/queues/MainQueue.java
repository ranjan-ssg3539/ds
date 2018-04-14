package prac.queues;

public class MainQueue {

	public static void main(String[] args) {
		QueueUsingStack1 qs = new QueueUsingStack1();
		qs.enqueue(1);qs.enqueue(2);qs.enqueue(3);
		qs.display();
		qs.dequeue();
		qs.display();

	}

}

package scheduler;

import java.util.LinkedList;
import java.util.Queue;

public class Scheduler {

	Queue<ITask> q = new LinkedList<>();

	public Scheduler() {
		System.out.println("Created a new scheduler!\n");
	}

	public void main() {
		if (q.size() > 0) {
			System.out.println("Now is working at " + q.peek() + ":");
			q.remove().doWork();
			System.out.println(q.size() + " unfinished tasks remain.\n");
		} else {
			System.out.println("There are no more tasks!");
		}
	}

	public void push(ITask task) {
		q.offer(task);
		System.out.println("Added a new task - " + task.toString());
	}

}

package scheduler;

import java.util.Iterator;

/*
Създаване на Scheduler, който ще има един метод push и ще приема
интерфейс Task. Интерфейсът Task ще има един метод doWork.
Scheduler-a трябва да има опашка в която да влиза съответния Task
след като се извика методът му push.
Scheduler-a ще има някакъв базов метод, може да се казва main,
където ще бъде реализирана логката по взимане на Task от queue-то
и стартиране на doWork.
Трябва да се направят минимум 4 различни имплементаци на Task
интерфейс-а.
Да има output-и, които да показват как се изпълнява всеки таск.*/

public class demo {

	public static void main(String[] args) {
		Scheduler sheduler = new Scheduler();

		sheduler.push(new Task_playing());
		sheduler.push(new Task_singing());
		sheduler.push(new Task_cooking());
		sheduler.push(new Task_painting());
		sheduler.push(new Task_cooking());
		sheduler.push(new Task_painting());
		sheduler.push(new Task_playing());
		sheduler.push(new Task_playing());

		System.out.println("\n");

		Iterator<ITask> it = sheduler.q.iterator();
		while (it.hasNext()) {
			sheduler.main();
		}

		sheduler.main();
	}

}

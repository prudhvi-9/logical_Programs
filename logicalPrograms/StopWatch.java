package logicalPrograms;

import java.util.*;

public class StopWatch {

	long startTimer = 0;
	long stopTimer = 0;
	long elapsed;

	/**
	 * This method is created to measuring the time that elapses between the start
	 * and end clicks.
	 * 
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		StopWatch time = new StopWatch();
		Scanner cs = new Scanner(System.in);
		/**
		 * 1)Taking values from user.
		 */

		System.out.println("Press '1' to Start Time: ");
		int start = cs.nextInt();
		if (start == 1) {
			time.start();

			System.out.println("Press '2' to Stop Time: ");
			int end = cs.nextInt();
			if (end == 2) {
				time.stop();

				/**
				 * Calculating the elapsed time between start and end timer.
				 */
				long eltime = time.getElapsedTime();

				System.out.println("Total Time Elapsed is " + (eltime / 1000) + " sec");
			} else {
				System.out.println("Enter Valid number");

			}
		} else {
			System.out.println("Enter Valid number");
		}

		cs.close();
	}

	/**
	 * To the start timer.
	 */
	public void start() {
		startTimer = System.currentTimeMillis();
		System.out.println("Start Time is: " + startTimer);
	}

	/**
	 * To stop timer.
	 */
	public void stop() {
		stopTimer = System.currentTimeMillis();
		System.out.println("Stop Time is: " + stopTimer);
	}

	public long getElapsedTime() {

		elapsed = stopTimer - startTimer;
		return elapsed;

	}
}

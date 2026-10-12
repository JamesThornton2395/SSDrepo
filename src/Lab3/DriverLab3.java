import java.util.Random;

/**
 * Generates random values and printing statistics using the stats class
 */
public class DriverLab3 {

	/**
	 * Runs the program
	 *
	 * @param args command line args passed to the application
	 */
	public static void main(String[] args) {
		final int VALUES = 10;

		Stats stats = new Stats(VALUES);

		Random random = new Random();

		// Fill stats object with random values for test
		for (int i = 0; i < VALUES; i++) {
			stats.addValue(random.nextInt(100));
		}

		// Display the stored values and the computed statistics.
		System.out.println("Numbers stored : ");
		System.out.println(stats);

		System.out.println("Average = " + stats.getAverage());
		System.out.println("Count = " + stats.getCount());
		System.out.println("Total = " + stats.getTotal());
		System.out.println("Minimum value = " + stats.getMinimum());
		System.out.println("Maximum value = " + stats.getMaximum());
	}
}
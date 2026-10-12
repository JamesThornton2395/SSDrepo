import java.util.Arrays;

/**
 * Stores a list of integers and does basic calculations
 */
public class Stats {

	/**
	 * The array used to store the integers
	 */
	private int[] numbers;

	/**
	 * The amount of values in the array
	 */
	private int count;

	/**
	 * Creates a new Stats object with specified capacity
	 *
	 * @param capacity the maximum number of values it can store
	 */
	public Stats(int capacity) {
		numbers = new int[capacity];
	}

	/**
	 * Adds a value to the array
	 *
	 * @param value the value to add
	 */
	public void addValue(int value) {
		// Store incoming value
		numbers[count] = value;
		count++;
	}

	/**
	 * Returns number of elements in array
	 *
	 * @return the length of the numbers array
	 */
	public int getCount() {
		return numbers.length;
	}

	/**
	 * Finds the highest value in array
	 *
	 * @return  maximum value in array
	 */
	public int getMaximum() {
		int maximum = numbers[0];

		// Check each value + keep largest one found so far
		for (int index = 1; index < numbers.length; index++) {
			if (numbers[index] > maximum) {
				maximum = numbers[index];
			}
		}

		return maximum;
	}

	/**
	 * Finds lowest value in array
	 *
	 * @return minimum value in array
	 */
	public int getMinimum() {
		int minimum = numbers[0];

		// Check each value + keep smallest found so far
		for (int index = 1; index < numbers.length; index++) {
			if (numbers[index] < minimum) {
				minimum = numbers[index];
			}
		}

		return minimum;
	}

	/**
	 * sum all values in array
	 *
	 * @return total of all values in array
	 */
	public int getTotal() {
		int total = 0;

		// Add every value to calculate total
		for (int index = 0; index < numbers.length; index++) {
			total += numbers[index];
		}
		return total;
	}

	/**
	 * average values from integers.
	 *
	 * @return average of all numbers in array
	 */
	public double getAverage() {
		int total = 0;
		// Sum values before dividing by number of values
		for (int index = 0; index < numbers.length; index++) {
			total += numbers[index];
		}

		double average = total / (double) numbers.length;
		return average;
	}

	/**
	 * Returns average of stored values
	 *
	 * @return average of all values in array
	 */
	public double get() {
		int total = 0;
		// Add every value before calculating average
		for (int index = 0; index < numbers.length; index++) {
			total += numbers[index];
		}

		double average = total / (double) numbers.length;
		return average;
	}

	/**
	 * Creates a string of values
	 *
	 * @return string listing all values in array
	 */
	@Override
	public String toString() {
		return Arrays.toString(numbers);
	}
}

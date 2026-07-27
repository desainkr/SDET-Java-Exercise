package SDETInterview;

public class Counter {
	public static int staticCount = 0; // Shared across all instances
	public int nonStaticCount = 0; // Unique per instance

	public static void incrementStatic() {
		staticCount++;
	}

	public void incrementNonStatic() {
		nonStaticCount++;
	}

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();

		Counter.incrementStatic(); // staticCount = 1
		Counter.incrementStatic(); // staticCount = 2
		Counter.incrementStatic(); // staticCount = 3

		c1.incrementNonStatic(); // c1.nonStaticCount = 1
		c2.incrementNonStatic(); // c2.nonStaticCount = 1

		System.out.println("Static Count = " + Counter.staticCount);
		System.out.println("c1 Non-Static Count = " + c1.nonStaticCount);
		System.out.println("c2 Non-Static Count = " + c2.nonStaticCount);
	}

}

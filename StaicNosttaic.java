package SDETInterview;

public class StaicNosttaic {
	public static int staticCount = 0; // Shared across all instances
	public int nonStaticCount = 0; // Unique per instance

	public static void incrementStatic() {
		staticCount++;
	}

	public void incrementNonStatic() {
		nonStaticCount++;
	}

	public static void main(String[] args) {
		StaicNosttaic c1 = new StaicNosttaic();
		StaicNosttaic c2 = new StaicNosttaic();

		StaicNosttaic.incrementStatic(); // staticCount = 1
		StaicNosttaic.incrementStatic(); // staticCount = 2
		StaicNosttaic.incrementStatic(); // staticCount = 3

		c1.incrementNonStatic(); // c1.nonStaticCount = 1
		c2.incrementNonStatic(); // c2.nonStaticCount = 1

		System.out.println("Static Count = " + StaicNosttaic.staticCount);
		System.out.println("c1 Non-Static Count = " + c1.nonStaticCount);
		System.out.println("c2 Non-Static Count = " + c2.nonStaticCount);
	}

}

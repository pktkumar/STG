package STG;

public class LongNumber_Floor {
	
	public static void main(String args[]) {

		System.out.println(floor(1.6f, 1.6f));
		
	}
	
	private static int floor(double a, double b) {
		return (int) Math.floor(a+b);
	}

}

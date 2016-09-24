package testRecursion;

public class TestRecursion {
	int count = 1;
	public static void main(String[] args) {
		for (int i=1; i<20; i++) {
			System.out.println("There're " + recursion(i) + " rabbits in " + i + "month" );
		}
	}
	
	
	public static int recursion(int month) {
		int count = 1;
		if (month == 1 || month == 2) {
			return count;
		}
		count = recursion(month - 1) + recursion(month -2);
		
		return count;
		
	}
}

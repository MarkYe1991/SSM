package testSort;

public class SortUtil {
	
	public static int[] createArray() {
//		return new int[]{90,1,4,5,3,841,22,46,887,141,23,65,47};
		return new int[]{91,90,1,1,1,4,4,4,5,3};
	}
	
	public static void swap(int[] array, int i, int j) {
		int temp = 0;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}

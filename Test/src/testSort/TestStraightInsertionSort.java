package testSort;

public class TestStraightInsertionSort {

	public static void main(String[] args) {
		int[] testArray = SortUtil.createArray();
		insertionSort(testArray);
		for (int i : testArray) {
			System.out.print(i + ", ");
		}
	}

	public static void insertionSort(int[] a) {
		int i, j;

		for (i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				a[0] = a[i];
				for (j = i - 1; a[j] > a[0]; j--) {
					a[j + 1] = a[j];
				}
				a[j + 1] = a[0];
			}
		}
	}
}

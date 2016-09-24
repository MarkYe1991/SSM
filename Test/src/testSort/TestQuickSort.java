package testSort;

public class TestQuickSort {

	public static void main(String[] args) {
		int[] testArray = SortUtil.createArray();
		quickSort(testArray, 0, testArray.length - 1);
		for (int i : testArray) {
			System.out.print(i + ", ");
		}
	}

	public static void quickSort(int[] array, int low, int high) {
		if(low>=high) return;  
		
		int pivot = partition(array, low, high);
		quickSort(array, low, pivot-1);
		quickSort(array, pivot+1, high);
	}

	private static int partition(int[] array, int low, int high) {
		int pivotKey = array[low];
		while (low < high) {
			while (low<high && array[high]>= pivotKey) high--;
			array[low]=array[high];  
			 
			while (low<high && array[low]<= pivotKey) low++;
			array[high]=array[low];  
		}
		array[low]=pivotKey;  
		return low;
	}
}

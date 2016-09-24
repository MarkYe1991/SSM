
public class TestBubbleSort {
	public static void main(String[] args) {
		int[] a = {10,4,6,767,3,9};
		for(int i : bubbleSort(a)) {
			System.out.println(i);
		}
	}
	
	static int[] bubbleSort(int[] a) {
		int l = a.length;
		int t;
		boolean f = true;
		for(int j=0; j<l && f; j++) {
			f = false;
			for(int i=0; i<l-1; i++) {
				if(a[i] > a[i+1]) {
					t = a[i];
					a[i] = a[i+1];
					a[i+1] = t;
					f = true;
				}
			}
		}
		return a;
	}
	
	static void change(int[] a, int i, int j) {
		
		
	}
}

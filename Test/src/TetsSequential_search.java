
public class TetsSequential_search {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		System.out.println(sS(new int[] {1,2,3,4,5}, 4));
		System.out.println((double) 1/2);

	}
	
	static int sS(int[] a, int k) {
		int i = a.length - 1;
		if (a[0] == k) {
			return 0;
		}
		while (a[i] != k) {
			i--;
		}
		
		return i;
		
	}
}

package testIO;

public class TestLoop {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		ar:
		for(;;) {
			a = a+1;
			System.out.println(a);
			if (a>15) {
				return;
			}
			b = 0;
			br:
			for(;;) {
				b++;
				System.out.println(b + "br");
				if(b>10) {
					break ar;
				}
			}
		}
		
	}

}

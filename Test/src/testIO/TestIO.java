package testIO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestIO {
	public static void main(String[] args) throws IOException {
//		
		
//		File f = new File("C:\\Users\\mark.ye\\Desktop\\new\\bdj");
//		f.mkdirs();
////		byte[] b = new byte[20];
//		byte[] b = {1,2,3,4,5,6,7,8,9,0};
//		System.out.println(b.toString());
//		ByteArrayInputStream bais = new ByteArrayInputStream(b);
//		int i =0;
//		while (i<1000) {
//			System.out.println(bais.read());
//			i++;
//		}
		
		
//		System.out.println(0xffffffff);
//		byte b=-21;
//		System.out.println((byte) 280 );
//		  System.out.println((char)b);
//		  System.out.println((int)(char)(b & 0xff));
		List al =  Arrays.asList(new Integer[]{1,2,34,4});
		
		List list = new LinkedList(Arrays.asList(new Integer[]{1,2,34,4}));
		System.out.println(list.getClass());
		
	}
}

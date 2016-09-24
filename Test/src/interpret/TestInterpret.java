package interpret;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class TestInterpret {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(new Integer(1));
		l.add("2");
		l.forEach((number) -> System.out.println(number));

		Map m = new HashMap();
		m.put(1, 2);
		m.forEach((k, v) -> System.out.println(k + ", " + v));

		Map t = new Hashtable();
		m.put(1, 2);
		m.forEach((k, v) -> System.out.println(k + ", " + v));

		//Runnable
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

			}
		};
		
		Runnable r2 = () -> new HashMap();
		
		
		

	}
}

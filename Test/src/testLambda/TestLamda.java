package testLambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class TestLamda {
	public static void main(String[] args) {
		InterfaceA a = ()->System.out.println("");
		a.methodA();
		a.methodB();

	}

}

package testIO;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflectMain {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		String oldValue = "sdfg*!dfg";
		 String[] policyRes = oldValue.split("!");
		 String policyCode = policyRes[0];
		 System.out.println(policyCode);
	        String policyVariable = policyRes[1];
		 
	}

}

package testIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestRegular {

	public static void main(String[] args) throws FileNotFoundException {
		String a = null;
		String b = "b";
		
		System.setOut(new PrintStream(new File("C:\\Users\\mark.ye\\Desktop\\new\\a\\b\\test.txt")));
		System.out.println("asdfasdf");
	}

}

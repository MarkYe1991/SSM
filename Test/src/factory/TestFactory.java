package factory;

import java.io.Console;
import java.util.Scanner;

public class TestFactory {

	public static void main(String[] args) {
		int numberA;
		int numberB;
		String operator;
		Scanner s = new Scanner(System.in);
		
		System.out.println("please type the first num");
		numberA = s.nextInt();
		
		System.out.println("please type the second num");
		numberB = s.nextInt();
		
		System.out.println("please type the operator");
		operator = s.next();
		
		switch(operator) {
		case "+":
			System.out.println("result is:" + (numberA + numberB));
			break;
		case "-":
			System.out.println("result is:" + (numberA - numberB));
			break;
		case "*":
			System.out.println("result is:" + (numberA * numberB));
			break;
		case "/":
			System.out.println("result is:" + (numberA / numberB));	
			break;
		}
	}

}

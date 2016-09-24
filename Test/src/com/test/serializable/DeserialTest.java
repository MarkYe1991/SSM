package com.test.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.test.Serial;



public class DeserialTest {

	/** * @param args */
	public static void main(String[] args) {
		Serial serial2;
		Serial serial3;
		try {
			FileInputStream fis = new FileInputStream("serialTest.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
//			serial2 = (Serial) ois.readObject();
//			serial3 = (Serial) ois.readObject();
//			ois.close();
//			System.out.println("Object Deserial" + serial2);
//			System.out.println(serial2 == serial3);
			
			Object obj = null;
			while ((obj = ois.readObject()) != null) { // 如果为null就读取到文件结尾了。
				Serial person = (Serial) obj;
				System.out.println(person);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

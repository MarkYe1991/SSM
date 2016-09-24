package com.test.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.test.Serial;

public class SerialTest {

	/** * @param args */
	public static void main(String[] args) {
		Serial serial1 = new Serial(1, "song");
		System.out.println("Object Serial" + serial1);
		try {
			File f = new File("serialTest.txt");
			FileOutputStream fos = new FileOutputStream("serialTest.txt", true);
			
			ObjectOutputStream oos = new ObjectOutputStream(fos) {
				private byte[] bs;

				protected void writeStreamHeader() throws IOException {
					@SuppressWarnings("resource")
					FileInputStream fis = new FileInputStream("serialTest.txt");
					bs = null;
					fis.read(bs, 0, 5);
					for (byte b1:bs) {
						System.out.println(b1);
					}
					return;
				}
			};
			oos.writeObject(serial1);
			oos.writeObject(new Serial(1, "song1"));
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
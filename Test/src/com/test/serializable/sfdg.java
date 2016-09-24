package com.test.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class sfdg {

	public static void main(String[] args) throws IOException {
		File f = new File("serialTest.txt");
		FileInputStream fis = new FileInputStream(f);
		System.out.println(f.length());
		
		byte[] bs = new byte[10];
		fis.read(bs, 0, 5);
		for (byte b1:bs) {
			System.out.println(b1);
		}

	}

}

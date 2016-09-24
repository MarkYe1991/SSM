package pipeCommu;

import java.io.*;

public class PipedCommu {
	public static void main(String[] args) {
		// TODOAuto-generatedmethodstub
		try {
			PipedReader reader = new PipedReader();
			PipedWriter writer = new PipedWriter(reader);
			Thread a = new Send(writer);
			Thread b = new Read(reader);
			a.start();
			Thread.sleep(1000);
			b.start();
		} catch (IOException e) {
			e.printStackTrace();

		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
}

class Send extends Thread {
	PipedWriter writer;

	public Send(PipedWriter writer) {
		this.writer = writer;
	}

	public void run() {
		try {
			writer.write("this is a.hello world".toCharArray());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Read extends Thread {
	PipedReader reader;

	public Read(PipedReader reader) {
		this.reader = reader;
	}

	public void run() {
		System.out.println("this is B");
		try {
			char[] buf = new char[1000];
			reader.read(buf, 0, 100);
			System.out.println(new String(buf));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
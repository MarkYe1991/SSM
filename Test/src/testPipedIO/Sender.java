package testPipedIO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PipedOutputStream;

public class Sender implements Runnable {
	PipedOutputStream pis = new PipedOutputStream();

	public PipedOutputStream getPis() {
		return pis;
	}

	@Override
	public void run() {
		BufferedWriter br = new BufferedWriter(new OutputStreamWriter(pis));
		try {
			br.write("asdf");
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

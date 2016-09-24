package testPipedIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;

public class Reciever implements Runnable {
	PipedInputStream pis = new PipedInputStream();

	public PipedInputStream getPis() {
		return pis;
	}

	@Override
	public void run() {
		BufferedReader br = new BufferedReader(new InputStreamReader(pis));
		try {
			System.out.println(br.readLine());
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

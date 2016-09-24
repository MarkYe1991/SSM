package testPipedIO;

import java.io.IOException;

public class TestPipedIO {

	public static void main(String[] args) throws IOException, InterruptedException {
		Sender s = new Sender();
		Reciever r = new Reciever();
		
		s.getPis().connect(r.getPis());
		
		Thread t = new Thread(s);
		t.start();
		t.sleep(10000);
			
			
		new Thread(r).start();
		
	}

}

package command;

public class TestCommand {

	public static void main(String[] args) {
		Babecuer b = new Babecuer();
		AbstractCommand chinchen = new ChinckenCommand(b);
		chinchen.excuteCommand();
		
		AbstractCommand mutton = new MuttonCommand(b);
		mutton.excuteCommand();
	}

}

package command;

public class ChinckenCommand extends AbstractCommand{

	public ChinckenCommand(Babecuer b) {
		super(b);
	}

	@Override
	void excuteCommand() {
		b.kaoChi();
	}

}

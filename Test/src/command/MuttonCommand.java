package command;

public class MuttonCommand extends AbstractCommand {
	public MuttonCommand(Babecuer b) {
		super(b);
	}

	@Override
	void excuteCommand() {
		b.kaoRou();
	}
}

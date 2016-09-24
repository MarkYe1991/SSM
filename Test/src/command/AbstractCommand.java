package command;

public abstract class AbstractCommand {
	protected Babecuer b;
	public AbstractCommand(Babecuer b) {
		this.setB(b);
	}
	
	abstract void excuteCommand();

	public Babecuer getB() {
		return b;
	}

	public void setB(Babecuer b) {
		this.b = b;
	}

}

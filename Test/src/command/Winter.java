package command;

public class Winter {
	AbstractCommand c;
	Winter(AbstractCommand c) {
		this.c = c;
	}
	public void notifyB() {
		c.excuteCommand();
	}
}

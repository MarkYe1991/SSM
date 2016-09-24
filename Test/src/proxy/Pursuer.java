package proxy;

public class Pursuer implements GiveGift{
	private SchoolGirl mm;

	public Pursuer(SchoolGirl mm) {
		this.mm = mm;
	}
	
	public void giveDoll() {
		System.out.println("give doll to: " + mm.name);
	}
}

package proxy;

public class Proxy implements GiveGift{
	private Pursuer pursuer;
	public Proxy(SchoolGirl girl) {
		pursuer = new Pursuer(girl);
	}

	@Override
	public void giveDoll() {
		System.out.println("proxy");
		pursuer.giveDoll();
		
	}

}

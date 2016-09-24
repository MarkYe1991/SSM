package proxy;

public class TestProxy {

	public static void main(String[] args) {
		SchoolGirl jiaoJiao = new SchoolGirl("jiaojiao");
		GiveGift daiLi = new Proxy(jiaoJiao);
		
		daiLi.giveDoll();
	}

}

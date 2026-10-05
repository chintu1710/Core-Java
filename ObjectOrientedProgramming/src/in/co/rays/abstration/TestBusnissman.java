package in.co.rays.abstration;

public class TestBusnissman {
	
	public static void main(String[] args) {
		
		Richman r = new BussinessMan();
		
		r.donation();
		r.earnMoney();
		r.party();
		
		System.out.println("==============================");
		
		SocialWork sw = new BussinessMan();
		
		sw.helpToOthers();
		
		System.out.println("===========================");
		
		BussinessMan bi = new BussinessMan();
		
		bi.donation();
		bi.earnMoney();
		bi.party();
		bi.helpToOthers();
	}

}

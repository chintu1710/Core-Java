package in.co.rays.pt;

public class DivisibleBy {
	public static void main(String[] args) {
		int a =0;
		for (int i = 1; i <= 100; i++) {
			int b = i % 7;
			if(b==a) {
				System.out.println(i);
			}
			
		
		}
	}

}

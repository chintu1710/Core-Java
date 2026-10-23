package pratice.java.pt;

public class pratice015 {

	public static void main(String[] args) {

		int[] a = { 50, 20, 30, 40, 50, 60 };

		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}

}

package in.co.rays.string;

public class StringGoogle {
	public static void main(String[] args) {
		String name = "GooGLE";
		String 	r = name.toUpperCase();

		int count = 0;
		{
			for (int i = 0; i < r.length(); i++) {

				if (r.charAt(i) == 'O')
					count++;

			}
		}
		System.out.println("Number of o    " + count);

	}

}

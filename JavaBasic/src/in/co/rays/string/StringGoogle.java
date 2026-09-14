package in.co.rays.string;

public class StringGoogle {
	public static void main(String[] args) {
		String name = "GOOGLE";

		int count = 0;
		{
			for (int i = 0; i < name.length(); i++) {

				if (name.charAt(i) == 'O')
					count++;

			}
		}
		System.out.println("Number of o    " + count);

	}

}

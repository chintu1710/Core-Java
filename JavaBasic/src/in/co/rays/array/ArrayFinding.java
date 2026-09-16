package in.co.rays.array;

public class ArrayFinding {
	public static void main(String[] args) {
		String[] arr = { "BCA", "Btech", "BBA", "MCA", "Bphrma" };
		String serch = "BBA";

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals(serch)) {
				System.out.println("found" + arr[i] + "\t at index" + i);

			}

		}
	}

}

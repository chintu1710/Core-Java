package in.co.rays.array;

public class ArrayCapitalCactor {
	public static void main(String[] args) {
		char[] arr = { 'a', 'B', 'c', 'D', 'e', 'f' };

		for (int i = 0; i < arr.length; i++) {
			if (Character.isUpperCase(arr[i])) {
				System.out.println(arr[i]);

			}

		}
		for (int i = 0; i < arr.length; i++) {
			if (Character.isLowerCase(arr[i])) {
				System.out.print(arr[i]);
				
			}
			
		}
	}

}

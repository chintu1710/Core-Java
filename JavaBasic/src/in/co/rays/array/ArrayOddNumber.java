package in.co.rays.array;

public class ArrayOddNumber {
	public static void main(String[] args) {
		int[] arr = {2, 7, 10, 15, 22, 31};
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("it is an even number " + arr[i]);
				
			} else {
				System.out.println("odd number "+arr[i]);

			}
			
		}
	}

}

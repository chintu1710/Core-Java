package in.co.rays.array;

public class ArraySum {
	public static void main(String[] args) {
		int[] arr = { 15, 20, 25, 50, 100, 5, 150, 398, 0 };
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum +arr[i];
			
		}
		System.out.println(sum);
		
		
	}

}

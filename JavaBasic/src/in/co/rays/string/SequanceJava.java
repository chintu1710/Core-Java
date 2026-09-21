package in.co.rays.string;

public class SequanceJava {
	public static void main(String[] args) {
		String sequance = "I Love JAVA";
		
		String[] words = sequance.split(" ");
		
		for (String word : words) {
			System.out.println(word);
		}
	}

}

package in.co.rays.string;

public class TestString {
	public static void main(String[] args) {
		{
			String name = "Chintu";
			String name1 = "Chintu";
		}
//		 == oprator check with there memory
		String str = new String("rays");
		String str1 = new String("rays");

//		System.out.println(name == name1);
		System.out.println(str.equals(str1));
	}

}

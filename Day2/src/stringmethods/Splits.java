package stringmethods;

public class Splits {
	public static void main(String[] args) {
		String str="java,python,js";
		String []lan=str.split(",");
		for(String s1:lan) {
			System.out.println(s1);
		}
	}

}

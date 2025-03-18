package stringmethods;

public class Builder {
	public static void main(String[]args) {
		StringBuilder sb = new StringBuilder("hello");
		sb.append(" karthi");
		System.out.println("After append:"+sb);
		sb.insert(5, ",");
		System.out.println("After insert:"+sb);
		sb.replace(7, 13, "world");
		System.out.println("After replace:"+sb);
		sb.reverse();
		System.out.println("After reverse:"+sb);
		StringBuffer sb1 = new StringBuffer("hello");
		sb1.append(" karthi");
		System.out.println("String Buffer:"+sb1);
		sb1.insert(5, ",");
		System.out.println("String Buffer:"+sb1);
		sb1.replace(7, 13, "world");
		System.out.println("String Buffer:"+sb1);
	}
}


public class leadif {
	public static void main(String[]args) {
		int a=100;
		int b=400;
		int c=300;
		if(a>b && a>c) {
			System.out.println("A is greater...");
		}
		else if (b>a && b>c) {
			System.out.println("B is greater...");
		}
		else if (c>a && c>b) {
			System.out.println("C is greater...");
		}
		else {
				System.out.println("All are equal...");
		}
	}
}
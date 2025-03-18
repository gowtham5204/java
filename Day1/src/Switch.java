import java.util.*;

public class Switch {
	public static void main(String[]args) {
		Scanner s1= new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		char result;
		System.out.println("+,-");
		 result=s1.next().charAt(0);
		 switch(result) {
		 case '+':
			 int c=a+b;
			 System.out.println("Add" +c);
		 break;
		 case '-':
			 int d=a-b;
			 System.out.println("Sub" +d);
		 break;
		 default:
			 System.out.println("Invalid choice");
		 }
	}
}
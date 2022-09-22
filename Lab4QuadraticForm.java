import java.util.Scanner;
public class Lab4QuadraticForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("a: ");
		int a = scan.nextInt();
		System.out.println("b: ");
		int b = scan.nextInt();
		System.out.println("c: ");
		int c = scan.nextInt();
		double Num1= ((-1*b) - Math.sqrt(Math.pow(b, 2) - (4*a*c))/(2*a));
		double Num2= ((-1*b) + Math.sqrt(Math.pow(b, 2) - (4*a*c))/(2*a));
		System.out.println(Num1);
		System.out.println(Num2);
		
		
		
	}

}

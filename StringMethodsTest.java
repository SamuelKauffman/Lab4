import java.util.Random;
public class StringMethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mutation1= "Change is inevitable";
		System.out.println(mutation1);
		System.out.println("The length of the string is " + mutation1.length());
		mutation1= "Change is inevitable "+"except from vending machines";
		String mutation2=mutation1.toUpperCase();
		String mutation3=mutation1.substring(3);
		System.out.println("Mutation1: "+ mutation1);
		System.out.println("Mutation2: "+ mutation2);
		System.out.println("Mutation3: "+ mutation3);
		Random generator= new Random();
		int Num1= generator.nextInt(7)+3;
		System.out.println("Random number 1: " + Num1);
		int Num2= generator.nextInt(25)+20;
		System.out.println("Random number 2: " + Num2);
		int Num3= generator.nextInt(50)-20;
		System.out.println("Random number 3: " + Num3);
		
	}

}

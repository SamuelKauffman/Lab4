import java.util.Random;
public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Weight= {"79","13","64","52","67","98","87","71","79","101"};
		System.out.println("The weight of the fifth person"+ Weight[5]);
		Weight[3]= "200";
		System.out.println("The new weight of the third person is: " + Weight[3]);
		Weight[8]= "120";
		System.out.println("The new weight of the eighth person is: "+Weight[8]);
		System.out.println("There are "+ Weight.length + " people");
		Random generator= new Random();
		int Num1=generate.nextInt();
		System.out.println();
	}

}

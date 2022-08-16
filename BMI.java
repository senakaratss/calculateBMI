import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Please enter your height (in meters): ");
		double height=kb.nextDouble();
		System.out.println("Please enter your weight: ");
		double weight=kb.nextDouble();
		double bmi= weight/(height*height);
		System.out.println("Your BMI is "+bmi);
;		
		

	}

}

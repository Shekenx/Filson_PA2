import java.util.Scanner;
public class Filson_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	      double weight;
	      double height;
	      double BMI;
	      int num;
	   
	      

	      System.out.println("Enter 1 to calculate BMI using Height(inches) and Weight(pounds)");
	      System.out.println("Enter 2 to calculate BMI using Height(Meters) and Weight(Kilograms)");
	 
	      num = input.nextInt();
	    
	      switch (num) {
	         case 1:
	            System.out.println("Your weight: ");
	            weight = input.nextDouble();
	            System.out.println("Your height: ");
	            height = input.nextDouble();
	            BMI = (703 * weight) / (Math.pow(height, 2));
	            System.out.printf("Your BMI: %.1f", BMI);
	            System.out.println("\nBMI Categories:\r\n" + 
	            		"Underweight = <18.5\r\n" + 
	            		"Normal weight = 18.5–24.9\r\n" + 
	            		"Overweight = 25–29.9\r\n" + 
	            		"Obesity = BMI of 30 or greater");
	            break;

	         case 2:
	        	 System.out.println("Your weight: ");
	        	  weight = input.nextDouble();
		            System.out.println("Your height: ");
		            height = input.nextDouble();
		            BMI = (weight) / (Math.pow(height, 2));
		            System.out.printf("Your BMI: %.1f", BMI);
		            System.out.println("\nBMI Categories:\r\n" + 
		            		"Underweight = <18.5\r\n" + 
		            		"Normal weight = 18.5–24.9\r\n" + 
		            		"Overweight = 25–29.9\r\n" + 
		            		"Obesity = BMI of 30 or greater");
	            break;

	         default:
	            System.out.println("Please enter 1 or 2");
	            break;
	         
	      }
	  

	}

}

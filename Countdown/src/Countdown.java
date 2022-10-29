import java.util.Scanner;

public class Countdown 
{
	
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Threee....");
		System.out.print("Two....");
		System.out.print("One.....");
		System.out.print("Zero....");
		
		System.out.println("Lift off!");
		System.out.println("Houston we have a problem!");
		
		int number1, number2, sum = 0;
		
		System.out.println("Please enter a number to average:");
		
		number1 = scan.nextInt();
		
		System.out.println("please enter another number:");
		
		number2 = scan.nextInt();
		
		sum = (number1 + number2) / 2;
		
		System.out.println("The average between " + number1 + " and " + number2 + " is: " + sum);

	}
		
}
  
//Aaron Goode
//Multiple mathematic operations
//HW3
import java.util.Scanner;
public class payment {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
//1 Calculates Annual Interest
		double principal, annualinterest, years, totalpaid, a;
		
		System.out.println("What is the principal? ");
		principal = console.nextDouble();
		System.out.println("What is the annual interest rate? ");
		annualinterest = console.nextDouble();
		System.out.println("How many years is interest accrued? ");
		years = console.nextDouble();
		
		for (double N = 1; N<=years;N++){
			a = principal * (annualinterest*.01);
			principal+=a;}
		System.out.printf("You are paid $%.2f in total. %n", principal);
		
			
//2 Total and Average of Every Number Entered until user guesses -99
		int total = 0, number = 0, average = 0, count = 0;
			
		while(number != -99){
			count++;
			total+=number;
			System.out.println("Enter number: ");
			number = console.nextInt();
		}
		average = total/(count-1);
		System.out.printf("Total: %d%n", total);
		System.out.printf("Average: %d%n", average);
		
//3 Exponential Equation
		int x = 0, y = 0, counter = 0, constant;
		System.out.println("Enter a base #: ");
		x = console.nextInt();
		System.out.println("Enter an exponent #: ");
		y = console.nextInt();
		do {
			counter++;	
			constant = x;
			x *= constant;
		}while ((counter+1)<y);
		System.out.println(x);
		
//4 Factorial
		int N = 0, original = 1, holder = original;
		System.out.println("Enter a number: ");
		N = console.nextInt();
		do {
			original++;
			holder *= original;
			if (N==0||N==1){
				System.out.println(1);
			}
			else if(original==N){
				System.out.println(holder);
			}
			}while (original<N);

	}

	}

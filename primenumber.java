
import java.util.Scanner;
public class primenumber {
	// check for git test good
	public static void main(String args[])
	   {		
		int temp;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number to check prime no or not :");
		//capture the input in an integer from user
		int num=scan.nextInt();
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		       isPrime=false;
		      break;
		   }
		}
		// new changes arrived by gomathy
		//If isPrime is true then the number is prime else not
		//second comment for to test git
		if(isPrime)
		   System.out.println(num + " is Prime Number");
		else
		   System.out.println(num + " is not Prime Number");
	   }
	}
//Program #1 Java Program to Check Whether a Number is Even or Odd
import java.util.Scanner;


public class EvenOrOdd{	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number: ");

	
		int n = scn.nextInt();
		if(n%2==0){

		System.out.println("Even");
		}
		else{

		System.out.println("Odd");
		}
		scn.close();
	}

}
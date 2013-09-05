import java.io.*;
import java.util.*;


/*
 * This program is a simple menu-driven calculator
 */
public class numberTest {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		float number1;
		float number2;
		int number3;
		float total;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		number1 = scanner.nextInt();
		
		System.out.println("Please enter the second number");
		number2 = scanner.nextInt();
		
		System.out.println("Please select a number \n 1.Addition\n 2.Subtraction\n 3.Product " +
				"\n 4.Quatient");
		number3 = scanner.nextInt();
		
		
		
		switch(number3)
		{
		case 1:
			total = number1 + number2;
			System.out.println("Here is the sum of the two numbers" + total);
		break;
		
		case 2:
			total = number1 - number2;
			System.out.println("Here is the differnece of the two number" + total);
		break;
		
		case 3:
			total = number1 * number2;
			System.out.println("Here is the product of the two numbers" + total);
		break;
		
		case 4:
			
			if(number2 == 0)
			{
				System.out.println("Cannot divide by 0");
			}
			else
			{
				total = number1 / number2;
				System.out.println("Here is the quatient of the two numbers" +  total);
			}
		break;
		
		}
		
		
	}

}

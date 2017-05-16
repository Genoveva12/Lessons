package com.genoveva;

import java.util.Random;
import java.util.Scanner;


public class MathGame 
{

	public static void main(String[] args)
	{
	
		Random rnd = new Random();
		Scanner in = new Scanner(System.in);
		
		int num1 = rnd.nextInt(10);
		int num2 = rnd.nextInt(10);
		int operand = rnd.nextInt(5);
		int result;
		
		
		switch (operand)
		{
		case 0:
			System.out.println(num1 + " * " + num2);
		    result = num1 * num2;
		case 1:
			if(num2 != 0)
			{
			System.out.println(num1 + " / " + num2);
			result = num1 / num2;
			}
			
		case 2:
			System.out.println(num1 + " + " + num2);
			result = num1 + num2;
		case 3:
			System.out.println(num1 + " - " + num2);
			result = num1 - num2;
		case 4:
			System.out.println(num1 + " % " + num2);
			result = num1 % num2;
		}
		
//		if (operand == 0)
//		{
//			System.out.println(num1 + " * " +  num2);
//			in.nextLine();
//			result = num1 * num2; 
//		}
//		
//		else if (operand == 1 && num2 != 0)
//		{
//			System.out.println(num1 + " / " + num2);
//			result = num1 / num2;
//		}
//		
//		else if (operand == 2)
//		{
//			System.out.println(num1 + " + " + num2);
//			result = num1 + num2;
//		}
//
//		else if (operand == 3)
//		{
//			System.out.println(num1 + " - " + num2);
//			result = num1 - num2;
//		}
//		
//		else if (operand == 4)
//		{
//			System.out.println(num1 + " % " + num2);
//			result = num1 % num2; 
//		}
//		
		
		    
			
	

	
		
	}

}

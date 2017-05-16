package com.genoveva;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		 Scanner in = new Scanner(System.in);
		  int number = in.nextInt();
				 
		 
		 
			int factor = 1; 
			 
			for(int i = 1; i <= number; ++i)
			{
				factor = factor * i;
			}
			
		 			
		 System.out.println("Your total is " + factor);
	}

}

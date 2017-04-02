package com.genoveva;

import java.util.Scanner;

public class ForPractice 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		for(int i = 1; i < 101; ++i)
//		{
//			//int res = i % 2;
//			if( /*res*/ i % 2 == 1)
//			{
//				System.out.println(i + " odd");
//			}
//			else
//			{
//				System.out.println(i + " even");
//			}
//		}
		
//		for(int i = 1; i < 101; ++i)
//		{
//			if(i % 3 == 0 && i % 5 == 0)
//			{
//				System.out.println(i + " Fizz Fuzz");
//			}
//			else if(i % 5 == 0)
//			{
//				System.out.println(i + " Fuzz");
//			}
//			else if(i % 3 == 0)
//			{
//				System.out.println(i + " Fizz");
//			}
//			else
//			{
//				System.out.println(i + " Neither");
//			}
//		}
		
//		for(int i = 1; i < 11; ++i)
//		{
//			int square = i * i;
//			System.out.println(i  + " al cuadrado es " + i*i );
//			
//		}
		
		
//		System.out.println("Please enter a number");
//		
		 
//		
//		int max, min;
//		
//		
//		
//		max = input;
//		min = input;
//		
//		while (input != -99)
//		{
//			
//			if(input > max)
//			{
//				max = input;
//			}
//			
//			if(input < min)
//			{
//				min = input;
//			}
//			System.out.println("Please enter another number");
//			input = in.nextInt();
//		}
//		System.out.println("The highest number is " + max);
//		System.out.println("The lowest number is " + min);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int input = in.nextInt();
		
		int sum = 0;
		
		while(input != 0)
		{
			sum = input + sum;
			System.out.println("Please enter a number");
			input = in.nextInt();
		}
		System.out.println("Your total is: " + sum);
	}
}

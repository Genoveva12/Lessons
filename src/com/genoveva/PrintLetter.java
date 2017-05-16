package com.genoveva;

import java.util.Scanner;

public class PrintLetter
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
	
		
		for(int i = 0; i < word.length(); ++i)
		{
			
			System.out.println(word.charAt(i));
		}
		System.out.println(word);	
	}

}

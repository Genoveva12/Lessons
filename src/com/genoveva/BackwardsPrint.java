package com.genoveva;

import java.util.Scanner;

public class BackwardsPrint {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);	
		String word = in.nextLine();
	
		
		for(int i = word.length() -1 ; i > -1 ; --i)
		{
			
			System.out.println(word.charAt(i));
		}
			

	}

}

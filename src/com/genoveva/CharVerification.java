package com.genoveva;

import java.util.Scanner;

public class CharVerification {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String message = in.nextLine();
		char letter = in.nextLine().charAt(0);
		int veces = 0;
		 
		 for(int i = 0; i < message.length();++i)
		 {			 
			 if(letter == message.charAt(i))
			 {
				  veces = veces +1; 
			 }
	     }
		 
				 System.out.println("The letter you entered appears " + veces + " times in the message you entered");
	}

}

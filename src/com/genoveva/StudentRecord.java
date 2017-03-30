package com.genoveva;

import java.util.Scanner;

public class StudentRecord 
{
	//static Scanner in = new Scanner (System.in);
	static final int MAX = 16;
	static int size = 8;
	
	static char [] grades = {'A', 'B', 'C', 'D', 'F','A', 'B', 'C',
							 '\0','\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	static String [] names = {"Ciriaco", "Anaximandro","Justino", "Hermenegildo", "Secundino", "Miguelito", "Genoveva", "Guavate",
								"", "", "", "", "", "", "", ""};
	static boolean isOver = false;
	
	public static void main(String[] args) 
	{
		do
		{
			showOptions();
			validateInput();
		}while (!isOver);

	}
	
	public static void showOptions()
	{
		System.out.println("Choose an option:");
		System.out.println("Press L for a List of the students");
		System.out.println("Press A to add a new student");
		System.out.println("Press S to search for a specific student");
		System.out.println("Press R to remove a student");
		System.out.println("Press E to exit the program");
	}
	
	public static void validateInput()
	{
		Scanner in = new Scanner(System.in);
		char input = in.nextLine().charAt(0);
		switch (input)
		{
		case 'L':
		case 'l': 
			listStudent();
			break;
		case 'A':
		case 'a': 
			break;	
		case 'S':
		case 's': 
			searchForStudent();
			break;
		case 'R':
		case 'r': 
			break;
		case 'E':
		case 'e': 
			isOver = true;
			break;
		default: 
			System.out.println("Invalid Input");
		}
	}
	
	public static void listStudent()
	{
		for(int i = 0; i < size; ++i)
		{
			System.out.println(i + ") " + names[i]);
		}
	}

	public static void searchForStudent()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the student number");
		int selection = in.nextInt();
		if(selection < size && selection > -1)
		{
			System.out.println(selection + ") " + names[selection] + " " + grades[selection] );
		}
		else
		{
			System.out.println("Empty Slot");
		}
		
	}
}

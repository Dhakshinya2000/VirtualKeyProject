package com.LockedMe;

import java.io.*;
import java.util.*;

public class WelcomeScreen {
	File d = new File("C://Users/Admin/Desktop/javap/VirtualKeyProject/TextFiles/");
	Scanner sc = new Scanner(System.in);
	void MainMenu()
	{
		System.out.println("Press 1 to display Files");
		System.out.println("Press 2 to display Operations on Files");
		System.out.println("Press 3 to Quit");
	}
	void DisplayFiles()
	{
		String files[] = d.list(); 
		for(int i=0;i<files.length;i++)
			System.out.println(files[i]);
	}
	void Display()
	{		
		WelcomeScreen ws = new WelcomeScreen();
		FileOperations fo = new FileOperations();
			
		int option =0;
		while(option !=3)
		{   
			if(option != 3)
			ws.MainMenu();
			option = sc.nextInt();
			switch(option)
			{
			case 1:
				ws.DisplayFiles();
				break;
			case 2:
				fo.Operations();
				break;
			case 3:
				System.out.println("You exited the application");
				break;
			default:
				System.out.println("Invalid Operation");
			}
			if(option == 2)
			      break;
		}
	}

}

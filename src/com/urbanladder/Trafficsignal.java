package com.urbanladder;

import java.util.Scanner;

public class Trafficsignal {

	public static void main(String[] args) {
		System.out.println("Enter the color: Yellow, Red and Green");
		Scanner sc=new Scanner(System.in);
		String color=sc.nextLine();
	//	String c1=color.equalsIgnoreCase(color);
		switch(color)
		{
		case "Yellow":
			System.out.println("Ready");
		 	break;
		case "Red":	
			 System.out.println("Stop");
		 	break;
		case "Green":
			 System.out.println("GO ");
		 	break;
		 default:
			 System.out.println("Invalid");
		 	break;
		}
	}

}

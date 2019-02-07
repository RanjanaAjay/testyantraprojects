package com.urbanladder;

import java.util.Scanner;

public class Genderstatus {

	public static void main(String[] args) {
		System.out.println("Enter your Gender");
		Scanner sc=new Scanner(System.in);
		String Gender=sc.nextLine();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(Gender.equalsIgnoreCase("female") && (age>=18))
	//	if((Gender=="f" || Gender=="F" || Gender=="female" || Gender=="Female") && (age>=18))
		{
			System.out.println("You are female and eligible for marriage");
		}
		
		else if(Gender.equalsIgnoreCase("male") && (age>=21))
	//	else if((Gender=="m" || Gender=="M" || Gender=="male" || Gender=="Male") && (age>=21))
		{
			System.out.println("Your a male and eligible for marriage");
		}
		else
		{
			System.out.println("Invalid");
		}
		
		

	}

}

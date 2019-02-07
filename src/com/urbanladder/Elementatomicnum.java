package com.urbanladder;

import java.util.Scanner;

public class Elementatomicnum {

	public static void main(String[] args) {
		System.out.println("Enter the atomic number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("Hydrogen");
			break;
		case 2:
			System.out.println("Helium");
			break;
		case 3:
			System.out.println("Lithium");
			break;
		case 4:
			System.out.println("Beryllium");
			break;
		case 5:
			System.out.println("Boron");
			break;
		case 6:
			System.out.println("Carbon");
			break;
		case 7:
			System.out.println("Nitrogen");
			break;
		case 8:
			System.out.println("Oxygen");
			break;
		case 9:
			System.out.println("Fluorine");
			break;
		case 10:
			System.out.println("Neon");
			break;
		case 11:
			System.out.println("Sodium");
			break;
		case 12:
			System.out.println("Magnesium");
			break;
		case 13:
			System.out.println("Aluminum");
			break;
		case 14:
			System.out.println("Silicon");
			break;
		case 15:
			System.out.println("Phosphorus");
			break;
		case 16:
			System.out.println("Sulfur");
			break;
		case 17:
			System.out.println("Chlorine");
			break;
		case 18:
			System.out.println("Argon");
			break;
		case 19:
			System.out.println("Potassium");
			break;
		case 20:
			System.out.println("Calcium");
			break;
		default:
			System.out.println("None");
			break;
		}

	}

}

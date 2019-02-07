package com.urbanladder;

import java.util.Scanner;

public class Sumofdigits {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number");
		int num=sc.nextInt();
		int sum =0;
		while(num>0||sum>9)
		{
			if(num==0)
			{
				num=sum;
				sum=0;
			}
			sum=sum+num%10;
			num=num/10;
			
		}
		System.out.println("sum of number is "+sum);
	}

}
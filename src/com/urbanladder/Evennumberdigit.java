package com.urbanladder;

import java.util.Scanner;

public class Evennumberdigit {

	public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int len=0;
	int copy=num;
//	Boolean i=true;
	
			while(copy!=0) {
			copy=copy/10;
			len++;
			}
//	System.out.println(len);		
		if(len%2==1) {
		System.out.println("Invalid");
	}else {
		
		int j=len/2;
		int temp,rev=0;
		copy=num;
	while(j!=0) {
		temp=copy%10;
		copy=copy/10;
		rev=rev*10+temp;
		j--;
	}
	copy=1; j=len/2;
//	System.out.println(rev);
	for(int k=j;k>0;k--) {
	copy=copy*10;
	num=num/10;
	}
	num=num*copy+rev;
	System.out.println(num);
	
	
	}
	}

	}



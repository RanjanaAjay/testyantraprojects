package com.urbanladder;

import java.util.Scanner;

public class CurrentBillstatus {

	public static void main(String[] args) {
	
	int units;
	int arrears;
	Double Total=0.0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter arrears");
	arrears=sc.nextInt();
	System.out.println("Enter the Number of units");
	units=sc.nextInt();
	
	if(units<=50)
	{		
		Total=units*1.20;
		}
	else if(units>50 && units<=100)
	{		
		Total=(50*1.2)+(units-50)*2.4;
		}	
	else if(units>100 && units<=150)
	{		
		Total=(50*1.2)+(50*2.4)+(units-100)*3.6;  
		}	
	else if(units>=150)
	{		
		Double Discount=units*0.05;
		if(Discount>200)
		{
			Total=(units*3.60)-200;
		}else
		{		
		Total=(units*3.60)-(units*0.05);
	}
	
		if(arrears>0)
		{
			Total=Total+arrears+(arrears*.10)-Discount;
		}
		else
		{
			Total=Total-Discount;
			System.out.println("Total"+Total);
			
		}
	}
	System.out.println(Total);
}
}
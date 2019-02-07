package com.urbanladder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Swapimmediatedigit {
	   public static void main(String args[]) 
       { 
                 int x,y; 
                 Scanner s1=new Scanner(System.in); 
                 System.out.print("Enter the Size of Array : "); 
                 y=s1.nextInt(); 
                 int a[]=new int[y]; 
                 int b[]=new int[y]; 
                 System.out.println("\nEnter The Elements In First Array\n"); 
                       for(x=0;x<a.length;x++) {
                             a[x]=s1.nextInt(); 
                       }
                 int temp,i=0,j;
                 while(i<a.length) {
                	 j=i+1;
                			 {
                		 temp=a[i];
                		 a[i]=a[j];
                		 a[j]=temp;
                			 }
                	 i=i+2;
                 }
                      
               System.out.println("Result");
               for(x=0;x<a.length;x++) {
                 System.out.println(a[x]); 
             }
       }
}
                    
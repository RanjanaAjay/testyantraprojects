package com.urbanladder;

public class Sumoffirsthalf {
	public static void main(String args[]) 
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6 }; 
        int sum=0; 
  
        // Loop to find even, odd sum 
        for (int i = 0; i < arr.length/2; i++) { 
            
                sum += arr[i]; 
         
        } 
  
        System.out.println("sum of first half array: " + sum); 
       // System.out.println("Odd index positions sum: " + odd); 
    } 
} 
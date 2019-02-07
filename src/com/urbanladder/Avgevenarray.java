package com.urbanladder;

public class Avgevenarray {
	public static void main(String args[]) 
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6 }; 
        int even = 0, odd = 0, c=0;
  
        // Loop to find even, odd sum 
        for (int i = 0; i < arr.length; i++) { 
            if (i % 2 == 0) {
                even += arr[i]; 
            c++;
            }
         //   else
         //       odd += arr[i]; 
        } 
  
        System.out.println("avg of Even index positions sum: " + (even/c)); 
       // System.out.println("Odd index positions sum: " + odd); 
    } 
} 
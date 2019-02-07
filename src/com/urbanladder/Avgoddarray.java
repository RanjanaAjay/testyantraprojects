package com.urbanladder;

public class Avgoddarray {
	public static void main(String args[]) 
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6 }; 
        int even = 0, odd = 0, c=0;
  
        // Loop to find even, odd sum 
        for (int i = 0; i < arr.length; i++) { 
            if (i % 2 != 0) {
               // even += arr[i]; 
                    
         odd += arr[i]; 
            c++;
    }
        } 
  
        System.out.println("Avg of odd index positions sum: " + (odd/c)); 
       // System.out.println("Odd index positions sum: " + odd); 
    } 
} 
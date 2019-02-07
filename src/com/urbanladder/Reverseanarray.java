package com.urbanladder;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverseanarray {
	public static void main(String[] args) {
		Integer[] arr= {10,20,30,40,50};
		List<Integer> al=new ArrayList<>();
		
		al=Arrays.asList(arr);
		System.out.println("befor reverse\n");
		System.out.println(al);
		Collections.reverse(al);
		System.out.println("after reverse\n");
		System.out.println(al);
		
	}

}

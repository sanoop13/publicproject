package com.mystudy.sort;

import java.util.Scanner;

public class LinearSearch {

	public LinearSearch() {
		// TODO Auto-generated constructor stub
	}
	static int a[]= {8,2,4,9,3,6};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner read=new Scanner(System.in);
		int num=Integer.parseInt(read.nextLine());
		for(int i=0;i<a.length;i++){
			if(num==a[i]){
				System.out.print("found at index "+i);
				break;
			}
			
		}
		System.out.println("not found");
	}

}

package com.geeksforgeeks.practiceset1;

import java.util.Scanner;

public class ChocDistribution {

	public ChocDistribution() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the packets");
		String input=in.nextLine();
		String [] inputstr=input.split(",");
		System.out.println("Enter number of children");
		int m = Integer.parseInt(in.nextLine());
		int[] packArray=new int[inputstr.length] ;
		for(int i=0;i<inputstr.length;i++){
			packArray[i]=Integer.parseInt(inputstr[i]);
		}
		for(int i=0;i<packArray.length;i++){
			int temp;
			for(int j=i+1; j<packArray.length;j++){
				if(packArray[j]<packArray[i]){
					temp=packArray[i];
					packArray[i]=packArray[j];
					packArray[j]=temp;
					
				}
			}
		}
		int stIndex,lstIndex;
			for(int i=0;i+m-1<inputstr.length;i++){
				//System.out.print(packArray[i]+" ");
				int minimum=Integer.MAX_VALUE;
				int difference = packArray[i+m-1]-packArray[i];
				if(difference<minimum){
					minimum=difference;
					stIndex=i;
					lstIndex=i+m-1;					
				}
				
			}
			
			
		}

	

}

package com.mystudy.sort;

public class MyBubbleSort {

	public MyBubbleSort() {
		// TODO Auto-generated constructor stub
	}
	static int a[]= {8,2,4,9,3,6};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ascBubbleSort(a);
		dscBubbleSort(a);
	}
	private static void dscBubbleSort(int[] a2) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++){
			int temp;
			for(int j=0;j<a.length-1;j++){
				if(a[j]<a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		for ( int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	private static void ascBubbleSort(int[] a2) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++){
			int temp;
			for(int j=0;j<a.length-1;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		for ( int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

}

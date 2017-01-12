package com.mystudy.sort;

public class MySelectionSort {
	/**
	 * 
	 */

	public MySelectionSort() {
		// TODO Auto-generated constructor stub
	}
	static int a[]= {8,2,4,9,3,6};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ascSelectionSort(a);
		dscSelectionSort(a);
		
	}
	
	public static void ascSelectionSort(int[] a){
		for(int i=0;i<a.length;i++){
			int min=i;
			int temp;
			for(int j=i+1;j<a.length;j++){
				if(a[min]>a[j]){
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for ( int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	public static void dscSelectionSort(int[] a){
		for(int i=0;i<a.length;i++){
			int max=i;
			int temp;
			for(int j=i+1;j<a.length;j++){
				if(a[max]<a[j]){
					max=j;
				}
			}
			temp=a[i];
			a[i]=a[max];
			a[max]=temp;
		}
		for ( int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}


}

package com.mystudy.sort;

public class MyQuickSort {

	public MyQuickSort() {
		// TODO Auto-generated constructor stub
	}
	static int a[]= {8,2,4,9,3,6};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for ( int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		ascQuickSort(a);
		for ( int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		dscQuickSort(a);
		for ( int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}

	}
	private static void dscQuickSort(int[] a2) {
		// TODO Auto-generated method stub
		dscQuickSortImpl(a2,0,a2.length-1);
		
	}
	private static void dscQuickSortImpl(int[] a2, int i, int j) {
		// TODO Auto-generated method stub
		if(i<j){
			int q=dscQuickPartition(a2,i,j);
			dscQuickSortImpl(a2, i, q-1);
			dscQuickSortImpl(a2, q+1,j);
		}
		
	}
	private static int dscQuickPartition(int[] a2, int i, int j) {
		// TODO Auto-generated method stub
		int k=i;
		int temp;
		for(int in=i;in<j;in++){
			if(a2[in]>=a2[j]){
				temp=a2[in];
				a2[in]=a2[k];
				a2[k]=temp;
				k++;
			}
		}
		temp=a2[j];
		a2[j]=a2[k];
		a2[k]=temp;
		
		return k;
	}
	
	private static void ascQuickSort(int[] a2) {
		// TODO Auto-generated method stub
		ascQuickSortImpl(a2,0,a2.length-1);
		
	}
	private static void ascQuickSortImpl(int[] a2, int i, int j) {
		// TODO Auto-generated method stub
		if(i<j){
			int q=ascQuickPartition(a2,i,j);
			ascQuickSortImpl(a2, i, q-1);
			ascQuickSortImpl(a2, q+1,j);
		}
		
	}
	private static int ascQuickPartition(int[] a2, int i, int j) {
		// TODO Auto-generated method stub
		int k=i;
		int temp;
		for(int in=i;in<j;in++){
			if(a2[in]<=a2[j]){
				temp=a2[in];
				a2[in]=a2[k];
				a2[k]=temp;
				k++;
			}
		}
		temp=a2[j];
		a2[j]=a2[k];
		a2[k]=temp;
		
		return k;
	}

}

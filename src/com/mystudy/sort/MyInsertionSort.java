package com.mystudy.sort;

public class MyInsertionSort {
	
	/**
	 * for j<- 2 to n
	 * 	do key<- A[j]
	 * 		i<-j-1
	 * 		while i >0 and A[i]>key
	 * 			do A[i-1]<-A[i]
	 * 				i<-i-1
	 * 		A[i+1]<-key
	 * nearly sorted data and problem size is small
	 * best case theta(n)=0(n)
	 * worst case reverse sorted theta(n)=0(n^2)
	 */
	static int a[]= {8,2,4,9,3,6};
	public MyInsertionSort() {
		// TODO Auto-generated constructor stub
	}
	
	static int[] ascInsertionSort(int[] a){
		for (int i=1;i<a.length;i++){
			int temp;
			for (int j=i;j>0 && a[j-1]>a[j];j--){
				temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
				
			}
		}
		return a;
	}
	static int[] dscInsertionSort(int[] a){
		for (int i=1;i<a.length;i++){
			int temp;
			for (int j=i;j>0 && a[j-1]<a[j];j--){
				temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
				
			}
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for ( int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		int []a_2=ascInsertionSort(a);
		System.out.println("new arrray\n");
		for ( int i=0;i<a_2.length;i++){
			System.out.print(a_2[i]+" ");
		}
		a_2=dscInsertionSort(a);
		System.out.println("new arrray\n");
		for ( int i=0;i<a_2.length;i++){
			System.out.print(a_2[i]+" ");
		}
		
	}

}

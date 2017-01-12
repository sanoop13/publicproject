package com.mystudy.sort;

public class MyMergeSort {

	public MyMergeSort() {
		// TODO Auto-generated constructor stub
	}
	static int a[]= {8,2,4,9,3,6};
    static int[] tempMergArr=new int[a.length];
    static int length;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for ( int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		ascMergeSort(a);
		for ( int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		dscMergeSort(a);
		for ( int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	private static void ascMergeSort(int[] a2) {
		// TODO Auto-generated method stub
		doAscMergeSort(0,a2.length-1);
	}
	private static void doAscMergeSort(int i, int j) {
		// TODO Auto-generated method stub
		if(i<j){
			int mid=i+(j-i)/2;
			//System.out.println("calling first ASC Merge sort"+"first "+i+"second "+ mid);
			doAscMergeSort(i, mid);
			//System.out.println("calling first ASC_2 Merge sort"+"first "+(mid+1)+"second "+ j);
			doAscMergeSort(mid+1,j);
			//System.out.println("calling first ASC_3 Merge sort"+"first "+i+"second "+ mid+"third "+j);
			doAscMerge(i,mid,j);
	}
	}
	private static void dscMergeSort(int[] a2) {
		// TODO Auto-generated method stub
		doDscMergeSort(0,a2.length-1);
	}
	
	private static void doDscMergeSort(int i, int j) {
		// TODO Auto-generated method stub
		if(i<j){
			int mid=i+(j-i)/2;
			doDscMergeSort(i, mid);
			doDscMergeSort(mid+1,j);
			doDscMerge(i,mid,j);
	}
	}
	private static void doDscMerge(int lowerIndex, int middle, int higherIndex) {
		// TODO Auto-generated method stub
		for (int i=lowerIndex;i<=higherIndex;i++){
			tempMergArr[i]=a[i];
		}
		int i=lowerIndex;
		int j=middle+1;
		int k=lowerIndex;
		while (i <=middle && j<=higherIndex){
			System.out.println("first "+tempMergArr[i]+" second "+tempMergArr[j]);
			if(tempMergArr[i]>=tempMergArr[j]){
				a[k]=tempMergArr[i];
				i++;
			}else{
				a[k]=tempMergArr[j];
				j++;
			}
			k++;
		}
		while(i<=middle){
			a[k]=tempMergArr[i];
			k++;
			i++;
		}
		
	}
	private static void doAscMerge(int lowerIndex, int middle, int higherIndex) {
		// TODO Auto-generated method stub
		for (int i=lowerIndex;i<=higherIndex;i++){
			tempMergArr[i]=a[i];
		}
		int i=lowerIndex;
		int j=middle+1;
		int k=lowerIndex;
		while (i <=middle && j<=higherIndex){
			if(tempMergArr[i]<=tempMergArr[j]){
				a[k]=tempMergArr[i];
				i++;
			}else{
				a[k]=tempMergArr[j];
				j++;
			}
			k++;
		}
		while(i<=middle){
			a[k]=tempMergArr[i];
			k++;
			i++;
		}
	}

}

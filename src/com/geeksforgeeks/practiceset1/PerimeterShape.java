package com.geeksforgeeks.practiceset1;

public class PerimeterShape {

	public PerimeterShape() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] mat={
				{0, 1, 0, 0, 0},
                {1, 1, 1, 0, 0},
                {1, 0, 0, 0, 0}
		};
		int n=mat.length;
		int m=mat[0].length;
		int counter=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(mat[i][j] ==1){
					if(i-1<0 ){
						counter=counter+1;
					}else{
						if(mat[i-1][j]!=1){
							counter=counter+1;
						}
					}
					if(j-1<0){
						counter=counter+1;
					}else{
						if(mat[i][j-1]!=1){
							counter=counter+1;	
						}
					}if(i+1==n ){
						counter=counter+1;
					}else{
						if(mat[i+1][j]!=1){
							counter=counter+1;	
						}
					}if(j+1 ==m){
						counter=counter+1;
					}else{
						if(mat[i][j+1]!=1){
							counter=counter+1;	
						}
					}

				}
			}

		}
		
		System.out.println("border "+ counter);

	}

}

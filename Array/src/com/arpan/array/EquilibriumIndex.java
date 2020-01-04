package com.arpan.array;

public class EquilibriumIndex {
	
	public static void equalibriumIndex(int a[]){
		for(int i=1;i<=a.length-1;i++){
			int left_sum=0;
			int right_sum=0;
			for(int j=0;j<i;j++){
				left_sum=left_sum+a[j];
			}
			for(int j=i+1;j<a.length;j++){
				right_sum=right_sum+a[j];
			}
			if(left_sum==right_sum){
				System.out.println("eqi index" +i);
			}
		}
		
	}
	public static void equalibriumIndexBetter(int a[]){
		int totalSum=0;
		for(int i=0;i<=a.length-1;i++){
			totalSum=totalSum+a[i];
		}
		int left_sum=0;
		for(int i=0;i<a.length;i++){
			
			totalSum=totalSum-a[i];
			if(left_sum==totalSum){
				System.out.println("eq index "+(i));
			}
			
			left_sum=left_sum+a[i];
		}
		
	}
	public static void main(String[] args) {
		int[] a={-7,1,5,2,-4,3,0};
		equalibriumIndexBetter(a);
	}

}

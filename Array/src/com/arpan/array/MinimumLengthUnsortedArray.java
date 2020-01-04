package com.arpan.array;

public class MinimumLengthUnsortedArray {
	public static void MinimumLengthUnsortedArray(int a[]){
		int low=0;
		int high=a.length-1;
		for(int i=1;i<a.length;i++){
			if(a[i]>a[i-1]){
				continue;
			}else{
				low=i-1;
				break;
			}
		}
		System.out.println("s "+low);
		for(int i=a.length-2;i>0;i--){
			if(a[i]>a[i-1]){
				continue;
			}else{
				high=i;
				break;
			}
		}
		System.out.println("e "+high);
		int lower_value=a[low];
		int higher_value=a[high];
		for(int i=low+1;i<=high;i++){
			if(a[i]<lower_value){
				lower_value=a[i];
			}
			if(higher_value<a[i]){
				higher_value=a[i];
			}
			
		}
		System.out.println("low "+ lower_value);
	      System.out.println("high "+ higher_value);
		for(int i=0;i<a.length;i++){
			if(lower_value>a[i]){
				continue;
			}else{
				lower_value=i;
				break;
			}
		}
		for(int i=a.length-1;i>0;i--){
			if(higher_value<a[i]){
				continue;
			}else{
				higher_value=i;
				break;
			}
		}
		System.out.println("lower value "+lower_value);
		System.out.println("higher_value  "+higher_value);
	}
	public static void main(String[] args) {
		int a[]={10, 12, 20, 30, 1, 40, 32, 31, 35, 50, 60};
		MinimumLengthUnsortedArray(a);
	}

}

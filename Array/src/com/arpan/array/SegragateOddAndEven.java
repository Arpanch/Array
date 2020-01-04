package com.arpan.array;

public class SegragateOddAndEven {
	public static void segragateOddAndEven(int a[]){
		for(int i=0,j=a.length-1;i<j;){
			if(a[i]%2==0){
				i++;
			}else{
				if(a[j]%2==0){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					i++;
					j--;
				}else{
					j--;
				}
			}
		}
	}
	public static void main(String[] args) {
		int a[]={1,3,5,7,8,6,2,3};
		segragateOddAndEven(a);
		int i=0;
		while(i!=a.length){
			System.out.println(a[i]);
			i++;
		}
	}

}

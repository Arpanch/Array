package com.arpan.array;

public class CountFrequencies {
	public static void countFrquency(int a[]){
		for(int i=0;i<a.length;){
			if(a[i]<0){
				i++;
				continue;
			}
			if(a[i]>0){
				int index=a[i]-1;
				if(a[index]<0){
					a[index]=a[index]-1;
					a[i]=0;
					i++;
				}else{
					a[i]=a[index];
					a[index]=-1;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println((i+1)+"--> "+Math.abs(a[i]));
		}
	}
	
	public static void main(String[] args) {
		int arr2[] = {4, 4, 4, 4};
		countFrquency(arr2);
	}

}

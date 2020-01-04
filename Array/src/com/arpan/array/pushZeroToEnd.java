package com.arpan.array;

public class pushZeroToEnd {
	
	public static void  pushZeroToEnd(int a[]){
		int counter=0;
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				a[counter]=a[i];
				counter++;
			}
			
		}
		for(int i=counter;i<a.length;i++){
			a[i]=0;
		}
	}
	public static void main(String[] args) {
		int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        pushZeroToEnd(arr);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
	}



package com.arpan.array;

public class TwoRepeatingElement {
	
	void printRepeating(int arr[], int size) 
    {
        int count[]=new int[size];
        for(int i=0;i<=size-1;i++){
        	if(count[arr[i]]==1){
        		System.out.println(arr[i]);
        	}else{
        		count[arr[i]]=++count[arr[i]];
        	}
        }
    }
 
    public static void main(String[] args)
    {
    	TwoRepeatingElement repeat = new TwoRepeatingElement();
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        repeat.printRepeating(arr, arr_size);
    }

}

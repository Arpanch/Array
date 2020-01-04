package com.arpan.array;

public class SortArrayOf012 {
public static void sortArrayOf012(int a[]){
	int low=0;
	int mid=0;
	int high=a.length-1;
	while(mid<=high){
		switch(a[mid]){
		case 0:{
			int temp=a[low];
			a[low]=a[mid];
			a[mid]=temp;
			low++;
			mid++;
			break;
		}
		case 1:{
			mid++;
			break;
		}
		case 2:{
			int temp=a[mid];
			a[mid]=a[high];
			a[high]=temp;
			high--;
			break;
		}
		}
	}
}
static void printArray(int arr[], int arr_size)
{
    int i;
    for (i = 0; i < arr_size; i++)
        System.out.print(arr[i]+" ");
    System.out.println("");
}
public static void main(String[] args) {
	 int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
     int arr_size = arr.length;
     sortArrayOf012(arr);
     System.out.println("Array after seggregation ");
     printArray(arr, arr_size);
	
}
}

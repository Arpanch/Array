package com.arpan.array;

public class RepeatingElementsWithArrayModification {
	
	public void findRepeatingElements(int a[],int size){
		for(int i=0;i<size;i++){
			if(a[Math.abs(a[i])]>0){
				a[Math.abs(a[i])]=Math.negateExact(a[Math.abs(a[i])]);
			}else{
				System.out.println(Math.abs(a[i]));
			}
		}
	}
	public static void main(String[] args) {
		RepeatingElementsWithArrayModification repeat = new RepeatingElementsWithArrayModification();
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        repeat.findRepeatingElements(arr, arr_size);
	}

}

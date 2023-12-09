package sorting_algos;

import java.util.Scanner;

public class SelectionSort {

	public static int[] input(int[] arr, Scanner s) {     //input(int[], Scanner) function to take input
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static int[] selectionSort(int[] arr) {           //selectionSort(int[]) function to sort array
		for(int i=0;i<arr.length-1;i++) {
			int minimum=arr[i];
			int index=-1;
			for(int j=i+1;j<arr.length;j++) {           
				if(arr[j]<minimum) {                     //The if condition checks if arr[j] is less than arr[j+1]
					minimum=arr[j];
					index=j;
					
					
				}
			}	
			if(index!=-1) {
				int temp=arr[index];                     //if it's greater, both the values will be swapped
				arr[index]=arr[i];                      //This process will continue for each index resulting in sorted array
				arr[i]=temp;
			}
					
		}
		return arr;
	}

	public static void printSorted(int[] arr) {           //printSorted(int[]) method to print array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {              //main method
		Scanner s=new Scanner(System.in);                 //Creating object of Scanner class
		System.out.println("Enter array size: ");
		int size=s.nextInt();                             //array size input
		int[] arr=new int[size];
		System.out.println("Enter "+size+" numbers to perform selection sort: ");
		arr=input(arr,s);                                 //calling input method to take input
		arr=selectionSort(arr);                              //calling bubbleSort method to sort array
		printSorted(arr);                                 //calling printSorted method to print sorted array 

	}

}



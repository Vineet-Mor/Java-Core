package sorting_algos;

import java.util.Scanner;

public class InsertionSort {

	public static int[] input(int[] arr, Scanner s) {     //input(int[], Scanner) function to take input
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static int[] insertionSort(int[] arr) {           //bubbleSort(int[]) function to sort array
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0;j--) {           
				if(arr[j]<arr[j-1]) {                     //The if condition checks if arr[j] is less than arr[j-1]
					int temp=arr[j];                      //if it's less, both the values will be swapped
					arr[j]=arr[j-1];                      //This process will continue for each index until j=0
					arr[j-1]=temp;                        //It will place the value in sorted order with respected to the values on indexes less than i
				}
				else{
					break;
					}
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
		System.out.println("Enter "+size+" numbers to perform bubble sort: ");
		arr=input(arr,s);                                 //calling input method to take input
		arr=insertionSort(arr);                              //calling bubbleSort method to sort array
		printSorted(arr);                                 //calling printSorted method to print sorted array 

	}


	
	
}

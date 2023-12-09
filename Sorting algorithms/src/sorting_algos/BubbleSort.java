package sorting_algos;


import java.util.Scanner;                         //importing Scanner class
public class BubbleSort {                         //defining BubbleSort class
	public static int[] input(int[] arr, Scanner s) {     //input(int[], Scanner) function to take input
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static int[] bubbleSort(int[] arr) {           //bubbleSort(int[]) function to sort array
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {           
				if(arr[j]>arr[j+1]) {                     //The if condition checks if arr[j] is greater than arr[j+1]
					int temp=arr[j];                      //if it's greater, both the values will be swapped
					arr[j]=arr[j+1];                      //This process will continue for each index resulting in sorted array
					arr[j+1]=temp;
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
		arr=bubbleSort(arr);                              //calling bubbleSort method to sort array
		printSorted(arr);                                 //calling printSorted method to print sorted array 

	}

}

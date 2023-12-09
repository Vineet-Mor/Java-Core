package sorting_algos;

import java.util.Scanner;

public class MergeSort {
	/*
	 *  mergeSort(int[],int[]) function takes two sorted arrays
	 *  as input and merge it in such a way that the merged array
	 *  is also sorted.
	 */
	public static int[] mergeSort(int[] arr1, int[] arr2) {
		int[] arr=new int[arr1.length+arr2.length];
		int index1=0;
		int index2=0;
		int index=0;
		
		/*
		 * this while loop will run until the shortest length array elements are merged
		 * and stored in the new array
		 */
		while(index1<arr1.length && index2<arr2.length) {
				if(arr1[index1]<arr2[index2]) {
					arr[index]=arr1[index1];
					index++;
					index1++;
				}
				else {
					arr[index]=arr2[index2];
					index2++;
					index++;
				}
		}
		/*
		 * these while loops will make sure the remaining elements of the larger size
		 * array are added to the merged array
		 */
		while(index1<arr1.length) {
			arr[index]=arr1[index1];
			index++;
			index1++;
		}
		while(index2<arr2.length) {
			arr[index]=arr2[index2];
			index++;
			index2++;
		}
		return arr;
	}
	
	//input(int, Scanner) function to take input
	public static int[] input(int size,Scanner s) {     
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	//printSorted(int[]) method to print array
	public static void printSorted(int[] arr) {           
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st sorted array size");
		int[] arr1=input(s.nextInt(),s);
		System.out.println("Enter 2st sorted array size");
		int[] arr2=input(s.nextInt(),s);
		printSorted(mergeSort(arr1,arr2));
	}

}


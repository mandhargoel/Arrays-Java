package Array;

import java.util.Scanner;

public class ArrayOps {
	
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//int[] array = takeinput(); 
		
		//display(array);
		
		//int[] array= {10, 20, 30, 40, 50};
		
		//System.out.println(maxinArray(array));
		//System.out.println(linearsearch(array, 30));
		//System.out.println(binarysearch(array,40 ));
		
		int[] array= {99, 88, 77, 66, 55, 44, 33, 22, 11, 1};
		//Bubblesort(array);
		//selectionsort(array);
		//insertionsort(array);
		display(array);
		

	}
	
	public static int[] takeinput() {
		
		System.out.println("size ?");
		int n= scn.nextInt();
		
		int [] arr= new int[n];
		
		for(int i=0; i < arr.length; i++) {
		    System.out.println("Enter the value for " + i + "index ?");
			arr[i]= scn.nextInt();
		}
		
		return arr;
	}
	
	public static void display(int[] arr) {
		
		for(int i=0; i < arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		
	}

	public static int maxinArray(int[] arr) {
		 int max = Integer.MIN_VALUE;
		 for(int i=0;  i < arr.length; i++) {
			 if(arr[i]> max) {
				 max= arr[i];
			 }
		 }
		 
		 return max;
	}

	public static int linearsearch(int[] arr, int item) {
		for(int i=1; i< arr.length; i++) {
			if(arr[i] == item) {
				return i;
			}
		}
		return -1;
	}

	public static int binarysearch (int[] arr, int item) {
		int low=0, high=arr.length-1;
		
		while(low<high) {
			int mid=(low+high)/2;
			
			if(arr[mid]< item) {
				low= mid+1;
			}else if(arr[mid]>item) {
				high=mid-1;
			}else
				return mid;
		}
		return -1;
	}

	public static void Bubblesort(int[] arr) {
		
		for(int counter=0; counter< arr.length-1; counter++) {
			
			for(int j=0; j<arr.length-1-counter; j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	public static void selectionsort(int[] arr) {
		for(int counter=0; counter< arr.length-1; counter++) {
			int min=counter;
			for(int j=counter+1; j<=arr.length-1-counter; j++) {
				
				if(arr[j]<arr[min])
					min=j;
			}
			int temp=arr[min];
			arr[min]=arr[counter];
			arr[counter]=temp;
		}
	}

	public static void insertionsort(int[] arr) {
		for(int counter=1; counter<= arr.length-1; counter++) {
			int val=arr[counter];
			
			int j=counter-1;
			while(j >= 0 && arr[j] > val) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=val;
		}
	}

}

package javaproject1;

import java.util.Scanner;

public class binarysearchex {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter number of elements: ");
	        int n = scanner.nextInt();
	        int[] array = new int[n];

	        System.out.println("Enter " + n + " sorted elements:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }

	        
	        System.out.print("Enter the element to search: ");
	        int target = scanner.nextInt();

	       
	        int result = binarySearch(array, target);

	       
	        if (result == -1) {
	            System.out.println("Element not found in the array.");
	        } else {
	            System.out.println("Element found at index: " + result);
	        }

	        scanner.close();
	    }

	    
	    public static int binarySearch(int[] arr, int key) {
	        int low = 0;
	        int high = arr.length - 1;

	        while (low <= high) {
	            int mid = (low + high) / 2;

	            if (arr[mid] == key)
	                return mid; 
	            else if (arr[mid] < key)
	                low = mid + 1; 
	            else
	                high = mid - 1; 
	        }

	        return -1; 
	    }
	}



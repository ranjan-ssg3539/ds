package prac.misc.qs2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.Semaphore;

public class QuickSort2 {
	static int arr[] = {3,5,4,9,8,6,1,2,7};
	
	static int partition(int arr[], int low, int high) {
		
		int i = low;
		int pivot = arr[high];
		for(int j = 0; j<high; j++) {
			if(arr[j] < pivot) {
				i++;
			}
		}
		int temp = arr[high];
		arr[high] = arr[i];
		arr[i] = temp;
		return i;
	}
	
	static void qs(int arr[], int low, int high) {
		if (low < high) {
			int barrier = partition(arr, low, high);
			qs(arr, low, barrier - 1);
			qs(arr, barrier + 1, high);
		}
		
	}
	
	public static void main(String[] args) {
		int low = 0, high = 8;
		qs(arr, low, high);
		System.out.println("After sorting:");
		for (int i =0; i < high; i++) {
			System.out.println(arr[i]);
		}

	}

}

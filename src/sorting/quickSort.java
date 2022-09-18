package sorting;

import java.util.Arrays;

public class quickSort {
	
	public static int partition(int[] a,int low,int high) {
		int pivot = a[high];
		int j=low-1;
		for(int i=low;i<high;i++) {
			if(a[i]<pivot) {
				j++;
				int temp = a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		
		j++;
		int temp = a[j];
		a[j]=a[high];
		a[high]=temp;
		return j;
	}
	
	public static void quickSort(int[] a,int low,int high) {
		if(low<high) {
			int i = partition(a,low,high);
			quickSort(a,low,i-1);
			quickSort(a,i+1,high);
		}
	}

	public static void main(String[] args) {
		int[] a = {7,8,1,3,2,5,4};
		quickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

}

package sorting;

import java.util.Arrays;

public class insertionSort {

	public static void main(String[] args) {
		int[] a = {7,8,1,3,2,5,4};

		for(int i=1;i<a.length;i++) {
			int cur = a[i];
			int j=i-1;
			while(j>=0 && a[j]>cur) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=cur;
		}

		System.out.println(Arrays.toString(a));

	

}

}

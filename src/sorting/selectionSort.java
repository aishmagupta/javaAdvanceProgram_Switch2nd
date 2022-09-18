package sorting;

import java.util.Arrays;

public class selectionSort {

	public static void main(String[] args) {
		
		int[] a = {7,8,1,3,2,5,4};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				int smallest = i;
				if(a[j]>a[i]) { 
					smallest = j;
				}
				
				int temp = a[smallest];
				a[smallest] = a[i];
				a[i]=temp;
			}
		}
		
		System.out.println(Arrays.toString(a));

	}

}

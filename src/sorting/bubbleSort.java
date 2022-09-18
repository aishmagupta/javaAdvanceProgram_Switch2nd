package sorting;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		
		int[] a = {7,8,1,3,2,5,4};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[i]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));

	}

}

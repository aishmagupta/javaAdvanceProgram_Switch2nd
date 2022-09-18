package arrays;

import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {4, 5, 1, 2,9,8,0};
		int low = 0;
		int high = a.length-1;
		while(low<high) 
		{
			int temp = a[low];
			a[low]=a[high];
			a[high]=temp;
			low++;
			high--;
		}
		System.out.println(Arrays.toString(a));
	}

}

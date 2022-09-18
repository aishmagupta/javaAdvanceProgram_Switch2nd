package sorting;

import java.util.Arrays;

public class mergeSort {
	
	public static void conquer(int[] a,int mid, int low,int high) 
	{
		int[] merge = new int[high-low+1];
		int i1=low;
		int i2=mid+1;
		int x=0;
		
		while(i1<=mid && i2<=high) 
		{
			if(a[i1]>a[i2]) {
				merge[x++]=a[i1++];
			}
			else {
				merge[x++]=a[i2++];
			}
		}
		
		while(i1<=mid) 
		{
			merge[x++]=a[i1++];
		}
		
		while(i2<=high) 
		{
			merge[x++]=a[i2++];
		}
		
		for(int i=0,j=low;i<a.length;i++,j++) {
			a[j]=merge[i];
		}
	}
	
	public static void divide(int[] a,int low,int high) {
		if(low>=high) {
			return;
		}
		int mid = low + (high-low)/2;
		divide(a,0,mid);
		divide(a,mid+1,high);
		conquer(a,mid,low,high);
	}

	public static void main(String[] args) {

		int[] a = {7,8,1,3,2,5,4};
		divide(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

}

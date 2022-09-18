package arrays;

import java.util.Arrays;

public class searchRotatedArray {

	public static void main(String[] args) {
		
		int[] n = {4,5,6,7,0,1,2}; int target = 7;
		
		int in = 0;
		for(int i=0;i<n.length;i++) {
			if(n[i]==target) {
				in = i; 
				System.out.println(in);
				break;
			}
		}
		
		//Binary search
		Arrays.sort(n);
		System.out.println(Arrays.toString(n));
		int low = 0; int high = n.length-1;
		while(low<=high) 
		{
			int mid = (low+high)/2;
			if(n[mid]==target) {
				System.out.println("target is present in array at index " + mid);
				break;
			}
			else if(n[mid]<target) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		 if ( low > high ){  
		      System.out.println("Element is not found!");  
		   } 
	}

}

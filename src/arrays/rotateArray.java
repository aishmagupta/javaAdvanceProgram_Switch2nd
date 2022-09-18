package arrays;

import java.util.Arrays;

public class rotateArray {

	public static void main(String[] args) {
		
		 int a[] = {1, 2, 3, 4, 5, 6, 7}; int d = 4;
		 
		 int[] temp = new int[a.length];
		 int cnt=0;
		 for(int i=d;i<a.length;i++) {
			 temp[cnt]=a[i]; 
			 cnt++;
		 }
		 System.out.println(Arrays.toString(temp));
		 
		 int[] temp2 = new int[d];
		 for(int i=0;i<d;i++) {
			 temp2[i]=a[i]; 
		 }
		 System.out.println(Arrays.toString(temp2));
		 
		 for(int i=0;i<d;i++) {
			 temp[cnt]=temp2[i]; 
			 cnt++;
		 }
		 System.out.println(Arrays.toString(temp));
	}

}

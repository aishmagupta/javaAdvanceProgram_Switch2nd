package arrays;

import java.util.Arrays;

public class merge2sortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10, 5, 15};
		int  b[] = {20, 3, 2};

		//1 way temp[] 2n
		int[] temp = new int[a.length+b.length];
		int cnt=0;
		for(int i=0;i<a.length;i++) {
			temp[i]=a[i]; cnt++;
		}
		for(int i=0;i<b.length;i++) {
			temp[cnt]=b[i]; cnt++;
		}
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));





	}

}

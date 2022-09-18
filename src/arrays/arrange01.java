package arrays;

import java.util.Arrays;

public class arrange01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] s = {1,0,1,1,1,0,1,0};
		
		//1
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		
		//2
		int cnt=0;
		for(int i=0;i<s.length;i++) {
			if(s[i]==0) {
				cnt++;
			}
		}
		for(int i=0;i<=cnt;i++) {
			s[i]=0;
		}
		for(int i=cnt;i<s.length;i++) {
			s[i]=1;
		}
		System.out.println(Arrays.toString(s));
		
		
		
		
		
	}

}

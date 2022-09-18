package string;

import java.util.Arrays;

public class reversePreservingspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = " abc de ";
		char[] c = s.toCharArray();
		
		int low = 0;
		int high = c.length-1;
		while(low<high) 
		{
			if(c[low]==' ') {
				low++; continue;
			}
			else if (c[high]== ' '){
				high--; continue;
			}
			else {
				char ch = c[low];
				c[low]=c[high];
				c[high]=ch;
				low++; high--;	
			}
		}
		
		System.out.println(String.valueOf(c));
	}

	// rptate array
	//print list os lements in order no dups
	// merge 2 unsorted array in one 
}

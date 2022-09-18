package string;

public class palindromeSubstringLongest {

	public static void main(String[] args) {
		
		
		String s = "babad"; int max =0; int start =0;
		
		for(int i=0;i<s.length();i++)
		{
			int low = i-1; int high = i+1;
			
			while(low>=0 && s.charAt(low)==s.charAt(i)) {
				low--;
			}
			while(high<s.length() && s.charAt(i)== s.charAt(high)) {
				high++;
			}
			while(low>=0 && high<s.length() && s.charAt(low)==s.charAt(high)) {
				high++; low--;
			}
			
			int length = high-low-1; max = length;
			System.out.println(s.substring(start,start+max));
			
			if(length>max) 
			{
				max = length;
				start = low+1;
			}
		}
		
		System.out.println(s.substring(start,start+max));
	}

}

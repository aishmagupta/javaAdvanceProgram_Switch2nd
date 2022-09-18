package string;

public class longestPrefSuff {

	public static void main(String[] args) {
		
		String s = "aabcdaabc";
		
		int low = 0; String temp="";
		int mid = (1 + s.length())/2;
		
		while(mid<s.length()) 
		{
			if(s.charAt(low)==s.charAt(mid)) {
				temp += s.charAt(low);
				mid++; low++;
			}
			else {
				mid = mid-s.length()-1;
				low=0;
			}
		}
		System.out.println(temp +" "+ low);

	}

}

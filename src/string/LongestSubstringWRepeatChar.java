package string;

public class LongestSubstringWRepeatChar {

	public static void main(String[] args) {
		
		String s = "abcabcbb";
		
		String temp = ""; int max = 1;
		
		for(int i=0;i<s.length();i++) {
			if(temp.contains(String.valueOf(s.charAt(i)))) {
				temp = temp.substring(temp.indexOf(s.charAt(i))+1);
				
			}
			temp = temp + s.charAt(i);
			System.out.println(temp + " "+ max);
			 max = Math.max(temp.length(),max);
		}
		
		
		System.out.println(temp + " "+ max);
	}

}

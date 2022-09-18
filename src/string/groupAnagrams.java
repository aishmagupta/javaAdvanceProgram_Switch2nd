package string;

import java.util.*;

public class groupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = {"cat", "dog", "tac", "god", "act"};
		
		HashMap<String,List<String>> h = new HashMap<>();
		
		for(int i=0;i<s.length;i++) {
			String ss = s[i];
			char[] c = s[i].toCharArray();
			Arrays.sort(c);
			String temp = new String(c);
			
			if(h.containsKey(temp)) {
				h.get(temp).add(ss);
			}
			else {
				List<String> word = new ArrayList<String>();
				word.add(temp);
				h.put(temp, word);
			}
			
		}
		
		System.out.println(h);
		
	}

}

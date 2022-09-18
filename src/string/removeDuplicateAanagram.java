package string;
import java.util.*;

public class removeDuplicateAanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = {"geeks","keegs","code","doce", "k"};
		HashSet<String> h = new HashSet<>();
		
		for(int i=0;i<s.length;i++) {
			String ss = s[i];
			char[] c = s[i].toCharArray();
			Arrays.sort(c);
			String temp = new String(c);
			
			if(!h.contains(temp)) {
				h.add(temp);
			}
			System.out.println(h);
		}
		
		System.out.println(h);
	}

}

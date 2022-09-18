package string;

import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "timetopractice"; String p = "toc";
		
		String temp = "";
		for(int i=0;i<p.length();i++) 
		{
			if(i==0) {
				for(int j=i;j<s.length();j++) {
					if(p.charAt(i)==s.charAt(j)) {
						temp +=s.charAt(j);
						break;
					}
				}
			}
			else
			{
				for(int j=i;j<s.length();j++) {
					if(p.charAt(i)==s.charAt(j)) {
						temp +=s.charAt(j);
						
					}
				}
			}
			
		}

	}

}

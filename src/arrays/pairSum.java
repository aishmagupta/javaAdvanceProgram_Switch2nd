package arrays;

public class pairSum {

	public static void main(String[] args) {
		
		int s[] = {11, 15, 26, 38, 9, 10}; int x = 35;
		
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if((s[i]+s[j])==x) {
					
					System.out.println("Pair sum is: " + s[i] + "," + s[j]);
					break;
				}
				
			}
		}
		
		

	}

}

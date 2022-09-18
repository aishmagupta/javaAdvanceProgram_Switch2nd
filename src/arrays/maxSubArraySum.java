package arrays;

public class maxSubArraySum {

	public static void main(String[] args) {
		
		int[] s = {-2,1,-3,4,-1,2,1,-5,4};
		
		int temp = 0; int max =0; int low =0; int high=0;
		for(int i=0;i<s.length;i++) {
			temp = s[i];
			for(int j=i+1;j<s.length;j++) {
				temp = temp+s[j];	
				high = j;
			}
			
			if(max<temp) {
				max=temp;
				low = i;
			} 
			
			temp=0;
			
		}
		
		
		System.out.println(s[low] + " , " + s[high] + " = " + max);

	}

}

package arrays;

public class minMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1000, 11, 445, 1, 330, 3000};
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) 
		{
			if(max<a[i]) {
				max = a[i];
			}
			if(min>a[i]) {
				min = a[i];
			}
		}
		System.out.println(max +" "+ min);
	}

}

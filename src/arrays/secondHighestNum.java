package arrays;

public class secondHighestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 16, 5, 15};
		
		int first =0; int second=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>first) {
				second = first;
				first=a[i];
			}
			else if (a[i]>second && a[i]!=first) {
				second=a[i];
			}
		
		}
		System.out.println(first);
		System.out.println(second);
	}

}

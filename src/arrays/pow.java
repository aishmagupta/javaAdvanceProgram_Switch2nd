package arrays;

public class pow {

	public static int pow(int x, int n) 
	{
		int temp =1;
		for(int i=1;i<=n;i++){ 
			temp = temp * x;
		}
		return temp;
	}


		public static void main(String[] args) {

			System.out.println(pow(3,6));
		}

	}

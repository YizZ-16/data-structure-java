package recursion;

public class FindBinaryOne {
	
	public static void  main(String [] args) {
		System.out.print(new FindBinaryOne().find(8));
	}
	
	private int find(int n) {
		if (n ==0) {
			return 0;
		}
		if (n==1) {
			return 1;
		}
		if (n == 2) {
			return 1;
		}
		
		if (n % 2 ==0) {
			return find(n/2);
		}
		
		if (n % 2 == 1) {
			return find(n/2)+1;
		}
		return 0;
	}

}

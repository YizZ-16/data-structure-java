package sort;

public class BubbleSort {
	
	public void sort (int [] arr) {
		int i=0 , j=0 ;
		int len = arr.length;
		System.out.println("arr len: "+len);
		for (i=0; i<len; i++) {
			for (j=0; j<len-1-i; j++ ) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
	
	public void sortBetter(int [] arr ){
		int low = 0;
		int high = arr.length-1;
		int temp,j;
		while (low < high) {
			for (j=low; j<high; j++ ) {
				if (arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			--high;
			for (j=high; j>low; j--) {
				if (arr[j]<arr[j-1]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
			++low;
		}
		
	}
	
	public static void main (String [] args) {
		int [] arr = new int []{
				3,44,38,5,47,15,36,26,27,2,46,4,19,50,48
		};
		
		//new BubbleSort().sort(arr);
		new BubbleSort().sortBetter(arr);
		int i = 0;
		while (i < arr.length) {
			System.out.print(arr[i++] + " ");
		}	
		
	}

}

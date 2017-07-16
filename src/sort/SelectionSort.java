package sort;

public class SelectionSort {
	
	public void sort (int arr []) {
		int len = arr.length;
		int temp;
		int i,j,index;
		for (i=0; i<len-1; i++){
			index = i;
			for (j=i+1; j<len; j++) {
				if (arr[index]>arr[j]) {
					index = j ;
				}
			}
			temp = arr[i];
			arr [i]= arr [index];
			arr [index] = temp;
		}
		i = 0;
		while (i<len) {
			System.out.print(arr[i]+ " ");
			++i;
		}
	}
	
	public void insertSort(int [] arr) {
		int i,j,temp;
		int len = arr.length;
		for (i=1; i<len; i++) {
			temp = arr[i];
			j = i-1;
			while (j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1] = temp;
		}
		i = 0;
		while (i<len) {
			System.out.print(arr[i]+ " ");
			++i;
		}
	}
	
	public static void main (String [] args) {
		int [] arr = new int []{
				3,44,38,5,47,15,36,26,27,2,46,4,19,50,48
		};
		//new SelectionSort().sort(arr);
		new SelectionSort().insertSort(arr);
		
	}

}

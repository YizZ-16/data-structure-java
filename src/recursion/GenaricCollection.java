package recursion;

public class  GenaricCollection <T extends Object> {
	
	private T [] arr;
	private int size;
	
	public GenaricCollection(T [] a) {
		this.arr = a;
		this.size = a.length;
	}
	
	public boolean isEmpty() {
		return this.size >= 0;
	}
	
	public int makeEmpty() {
		if (this.size == 0) {
			return 0;
		}
		for (int i=0; i<this.size; i++) {
			arr[i] = null;
		}
		return this.size;
	}
	
	public int insert(T a) {
		this.arr[size] = a;
		return this.size+1;
	}
	
	public T remove (T a) {
		 int index = contain(a);
		 if (index == -1) {
			 return null;
		 }
		 for ( int i=index; i<this.size-1; i++) {
			 this.arr[i] = this.arr[i+1];
		 }
		 this.size = this.size -1;
		 return a;
	}
	
	public int  contain(T a) {
		int f = -1;
		for (int i=0; i<this.size; i++) {
			if (this.arr[i]==a) {
				f = i;
				break;
			}
		}
		
		return f ;
	}
	
	public int isPresent(T a) {
		return  contain(a);
	}
	

}

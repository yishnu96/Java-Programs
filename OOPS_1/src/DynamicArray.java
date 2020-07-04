
public class DynamicArray {
	private int data[];
	private int nextelementIndex;
	
	public DynamicArray() {
		data = new int[5];
		nextelementIndex=0;
	}
	
	public int size() {
		return nextelementIndex;
	}
	
	public boolean isEmpty() {
		return nextelementIndex==0;
	}
	
	public int get(int i) {
		if(i>= nextelementIndex)
			return -1;
		return data[i];
	}
	
	public void addElement(int element) {
		if(nextelementIndex == data.length)
			doubletheArray();
		data[nextelementIndex] = element;
		nextelementIndex++;
		
	}

	private void doubletheArray() {
		int temp[]=data;
		
		data = new int[2* temp.length];
		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
	}
	
	public void setelement(int i,int element) {
		
		while(i>=nextelementIndex)
			doubletheArray();
		
		data[i] = element;
	}
	
	public void removeLast() {
		if(nextelementIndex == 0)
			return;
		
		int temp = data[nextelementIndex - 1];
		data[nextelementIndex - 1]=0;
		nextelementIndex--;
	}
}




























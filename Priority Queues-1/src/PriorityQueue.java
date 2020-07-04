import java.util.ArrayList;

public class PriorityQueue {
	
	private ArrayList<Integer> heap;
	
	public PriorityQueue(){
		heap = new ArrayList<Integer>();
	}

	public void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while(childIndex > 0){
			if(heap.get(childIndex) > heap.get(parentIndex))
			{
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			}
			else
				return;

		}
	}
	
	public void print() {
		
		for(int i=0;i<heap.size();i++)
			System.out.println(heap.get(i)+" ");
	}

	public int getMax() {
		if(isEmpty()){
			// Throw an exception
			return Integer.MAX_VALUE;
		}
		return heap.get(0);
	}

	public int removeMax() {
		
		if(heap.isEmpty()) {
			return Integer.MAX_VALUE;
		}
		
		int ans = heap.get(0);
		 
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		
		int parentIdx = 0;
		int leftIdx = 2*parentIdx + 1;
		int rightIdx = 2*parentIdx + 2;
		
		while(leftIdx < heap.size())
		{
			int maxIdx = parentIdx;
			
			if(heap.get(leftIdx) > heap.get(maxIdx) )
				maxIdx=leftIdx;
			
			if( rightIdx < heap.size() && heap.get(rightIdx) > heap.get(maxIdx))
				maxIdx=rightIdx;
			
            if( maxIdx == parentIdx)
                break;
            
			Integer temp = heap.get(maxIdx);
			heap.set(maxIdx, heap.get(parentIdx));
			heap.set(parentIdx, temp);
			parentIdx = maxIdx;
			leftIdx = 2*parentIdx + 1;
			rightIdx = 2*parentIdx +2;
		}
		
		return ans;
	}

	public int getSize() {
		return heap.size();
	}

	public boolean isEmpty() {
		return heap.size() == 0;
	}

}

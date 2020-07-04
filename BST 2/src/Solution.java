import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

class collectn{
    int min;
    int max;
    boolean isBST;
    int size ;
    
    collectn(){
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        isBST = true;
        size = 0;
    }
}



public class Solution {


	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		 
		collectn m = largestBST(root);
        return m.size;
	}
	
    private static collectn largestBST(BinaryTreeNode<Integer> root){
    	
        if(root == null){
            return new collectn();
        }
        
        collectn leftrtn = largestBST(root.left);
        collectn rightrtn =largestBST(root.right);
        
        collectn m = new collectn();
        
        if(leftrtn.isBST == false || rightrtn.isBST == false || (leftrtn.max > root.data || rightrtn.min <= root.data)){
            m.isBST = false;
            m.size = Math.max(leftrtn.size, rightrtn.size);
            return m;
        }
        
        m.isBST = true;
        m.size = leftrtn.size + rightrtn.size + 1;
     
        m.min = root.left != null ? leftrtn.min : root.data;
  
        m.max = root.right != null ? rightrtn.max : root.data;
   
        return m;
    }
	

	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		
		ArrayList<Integer> temp = new ArrayList<>(); 
		ArrayList<Integer> arr = List(root, temp); 
  
		for(int i=0;i<arr.size()-1;i++)
		{
			for(int j = i+1;j<arr.size();j++)
			{
				if(arr.get(i) + arr.get(j) == s)
                    if(arr.get(i) < arr.get(j))
					    System.out.println(arr.get(i) + " "+ arr.get(j));
                    else
					    System.out.println(arr.get(j) + " "+ arr.get(i));
			}
		}
		
	}

	private static ArrayList<Integer> List(BinaryTreeNode<Integer> root, ArrayList<Integer> list) {
		
    	if (root == null) 
    		return list; 

    	List(root.left, list); 
    	list.add(root.data); 
    	List(root.right, list); 

    	return list; 
	}

	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
		
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
		ArrayList<Node<BinaryTreeNode<Integer>>> a = new ArrayList<Node<BinaryTreeNode<Integer>>>();
		int levelNodes =0;

		if(root==null) 
			return null;

		q.add(root);

		while(!q.isEmpty())
		{
			levelNodes = q.size();
			Node<BinaryTreeNode<Integer>> head = null;
			Node<BinaryTreeNode<Integer>> curr = null;
			while(levelNodes>0)
			{
				BinaryTreeNode<Integer> n = q.remove();
				Node<BinaryTreeNode<Integer>> ln = new Node<BinaryTreeNode<Integer>>(n);
				
				if(head==null)
				{
					head = ln;
					curr = ln;
				}
				else
				{
					curr.next = ln;
					curr = curr.next;
				}
				if(n.left!=null) q.add(n.left);
				if(n.right!=null) q.add(n.right);
				levelNodes--;
			}
			
			a.add(head);
		}
		return a;
	} 
}



class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}











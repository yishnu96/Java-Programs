import java.util.*;

class BinaryTreeNode<T> { 
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    BinaryTreeNode(T data) {
        this.data = data;
    }
};
public class Main {

    public static void printLevelATNewLine(BinaryTreeNode<Integer> root) {
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
          BinaryTreeNode<Integer> first = q.poll();
          if(first == null) {
            if(q.isEmpty()) {
              break;
            }
            System.out.println();
            q.add(null);
            continue;
          }
          System.out.print(first.data + " ");
          if(first.left != null) {
            q.add(first.left);
          }
          if(first.right != null) {
            q.add(first.right);
          }
        }
      }
      
      public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          int n = s.nextInt();
          int[] preorder = new int[n];
          for(int i = 0; i < n; ++i) {
              preorder[i] = s.nextInt();
          }
          BinaryTreeNode<Integer> root = Solution.constructBST(preorder);
          printLevelATNewLine(root);
      }
}

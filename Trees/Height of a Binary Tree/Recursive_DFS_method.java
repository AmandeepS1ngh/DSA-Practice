// Using Depth first search method
import java.util.* ;
import java.io.*; 
/****************************************************
class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

*****************************************************/
public class Solution 
{
	public static int findMaxDepth(BinaryTreeNode<Integer> root) 
	{
		// WRITE YOUR CODE HERE 
		if(root == null)return 0;
		
		int lh = findMaxDepth(root.left);
		int rh = findMaxDepth(root.right);

		return 1+Math.max(lh,rh);
	}
}

package tree;

import java.util.*;

public class BTree {
	TreeNode root;

	public void createBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;

	}
	// Recursive Inorder traversal
//public void inOrder(TreeNode root) {
//if(root==null) {
//	return;
//}
//inOrder(root.left);
//System.out.print(root.data +" ");
//inOrder(root.right);
//
//}

//Iterative Inorder traversal
	public void inOrder() {
		if (root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		while (!stack.isEmpty() || temp != null) {

			if (temp != null) {
				stack.push(temp);
				temp = temp.left;
			} else {
				temp = stack.pop();
				System.out.print(temp.data + " ");
				temp = temp.right;
			}
		}
	}

	// Recursive Preorder traversal
//	public void preOrder(TreeNode root) {
//		if (root == null)
//			return;
//		System.out.print(root.data + " ");
//		preOrder(root.left);
//		preOrder(root.right);
//	}
	// Iterative Preorder traversal
	public void preOrder() {
		if (root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.data + " ");
			if (temp.right != null) {
				stack.push(temp.right);
			}
			if (temp.left != null) {
				stack.push(temp.left);
			}
		}
	}
//Recursive Postorder traversal	
	public void postOrder(TreeNode root) {
		if(root==null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
		
	}
	//Levelorder traversal
	public void levelOrder() {
		if(root==null)
			return;
		Queue<TreeNode>queue=new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode temp=queue.poll();
			System.out.print(temp.data+" ");
			if(temp.left!=null) {
				queue.offer(temp.left);
			}
			if(temp.right!=null) {
				queue.offer(temp.right);
			}
		}
	}

	public static void main(String[] args) {
		BTree k = new BTree();
		k.createBinaryTree();
		System.out.println("Level Order:");
		k.levelOrder();
		System.out.println("\nIn Order");
		// k.inOrder(k.root);
		k.inOrder();
		System.out.println("\nPre Order");
		k.preOrder();
		// k.preOrder(k.root);
		System.out.println("\nPost Order");
		k.postOrder(k.root);
		
	}
}

class TreeNode {
	TreeNode left;
	TreeNode right;
	int data;

	public TreeNode(int data) {
		this.data = data;
	}

}
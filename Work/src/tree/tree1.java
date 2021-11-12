package tree;

import java.util.Scanner;

public class tree1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Node root=createTree();
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
		add(root, 25);

	}
	public static Node add(Node node,int data) {
		if(node==null) {
			return new Node(null,null,data);
		}
			
		if(data>node.data) {
			node.right=add(node.right, data);
		}
		else if(data<node.data) {
			node.left=add(node.left, data);
		}
		else {
			
		}
		return node;
		
	}
    
	public static Node createTree() {
		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		if (data == -1)
			return null;
		root = new Node(null,null,data);

		System.out.println("Enter left for " + data);
		root.left = createTree();

		System.out.println("Enter right for " + data);
		root.right = createTree();

		return root;
	}
	static void inOrder(Node root) {
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	static void preOrder(Node root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	static void postOrder(Node root) {
		if(root==null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
}

class Node {
	Node left, right;
	int data;
	public Node(Node left, Node right, int data) {
		
		this.left = left;
		this.right = right;
		this.data = data;
	}

	

}
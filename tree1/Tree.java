package tree1;

import java.util.*;

public class Tree {

	Node root;

	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	public void insert(int val) {
		Node newNode = new Node(val);
		Node temp = root;
		if (temp == null) {
			root = newNode;
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(temp);
		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			if (temp.left == null) {
				temp.left = newNode;
				return;
			} else {
				q.add(temp.left);
			}
			if (temp.right == null) {
				temp.right = newNode;
				return;
			} else {
				q.add(temp.right);
			}
		}
	}

	public void delete(int val) {

		Node temp = root;
		if (temp == null) {
			System.out.println("binary tree is empty");
			return;
		}
		if (temp.left == null && temp.right == null) {
			if (temp.data == val) {
				root = null;
				return;
			}
			return;
		}

		Queue<Node> q = new LinkedList<>();
		q.add(temp);
		Node lastNode = null, keyNode = null;

		while (!q.isEmpty()) {
			lastNode = q.peek();
			q.remove();

			if (lastNode.data == val) {
				keyNode = lastNode;
			}
			if (lastNode.left != null) {
				q.add(lastNode.left);
			}
			if (lastNode.right != null) {
				q.add(lastNode.right);
			}
		}

		if (keyNode != null) {
			int key = lastNode.data;
			deleteRightMostNode(temp, lastNode);
			keyNode.data = key;

		}

	}

	private void deleteRightMostNode(Node temp, Node lastNode) {

		Queue<Node> q = new LinkedList<>();
		q.add(temp);
		Node prev = null;
		while (!q.isEmpty()) {
			prev = q.peek();
			q.remove();

			if (prev.left.data == lastNode.data) {
				prev.left = null;
				return;
			} else if (prev.right.data == lastNode.data) {
				prev.right = null;
				return;
			}

			if (prev.left.data != lastNode.data) {
				q.add(prev.left);
			}
			if (prev.right.data != lastNode.data) {
				q.add(prev.right);
			}
		}

	}

	public void print(Node temp) {
		if (temp == null)
			return;
		print(temp.left);
		System.out.print(temp.data + "->");
		print(temp.right);
	}

//inorder traversal without recursion
	public void inorder() {
		if (root == null)
			return;

		Stack<Node> s = new Stack<>();
		Node curr = root;

		while (curr != null || s.size() > 0) {
			while (curr != null) {
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			System.out.print(curr.data + "->");
			curr = curr.right;
		}
	}

// pre order traversal without using recursion
	void preorderWithoutRecr() {
		Stack<Node> s = new Stack<>();
		s.push(root);

		while (!s.isEmpty()) {
			Node curr = s.pop();
			System.out.print(curr.data + "->");

			if (curr.right != null) {
				s.push(curr.right);
			}
			if (curr.left != null) {
				s.push(curr.left);
			}
		}

//		System.out.print(temp.data+"->");
//		preorder(temp.left);
//		preorder(temp.right);
	}

// pre order traversal
	void preorder(Node temp) {
		if (temp == null)
			return;

		System.out.print(temp.data + "->");
		preorder(temp.left);
		preorder(temp.right);
	}

//postorder traversal
	void postOrder(Node curr) {
		if (curr == null)
			return;
		postOrder(curr.left);
		postOrder(curr.right);
		System.out.print(curr.data + "->");
	}

	void printLevelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {

			Node temp = q.poll(); // poll remove present head
			System.out.print(temp.data + "->");

			if (temp.left != null) {
				q.add(temp.left);
			}
			if (temp.right != null) {
				q.add(temp.right);
			}

		}
	}

	void printReverseLevelOrder() {

		Node curr = root;
		Queue<Node> q = new LinkedList<>();
		Stack<Node> s = new Stack<>();
		q.add(curr);

		while (!q.isEmpty()) {
			curr = q.peek();
			q.poll();
			s.push(curr);

			if (curr.right != null)
				q.add(curr.right);

			if (curr.left != null)
				q.add(curr.left);

		}

		while (!s.isEmpty()) {
			curr = s.peek();
			System.out.print(curr.data + "->");
			s.pop();
		}

	}

	public static void main(String[] args) {

		Tree bt = new Tree();
		/*
		 * bt.insert(1); bt.insert(2); bt.insert(3); bt.insert(4); bt.insert(5);
		 */
		
		  bt.root = new Node(2); 
		  bt.root.left = new Node(4); 
		  bt.root.right = new Node(1); 
		  bt.root.left.left = new Node(7); 
		  bt.root.right.left = new Node(8);
		  bt.root.right.right = new Node(3);
		 

		bt.print(bt.root);
		//System.out.println("\nafter deletion");
		System.out.println("\ninorder traversal");
		// bt.delete(1);
		bt.inorder();
//		bt.insert(6);
//		bt.insert(7);
//		bt.insert(8);
		System.out.println("\npreorder traversal");
		bt.preorder(bt.root);
		System.out.println("\npost order without recursion");
		bt.preorderWithoutRecr();

		System.out.println("\npostorder traversal");
		bt.postOrder(bt.root);

		System.out.println("\nlevel order traversal");
		bt.printLevelOrder();

		System.out.println("\nlevel order traversal in reverse order");
		bt.printReverseLevelOrder();

	}

}

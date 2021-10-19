package com.peopletech.ass2;

public class LinkedListAssgn {

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	Node head;
	
	void add(int data) {
		Node toAdd = new Node(data);
		if(isEmpty()) {
			head = toAdd;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = toAdd;
		}
	}
	
	boolean isEmpty() {
		return head == null;
	}
	
	void printList() {
		if(isEmpty()) {
			System.out.println("list is empty");
		}else {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data+"-->");
				temp= temp.next;
			}
		}
	}
	
	void getOfMiddle() {
		if(isEmpty()) {
			System.out.println("list is empty");
		}else {
			Node slow = head;
			Node fast = head;
			while(fast != null && fast.next!=null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			System.out.println(slow.data);
		}
	}
	
	public static void main(String[] args) {
		
		LinkedListAssgn ll = new LinkedListAssgn();
		ll.printList();
		ll.add(98);
		ll.add(45);
		ll.add(28);
		ll.add(65);
		ll.add(41);
		ll.printList();
		System.out.println("\nmiddle of the node from the list is:");
		ll.getOfMiddle();
	}

}


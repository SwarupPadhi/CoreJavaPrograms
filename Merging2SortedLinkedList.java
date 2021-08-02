package com.coreJava;
//Asked in JPMC

public class Merging2SortedLinkedList {
	static Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
		public static void push(int new_data)
		{
		    Node new_node = new Node(new_data);
		    new_node.next = head;
		    head = new_node;
		}
	}

	public static void main(String[] args) {
		Merging2SortedLinkedList linkedList = new Merging2SortedLinkedList();
		linkedList.head = new Node(1);
		
		Node.push(2);

	}

}

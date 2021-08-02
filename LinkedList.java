package com.coreJava;
//Try to understand
public class LinkedList {
	
	Node head;
	public class Node{
		int data;
		Node next;
		Node(int newElement){
			data=newElement;
			next=null;
		}
	}
	
	public void insert(int newElement){
		Node node= new Node(newElement);
		node.next=head;
		head=node;
	}
	
	public void reverse(){
		Node prevNode = null;
		Node nextNode = null;
		Node currentNode = head;
		while(currentNode.next!=null){
			nextNode=currentNode.next;
			currentNode.next=prevNode;
			prevNode=currentNode;
			currentNode=nextNode;
		}
		head = prevNode;			
	}
	
/*	public void insertCircularLink(int newElement){
		Node node= new Node(newElement);
		node.next=head;
		head=node;
		node.next.next=head;
	}*/
	
	public void display(){
		Node tHead= head;
		while(tHead!=null){
			System.out.print(tHead.data+"->");
			tHead=tHead.next;
		}
		System.out.println("NULL");
	}
	
	public Node sort(Node a, Node b){
		Node result=null;
		if(a==null) return b;
		if(b==null) return a;
		if(a.data<b.data){
			result=a;
			result.next= sort(a.next,b);
		} else{
			result=b;
			result.next= sort(a,b.next);
		}
		return result;
	}
	
	public void sortLinkedList(){
		Node tHead=head;
		Node currentNode=head;
		Node prev=null;
		Node next=null;
		while(tHead!=null){
			if(currentNode.data>currentNode.next.data){
				next=currentNode.next;
				prev=currentNode;
				prev.next=next.next;
				
				
				
			}
		}
		
	}
	
	public static void main(String args[]){
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(9);
		list.insert(2);
		list.insert(8);
		list.insert(3);
		list.insert(0);
		list.display();
		list.reverse();
		list.display();
		//list.sort(a, b);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*Node head;
	class Node{
		int date;
		Node next;
		Node(int newNodeData){
			date=newNodeData;
			next=null;
		}
	}
	
	public void push(int newNodeData){
		Node newNode= new Node(newNodeData);
		newNode.next=head;
		head=newNode;
	}
	
	public void pop(int deleteNodeData){
		Node headNode=head;
		if(head!=null){
			while(headNode!=null){
				if(headNode.next.date==deleteNodeData){
					if(headNode.next.next==null){
						headNode.next=null;
					} else{
						headNode.next=headNode.next.next;
					}
					break;
				}
				headNode=headNode.next;
			}
		}
	}

	public void displayLinkedList(){
		Node headNode=head;
		while(headNode!=null){
			System.out.print(headNode.date+"->");
			headNode=headNode.next;
		}
		System.out.println("NULL");
	}
	
	public void displayMiddleElement(){
		Node slowPointer=head;
		Node fastPointer=head;
		
		if(head!=null){
			while(fastPointer!=null && slowPointer!=null){
				fastPointer = fastPointer.next.next;
				slowPointer=slowPointer.next;
			}
			System.out.println(slowPointer.date);
		}
		
	}
	
	public void reverseLinkedList(){
		System.out.println("\nreversing the linked list\n");
		Node prev=null;
		Node next=null;
		Node current=head;
		while(current!=null){
			
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head = prev;
		
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(1);
		list.push(4);
		list.push(3);
		list.push(2);
		
		list.displayLinkedList();
		//list.displayMiddleElement();
		//list.pop(3);
		//list.displayLinkedList();
		list.reverseLinkedList();
		list.displayLinkedList();
		
	}*/
	
	
	
	
	/*
	 * public static void main(String[] args) { LinkedList linkedList = new
	 * LinkedList();
	 * 
	 * linkedList.add(1); linkedList.add("A"); linkedList.add(2);
	 * linkedList.add("B"); linkedList.add(4, "C"); linkedList.add(0, "C");
	 * linkedList.add(1); //add to 4th index value D, if I make it more than
	 * current size it will throw Array out of bound exception linkedList.add(4,
	 * "D"); linkedList.add(3);
	 * 
	 * linkedList.addLast("X"); linkedList.addFirst("Y"); System.out.println(
	 * "Linked list : " + linkedList);
	 * 
	 * //linkedList.remove();// Remove first element //linkedList.remove();//
	 * Remove first element //linkedList.remove(2);//remove index
	 * linkedList.remove("C");//remove first occrance of value
	 * System.out.println("Linked list : " + linkedList);
	 * 
	 * 
	 * 
	 * 
	 * }
	 */

}

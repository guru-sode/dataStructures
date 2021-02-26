package com.ds.guru;

public class GurusLinkList {
	Node head;
	int size=0;
	
	public void insert(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			Node currentNode = head;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			size++;
			currentNode.next = newNode;
		}
	}
	
	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			head = newNode;
			newNode.next = temp;
			size++;
		}
	}
	
	public void insertAtIndex(int index, int data){
		Node newNode = new Node(data);
		if(index > size) {
			System.out.println("Index is larger than size");
		}
		else {
			Node currentNode = head;
			for(int i=0; i<index-1; i++) {
				currentNode = currentNode.next;
			}
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}
	}
	
	public void deleteAt(int index) {
		if(index == 0) {
			head = head.next;
		}
		else {
			Node currentNode = head;
			Node delete = null;
			for(int i=0; i<index-1; i++) {
				currentNode = currentNode.next;
			}
			delete = currentNode.next;
			currentNode.next = delete.next;
		}
	}
	
	public void showList() {
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			Node currentNode = head;
			while(currentNode.next != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next; 
			}
			System.out.println(currentNode.data);
		}
	}
}

package com.ds.guru;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GurusLinkList list = new GurusLinkList();
		list.insert(4);
		list.insert(5);
		list.insert(10);
		list.insertAtHead(2);
		list.insertAtIndex(2, 18);
		list.deleteAt(1);
		
		list.showList();
	}

}

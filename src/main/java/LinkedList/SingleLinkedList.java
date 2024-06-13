package LinkedList;

public class SingleLinkedList {

	SingleLink head;

	SingleLink tail;

	public SingleLinkedList insertAtEndSingleLinkedList(SingleLinkedList list, int data) {

		SingleLink node = new SingleLink();
		node.data = data;
		if (list.tail != null) {
			list.tail.next = node;
			list.tail = node;
		} else {
			list.head = node;
			list.tail = node;
		}
		return list;
	}

	public SingleLinkedList insertAtHeadSingleLinkedList(SingleLinkedList list, int data) {

		SingleLink node = new SingleLink();
		node.data = data;
		if (list.head != null) {
			node.next = list.head;
			list.head = node;
		} else {
			list.head = node;
			list.tail = node;
		}
		return list;
	}

	public SingleLinkedList insertAtLocationSingleLinkedList(SingleLinkedList list, int location, int data) {
		SingleLink node = new SingleLink();
		node.data = data;
		int listSize = list.sizeOfSingleLinkedList(list);
		if (list.head == null) {
			System.out.println("Empty List, addind in head");
			list.head = node;
			list.tail = node;
		} else if (location == 1 || location == 0) {
			list = list.insertAtHeadSingleLinkedList(list, data);
		} else if (location == -1 || location > listSize) {
			list = list.insertAtEndSingleLinkedList(list, data);
		} else {
			int i = 1;
			SingleLink tempNode = new SingleLink();
			tempNode = list.head;
			while (tempNode != null && i++ < location - 1) {
				tempNode = tempNode.next;
			}
			node.next = tempNode.next;
			tempNode.next = node;
		}
		return list;
	}

	public StringBuilder printSingleLinkedList(SingleLinkedList list) {
		SingleLink tempNode = new SingleLink();
		tempNode = list.head;
		int i = 0;
		StringBuilder print = new StringBuilder();
		if (list.head == null)
			return null;
		print.append("Size of list -> " + list.sizeOfSingleLinkedList(list) + "\n");
		print.append("--------------------Printing List----------------------\n");
		print.append("Head of List -> " + list.head.print() + "\n");
		print.append("Tail of List -> " + list.tail.print() + "\n");

		while (tempNode != null) {
			print.append(1 + i++ + "th Element of list->");
			print.append(tempNode.print() + "\n");
			tempNode = tempNode.next;
		}
		return print;
	}

	public int sizeOfSingleLinkedList(SingleLinkedList list) {
		int i = 1;
		SingleLink tempNode = new SingleLink();
		tempNode = list.head;
		while (tempNode.next != null) {
			tempNode = tempNode.next;
			i++;
		}
		return i;
	}
	
	public boolean searchInSingleLinkedList(SingleLinkedList list, int data) {
		SingleLink tempNode = new SingleLink();
		tempNode = list.head;
		while(tempNode!=null ) {
			if(tempNode.data == data)
				return true;
			tempNode = tempNode.next;
		}
		return false;
	}
	
	
	public SingleLinkedList deleteAtHeadSingleLinkedList(SingleLinkedList list) {
		
		if(list.head==null)
			return null; // to handle in exception
		else {
			if(list.sizeOfSingleLinkedList(list)>1)
				list.head = list.head.next;
			else {
				list.head =null;
				list.tail =null;
			}
			
		}
		return list;
	}
	
	public SingleLinkedList deleteAtEndSingleLinkedList(SingleLinkedList list) {
		if(list.head == null || list.tail == null)
			return null;//exception
		else {
			if(list.sizeOfSingleLinkedList(list)>1) {
				SingleLink temmNode = new SingleLink();
				temmNode = list.head;
				while(temmNode.next.next!=null)
					temmNode = temmNode.next;
				temmNode.next = null;
				list.tail = temmNode;
			}
			else {
				list.head =null;
				list.tail =null;
			}
		}
		return list;
	}
	
//	public SingleLinkedList delete
	

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list = list.insertAtHeadSingleLinkedList(list, 5);
		list = list.insertAtHeadSingleLinkedList(list, 7);
		list = list.insertAtHeadSingleLinkedList(list, 8);
		list = list.insertAtEndSingleLinkedList(list, 4);
		list = list.insertAtEndSingleLinkedList(list, 3);
		list = list.insertAtLocationSingleLinkedList(list, 3, 6);
		System.out.println(list.printSingleLinkedList(list));
		System.out.println("Data present in list ->"+list.searchInSingleLinkedList(list, 34));
		list = list.deleteAtHeadSingleLinkedList(list);
		System.out.println(list.printSingleLinkedList(list));
		list = list.deleteAtEndSingleLinkedList(list);
		System.out.println(list.printSingleLinkedList(list));
	}
}

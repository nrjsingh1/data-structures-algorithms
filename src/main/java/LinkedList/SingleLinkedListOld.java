package LinkedList;

public class SingleLinkedListOld {

	SingleLink head;

	SingleLink tail;//Single linkedList does not contain tail pointer


	public SingleLinkedListOld insertAtHeadSingleLinkedList(SingleLinkedListOld list, int data) {

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

	public SingleLinkedListOld insertAtEndSingleLinkedList(SingleLinkedListOld list, int data) {

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

	public SingleLinkedListOld insertAtLocationSingleLinkedList(SingleLinkedListOld list, int location, int data) {
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

	public StringBuilder printSingleLinkedList(SingleLinkedListOld list) {
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

	public int sizeOfSingleLinkedList(SingleLinkedListOld list) {
		int i = 1;
		SingleLink tempNode = new SingleLink();
		tempNode = list.head;
		while (tempNode.next != null) {
			tempNode = tempNode.next;
			i++;
		}
		return i;
	}
	
	public boolean searchInSingleLinkedList(SingleLinkedListOld list, int data) {
		SingleLink tempNode = new SingleLink();
		tempNode = list.head;
		while(tempNode!=null ) {
			if(tempNode.data == data)
				return true;
			tempNode = tempNode.next;
		}
		return false;
	}
	
	
	public SingleLinkedListOld deleteAtHeadSingleLinkedList(SingleLinkedListOld list) {
		
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
	
	public SingleLinkedListOld deleteAtEndSingleLinkedList(SingleLinkedListOld list) {
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
}

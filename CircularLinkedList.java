//this is a class

package nana;

public class CircularLinkedList {
	private static class Node {
	int data;
	Node next;
	Node(int data) { this.data = data; }
	
	}
	
	private Node last = null;

	
	public void insert(int data) {
		Node newNode = new Node(data);
		if (last == null) {
			
		last.next = last;
		
	} else {
		newNode.next = last.next;
		last.next = newNode;
		last = newNode;
		
	   }
	  
	}
	
	
	public void display() {
		if (last == null) {
		System.out.println("List is empty");
		return;			
	}
		Node temp = last.next;
		System.out.println("Circular List: ");
		do {
			  System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != last.next);
	        System.out.println();
		
			}

	
	public void delete() {
		if (last == null) {
			System.out.println("List is empty");
			return;
		}
		Node First = last.next;
		if (First == last) {
			System.out.println("Deleted: " + First.data);
			last = null;
		} else {
			System.out.println("Deleted: " + First.data);
			last.next = First.next;
			
			last.next = First.next;
			
		}
	}

}



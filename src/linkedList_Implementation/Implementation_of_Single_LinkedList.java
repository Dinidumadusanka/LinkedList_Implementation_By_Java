package linkedList_Implementation;
import java.io.*;
    
public class Implementation_of_Single_LinkedList {
	
    	Node head; 

	
		static class Node {

			int data;
			Node next;

			
			Node(int d)
			{
				data = d;
				next = null;
			}
		}



		// Method to insert a new node
		public static Implementation_of_Single_LinkedList  insert(Implementation_of_Single_LinkedList  list,
										int data)
		{
	
			Node new_node = new Node(data);
			new_node.next = null;

			
			if (list.head == null) {
				list.head = new_node;
			}
			else {
			
				Node last = list.head;
				while (last.next != null) {
					last = last.next;
				}

			
				last.next = new_node;
			}

		
			return list;
		}

		

		// Method to print the LinkedList.
		public static void printList(Implementation_of_Single_LinkedList  list)
		{
			Node currNode = list.head;

			System.out.print("\nLinkedList: ");

			
			while (currNode != null) {
			
				System.out.print(currNode.data + " ");

		
				currNode = currNode.next;
			}
			System.out.println("\n");
		}

		

		// Method to delete a node in the LinkedList by KEY
		public static Implementation_of_Single_LinkedList  deleteByKey(Implementation_of_Single_LinkedList  list,
											int key)
		{
			
			Node currNode = list.head, prev = null;

			

			if (currNode != null && currNode.data == key) {
				list.head = currNode.next; 

			
				System.out.println(key + " found and deleted");

				return list;
			}

	
			while (currNode != null && currNode.data != key) {
				
				prev = currNode;
				currNode = currNode.next;
			}

	
			if (currNode != null) {
			
				prev.next = currNode.next;

				
				System.out.println(key + " found and deleted");
			}

			
			if (currNode == null) {
				
				System.out.println(key + " not found");
			}

		
			return list;
		}

	

		// Method to delete a node in the LinkedList by POSITION
		public static Implementation_of_Single_LinkedList 
		deleteAtPosition(Implementation_of_Single_LinkedList  list, int index)
		{
			
			Node currNode = list.head, prev = null;

		

			if (index == 0 && currNode != null) {
				list.head = currNode.next; 

				
				System.out.println(
					index + " position element deleted");

				
				return list;
			}

			
			int counter = 0;

		
			while (currNode != null) {

				if (counter == index) {
				
					prev.next = currNode.next;

				
					System.out.println(
						index + " position element deleted");
					break;
				}
				else {
				
					prev = currNode;
					currNode = currNode.next;
					counter++;
				}
			}

			
		
			if (currNode == null) {
				
				System.out.println(
					index + " position element not found");
			}

		
			return list;
		}

	

		// method to create a Singly linked list with n nodes
		public static void main(String[] args)
		{
			
			Implementation_of_Single_LinkedList  list = new Implementation_of_Single_LinkedList ();

			
			list = insert(list, 10);
			list = insert(list, 20);
			list = insert(list, 30);
			list = insert(list, 40);
			list = insert(list, 50);
			list = insert(list, 60);
			list = insert(list, 70);
			list = insert(list, 80);

			
			printList(list);

		
			deleteByKey(list, 10);

			
			printList(list);

		
			deleteByKey(list, 40);

		
			printList(list);

			
			
			deleteByKey(list, 100);

			
			printList(list);

		
			deleteAtPosition(list, 0);

		
			printList(list);

			
			deleteAtPosition(list, 200);

			
			printList(list);

			
			deleteAtPosition(list, 100);

			
			printList(list);
		}
	}


	



	
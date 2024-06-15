package linkedList_Implementation;
import java.util.Scanner;
public class Implementation_of_the_stack_using_doubly_linkedlist {

	static class Node {
	        int data;
	        Node prev;
	        Node next;
	    }

	    private Node start = null;
	    private Node top = null;

	    // Check if stack is empty
	    public boolean isEmpty() {
	        return start == null;
	    }

	    // Pushes element onto stack
	    public void push(int d) {
	        Node n = new Node();
	        n.data = d;
	        if (isEmpty()) {
	            n.prev = null;
	            n.next = null;
	            start = n;
	            top = n;
	        } else {
	            top.next = n;
	            n.next = null;
	            n.prev = top;
	            top = n;
	        }
	    }

	    // Pops top element from stack
	    public void pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	        } else if (top == start) {
	            top = null;
	            start = null;
	        } else {
	            top = top.prev;
	            top.next = null;
	        }
	    }

	    // Returns top element of the stack
	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	            return -1;
	        } else {
	            return top.data;
	        }
	    }

	    // Determines the size of the stack
	    public int size() {
	        int count = 0;
	        if (!isEmpty()) {
	            Node ptr = start;
	            while (ptr != null) {
	                count++;
	                ptr = ptr.next;
	            }
	        }
	        return count;
	    }

	    // Prints all elements in the stack
	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	        } else {
	            Node ptr = start;
	            System.out.print("Stack: ");
	            while (ptr != null) {
	                System.out.print(ptr.data + " ");
	                ptr = ptr.next;
	            }
	            System.out.println();
	        }
	    }

	    // Driver code with menu-driven interface
	    public static void main(String[] args) {
	    	Implementation_of_the_stack_using_doubly_linkedlist  stack = new Implementation_of_the_stack_using_doubly_linkedlist ();
	        Scanner scanner = new Scanner(System.in);
	        int choice, value;

	        while (true) {
	            System.out.println("\nStack Operations:");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Peek");
	            System.out.println("4. Check if Empty");
	            System.out.println("5. Get Size");
	            System.out.println("6. Display Stack");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to push: ");
	                    value = scanner.nextInt();
	                    stack.push(value);
	                    break;
	                case 2:
	                    stack.pop();
	                    break;
	                case 3:
	                    System.out.printf("Top element is %d\n", stack.peek());
	                    break;
	                case 4:
	                    System.out.println("Is stack empty? " + stack.isEmpty());
	                    break;
	                case 5:
	                    System.out.printf("Size of the stack is %d\n", stack.size());
	                    break;
	                case 6:
	                    stack.display();
	                    break;
	                case 7:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice! Please try again.");
	            }
	        }
	    }
	}

 
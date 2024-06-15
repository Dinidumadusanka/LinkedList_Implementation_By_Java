package linkedList_Implementation;
import java.util.Scanner;
import static java.lang.System.exit;
public class Implement_stack_using_singly_linkedlist {


	
	    public static void main(String[] args) {
	        StackUsingLinkedList stack = new StackUsingLinkedList();
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

	class StackUsingLinkedList {
	    private class Node {
	        int data;
	        Node link;
	    }

	    private Node top;

	    StackUsingLinkedList() {
	        this.top = null;
	    }

	    public void push(int x) {
	        Node temp = new Node();
	        if (temp == null) {
	            System.out.print("\nHeap Overflow");
	            return;
	        }
	        temp.data = x;
	        temp.link = top;
	        top = temp;
	    }

	    public boolean isEmpty() {
	        return top == null;
	    }

	    public int peek() {
	        if (!isEmpty()) {
	            return top.data;
	        } else {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	    }

	    public void pop() {
	        if (top == null) {
	            System.out.print("\nStack Underflow");
	            return;
	        }
	        top = top.link;
	    }

	    public int size() {
	        int count = 0;
	        Node temp = top;
	        while (temp != null) {
	            count++;
	            temp = temp.link;
	        }
	        return count;
	    }

	    public void display() {
	        if (top == null) {
	            System.out.print("\nStack Underflow");
	            return;
	        }
	        Node temp = top;
	        while (temp != null) {
	            System.out.print(temp.data);
	            temp = temp.link;
	            if (temp != null) {
	                System.out.print(" -> ");
	            }
	        }
	        System.out.println();
	    }
	}

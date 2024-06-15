package linkedList_Implementation;
import java.util.Scanner;
public class Implementation_of_FIFOQueue_using_LinkedList<T> {
	
	    private Node<T> front;
	    private Node<T> rear;
	    private int size;

	    private static class Node<T> {
	        private T data;
	        private Node<T> next;

	        public Node(T data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    public Implementation_of_FIFOQueue_using_LinkedList() {
	        this.front = null;
	        this.rear = null;
	        this.size = 0;
	    }

	    public void enqueue(T data) {
	        Node<T> newNode = new Node<>(data);
	        if (rear == null) {
	            front = newNode;
	            rear = newNode;
	        } else {
	            rear.next = newNode;
	            rear = newNode;
	        }
	        size++;
	    }

	    public T dequeue() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        T data = front.data;
	        front = front.next;
	        if (front == null) {
	            rear = null;
	        }
	        size--;
	        return data;
	    }

	    public T peek() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        return front.data;
	    }

	    public boolean isEmpty() {
	        return front == null;
	    }

	    public int size() {
	        return size;
	    }

	    public static void main(String[] args) {
	    	Implementation_of_FIFOQueue_using_LinkedList<Integer> queue = new Implementation_of_FIFOQueue_using_LinkedList<>();

	        System.out.println("Enqueue 1, 2, 3 to the queue");
	        queue.enqueue(1);
	        queue.enqueue(2);
	        queue.enqueue(3);

	        System.out.println("Peek front element: " + queue.peek());

	        System.out.println("Dequeue one element: " + queue.dequeue());
	        System.out.println("Peek front element after dequeue: " + queue.peek());

	        System.out.println("Enqueue 4 and 5 to the queue");
	        queue.enqueue(4);
	        queue.enqueue(5);

	        System.out.println("Dequeue all elements:");
	        while (!queue.isEmpty()) {
	            System.out.println("Dequeued: " + queue.dequeue());
	        }

	        System.out.println("Queue size after dequeue all elements: " + queue.size());

	       
	    }
	}


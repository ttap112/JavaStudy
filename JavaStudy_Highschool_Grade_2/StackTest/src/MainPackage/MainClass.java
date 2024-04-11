package MainPackage;

import java.util.EmptyStackException;

class Stack<T> {
	class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data ) {
			this.data = data;
		}
	}
	
	private Node<T> top;
	
	public T pop() {
		if (top == null) {
			throw new EmptyStackException();
	}
	T item = top.data;
	top = top.next;
	return item;
}
	
public void push(T item) {
	Node<T> t = new Node<T>(item);
	t.next = top;
	top = t;
}

public T peek() {
	if (top == null) {
		throw new EmptyStackException();
	}
	return top.data;
	}

public boolean isEmpty() {
	return top == null;
}

}

public class MainClass{
public static void main(String[] args) {
	
	Stack<Integer> stack = new Stack<Integer>();
	
	for(int i=0; i<4; i++) {
		stack.push(i+1);
	}
	
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.peek());
	System.out.println(stack.pop());
	System.out.println(stack.isEmpty());
	System.out.println(stack.pop());
	System.out.println(stack.isEmpty());
	
	
	}

}
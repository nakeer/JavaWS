import java.util.Arrays;

public class Stack<E> {
	
	private int size,top =0;
	//Object[] stack;
	private E[] stack;
	
	@Override
	public String toString() {
		return "Stack [size=" + size + ", top=" + top + ", stack=" + Arrays.toString(stack) + "]";
	}

	public Stack(int size) {
		this.size = size;
		stack = (E[]) new Object[size];
	}
	
	public void push(E e) {
		if(top < size) {
			stack[top++] = e;
		}
	}
	
	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>(11);
		stack.push("hello");
		stack.push("world");
		System.out.println(stack.toString());
	}

}

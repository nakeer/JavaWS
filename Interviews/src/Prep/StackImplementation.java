package Prep;

public class StackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackX stack = new StackX(3);
		stack.add("Naven");
		stack.add(new Integer(10));
		stack.add(new Person(28,"Shilpa"));
		Person p = (Person)stack.pop();
		System.out.println(p.getName());
		stack.pop();
		System.out.println(stack.pop());
		
		
	}

}

class StackX {
	int size;
	Object[] objects;
	int top;
	
	public StackX(int maxSize) {
		size = maxSize;
		objects = new Object[maxSize];
		top = -1;
	}
	
	public void add(Object object) {
		if(top < size-1)
		objects[++top] = object;
		else
			System.out.println("exceeding the size");
	}
	
	
	public Object pop() {
		if(top >-1) {
			return objects[top--];
		}
		else {
			return null;
		}
	}
	
	
}

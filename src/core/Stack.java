package core;

public class Stack implements IStack {

	public Object arr[];
	public int size;
	public int top;
	
	public Stack(int size) {
		this.size = size;
		arr = new Object[size];
		top = -1;
	}
	
	@Override
	public boolean isEmpty() {
		if (top == -1) {
			System.out.println("Stack is Empty");
			return true;
		}
		return false;
	}
	
	@Override
	public boolean isFull() {
		if (top >= size-1) {
			System.out.println("Stack is FULL!");
			return true;
		}
		return false;
	}
	
	@Override
	public int getSize() {
		return size;
	}
	
	@Override
	public Object getTop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
            return -1;
        }
        else {
        	return arr[top];
        }
	}
	
	@Override
	public void push(int x) {
		try {
			top++;
			arr[top] = x;
		} catch (Exception e) {
			throw new IndexOutOfBoundsException(e.getMessage());
		}
	}
	
	@Override
	public void pop() {
		if (top == -1) {
			System.out.println("Stack is Empty");
			return;
		}
		
		top--;
	}
	
	@Override
	public void delete() {
		for (int i=0; i<top; i++) {
			arr[i] = null;
		}
	}

}

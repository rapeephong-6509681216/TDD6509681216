package core;

import java.util.ArrayList;

public class Stack implements IStack {
    private ArrayList<Object> stack;
    private int capacity;

    public Stack(int initialCapacity) {
        this.stack = new ArrayList<>(initialCapacity);
        this.capacity = initialCapacity;
    }

    @Override
    public boolean push(Object elm) throws PushToFullStackException {
        if (stack.size() >= capacity) {
            throw new PushToFullStackException("Stack is full");
        }
        return stack.add(elm);
    }

    @Override
    public Object pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    @Override
    public void setCapacity(int initialCapacity) {
        this.capacity = initialCapacity;
    }

    @Override
    public Object top() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

	@Override
	public Object getTop() {
	    if (stack.isEmpty()) {
	        return null;
	    }
	    return stack.get(stack.size() - 1);
	}

	@Override
	public void delete() {
	    stack.clear();
	}
}
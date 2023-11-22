package core;

public interface IStack {
	
	boolean isEmpty();
	
	boolean isFull();
	
	int getSize();
	
	void push(int x);
	
	Object getTop();
	
	void pop();
	
	void delete();
	
}
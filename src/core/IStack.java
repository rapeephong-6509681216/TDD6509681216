package core;

public interface IStack {
	
    boolean push(Object elm) throws Exception;
    
    Object pop();
    
    void setCapacity(int initialCapacity);
    
    Object top();
    
    int getSize();
    
    boolean isEmpty();
    
    Object getTop();
    
    void delete();
}
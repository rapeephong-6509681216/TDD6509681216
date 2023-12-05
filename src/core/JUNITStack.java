package core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUNITStack {
    
    @Test
    public void testEmptyInitialStack() {
        Stack s1 = new Stack(5);
        int size = s1.getSize();
        assertEquals(0, s1.getSize());
        assertTrue(s1.isEmpty());
    }

    @Test
    public void testPushElmToTop() {
        Stack s1 = new Stack(5);
        s1.push(2);
        assertEquals(1, s1.getSize());
        assertEquals(2, s1.getTop());
    }
    
    @Test
    public void  testLastInFirstOut() {
        Stack s1 = new Stack(4);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        assertEquals(4, s1.getTop());
        s1.pop();
        assertEquals(3, s1.getTop());
        s1.pop();
        assertEquals(2, s1.getTop());
        s1.pop();
        assertEquals(1, s1.getTop());
        
        s1.delete();	
    }

    @Test
    public void PushElmTolimitedSizeStack() {
        Stack s1 = new Stack(3);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        
        Exception exception = assertThrows(PushToFullStackException.class, () -> {
            s1.push(4);
        });

        assertEquals(3, s1.pop());
        assertEquals(2, s1.pop());
        assertEquals(1, s1.pop());

        String expectedMessage = "Stack is full";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
        
        s1.delete();
    }
}
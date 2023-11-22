package core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUNITStack {

	@Test
	public void  testLastInFirstOut() {
		Stack s1 = new Stack(4);
		assertTrue(s1.isEmpty());
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
		Stack s2 = new Stack(3);
		s2.push(1);
		s2.push(2);
		s2.push(3);
		assertEquals(3, s2.getTop());
		s2.pop();
		assertEquals(2, s2.getTop());
		s2.pop();
		assertEquals(1, s2.getTop());

		
		Exception exception = assertThrows(RuntimeException.class, () -> {
	        Integer.parseInt("1a");
	    });

	    String expectedMessage = "For input string";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
}

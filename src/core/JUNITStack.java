package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack();
		int size = s1.getSize();
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
	}
	public void testPushElmToTop() {
		Stack s1 = new Stack();
		s1.push(1);
		Object Top = s1.Top();
		assertFalse(s1.isFull());
		assertEquals(1, Top);
	}
	public void testLastInFirstOut() {
		Stack s1 = new Stack();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		Object Pop = s1.Pop();
		assertFalse(s1.isFull());
		assertEquals(3, Pop);
	}
}

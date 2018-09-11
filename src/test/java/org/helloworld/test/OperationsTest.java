package org.helloworld.test;
import static org.junit.Assert.*;
import org.helloworld.Operations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperationsTest {
	
	Operations op ;
	
	@Before
	public void setUp() throws Exception {
		op = new Operations();
	}

	@Test
	public void addTest() {
		int result = op.add(2,2);
		assertEquals(result , 4);
	}
	
	@Test
	public void subtractTest() {
		int result = op.subtract(4, 1);
		assertEquals(result , 3);
	}
	
	@Test
	public void mulitplyTest() {
		int result = op.multiply(10, 10);
		assertEquals(result , 100);
	}
	
	@After
	public void tearDown() {
		op = null;
	}

}

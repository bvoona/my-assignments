package demo_Testcase;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseDemo {
	DemoClass d = new DemoClass();

	@Test
	public void test() {
		assertEquals(25,d.Sum(10, 15));
	}

}

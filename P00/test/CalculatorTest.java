import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		

	}	

@Test 
public void testSubtract() {
	//Arrange
	int a = 4321;
	int b = 1234;
	
	//Act
	Calculator cal = new Calculator();
	int actual = cal.subtract(a, b);
	
	//Assert
	int expected = 3087;
	assertEquals (expected, actual);

}

@Test 
public void testMultiply() {
	//Arrange 
	int a = 10;
	int b = 5;
	
	//Act
	Calculator cal = new Calculator();
	int actual = cal.multiply(a, b);
	//Assert
	int expected = 50;
	assertEquals (expected, actual);
	
	
}

public void testDivide() {
	//Arrange 
	int a = 10;
	int b = 5;
	
	//Act
	Calculator cal = new Calculator();
	int actual = cal.divide(a, b);
	
	//Assert
	int expected = 2;
	assertEquals (expected, actual);

}
}
package org.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	private Calculator calculator;
	
	@BeforeEach
	public void beforeEach() {
		try {
			calculator = new Calculator();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("Test add operation")	
    public void testAdd() {
        float result = calculator.add(10, 5);
        assertEquals(15, result);
    }

    @Test
    @DisplayName("Test subtract operation")	
    public void testSubtract() {
    	float result = calculator.subtract(10, 5);
        assertEquals(5, result);
    }

    @Test
    @DisplayName("Test multiply operation")	
    public void testMultiply() {
    	float result = calculator.multiply(2, 5);
        assertEquals(10, result); 
    }

    @Test
    @DisplayName("Test divide operation")	
    public void testDivide() {
    	float result = 0;
		try {
			result = calculator.divide(10, 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
        assertEquals(5, result);
    }
    
    @Test
    @DisplayName("Test divide by 0")
    public void testDivideByZero() {
    	assertThrows(Exception.class,
				() -> calculator.divide(15,0),
				"Divide by 0 must throws an Exception");
    }
}

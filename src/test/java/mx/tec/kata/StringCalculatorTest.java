package mx.tec.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {
	StringCalculator sc = new StringCalculator();
	
	@Test
	void test_givenCalculator_whenAddEmptyString_then0() {
		String numbers = "";
		int expectedResult = 0;
		int actualResult = sc.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void test_givenCalculator_whenAdd1_then1() {
		String numbers = "1";
		int expectedResult = 1;
		int actualResult = sc.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void test_givenCalculator_whenAdd1Comma2_then3() {
		String numbers = "1,2";
		int expectedResult = 3;
		int actualResult = sc.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void test_givenCalculator_whenAdd_1_2_3_4_5_6_7_8_9_then45() {
		String numbers = "1,2,3,4,5,6,7,8,9";
		int expectedResult = 45;
		int actualResult = sc.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void test_givenCalculator_whenAddSlashSlashSemiColonNewLine1SemiColon2_then3() {
		String numbers = "//;\n1;2";
		int expectedResult = 3;
		int actualResult = sc.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void test_givenCalculator_whenAdd_1_Minus2_3_Minus4_5_Minus6_7_Minus8_9_thenException() {
		String numbers = "1,-2,3,-4,5,-6,7,-8,9";
		String expectedResult = "negatives not allowed -2, -4, -6, -8";
		
		try {
			sc.add(numbers);
			fail("Exception not thrown");
		}catch(UnsupportedOperationException e) {
			assertEquals(expectedResult, e.getMessage());
		}
	}

}

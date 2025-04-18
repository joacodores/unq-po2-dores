package ar.edu.unq.po2.tp3.counter;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;



import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import java.util.Arrays;


public class CounterTestCase {
	private Counter counter;
	private Counter counterB;
	
	@BeforeEach
	public void setUp() throws Exception {
		ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1,3,5,7,9,1,1,1,1,4));
		ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(123462, 76343, 14345, 32,34 ,144431));
		counter = new Counter(lista);
		counterB = new Counter(lista2);
	}
	
	
	@Test
	public void testEvenNumbers() {
		int amount = counter.getEvenOcurrences();
		
		assertEquals(amount, 1);
	}
	
	@Test
	public void testOddNumbers() {
		int amount = counter.getOddOcurrences();
		
		assertEquals(amount, 9);
	}
	@Test
	public void testMultiples() {
		int amount = counter.getMultiplesOf(3);
		
		assertEquals(amount, 2);
	}
	
	
	
	
	@Test
	public void testMostEvenDigits() {
		int theOneWithMostEvenDigits = counterB.getMostEvenDigits();
		System.out.println(theOneWithMostEvenDigits);
	}
	
	@Test 
	public void testHighestMultiple() {
		int highestMultiple = counter.highestMultipleOf_And_(3, 9);
		assertEquals(highestMultiple, 999);
	}

}

package ar.edu.unq.po2.tp3.EjFinal.Persona;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {
	
	private Persona persona1;
	private Persona persona2;
	
	@BeforeEach 
	public void setUp() throws Exception{
		persona1 = new Persona("Joaquin", "Dores", LocalDate.of(2004, 5, 22));
		persona2 = new Persona("Guadalupe", "Osso", LocalDate.of(2003, 10, 20));
	}
	
	@Test
	void testPersonaAge() {
		int age = persona1.getAge();
		int ageB = persona2.getAge();
		
		assertEquals(age, 20);
		assertEquals(ageB, 21);
		
	}
	
	void testPersonaYoungerThan() {
		assertTrue(persona1.isYoungerThan(persona2));
	}

}
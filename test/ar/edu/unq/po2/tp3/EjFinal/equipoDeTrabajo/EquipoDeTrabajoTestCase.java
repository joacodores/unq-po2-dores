package ar.edu.unq.po2.tp3.EjFinal.equipoDeTrabajo;
import ar.edu.unq.po2.tp3.EjFinal.Persona.*;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	
	private EquipoDeTrabajo equipoDeTrabajo;
	private Persona persona1;
	private Persona persona2;
	private Persona persona3;
	private Persona persona4;
	private Persona persona5;
	
	@BeforeEach
	public void setUp() throws Exception{
		persona1 = new Persona("Joaquin", "Dores", LocalDate.of(2004, 5, 22));
		persona2 = new Persona("Manuel", "Caceres", LocalDate.of(2003, 3, 31));
		persona3 = new Persona("Agustin", "Juarez", LocalDate.of(2002, 7, 2));
		persona4 = new Persona("Carmen", "Massad", LocalDate.of(1999, 1, 21));
		persona5 = new Persona("Yamila", "Martinez", LocalDate.of(1990, 11, 10));
		
		ArrayList<Persona> list = new ArrayList<>(Arrays.asList(persona1,persona2, persona3, persona4, persona5));
		equipoDeTrabajo = new EquipoDeTrabajo("Grupo3", list);
	}
	
	
	
	
	@Test
	void testAverageAge() {
		double averageAgeOfGroup = equipoDeTrabajo.averageAge();
		System.out.println("El promedio de edad del " + equipoDeTrabajo.getTeamName() + " es de " +
		averageAgeOfGroup + "años.");
	}

}

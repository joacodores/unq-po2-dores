package ar.edu.unq.po2.tp3.persona;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String name;
	private LocalDate dateOfBirth;
	
	public Persona(String n, LocalDate d) {
		this.name = n;
		this.dateOfBirth = d;
	}
	
	public int getAge() {
		LocalDate hoy = LocalDate.now();
		int age = Period.between(dateOfBirth, hoy).getYears();
		return age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public boolean isYoungerThan(Persona p) {
		return this.getAge() < p.getAge();
	}
	
	
}

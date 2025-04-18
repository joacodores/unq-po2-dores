package ar.edu.unq.po2.tp3.EjFinal.Persona;


import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String name;
	private String lastName;
	private LocalDate dateOfBirth;
	
	public Persona(String n, String ln, LocalDate d) {
		this.name = n;
		this.lastName = ln;
		this.dateOfBirth = d;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public int getAge() {
		LocalDate hoy = LocalDate.now();
		int age = Period.between(dateOfBirth, hoy).getYears();
		return age;
	}
	
	public boolean isYoungerThan(Persona p) {
		return this.getAge() < p.getAge();
	}
	
	
}
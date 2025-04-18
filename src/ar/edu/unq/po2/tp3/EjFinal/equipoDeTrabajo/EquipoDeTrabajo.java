package ar.edu.unq.po2.tp3.EjFinal.equipoDeTrabajo;
import ar.edu.unq.po2.tp3.EjFinal.Persona.*;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	private String teamName;
	private ArrayList<Persona> teamMembers; 
	
	public EquipoDeTrabajo(String teamName, ArrayList<Persona> teamMembers) {
		this.teamName = teamName;
		this.teamMembers = teamMembers;
		
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public ArrayList<Persona> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(ArrayList<Persona> teamMembers) {
		this.teamMembers = teamMembers;
	}
	
	public double averageAge() {
		double averageAge = 0;
		for(Persona p : teamMembers) {
			averageAge = averageAge + p.getAge();
		}
		averageAge = averageAge / teamMembers.size();
		return averageAge;
	}
}

package labsExercises.ejercicio5.logic;

import java.util.ArrayList;

import labsExercises.ejercicio5.entity.Persona;

public class CtrlABMCPersona {
	private ArrayList<Persona> personas; 
	
	public CtrlABMCPersona(){
		personas = new ArrayList<>();
		personas.add(new Persona("12", "Juan", "Perley", true));
	}
	
	public void createPersona(Persona p){
		personas.add(p);
	}
	
	public boolean personaExist(Persona p){
		return personas.contains(p);
	}
	
	public Persona retrievePersona(Persona p){
		for (Persona persona : personas) {
			if (persona.equals(p)){
				return persona;			
			}
		}
		return null;
	}
	
	public void updatePersona(Persona p){
		if (personaExist(p)){
			deletePersona(p);
		}
		createPersona(p);
	}

	public void deletePersona(Persona p){
		int index = personas.indexOf(p);
		personas.remove(index);	
	}
}

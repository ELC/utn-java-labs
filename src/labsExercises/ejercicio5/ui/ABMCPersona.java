package labsExercises.ejercicio5.ui;

import java.util.Scanner;

import labsExercises.ejercicio5.entity.Persona;
import labsExercises.ejercicio5.logic.CtrlABMCPersona;

public class ABMCPersona {
	
	private CtrlABMCPersona controller = new CtrlABMCPersona();
	private Scanner s;

	public void start() {
		s = new Scanner(System.in);
		
		String option = "-1";
			
		while (!option.equals("0")){
			System.out.println("Bienvenido al ABMC de Personas");
			System.out.println("�Qu� desea hacer?");
			System.out.println("1. Dar de alta una nueva persona");
			System.out.println("2. Ver los datos de una persona");
			System.out.println("3. Modificar los datos de una persona");
			System.out.println("4. Eliminar los datos de una persona");
			System.out.println("0. Salir");
			option = s.nextLine();
			clearScreen();
			handler(option);
		}
		s.close();
	}
	
	private void handler(String option){
		switch (option) {
		case "1":
			altaPersona();
			break;
		case "2":
			verPersona();
			break;
		case "3":
			modificarPersona();
			break;
		case "4":
			bajaPersona();
			break;
		default:
			break;
		}
	}
	
	private void altaPersona(){
		System.out.println("Dar de alta una persona");
		
		Persona newPersona = new Persona();
		
		System.out.println("Ingrese DNI:");
		newPersona.setDNI(s.nextLine());
		
		if (controller.personaExist(newPersona)){
			System.out.println("Ya existe una persona con ese DNI");
		}
		else {
			System.out.println("Ingrese apellido:");
			newPersona.setApellido(s.nextLine());
			
			System.out.println("Ingrese nombre:");
			newPersona.setNombre(s.nextLine());
			
			controller.createPersona(newPersona);
			
			
			System.out.println("Alta exitosa  - Presione Enter para continuar");
			s.nextLine();
			clearScreen();
		}
	}
	
	private void verPersona(){
		System.out.println("Ver la informacion de una persona");
		
		Persona newPersona = new Persona();
		
		System.out.println("Ingrese DNI:");
		newPersona.setDNI(s.nextLine());
		
		
		if (validarPersona(newPersona)){
			newPersona = controller.retrievePersona(newPersona);
			mostrarDatosPersona(newPersona);
			System.out.println("Presione Enter para continuar");
			s.nextLine();
			clearScreen();
		}
	}
	
	private void mostrarDatosPersona(Persona persona){
		System.out.println("DNI:" + persona.getDNI() + "\n");
		System.out.println("Apellido:" + persona.getApellido() + "\n");
		System.out.println("Nombre:" + persona.getNombre() + "\n");
	}
	
	private void modificarPersona(){
		System.out.println("Modificar datos de una persona");
		Persona newPersona = new Persona();
		
		System.out.println("Ingrese DNI:");
		newPersona.setDNI(s.nextLine());
		if (validarPersona(newPersona)){
			newPersona = controller.retrievePersona(newPersona);
			mostrarDatosPersona(newPersona);
			System.out.println("�Que dato desea modificar?");
			System.out.println("1. Nombre");
			System.out.println("2. Apellido");
			switch (s.nextLine()) {
			case "1":
				System.out.println("Ingrese nuevo nombre");
				newPersona.setNombre(s.nextLine());
				break;
			case "2":
				System.out.println("Ingrese nuevo apellido");
				newPersona.setApellido(s.nextLine());
			default:
				break;
			}
			
			controller.updatePersona(newPersona);
			
			
			System.out.println("Modificacion exitosa - Presione Enter para continuar");
			s.nextLine();
			clearScreen();
		}
	}

	private void bajaPersona(){
		System.out.println("Dar de baja una persona");
		Persona newPersona = new Persona();
		
		System.out.println("Ingrese DNI:");
		newPersona.setDNI(s.nextLine());
		if (validarPersona(newPersona)){
			newPersona = controller.retrievePersona(newPersona);
			System.out.println("�Esta seguro que quiere dar de baja la persona con los siguientes datos? [1=Si, 0=No]");
			mostrarDatosPersona(newPersona);
			
			if (s.nextLine().equals("1")){
				controller.deletePersona(newPersona);
				
				System.out.println("Baja exitosa - Presione Enter para continuar");
			}
			else{
				System.out.println("Baja cancelada, se ha arrepentido a tiempo - Presione Enter para continuar");
			}
			s.nextLine();
			clearScreen();
		}
	}
	
	private boolean validarPersona(Persona newPersona){		
		if (controller.personaExist(newPersona)){
			return true;
		}
		else{
			System.out.println("No existe una persona con ese DNI");
			return false;
		}
	}
	
	private void clearScreen(){
		for (int i = 0; i < 50; ++i) System.out.println();
	}

}

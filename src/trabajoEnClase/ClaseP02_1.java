package trabajoEnClase;

import java.util.ArrayList;



public class ClaseP02_1 {
	
	public static void main(String[] args){
		
	// Instanciar un objeto
	new ArrayList<Integer>();
	
	// Definir una variable
	ArrayList<Object> variable = null;
	
	// Instanciar la variable
	ArrayList<Object> instancia = new ArrayList<Object>();
	
	instancia = variable;
	variable = instancia;
	
	ArrayList <Integer> nros = new ArrayList <Integer> ();
	
	nros.add(11);
	nros.add(18);
	nros.add(1);
	
		
	show(nros);
	
	nros.add(1, 22);
	
	show(nros);
	
	nros.remove(3);
	
	show(nros);
	
	}

	private static void show(ArrayList<Integer> nros) {
		System.out.println("#################");
		
		for (Integer n : nros) {
			System.out.println(n);
		}
	}
	
	private static void mostarAlternative(ArrayList<Integer> nros) {
		for (int i=0; i <nros.size();i++){
			System.out.println(nros.get(i));
		}
	}
	
}



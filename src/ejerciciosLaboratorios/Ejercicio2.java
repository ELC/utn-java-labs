package ejerciciosLaboratorios;

import java.util.Scanner;
import ejerciciosLaboratorios.Ejercicio1;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		int number = 20;
		
		Scanner s = new Scanner(System.in);
		
		int[] nro = forma1(number, s);
		
		s.close();
		
		ejerciciosLaboratorios.Ejercicio1.show(nro);
	}
	
	public static int[] forma1(int number, Scanner s){
		int[] nroArray = new int[number];
		
		int limit = get_limit(s);
		
		boolean greater;
		int index = 0;
		
		for (int i = 0; i < number; i++) {
			
			System.out.println("Insert numbers");
			String dato = s.nextLine();
			
			greater = (Integer.parseInt(dato) > limit);
							
			if (greater) {
				nroArray[index] = Integer.parseInt(dato);
				index++;
			}
			
		}
		
		return nroArray;
		
	}
	
	private static int get_limit(Scanner s){
		System.out.println("Insert numbers");
		String limit_raw = s.nextLine();
		
		int limit = Integer.parseInt(limit_raw);
		
		return limit;
	}
}

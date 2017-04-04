package labsExercises;

//Enunciado https://github.com/utnfrrojava/java2016/blob/master/ejercicios/readme.md
import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		int number = 10;
		
		int[] numberArray = new int[number];
		
		Scanner s = new Scanner(System.in);
		
		int[] nro = forma1(numberArray, s);
		
		s.close();
		
		show(nro);
	}
	
	private static int[] forma1(int[] nroArray, Scanner s){
	
		for (int i = nroArray.length-1; i >= 0; i--) {
			System.out.println("Insert numbers");
			String dato = s.nextLine();
			nroArray[i] = Integer.parseInt(dato);
		}
		
		return nroArray;
	}
	
	
	
	static void show(int[] nros){
		for (int n : nros) {
			System.out.println(n);			
		}
	}

}

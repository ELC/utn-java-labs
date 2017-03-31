package trabajoEnClase;

public class Clase01 {
	// Fields (variables)
	// ├ De Clase (static)
	// └ De instancia

	public static void main(String[] args) {
		// public - Visibilidad
		// static - De clase
		// void - Tipo de retorno
		// main - Nombre del metodo
		int i = 10;
		int[] nros = new int[10];
		for (int j = 0; j < i; j++) {
			if (j%2==0) {
				System.out.println("Hola Mundo" + j);
			}
			nros[j] = (int)Math.pow(2, j);
		}
		for (int nro : nros) {
			System.out.println(nro);
		}
	}
	
	// methods (variables)
	// ├ De Clase (static)
	// └ De instancia
	
	// Visibilidad:
	// Public (Todo lugar que tenga acceso a la clase)
	// Private (Todo lugar dentro de la clase)
	// Package (Todo lugar dentro del paqueta)
	// Default (Tarea)
}
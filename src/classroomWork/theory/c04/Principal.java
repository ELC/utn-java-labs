package classroomWork.theory.c04;

public class Principal {

	public static void main(String[] args) {
		Movie mov1 = new Movie("Batman");
		Movie mov2 = mov1;
		
		System.out.println("El nombre de la pelicula 1 es: " + mov1.getNombre());
		
		mov2.setNombre("Superman");
		System.out.println("\nLuego de de cambiar el nombre a la pelicula 2 ");
		System.out.println("El nombre de la pelicula 1 es: " + mov1.getNombre());
		System.out.println("El nombre de la pelicula 2 es: " + mov2.getNombre());

	}

}

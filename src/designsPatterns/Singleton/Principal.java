package designsPatterns.Singleton;

public class Principal {

	public static void main(String[] args) {
		MyClass test1 = MyClass.getInstance();
		test1.setNombre("Batman ");
		System.out.println("Instancia 1: " + test1.getNombre());
		MyClass test2 = MyClass.getInstance();
		test2.setNombre("Superman ");
		MyClass test3 = test2;
		System.out.println("Instancia 1: " + test1.getNombre() + test1.hashCode());
		System.out.println("Instancia 2: " + test2.getNombre() + test2.hashCode());
		System.out.println("Instancia 3: " + test3.getNombre() + test3.hashCode());
		

	}

}

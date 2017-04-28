package designsPatterns.Singleton;

public class MyClass {
	private String nombre;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private static MyClass myself = new MyClass();
	
	private MyClass(){}
	
	public static MyClass getInstance(){
		return myself;
	}
}

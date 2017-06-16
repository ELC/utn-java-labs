package labsExercises.ejercicio5.entity;

public class Persona {
	private String nombre;
	private String apellido;
	private String DNI;
	private boolean habilitado;

	public boolean equals(Object obj){
	    if(obj instanceof Persona){
	    	return (((Persona)obj).getDNI().equals(this.getDNI()));
	    }
	    return false;
	}
	
	public Persona() {}
	
	public Persona(String dNI, String nombre, String apellido,
		boolean habilitado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dNI;
		this.habilitado = habilitado;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String i) {
		DNI = i;
	}
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

}

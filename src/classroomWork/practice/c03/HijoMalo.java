package classroomWork.practice.c03;

public class HijoMalo extends Padre {
	
	public HijoMalo(String Apellido){
		super("Hijo");
		this.setApellido(Apellido);
	}
	
	private String apellido;

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getDesc(){
		return "datos " + this.getNombre() + " " + this.getApellido();
	}
}

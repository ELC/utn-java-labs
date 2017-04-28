package labsExercises.ejercicio3;

public class EmpleadoAdministrativo extends Empleado {
	private double hsExtra;
	private double hsMes;
	
	public double getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(double hsExtra) {
		this.hsExtra = hsExtra;
	}
	public double getHsMes() {
		return hsMes;
	}
	public void setHsMes(double hsMes) {
		this.hsMes = hsMes;
	}
	
	public double getSueldo(){
		return getSueldoBase() * ((getHsExtra() * 1.5)+getHsMes()) / getHsMes();
	}
}

package classroomWork.practice.c03.ejemplo.entidades;

public class EmpleadoConComision extends Empleado {
	
	private double porcentajeComision;

	@Override
	public double getSueldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getPorcentajeComision() {
		return porcentajeComision;
	}

	public void setPorcentajeComision(double porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}

	public EmpleadoConComision(String nombre, String apellido, double sueldoBase, double importeVentas, double porcentajeComision){
		super(nombre,apellido,sueldoBase,importeVentas);
		this.setPorcentajeComision(porcentajeComision);
	}
}

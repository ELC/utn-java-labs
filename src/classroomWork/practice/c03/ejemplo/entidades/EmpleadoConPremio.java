package classroomWork.practice.c03.ejemplo.entidades;

public class EmpleadoConPremio extends Empleado {
	
	private double importePremio;
	private  double importeMinimoVentas;

	public double getImportePremio() {
		return importePremio;
	}

	public void setImportePremio(double importePremio) {
		this.importePremio = importePremio;
	}

	@Override
	public double getSueldo() {
		if (this.getImportePremio() > importeMinimoVentas){
			return this.getSueldoBase();
		}
		return 0;
	}
	
	public EmpleadoConPremio(String nombre, String apellido, double sueldoBase, double importeVentas, double importePremio){
		super(nombre,apellido,sueldoBase,importeVentas);
		this.setImportePremio(importePremio);
	}

}

package labsExercises.ejercicio3;

public class EmpleadoVendedor extends Empleado {
	private double porcenComision;
	private double totalVentas;
	public double getPorcenComision() {
		return porcenComision;
	}
	public void setPorcenComision(double porcenComision) {
		this.porcenComision = porcenComision;
	}
	public double getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(double totalVentas) {
		this.totalVentas = totalVentas;
	}
	
	public double getSueldo(){
		return getSueldoBase() + (getPorcenComision() * getTotalVentas() /100);
	}

}

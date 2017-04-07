package classroomWork.practice.c03.ejemplo.consola;

import classroomWork.practice.c03.ejemplo.entidades.*;


import java.util.ArrayList;

public class Principal{

	private static ArrayList<Empleado> emps;
	public static void main(String[] args) {
		emps = new ArrayList<Empleado>();
		cargaEmpleados();
		mostrarEmpleados();

	}
	
	private static void cargaEmpleados(){
		emps.add(new EmpleadoConComision("John","Perez",100,600,10));
		emps.add(new EmpleadoConPremio("John","Perez",300,1200,1700));
		emps.add(new EmpleadoConPremio("N","N",300,300,2000));
	}
	
	private static void mostrarEmpleados(){
		for (Empleado empleado : emps) {
			System.out.println(
					empleado.getApellido()+", "+
				    empleado.getNombre()+" tiene un sueldo de "+
					empleado.getSueldo()
					);
		}
	}
}

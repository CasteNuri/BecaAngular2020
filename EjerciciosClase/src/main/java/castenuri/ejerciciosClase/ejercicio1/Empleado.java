package castenuri.ejerciciosClase.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@ToString(exclude = "empresa")
public class Empleado {

	private Empresa empresa;
	private String name;
	private double salary;
	private int numEmpleado;
	
	
	public final void incrementSalary(double percent) {
		this.salary = this.salary*percent;
	}
	
	
	public void fire() {
		Empleado[] empleados= this.empresa.getEmpleados();
		
		for (int i = 0; i < empleados.length; i++) {
			if(empleados[i].getNumEmpleado() == this.numEmpleado) {
				empleados[i] = null;
				break;
			}
		}
		
		System.out.println("FIRED " + this.name.toUpperCase());
	}
	
	public void promote() {
		Ejecutivo ejecutivo = new Ejecutivo(this.empresa, this.name, this.salary, this.numEmpleado);
		Empleado[] empleados= this.empresa.getEmpleados();
		for (int i = 0; i < empleados.length; i++) {
			if(empleados[i].getNumEmpleado() == this.numEmpleado) {
				empleados[i] = ejecutivo;
				break;
			}
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public int getNumEmpleado() {
		return numEmpleado;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	

	
	
	
	
	
	
	
}

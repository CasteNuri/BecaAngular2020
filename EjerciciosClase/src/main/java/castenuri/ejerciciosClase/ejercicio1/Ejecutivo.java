package castenuri.ejerciciosClase.ejercicio1;

import lombok.Getter;

@Getter
public class Ejecutivo extends Empleado {
	
	private double presupuesto; 
	
	public Ejecutivo(Empresa empresa, String name, double salary, int numEmpleado) {
		super(empresa, name, salary, numEmpleado);
		
	}
	
	public void assignPresupuesto(double quantity) {
		this.presupuesto = quantity;
	}

	@Override
	public String toString() {
		return "Soy un ejecutivo";
	}

	
	
}

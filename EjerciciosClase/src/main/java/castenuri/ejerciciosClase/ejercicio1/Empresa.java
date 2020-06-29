package castenuri.ejerciciosClase.ejercicio1;

import lombok.Getter;

@Getter
public class Empresa {

	private String name;
	private int size;
	private Empleado[] empleados;
	private int contador;
	
	public Empresa(String name, int size) {
		
		this.name = name;
		this.size = size;
		empleados = new Empleado[size];
	}

	
	public void newEmpl (String name, double salary) {
		Empleado empleado = new Empleado(this, name, salary, contador);
	
		for (int i = 0; i < empleados.length; i++) {
			if(empleados[i]==null) {
				empleados[i] = empleado;
				contador++;
				break;
			}
		}
	}

	
	public Empleado getEmpleado(int emplNumber) {
		Empleado result = null;
		
		if(comp(emplNumber)) {
			result =  this.empleados[emplNumber];
		} else {
			result = null;
		}
		return result;
	}

	
	
	
	private boolean comp (int number) {
		return number < empleados.length;
	}
	
}

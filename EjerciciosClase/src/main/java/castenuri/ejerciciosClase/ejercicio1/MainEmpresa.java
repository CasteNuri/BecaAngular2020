package castenuri.ejerciciosClase.ejercicio1;

public class MainEmpresa {

	public static void main(String[] args) {
		

		Empresa empresa = new Empresa("ACME", 20);
		
		empresa.newEmpl("Pepe", 25000);
		empresa.newEmpl("Ana", 25000);
		
		System.out.println(empresa.getEmpleado(0).getName());
		System.out.println(empresa.getEmpleado(1).getName());
		
		//empresa.getEmpleado(0).fire();
		
		empresa.getEmpleado(1).promote();
		
		System.out.println(empresa.getEmpleado(0));
		System.out.println(empresa.getEmpleado(1));
		
	}

}

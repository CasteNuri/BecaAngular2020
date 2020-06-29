package castenuri.ejerciciosClase.fileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainExample {

	public static void main(String[] args) throws IOException {
		
		File file=new File("src/main/resources/diary.txt");
		
		
		System.out.println("1- Escribir diario");
		System.out.println("2- Leer diario");
		
		
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		int opcion=scanner.nextInt();
		
		if (opcion == 1) {
			System.out.println("Para dejar de escribir en tu diario escribe la palabra FIN");
			FileWriter writer= new FileWriter(file,true);
			writer.write("Hola caracola");		
			writer.close();
		}
	}

}

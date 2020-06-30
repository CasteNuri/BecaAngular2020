package castenuri.ejerciciosClase.fileWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class MainExampleIO {

	public static void main(String[] args) throws IOException {
		printMenu();
	}

	public static void printMenu() throws IOException {
		System.out.println("TU DIARIO");
		System.out.println("----------");
		System.out.println("1- Escribir diario");
		System.out.println("2- Leer diario");
		System.out.println("----------");

		option();
	}

	public static void option() throws IOException {
		File file = new File("src/main/resources/diary.txt");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();

		switch (option) {
		case 1:
			System.out.println("Para dejar de escribir en tu diario escribe la palabra FIN");
			Scanner scan = new Scanner(System.in);
			String input;
			
			SimpleDateFormat spf = new SimpleDateFormat("\n HH:mm EEEE, dd yyyy : ");
			String date = spf.format(Calendar.getInstance().getTime());
			
			String content = "";
			
			while(!(input = scan.nextLine()).equalsIgnoreCase("FIN")) {
				content = content.concat(input).concat("\n");
			}
			date = date.concat("\n").concat(content);
			
			FileWriter writer;
			try {
				writer = new FileWriter(file, true);
				writer.write(date);
				writer.close();
				main(null);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			break;
		case 2:
			FileReader fr = null;
			try {
				fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				String line = br.readLine();
				
				while (line != null) {
					line = br.readLine();
					System.out.println(line);
					if (line == null) {
						break;
					}
				}

				br.close();
				main(null);
			} catch (IOException e) {
				System.out.println(e.getMessage());
				main(null);
			}
			
			break;
		default:
			System.out.println("La opción escogida no es correcta");
			break;
		}


	}
}

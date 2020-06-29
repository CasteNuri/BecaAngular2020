package edu.es.eoi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import edu.es.eoi.service.ProductoService;

public class Main {
	
	public static Product[] content=new Product[200];
	public final static Double NUMERO_PI=3.14;
	
		
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {

		Product product1 = new Computer(1, "HP", "descripcion","Windows",800);
		Product product2 = new Television(1, "TV", "descripcion",42,500);
				
		ProductoService.printProduct(product1);	
		ProductoService.printProduct(product2);
			
		System.out.println(product1.calculatePrice()+"€");
		System.out.println(product2.calculatePrice()+"€");
			
		//Autoboxing y unboxing
		int a=0;
		double numero=5.0;
		boolean condicion=false;
	
		Integer entero= a;
		int b=entero;
	
		System.out.println(entero.toString());
		
		
		//EJERCICIOS FECHAS
		//EXERCISE !. Create a client's list and order them by birthday date
		
		Cliente cli1 = new Cliente("Pablo", new GregorianCalendar(1991, 01, 12).getTime());
		Cliente cli2 = new Cliente("Marina", new GregorianCalendar(1993, 01, 01).getTime());
		Cliente cli3 = new Cliente("Lydia", new GregorianCalendar(1995, 11, 03).getTime());
		Cliente cli4 = new Cliente("Nacho", new GregorianCalendar(1977, 12, 31).getTime());
		Cliente cli5 = new Cliente("Enzo", new GregorianCalendar(2015, 12, 30).getTime());
		Cliente cli6 = new Cliente("Aurora", new GregorianCalendar(1997, 11, 02).getTime());
		Cliente cli7 = new Cliente("Juan", new GregorianCalendar(1992, 12, 02).getTime());
		Cliente cli8 = new Cliente("Sergio", new GregorianCalendar(1991, 01, 12).getTime());
		Cliente cli9 = new Cliente("Ana", new GregorianCalendar(1993, 12, 12).getTime());
		Cliente cli10 = new Cliente("Carlos", new GregorianCalendar(1986, 06, 06).getTime());
		 
		List<Cliente> clientes = new ArrayList<Cliente> ();
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		clientes.add(cli4);
		clientes.add(cli5);
		clientes.add(cli6);
		clientes.add(cli7);
		clientes.add(cli8);
		clientes.add(cli9);
		clientes.add(cli10);
		
		
		Collections.sort(clientes, new Comparator<Cliente>() {
			public int compare (Cliente o1, Cliente o2) {
				return o1.getBirth().compareTo(o2.getBirth());
			}
		});
		
		clientes.stream().forEach(System.out::println);
		
		
		//EXERCISE 2. Make a method that calculates the difference between birth of two people. 

		System.out.println(getDiasDiferencia(cli1, cli2));
		
		//EXERCISE 3. Using Calendar how to express to a person that his birthday next year is on weekend.
		
		Calendar cal = new GregorianCalendar(2020, cli1.getBirth().getMonth(), cli1.getBirth().getDay());
		
		if(cal.get(Calendar.DAY_OF_WEEK)==5 || cal.get(Calendar.DAY_OF_WEEK)==6) {
			System.out.println("Tu pr�ximo cumple cae en finde" + cal.get(Calendar.DAY_OF_WEEK) + "," + cal.get(Calendar.MONTH));
		
		
		//SIMPLE DATE FORMAT
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			String date = "01/07/2024";
			
			Date date1 = sdf.parse(date);
			
			Calendar myCalendar = new GregorianCalendar();
			myCalendar.setTime(date1);
			
			Date date2 = new GregorianCalendar(2018, 01, 06).getTime();
			
			System.out.println(sdf.format(date2));
		
		
		}
	}

	
	public static long getDiasDiferencia(Cliente cli1, Cliente cli2) {
		return TimeUnit.DAYS.convert(cli1.getBirth().getTime() - cli2.getBirth().getTime(), TimeUnit.MILLISECONDS);
	}
}

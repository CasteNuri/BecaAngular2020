package edu.es.eoi;

import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsMain {

	public static void main(String[] args) {

		// Exercise 1

		String string1 = "Esto es una prueba";
		System.out.println(string1.toUpperCase());

		// Exercise 2

		String string2 = "La clase String tiene varios métodos, muy útiles, como saber su longitud, trocear la cadena, etc";
		String[] sentences = string2.split(",");
		for (int i = 0; i < sentences.length; i++) {
			System.out.println(sentences[i]);
		}

		// Exercise 3

		String string3 = "Esto es un ejemplo usado para determinar un indice";
		System.out.println(string3.indexOf("ejemplo"));

		// Exercise 4

		System.out.println(showDate("04/11/2016"));

		// Exercise 5

		String text = "La Curiosidad Resucitó al Gato.\r\n" + 
				"Andaba sopesando las ventajas de ser un gato cuando un ser curioso me observaba desde el exterior de mi caleidoscopio. Sólo podía ver su gran ojo a través de la lente y, entonces, la hizo girar.\r\n" + 
				"El mundo se deshizo en laberintos de ilusiones ópticas que flotaban a mi alrededor. Mil figuras abstractas, una tras otra, se fundían. Formas misteriosas que invocaban a mis fantasmas del recuerdo por callejones sin salida.\r\n" + 
				"Aturdida, caí de bruces contra la nada y un estado febril me invadió hasta mis recónditos adentros. Esta vez sabía que no podía escapar y presencié mi propia muerte hasta resucitar cual felino.";
		
		Map<String,Integer> letters = getLetterOcur(text, Arrays.asList("a", "e", "i", "o", "u"));
		
		for (String letter : letters.keySet()) {
			System.out.println("Tengo " + letters.get(letter) + " " + letter);
		}
	}

	static String showDate(String date) {
		Integer day = Integer.valueOf(date.substring(0, date.indexOf("/", 1)));
		Integer month = Integer.valueOf(date.substring(date.indexOf("/", 1) + 1, date.lastIndexOf("/")));
		Integer year = Integer.valueOf(date.substring(date.lastIndexOf("/") + 1));

		return "Es el " + day + " , de " + Month.of(month) + " del " + year;
	}
	
	
	static Map<String, Integer> getLetterOcur(String text, List<String> letters) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer> ();
		
		for(String letter : letters) {
			int count = counting(letter, text);
			map.put(letter, count);
		}
		return map;
	}
	
	
	
	
	public static int counting(String letter, String text) {
		Pattern pattern = Pattern.compile("[^"+letter+"]"+letter);
		Matcher matcher = pattern.matcher(text);
		int c = 0;
		while (matcher.find()) {
			c++;
		}
		return c;
	}
}

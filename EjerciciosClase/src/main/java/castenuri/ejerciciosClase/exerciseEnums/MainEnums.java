package castenuri.ejerciciosClase.exerciseEnums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class MainEnums {

	public static void main(String[] args) {

		List<Alumno> listaAlumnos = new ArrayList<Alumno>();

		for (int i = 0; i < 10; i++) {
			Alumno a = new Alumno();
			a.setNombre("Alumno ".concat(String.valueOf(i + 1)));
			listaAlumnos.add(a);
		}

		// listaAlumnos.stream().forEach(a -> System.out.println(a.getNombre()));

		// Generating a random qualification for every single mate

		for (Alumno alumno : listaAlumnos) {
			Integer nota = new Random().nextInt(10);

			if (nota.equals(CalificacionesEnum.SOBRESALIENTE.getNotaMin())
					|| nota.equals(CalificacionesEnum.SOBRESALIENTE.getNotaMax())) {
				alumno.setCalificacion(CalificacionesEnum.SOBRESALIENTE);
			} else if (nota.equals(CalificacionesEnum.NOTABLE.getNotaMin())
					|| nota.equals(CalificacionesEnum.NOTABLE.getNotaMax())) {
				alumno.setCalificacion(CalificacionesEnum.NOTABLE);
			} else if (nota.equals(CalificacionesEnum.BIEN.getNotaMin())
					|| nota.equals(CalificacionesEnum.BIEN.getNotaMax())) {
				alumno.setCalificacion(CalificacionesEnum.BIEN);
			} else if (nota.equals(CalificacionesEnum.SUFICIENTE.getNotaMin())
					|| nota.equals(CalificacionesEnum.SUFICIENTE.getNotaMax())) {
				alumno.setCalificacion(CalificacionesEnum.SUFICIENTE);
			} else {
				alumno.setCalificacion(CalificacionesEnum.INSUFICIENTE);
			}
		}

		// We print all qualifications without any order
		System.out.println("SIN ORDEN");
		listaAlumnos.stream()
				.forEach(a -> System.out.println(a.getNombre() + ", calificacion: " + a.getCalificacion()));

		// Ordering qualifications from top to bottom.
		Collections.sort(listaAlumnos, new Comparator<Alumno>() {
			@Override
			public int compare(Alumno o1, Alumno o2) {

				return o1.getCalificacion().compareTo(o2.getCalificacion());
			}
		});
		System.out.println("-------------------------------------");
		System.out.println("ORDEN DESCENDENTE");
		listaAlumnos.stream()
				.forEach(a -> System.out.println(a.getNombre() + ", calificacion: " + a.getCalificacion()));

		// Ordering qualifications from bottom to top.
		Collections.sort(listaAlumnos, new Comparator<Alumno>() {
			@Override
			public int compare(Alumno o1, Alumno o2) {

				return o2.getCalificacion().compareTo(o1.getCalificacion());
			}
		});
		System.out.println("-------------------------------------");
		System.out.println("ORDEN ASCENDENTE");
		listaAlumnos.stream()
				.forEach(a -> System.out.println(a.getNombre() + ", calificacion: " + a.getCalificacion()));

		// Now we want to filter how many students we have from any qualification
		System.out.println("Alumnos con Sobresaliente: " + listaAlumnos.stream().filter(a-> a.getCalificacion().equals(CalificacionesEnum.SOBRESALIENTE)).count());
		System.out.println("Alumnos con notable: " + listaAlumnos.stream().filter(a-> a.getCalificacion().equals(CalificacionesEnum.NOTABLE)).count());
		System.out.println("Alumnos con bien: " + listaAlumnos.stream().filter(a-> a.getCalificacion().equals(CalificacionesEnum.BIEN)).count());
		System.out.println("Alumnos con suficiente: " + listaAlumnos.stream().filter(a-> a.getCalificacion().equals(CalificacionesEnum.SUFICIENTE)).count());
		System.out.println("Alumnos con insuficiente: " + listaAlumnos.stream().filter(a-> a.getCalificacion().equals(CalificacionesEnum.INSUFICIENTE)).count());
	}

}

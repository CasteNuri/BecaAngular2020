package castenuri.ejerciciosClase.exerciseEnums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CalificacionesEnum {

	SOBRESALIENTE(9,10),
	NOTABLE(7,8),
	BIEN(6,6),
	SUFICIENTE(5,5),
	INSUFICIENTE(0,4);
	
	private int notaMin;
	private int notaMax;
}

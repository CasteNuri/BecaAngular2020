package edu.es.eoi;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cliente {

	
	private String name;
	private Date birth;
	
	@Override
	public String toString() {
		return "Cliente [name=" + name + ", birth= year " + birth.getYear() +", month: " +  birth.getMonth() + ", day " + birth.getDay()  + "]";
	}
	
	
	
}

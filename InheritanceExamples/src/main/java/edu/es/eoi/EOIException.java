package edu.es.eoi;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EOIException extends Exception {

	private static final long serialVersionUID = 1L;

	private Date time;
	
	
	public EOIException(String message, Date time) {
		super(message);
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "EOIException [time=" + time + ",getMessage()=" + getMessage() + "]";
	}
}

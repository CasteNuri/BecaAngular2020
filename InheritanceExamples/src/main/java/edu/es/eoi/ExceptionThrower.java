package edu.es.eoi;

import java.util.Calendar;

public class ExceptionThrower {

	
	//class which throws the EOIExceptions
	
	public void doSomething() throws EOIException {
		throw new EOIException("He lanzado un error", Calendar.getInstance().getTime());
	}
}

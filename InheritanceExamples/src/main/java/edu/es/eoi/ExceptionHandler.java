package edu.es.eoi;

public class ExceptionHandler {

	
	//method that generates exceptions and we capture them here
	
	void callDoSomething() {
		ExceptionThrower t = new ExceptionThrower();
		
		try {
			t.doSomething();
		} catch (EOIException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}

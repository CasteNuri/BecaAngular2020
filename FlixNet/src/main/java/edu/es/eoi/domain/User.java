package edu.es.eoi.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends Person {
	
	private String username;
	private String password;
	private String iban;
	private Suscription suscription;
	private List<Profile> profiles;
	private Wishlist wishList;
	
	
	
	

}

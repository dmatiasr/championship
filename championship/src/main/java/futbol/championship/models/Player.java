package futbol.championship.models;

import java.util.UUID;

public class Player {
	private String id;
	private String name;
	private String lastname;
	private String dni;
	
	public Player(String n, String lastname, String dni){
		this.id= UUID.randomUUID().toString();
		this.name=n;
		this.lastname=lastname;
		this.dni=dni;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "Player name=" + name;
	}
	
	


}

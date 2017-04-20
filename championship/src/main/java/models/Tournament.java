package models;

import java.util.List;
import java.util.UUID;

public class Tournament {
	private String id;
	private String name;
	private List<Zone> zones;
	
	public Tournament(String n, List<Zone> z){
		this.id = UUID.randomUUID().toString();
		this.name = n;
		zones= z;
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

	public List<Zone> getZones() {
		return zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}

	@Override
	public String toString() {
		return "Tournament [id=" + id + ", name=" + name + ", zones=" + zones
				+ "]";
	}
	
	
}

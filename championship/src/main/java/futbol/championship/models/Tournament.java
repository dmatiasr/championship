package futbol.championship.models;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import futbol.championship.utilities.Pair;

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
	/**
	 * 
	 * @return List of List for zone of team vs teams.
	 */
	public List< List <Pair <Team, Team>> > generateTournt(){
		
		List< List <Pair <Team, Team>> > tourn = new LinkedList <List <Pair <Team, Team> > >();
		for (int i = 0; i < zones.size(); i++) {
		 tourn.add( zones.get(i).generateMatchs());
		}
		
		return tourn;
	}
	
	

	
	

	@Override
	public String toString() {
		return "Tournament [name=" + name + ", zones=" + zones
				+ "]";
	}
	
	
}

package futbol.championship.models;

import java.util.List;
import java.util.UUID;

import futbol.championship.Match;
import futbol.championship.utilities.Pair;

public class Zone {
	private String id;
	private String name;
	private String location;
	private List<Team> teams;
	private Match match;
	
	public Zone(String n, String location, List<Team> tms){
		this.id = UUID.randomUUID().toString();
		this.name=n;
		this.location=location;
		this.teams=tms;
		match = new Match(tms);
	}
	/**
	 * 
	 * @return List (Team, Team) 
	 */
	public List<Pair<Team, Team>> generateMatchs(){
		
		return this.match.matcher();
	
	}

}

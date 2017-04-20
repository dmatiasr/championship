package models;

import java.util.List;
import java.util.UUID;

public class Team {
	private String id;
	private String name;
	private List<Player> players;
	private Zone zone;
	private int maxPlayers;
	public Team (){
		
	}
	public Team(String n, List<Player> pl, Zone z, int maxs){
		this.id = UUID.randomUUID().toString();
		this.name= n;
		this.players = pl;
		this.zone=z;
		this.maxPlayers=maxs;
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
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", players=" + players
				+ ", zone=" + zone + "]";
	}
}

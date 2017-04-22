package futbol.championship.models;

import java.util.List;
import java.util.UUID;

public class Team {
	private String id;
	private String name;
	private List<Player> players;
	public Team (){
		
	}
	public Team(String n, List<Player> pl){
		this.id = UUID.randomUUID().toString();
		this.name= n;
		this.players = pl;
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

	@Override
	public String toString() {
		return "Team name=" + name + ", players=" + players;
	}
}

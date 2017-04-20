package futbol.championship;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import futbol.championship.utilities.Pair;
import models.Team;

public class Match {
	private List<Team> teams;
	private int countTeams;
	
	public Match(List<Team> tms){
		this.teams= tms;
		countTeams= tms.size();
	
	}
	/**
	 * precondition : teams list must containing pair number of teams
	 * for not pairs number teams another treatment is performed 
	 * @return list of matchs
	 */
	public List<Pair<Team,Team>> matcher(){
		
		List<Pair<Team,Team>> matchs = new LinkedList<Pair<Team,Team>>();
		if (teams.size() % 2 == 0  ){ //if pair
			for (int i = 0; i < teams.size(); i++) {
				Pair p = new Pair();
				
				Team t = this.randomizer(teams);
				p.setFirst(t);
				teams.remove(t);
				
				Team t2 = this.randomizer(teams);
				p.setSnd(t2);
				teams.remove(t2);
				
				matchs.add(p);
			}
		}		
		return matchs;
	}
	
	/**
	 * 
	 * @param teams
	 * @return random team
	 */
	private Team randomizer( List<Team> teams){
		return teams.get(new Random().nextInt(teams.size()));
	}
	
	
	
}

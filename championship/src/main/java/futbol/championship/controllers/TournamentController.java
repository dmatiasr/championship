package futbol.championship.controllers;

import java.util.List;

import futbol.championship.models.Team;
import futbol.championship.models.Tournament;
import futbol.championship.models.Zone;

public class TournamentController {
	private Tournament tment;
	

	public boolean create(String nameT, List<Zone> zones){
		tment = new Tournament(nameT,zones);	
		return false;
	}
}

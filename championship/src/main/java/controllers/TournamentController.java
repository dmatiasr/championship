package controllers;

import java.util.List;

import models.Tournament;
import models.Zone;

public class TournamentController {
	private Tournament tment;
	public boolean create(String name, List<Zone> zones){
		tment = new Tournament(name,zones);
		
		return false;
	}
}

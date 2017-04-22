package futbol.championship;

import java.util.LinkedList;
import java.util.List;

import futbol.championship.models.Player;
import futbol.championship.models.Team;
import futbol.championship.models.Zone;
import futbol.championship.utilities.Pair;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        //Create players
    	Player p1 = new Player("p1","p1","3232323232");
    	Player p2 = new Player("p2","p2","377777777");
    	Player p3 = new Player("p3","p3","000000000" );
    	Player p4 = new Player("p4","p4","1111111111");
    	Player p5 = new Player("p5","p5","22222222");
    	Player p6 = new Player("p6","p6","333333332");
    	Player p7 = new Player("p7","p7","4444444232");
    	Player p8 = new Player("p8","p8","555555555232");
    	Player p9 = new Player("p9","p9","66666662");
    	Player p10 = new Player("p10","p10","32777777" );
    	Player p11= new Player("p11","p11","345345345");
    	Player p12 = new Player("p12","p12","323657567562");
    	
    	List<Player> t1 = new LinkedList<Player>();
    	t1.add(p1);
    	t1.add(p2);
    	t1.add(p3);
    	
    	List<Player> t2 = new LinkedList<Player>();
    	t2.add(p4);
    	t2.add(p5);
    	t2.add(p6);
    	
    	List<Player> t3 = new LinkedList<Player>();
    	t3.add(p7);
    	t3.add(p8);
    	t3.add(p9);
    	
    	List<Player> t4 = new LinkedList<Player>();
    	t4.add(p10);
    	t4.add(p11);
    	t4.add(p12);
    	
    	Team tm1 = new Team("T1",t1);
    	Team tm2 = new Team("T2", t2);
    	Team tm3 = new Team("T3", t3);
    	Team tm4 = new Team("T4", t4);
    	
    	List<Team> tms = new LinkedList<Team>();
    	tms.add(tm1);
    	tms.add(tm2); 
    	tms.add(tm3);
    	tms.add(tm4);
    	
    	Zone zone1 = new Zone("Zona de la muerte","SAO",tms);
    	List<Pair<Team, Team>> partidos= zone1.generateMatchs();
    	
    	for (int i = 0; i < partidos.size(); i++) {
			System.out.println(partidos.get(i).toString() );
		}
    	
   
    }
    
}

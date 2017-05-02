/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1game;

/**
 *
 * @author coni
 */
public class Formula1Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // wähle Player-Anzahl, Fahrer, Team
        
        Season season = new Season();
        
        season.prepareSeason();
                    
        // for(race: races{...
        // loop durch alle Races/Tracks
            //setup vor jedem Race, Strategie
        Race.doRace();
          
        //
        //Zu Saison-Ende Punktewertung anzeigen
        season.endSeason();
   
        
    }
    
}

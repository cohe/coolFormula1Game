/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1game;

import static formula1game.Season.getDriverName;
import static formula1game.Season.getDriverNation;
import java.util.ArrayList;

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
        
        
        Season.generateSeason();
        
        
        
        int numberOfPlayers = Season.selectNumberOfPlayers();     
        Season.chooseDrivers(numberOfPlayers);
        
        
        // for(race: races{...
        // loop durch alle Races/Tracks
            //setup vor jedem Race, Strategie
        Race.doRace();
        
        
        
        
        //
        //Punktewertung anzeigen
        Season.endSeason();

        
        
    }
    
}

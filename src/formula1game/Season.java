/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1game;

import java.util.ArrayList;

/**
 *
 * @author coni
 */
public class Season {
      
    protected ArrayList<Driver> driverList = new ArrayList<>();
    protected ArrayList<Track> trackList = new ArrayList<>();
    int numberOfPlayers;
    
    protected void prepareSeason(){
        createSeasonData();  
        chooseDrivers();
    }
     
    protected void createSeasonData(){ 
        createDriverData();  
        createTrackData();        
    }    
    
    protected void createDriverData(){
        Common.print("Erstelle Fahrerlager...");
        createDrivers();
        Common.print("Alle Fahrer erstellt:");
        for(Driver driver: driverList){
           Common.print1(driver.getDriverName()+ " (" + driver.getDriverNation() + ")");
        }
    }
    
        protected void createTrackData(){
        Common.print("Erstelle Rennstrecken...");
        createTracks();
        Common.print("Alle Strecken erstellt:");
        for(Track track: trackList){
           Common.print1(track.getTrackName() + " (" + track.getTrackRounds() + " Runden)" + ", " + track.getWeather());
        }
    }
    
    
    protected void createDrivers(){ 
        Driver driver1 = new Driver("Nicki Lauda", "AUT");
        Driver driver2 = new Driver("Ayrton Senna", "BRA");
        Driver driver3 = new Driver("Michael Schumacher", "GER");
        Driver driver4 = new Driver("Heinz-Harald Frentzen", "GER");
        Driver driver5 = new Driver("Ralf Schumacher", "GER");
        Driver driver6 = new Driver("Sebastian Vettel", "GER");
        Driver driver7 = new Driver("Mika Häkkinen", "FIN");
        Driver driver8 = new Driver("David Coulthard", "GBR");
        Driver driver9 = new Driver("Alain Prost", "FRA");
        Driver driver10 = new Driver("Jaques Villeneuve", "CAN");
        Driver driver11 = new Driver("Damon Hill", "GBR");
        Driver driver12 = new Driver("Jack Brabham", "AUS");
        Driver driver13 = new Driver("Nelson Piquet", "BRA");
        Driver driver14 = new Driver("Nigel Mansell", "BRA");
        Driver driver15 = new Driver("Fernando Alosno", "ESP");
        Driver driver16 = new Driver("Jenson Button", "GBR");
        Driver driver17 = new Driver("Emmerson Fittipaldi", "BRA");
        Driver driver18 = new Driver("Juan-Manuel Fangio", "ARG");
        Driver driver19 = new Driver("Lewis Hamilton", "GBR");
        Driver driver20 = new Driver("Nico Rosberg", "GER");            
        
        driverList.add(driver1);
        driverList.add(driver2);
        driverList.add(driver3);
        driverList.add(driver4);
        driverList.add(driver5);
        driverList.add(driver6);
        driverList.add(driver7);
        driverList.add(driver8);
        driverList.add(driver9);
        driverList.add(driver10);
        driverList.add(driver11);
        driverList.add(driver12);
        driverList.add(driver13);
        driverList.add(driver14);
        driverList.add(driver15);
        driverList.add(driver16);
        driverList.add(driver17); 
        driverList.add(driver18);
        driverList.add(driver19);
        driverList.add(driver20);
    }
    
    protected void createTracks(){ 
        Track track1 = new Track("Melbourne Albert Park Circuit", 5.303, 16, 1);
        Track track2 = new Track("Suzuka International Racing Course", 5.807 , 17, 2);
        Track track3 = new Track("Sao Paolo Interlagos", 4.309 , 15, 2);
        Track track4 = new Track("Mexiko-City Autodromo Hermanos Rodriguez", 4.313, 17, 1);
        Track track5 = new Track("Austin Circuit of the Americans", 5.516 , 20, 1);
        Track track6 = new Track("Indianapolis Motor Speedway", 4.195, 16, 1);
        Track track7 = new Track("Singapur Marina Bay Street Circuit", 5.067 ,23, 2);
        Track track8 = new Track("Sepang International Circuit", 5.543, 15, 2);
        Track track9 = new Track("Zandvoort Circuit Park", 4.252, 13, 2);
        Track track10 = new Track("Les Mans Circuit des 24 Heurs", 13.629, 38, 2);
        Track track11 = new Track("Silverstone Circuit", 5.901, 18, 2);
        Track track12 = new Track("Spa-Franchorchamps Circuit", 7.004, 21, 1);
        Track track13 = new Track("Budapest Hungaro-Ring", 4.381, 14, 2);   
        Track track14 = new Track("Barcelona Circuit de Montjuic", 3.791, 16, 1);
        Track track15 = new Track("Imola Autodromo Enzo e Dino Ferrari", 4.959, 17, 1);
        Track track16 = new Track("Monza Autodoma Nazionale", 5.783, 10, 1);
        Track track17 = new Track("Monte Carlo Circuit de Monaco", 3.34, 18, 2);
        Track track18 = new Track("Spielberg Österreich-Ring", 4.318, 8, 2);
        Track track19 = new Track("Hockenheim-Ring", 4.574, 17, 1);
        Track track20 = new Track("Nürburg-Ring", 5.148, 16, 2);            
        
        trackList.add(track1);
        trackList.add(track2);
        trackList.add(track3);
        trackList.add(track4);
        trackList.add(track5);
        trackList.add(track6);
        trackList.add(track7);
        trackList.add(track8);
        trackList.add(track9);
        trackList.add(track10);
        trackList.add(track11);
        trackList.add(track12);
        trackList.add(track13);
        trackList.add(track14);
        trackList.add(track15);
        trackList.add(track16);
        trackList.add(track17); 
        trackList.add(track18);
        trackList.add(track19);
        trackList.add(track20);
    }
    
    protected int selectNumberOfPlayers(){
        Common.print("Spieleranzahl: ");
        int number = 2; // toDo: Zuweisung durch Eingabe
        return number;
    }
    
    protected void chooseDrivers(){
        for(int i=0; i < numberOfPlayers; i++){
            Common.print("Player.name Fahrer wählen: ");
        }
    }
    
    protected void endSeason(){
        Common.print("Saison ist zu Ende.");
        Common.print("Abschlusswertung: ");
        
        for(Driver driver: driverList){
           Common.print1(driver.getSeasonPosition() + ". " + driver.getDriverName()+ ": " + driver.getDriverPoints() + " Punkte");
        }
  
    }
       
}

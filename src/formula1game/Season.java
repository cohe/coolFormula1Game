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
   
    ArrayList<Driver> drivers = new ArrayList<>();
    
    public static void generateSeason(ArrayList drivers){
        Common.print("Erstelle Fahrerlager...");
        
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
        
        Common.print("Alle Fahrer erstellt:");
        
        
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        drivers.add(driver4);
        drivers.add(driver5);
        drivers.add(driver6);
        drivers.add(driver7);
        drivers.add(driver8);
        drivers.add(driver9);
        drivers.add(driver10);
        drivers.add(driver11);
        drivers.add(driver12);
        drivers.add(driver13);
        drivers.add(driver14);
        drivers.add(driver15);
        drivers.add(driver16);
        drivers.add(driver17); 
        drivers.add(driver18);
        drivers.add(driver19);
        drivers.add(driver20);
        
        for(Driver driver: drivers){
           Common.print(getDriverName(driver)+ " ("+ getDriverNation(driver) + ")" + " (" + driver.getDriverType() + ")");
        }

    }
    
    public static String getDriverName(Driver driver){
        return driver.name;
    }
    
    public static String getDriverNation(Driver driver){
        return driver.nation;
    }
    
    public static int selectNumberOfPlayers(){
        Common.print("Spieleranzahl: ");
        int number = 2; // toDo: Zuweisung durch Eingabe
        return number;
    }
    
    public static void chooseDrivers(int number){
        for(int i=0; i < number; i++){
            Common.print("Player.name Fahrer wählen: ");
        }
    }
    
    public static void endSeason(){
        Common.print("Saison ist zu Ende.");
        Common.print("Abschlusswertung: ");
        
        
        
    }
    
    
    
}

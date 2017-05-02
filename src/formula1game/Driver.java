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
public class Driver {
    String name;
    String nation;
    String likeWeather;
    String hateWeather;
    boolean ki = true;
    
    double stamina;
    int points;
    
    Driver(String nam, String nat){
        this.name = nam;
        this.nation= nat;
    }
    
    public String getDriverType(){
        if(this.ki){
            return "KI";
        }
        else{
            return "Spieler";
        }
        
    }
    
    
}

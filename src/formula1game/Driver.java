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
    
    private final String name;
    private final String nation;
    private String likeWeather;
    private String hateWeather;
    private boolean ki = true;
    
    protected double stamina;
    protected int points;
    protected int seasonPosition;
    
    Driver(String s1, String s2){
        this.name = s1;
        this.nation= s2;
        this.stamina = 100.0;
        this.seasonPosition = 1;
    }
    
    public String getDriverName(){
        return this.name;
    }
    
     public String getDriverNation(){
        return this.nation;
    }
     
    public int getDriverPoints(){
        return this.points;
    }
    
    public int getSeasonPosition(){
        return this.seasonPosition;
    }
      
    public String getDriverType(){
        if(this.ki){
            return "KI";
        }
        else{
            return "Spieler";
        }
    }
    
    public void setDriverTypeToHuman(){
        this.ki = false;
    }
    
}

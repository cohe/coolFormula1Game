/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1game;

import java.util.Random;

/**
 *
 * @author coni
 */
public class Track {
    private final String name;
    private final int weatherType;
    private String weather;
    private final double length;
    private final int curves;
    private final int rounds;
    
    Track(String s1, double d1, int i1, int wT){
        this.name = s1;
        this.length =  d1;
        this.curves = i1;
        this.rounds = 300/(int)this.length;
        this.weatherType = wT;
        this.weather = getRandomWeather(wT);    
        
    }
    
    public String getTrackName(){
        return this.name;
    }    

    public double getTrackLength(){
        return this.length;
    }  

    public int getTrackCurves(){
        return this.curves;
    }  

    public int getTrackRounds(){
        return this.rounds;
    }

    public String getWeather() {
        return this.weather;
    }

    private String getRandomWeather(int wT){
     if (this.weatherType==1){
            switch (Common.getRandomNumber(3)) {
                case 0:
                    this.weather = "sonnig";
                    break;
                case 1:
                    this.weather = "bewölkt";
                    break;
                default:
                    this.weather = "leicht regnerisch";
                    break;
            }
        }
        else{
            switch (Common.getRandomNumber(3)) {
                case 0:
                    this.weather = "trocken";
                    break;
                case 1:
                    this.weather = "leicht regnerisch";
                    break;
                default:
                    this.weather = "sehr regnerisch";
                    break;
            }
        }
        return weather;
    }

}
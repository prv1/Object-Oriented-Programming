/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demohorses;

/**
 *
 * @author phillip389
 */
public class RaceHorse extends Horse {
    private int races;
    
    public void setRaces(int r){
        this.races = r;
    }
    
    public int getRaces(){
        return races;
    }
}

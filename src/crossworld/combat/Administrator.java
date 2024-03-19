/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crossworld.combat;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davidmizrahi
 */
public class Administrator extends Thread{
    
    private Semaphore sem;
    
    private Studio regularShow;
    
    private Studio avatar;
    
    private Character character;
    
    private ArtificialIntelligence ai;
    
    private int cycle_counter;
    
    public Administrator(){};
    
    public Administrator(Studio regularShow, Studio avatar, ArtificialIntelligence ai, Semaphore sem) {
        
        this.sem = sem;
        
        this.character = character;
        
        this.regularShow = regularShow;
        
        this.avatar = avatar;
        
        this.ai = ai;
        
        this.cycle_counter = 0;
        
        
    }

    public ArtificialIntelligence getAi() {
        return ai;
    }

    public void setAi(ArtificialIntelligence ai) {
        this.ai = ai;
    }

    public Semaphore getSem() {
        return sem;
    }

    public int getCycle_counter() {
        return cycle_counter;
    }

    public void setCycle_counter(int cycle_counter) {
        this.cycle_counter = cycle_counter;
    }
    

    public void setSem(Semaphore sem) {
        this.sem = sem;
    }

    public Studio getRegularShow() {
        return regularShow;
    }

    public void setRegularShow(Studio regularShow) {
        this.regularShow = regularShow;
    }

    public Studio getAvatar() {
        return avatar;
    }

    public void setAvatar(Studio avatar) {
        this.avatar = avatar;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    @Override
    public void run(){
        
        while(true){
            
            setFighters();
            if(getCycle_counter() == 8) setStarvationCounter();
            sem.release();
//            getAi().
            
        }
    
    
}
    
    
    public void setFighters(){
        
        Character firstFighter = getRegularShow().getFighter();
        
        getAi().setFirstFighter(firstFighter);
        Character secondFighter = getAvatar().getFighter();
        
        getAi().setSecondFighter(secondFighter);
        
        
    }
    
    public void setStarvationCounter(){
        
        
        
        Nodo RS_aux = getRegularShow().getReinforcementQueue().getFront();
        Nodo AV_aux = getAvatar().getReinforcementQueue().getFront();
        
        Character temp = null;
        
        while(RS_aux != null){
            
            temp = (Character) RS_aux.getInfo();
            
            temp.setCounter(temp.getCounter() + 1);
            
            RS_aux = RS_aux.getpNext();
        }
        
        
        temp = null;
        
        while(AV_aux != null){
            
            temp = (Character) AV_aux.getInfo();
            
            temp.setCounter(temp.getCounter() + 1);
            
            AV_aux = AV_aux.getpNext();
            
        }
        
    }

}


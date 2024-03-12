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
    
    
    public Administrator(){};
    
    public Administrator(Character character, Studio regularShow, Studio avatar, ArtificialIntelligence ai) {
        
        this.sem = new Semaphore(0);
        
        this.character = character;
        
        this.regularShow = regularShow;
        
        this.avatar = avatar;
        
        this.ai = ai;
        
        
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
            
            getCharacters();
//            getAi().
            
        }
    
    
}
    
    
    public void getCharacters(){
        
        try {
            //retrieve 1 character from priority queue 1 from each studio

            sem.acquire();
            Character regularShow = this.regularShow.getPq().getReadyQueues()[0].dequeue();
            getAi().setFirstFighter(regularShow);
            
            Character avatar = this.avatar.getPq().getReadyQueues()[0].dequeue();
            getAi().setSecondFighter(avatar);
            
            sem.release();
            
            
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }

}

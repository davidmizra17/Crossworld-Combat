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
    
    private Semaphore sync;
    
    private Semaphore sAI;
    
    private Studio regularShow;
    
    private Studio avatar;
    
    private Character character;
    
    private ArtificialIntelligence ai;
    
    private int cycle_counter;
    
    public Administrator(){};
    
    public Administrator(Studio regularShow, Studio avatar, ArtificialIntelligence ai, Semaphore sync, Semaphore sAI) {
        
        this.sync = sync;
        
        this.sAI = sAI;
        
        this.character = character;
        
        this.regularShow = regularShow;
        
        this.avatar = avatar;
        
        this.ai = ai;
        
        this.cycle_counter = 0;
        
        
    }

    public Semaphore getsAI() {
        return sAI;
    }

    public void setsAI(Semaphore sAI) {
        this.sAI = sAI;
    }
    


    public ArtificialIntelligence getAi() {
        return ai;
    }

    public void setAi(ArtificialIntelligence ai) {
        this.ai = ai;
    }

    public Semaphore getSync() {
        return sync;
    }

    public int getCycle_counter() {
        return cycle_counter;
    }

    public void setCycle_counter(int cycle_counter) {
        this.cycle_counter = cycle_counter;
    }
    

    public void setSync(Semaphore sync) {
        this.sync = sync;
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
            
            
            
            try {
                
                setFighters();
                sync.release();
                sAI.acquire();
                
                setCycle_counter(this.cycle_counter);
                
                getAvatar().starvationCounter();
                getRegularShow().starvationCounter();
                
                Random random = new Random();
                double rand = random.nextDouble();
                
                
                getAvatar().getCharacterFromReinforcement(rand);
                getRegularShow().getCharacterFromReinforcement(rand);
            
            
            } catch (InterruptedException ex) {
                Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
            }
         

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
        
        
        
        Nodo RS_aux = getRegularShow().getPq().getReadyQueues()[0].getFront();
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


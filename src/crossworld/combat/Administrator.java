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
    
    private Studio startrek;
    
    private Studio starwars;
    
    private Character character;
    
    private ArtificialIntelligence ai;
    
    private int cycle_counter;
    
    public Administrator(){};
    

    public Administrator(Studio startrek, Studio starwars, ArtificialIntelligence ai, Semaphore sem) {

        
        this.sync = sync;
        
        this.sAI = sAI;
        
        this.character = character;
        
        this.startrek = startrek;
        
        this.starwars = starwars;
        
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

    public Studio getStartrek() {
        return startrek;
    }

    public void setStartrek(Studio startrek) {
        this.startrek = startrek;
    }

    public Studio getStarwars() {
        return starwars;
    }

    public void setStarwars(Studio starwars) {
        this.starwars = starwars;
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
                
                getStartrek().starvationCounter();
                getStarwars().starvationCounter();
                
                Random random = new Random();
                double rand = random.nextDouble();
                
                
                getStartrek().getCharacterFromReinforcement(rand);
                getStarwars().getCharacterFromReinforcement(rand);
            
            
            } catch (InterruptedException ex) {
                Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
            }
         

//            getAi().
            
        }
    
    
}
    
    
    public void setFighters(){
      
        Character firstFighter = getStartrek().getFighter();

        
        getAi().setFirstFighter(firstFighter);
        Character secondFighter = getStarwars().getFighter();
        
        getAi().setSecondFighter(secondFighter);

        
        
    }
    
    public void setStarvationCounter(){
        
 
        Nodo ST_aux = getStartrek().getReinforcementQueue().getFront();
        Nodo SW_aux = getStarwars().getReinforcementQueue().getFront();

        
        Character temp = null;
        
        while(ST_aux != null){
            
            temp = (Character) ST_aux.getInfo();
            
            temp.setCounter(temp.getCounter() + 1);
            
            ST_aux = ST_aux.getpNext();
        }
        
        
        temp = null;
        
        while(SW_aux != null){
            
            temp = (Character) SW_aux.getInfo();
            
            temp.setCounter(temp.getCounter() + 1);
            
            SW_aux = SW_aux.getpNext();
            
        }
        
    }

}


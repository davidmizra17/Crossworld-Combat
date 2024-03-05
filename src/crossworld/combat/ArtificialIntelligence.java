/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crossworld.combat;

import java.util.concurrent.Semaphore;

/**
 *
 * @author davidmizrahi
 */
public class ArtificialIntelligence extends Thread {
    
    private Semaphore sem;
    
    private Character firstFighter;
    
    private Character secondFighter;
    
    
    public ArtificialIntelligence(){
        
        this.sem = new Semaphore(0);
        
    }

    public Semaphore getS() {
        return sem;
    }

    public void setS(Semaphore sem) {
        this.sem = sem;
    }
    
    
    
}

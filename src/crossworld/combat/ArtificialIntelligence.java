/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crossworld.combat;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 *
 * @author davidmizrahi
 */
public class ArtificialIntelligence extends Thread {
    
    private Semaphore sem;
    
    private Character firstFighter;
    
    private Character secondFighter;
    
    private Lista<Character> winners;
    
    private Administrator admin;
    
    
    public ArtificialIntelligence(Character firstFighter, Character secondFighter, Administrator admin){
        
        this.sem = new Semaphore(0);
        this.firstFighter = firstFighter;
        this.secondFighter = secondFighter;
        this.admin = admin;
        this.winners = new Lista();
        
    }

    public Lista<Character> getWinners() {
        return winners;
    }

    public void setWinners(Lista<Character> winners) {
        this.winners = winners;
    }

    public Administrator getAdmin() {
        return admin;
    }

    public void setAdmin(Administrator admin) {
        this.admin = admin;
    }

   
    public Semaphore getSem() {
        return sem;
    }

    public void setSem(Semaphore sem) {
        this.sem = sem;
    }

    public Character getFirstFighter() {
        return firstFighter;
    }

    public void setFirstFighter(Character firstFighter) {
        this.firstFighter = firstFighter;
    }

    public Character getSecondFighter() {
        return secondFighter;
    }

    public void setSecondFighter(Character secondFighter) {
        this.secondFighter = secondFighter;
    }
    
    
    @Override
    public void run(){
        while(true){
            
        }
    }
    
    
    public void fightOutcome() throws InterruptedException{
        
        Random random = new Random();
        
        double fightProb = random.nextDouble();
        
        double winnerCase = 0.4;
        double tiedCase = 0.27;
        double noCombatCase = 0.33;
        
        if(fightProb <= winnerCase){
            //choose winner
            //borrar perdedor de la simulacion y agregar ganador a la lista de ganadores
        }
        else if(fightProb <= winnerCase + tiedCase){
            //tie
            sem.acquire();
            
            this.admin.getRegularShow().getPq().getReadyQueues()[0].enqueue(firstFighter);
            this.admin.getAvatar().getPq().getReadyQueues()[0].enqueue(secondFighter);
            
            sem.release();
            
        }
        
        else{
            //no combat
        }

       
        
    }
    
    public void pickWinner(){
        
    }
    
    
    
    
}

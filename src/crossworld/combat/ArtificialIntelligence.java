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
import java.util.logging.Level;
import java.util.logging.Logger;
public class ArtificialIntelligence extends Thread {
    
    private Semaphore sem;
    
    private Character firstFighter;
    
    private Character secondFighter;
    
    private Lista<Character> winners;
    
    private Administrator admin;
    
    private int cycle_counter;
    
    public ArtificialIntelligence(){};
    
    public ArtificialIntelligence(Character firstFighter, Character secondFighter, Administrator admin){
        
        this.sem = new Semaphore(0);
        this.firstFighter = firstFighter;
        this.secondFighter = secondFighter;
        this.admin = admin;
        this.winners = new Lista();
        this.cycle_counter = 0;
        
    }

    public Lista<Character> getWinners() {
        return winners;
    }

    public void setWinners(Lista<Character> winners) {
        this.winners = winners;
    }

    public int getCycle_counter() {
        return cycle_counter;
    }

    public void setCycle_counter(int cycle_counter) {
        this.cycle_counter = cycle_counter;
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
            try {
                
                sleep(1500);
                String outcome = fightOutcome();
                
                System.out.println("Fight Outcome:\n");
                System.out.println(outcome);
                System.out.println("-------------------");
                
                
                this.cycle_counter++;
                
                getAdmin().setCycle_counter(this.cycle_counter);
                getAdmin().getAvatar().getCharacterFromReinforcement();
                getAdmin().getRegularShow().getCharacterFromReinforcement();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(ArtificialIntelligence.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    
    public String fightOutcome() throws InterruptedException{
        
        Random random = new Random();
        
//        double fightProb = random.nextDouble();
        double fightProb = 0.95;
        
        double winnerCase = 0.4;
        double tiedCase = 0.27;
        double noCombatCase = 0.33;
        
        if(fightProb <= winnerCase){
            String winner = pickWinner();
            return winner;
        }
        else if(fightProb <= winnerCase + tiedCase){
            //tie
//            sem.acquire();
            
            this.admin.getRegularShow().getPq().getReadyQueues()[0].enqueue(firstFighter);
            this.admin.getAvatar().getPq().getReadyQueues()[0].enqueue(secondFighter);
            
//            sem.release();
            
            return "Tie";
            
        }
        
        else{
            //no combat
            this.admin.getRegularShow().getReinforcementQueue().enqueue(firstFighter);
                    
            this.admin.getAvatar().getReinforcementQueue().enqueue(secondFighter);
            
            return "No Combat";
        }
        

       
        
    }
    
    public String pickWinner(){
        
        Character RegularShowFighter = new Character();
        Character AvatarFighter = new Character();
        
        int RSCounter = 0;
        int AvCounter = 0;
        
        
        RegularShowFighter = this.firstFighter;
        AvatarFighter = this.secondFighter;
        
        
        double skillTest = AvatarFighter.getSkills() - RegularShowFighter.getSkills();
        double healthTest = AvatarFighter.getHealthPoints() - RegularShowFighter.getHealthPoints();
        double strengthTest = AvatarFighter.getStrength() - RegularShowFighter.getStrength();
        double agilityTest = AvatarFighter.getAgility()- RegularShowFighter.getAgility();
        
        if(skillTest < 0) RSCounter++;
        else AvCounter++;
        
        
        if(healthTest < 0)RSCounter++;
        else AvCounter++;
        
        if(strengthTest < 0)RSCounter++;
        else AvCounter++;
        
        if(agilityTest < 0)RSCounter++;
        else AvCounter++;
        
        
        return RSCounter > AvCounter ? "Winner is Regular Show" : "Winner is Avatar";
        
        
    }
    
    
    
    
}

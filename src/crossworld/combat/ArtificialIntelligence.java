/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crossworld.combat;

import java.util.Random;
import java.util.concurrent.Semaphore;
import javax.swing.JTextField;



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
    
    private int TimeSleep = 10000;
    
    JTextField textField;
    JTextField skillsAvatar;
    JTextField skillsRS;
    JTextField hpAvatar;
    JTextField hpRS;
    JTextField agilityAvatar;
    JTextField agilityRS;
    JTextField strengthAvatar;
    JTextField strengthRS;
    JTextField idAvatar;
    JTextField idRS;
    
    public ArtificialIntelligence(){};
    
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
    
    public int getTimeSleep(){
        return TimeSleep;
    }
    
    public void setTimeSleep(int time){
        this.TimeSleep = time*1000;
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
                sleep(TimeSleep);
                String outcome = fightOutcome();
                System.out.println("Fight Outcome:\n");
                System.out.println(outcome);
                textField.setText(outcome);
                idAvatar.setText(Double.toString(secondFighter.getID()));
                skillsAvatar.setText(Double.toString(secondFighter.getSkills()));
                hpAvatar.setText(Double.toString(secondFighter.getHealthPoints()));
                agilityAvatar.setText(Double.toString(secondFighter.getAgility()));
                strengthAvatar.setText(Double.toString(secondFighter.getStrength()));
                idRS.setText(Double.toString(firstFighter.getID()));
                skillsRS.setText(Double.toString(firstFighter.getSkills()));
                hpRS.setText(Double.toString(firstFighter.getHealthPoints()));
                agilityRS.setText(Double.toString(firstFighter.getAgility()));
                strengthRS.setText(Double.toString(firstFighter.getStrength()));
                System.out.println("-------------------");
            } catch (InterruptedException ex) {
                Logger.getLogger(ArtificialIntelligence.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    public void setTextField(JTextField textField) {
        this.textField = textField;
    }
    
    public void setSkillsAvatar(JTextField textField) {
        this.skillsAvatar = textField;
    }
        
    public void setSkillsRS(JTextField textField) {
        this.skillsRS = textField;
    }
            
    public void setHpAvatar(JTextField textField) {
        this.hpAvatar = textField;
    }
                
    public void setHpRS(JTextField textField) {
        this.hpRS = textField;
    }
                    
    public void setAgilityAvatar(JTextField textField) {
        this.agilityAvatar = textField;
    }
                        
    public void setAgilityRS(JTextField textField) {
        this.agilityRS = textField;
    }
                            
    public void setStrengthAvatar(JTextField textField) {
        this.strengthAvatar = textField;
    }
                                
    public void setStrengthRS(JTextField textField) {
        this.strengthRS = textField;
    }
    
    public void setIdAvatar(JTextField textField) {
        this.idAvatar = textField;
    }
        
    public void setIdRS(JTextField textField) {
        this.idRS = textField;
    }
    
    public String fightOutcome() throws InterruptedException{
        
        Random random = new Random();
        
        double fightProb = random.nextDouble();
        
        double winnerCase = 0.4;
        double tiedCase = 0.27;
        double noCombatCase = 0.33;
        
        if(fightProb <= winnerCase){
            String winner = pickWinner();
            return winner;
        }
        else if(fightProb <= winnerCase + tiedCase){
            //tie
            sem.acquire();
            
            this.admin.getRegularShow().getPq().getReadyQueues()[0].enqueue(firstFighter);
            this.admin.getAvatar().getPq().getReadyQueues()[0].enqueue(secondFighter);
            
            sem.release();
            
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

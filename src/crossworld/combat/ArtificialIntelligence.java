/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crossworld.combat;

import Views.GUI;
import java.util.Random;
import java.util.concurrent.Semaphore;
import javax.swing.JTextField;



/**
 *
 * @author davidmizrahi
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
public class ArtificialIntelligence extends Thread {
    
    private Semaphore sem;
    
    private Character firstFighter;
    
    private Character secondFighter;
    
    private Lista<Character> winners;
    
    private Administrator admin;
    

    private int cycle_counter;

    private int TimeSleep = 10000;
    
    private JTextField textField;
    private JTextField skillsAvatar;
    private JTextField skillsRS;
    private JTextField hpAvatar;
    private JTextField hpRS;
    private JTextField agilityAvatar;
    private JTextField agilityRS;
    private JTextField strengthAvatar;
    private JTextField strengthRS;
    private JTextField idAvatar;
    private JTextField idRS;
    
    private JTextArea AVQ1; 
    private JTextArea AVQ2; 
    private JTextArea AVQ3;
    
    private JTextArea RSQ1; 
    private JTextArea RSQ2; 
    private JTextArea RSQ3; 
    
    
//    private GUI gui;
    
    

    
    public ArtificialIntelligence(){
        
        
        
        this.textField = new JTextField();
        this.skillsAvatar = new JTextField();
        this.skillsRS = new JTextField();
        this.hpAvatar = new JTextField();
        this.hpRS = new JTextField();
        this.agilityAvatar = new JTextField();
        this.agilityRS = new JTextField();
        this.strengthAvatar = new JTextField();
        this.strengthRS = new JTextField();
        this.idAvatar = new JTextField();
        this.idRS = new JTextField();
        
        this.AVQ1 = new JTextArea();
        this.AVQ2 = new JTextArea();
        this.AVQ2 = new JTextArea();
        
        this.RSQ1 = new JTextArea();
        this.RSQ2= new JTextArea();
        this.RSQ3 = new JTextArea();
//        this.gui = new GUI();
        
        
        
    };

   

   
    
    public ArtificialIntelligence(Character firstFighter, Character secondFighter, Administrator admin){
        
        this.sem = new Semaphore(0);
        this.firstFighter = firstFighter;
        this.secondFighter = secondFighter;
        this.admin = admin;
        this.winners = new Lista();
        this.cycle_counter = 0;
        
        //INITIALIZE JTEXTFIELD VARIABLES
        this.textField = new JTextField();
        this.skillsAvatar = new JTextField();
        this.skillsRS = new JTextField();
        this.hpAvatar = new JTextField();
        this.hpRS = new JTextField();
        this.agilityAvatar = new JTextField();
        this.agilityRS = new JTextField();
        this.strengthAvatar = new JTextField();
        this.strengthRS = new JTextField();
        this.idAvatar = new JTextField();
        this.idRS = new JTextField();
        
        
        
        
        
        
        
        
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

    public JTextField getTextField() {
        return textField;
    }

    public JTextField getSkillsAvatar() {
        return skillsAvatar;
    }

    public JTextField getSkillsRS() {
        return skillsRS;
    }

    public JTextField getHpAvatar() {
        return hpAvatar;
    }

    public JTextField getHpRS() {
        return hpRS;
    }

    public JTextField getAgilityAvatar() {
        return agilityAvatar;
    }

    public JTextField getAgilityRS() {
        return agilityRS;
    }

    public JTextField getStrengthAvatar() {
        return strengthAvatar;
    }

    public JTextField getStrengthRS() {
        return strengthRS;
    }

    public JTextField getIdAvatar() {
        return idAvatar;
    }

    public JTextField getIdRS() {
        return idRS;
    }
    
    
     public JTextArea getAVQ1() {
        return AVQ1;
    }

    public void setAVQ1(JTextArea AVQ1) {
        this.AVQ1 = AVQ1;
    }
    
    
    @Override
    public void run(){
        
        while(true){
            try {
                    
                sleep(TimeSleep);
                 getAdmin().setFighters();

                String outcome = fightOutcome();
                
                SwingUtilities.invokeLater(() -> {
                System.out.println("Fight Outcome:\n");
                System.out.println(outcome);
                textField.setText(outcome);
                idAvatar.setText(Double.toString(secondFighter.getID()));
                skillsAvatar.setText(String.format("%.2f",secondFighter.getSkills() ));
                hpAvatar.setText(String.format("%.2f",secondFighter.getHealthPoints()));
                agilityAvatar.setText(String.format("%.2f",secondFighter.getAgility()));
                strengthAvatar.setText(String.format("%.2f",secondFighter.getStrength()));
                idRS.setText(Double.toString(firstFighter.getID()));
                skillsRS.setText(String.format("%.2f",firstFighter.getSkills()));
                hpRS.setText(String.format("%.2f",firstFighter.getHealthPoints()));
                agilityRS.setText(String.format("%.2f",firstFighter.getAgility()));
                strengthRS.setText(String.format("%.2f",firstFighter.getStrength()));
                printQueues();
                
                System.out.println("-------------------");
                
                });
                
                
//                this.cycle_counter++;
//                
//                getAdmin().setCycle_counter(this.cycle_counter);
//                getAdmin().getAvatar().getCharacterFromReinforcement();
//                getAdmin().getRegularShow().getCharacterFromReinforcement();
                
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(ArtificialIntelligence.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    public JTextArea getAVQ2() {
        return AVQ2;
    }

    public void setAVQ2(JTextArea AVQ2) {
        this.AVQ2 = AVQ2;
    }

    public JTextArea getAVQ3() {
        return AVQ3;
    }

    public void setAVQ3(JTextArea AVQ3) {
        this.AVQ3 = AVQ3;
    }

    public JTextArea getRSQ1() {
        return RSQ1;
    }

    public void setRSQ1(JTextArea RSQ1) {
        this.RSQ1 = RSQ1;
    }

    public JTextArea getRSQ2() {
        return RSQ2;
    }

    public void setRSQ2(JTextArea RSQ2) {
        this.RSQ2 = RSQ2;
    }

    public JTextArea getRSQ3() {
        return RSQ3;
    }

    public void setRSQ3(JTextArea RSQ3) {
        this.RSQ3 = RSQ3;
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
////        double fightProb = 0.35;
        
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
            
            this.admin.getRegularShow().getPq().getReadyQueues()[firstFighter.getPriorityLevel()-1].enqueue(firstFighter);
            this.admin.getAvatar().getPq().getReadyQueues()[secondFighter.getPriorityLevel()-1].enqueue(secondFighter);
            
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
    
     public void printQueues(){
    
        this.AVQ1.setText((String)this.admin.getAvatar().getPq().getReadyQueues()[0].printQueue());
        this.AVQ2.setText((String)this.admin.getAvatar().getPq().getReadyQueues()[1].printQueue());
        this.AVQ3.setText((String)this.admin.getAvatar().getPq().getReadyQueues()[2].printQueue());
        
        this.RSQ1.setText((String)this.admin.getRegularShow().getPq().getReadyQueues()[0].printQueue());
        this.RSQ2.setText((String)this.admin.getRegularShow().getPq().getReadyQueues()[1].printQueue());
        this.RSQ3.setText((String)this.admin.getRegularShow().getPq().getReadyQueues()[2].printQueue());
        
        
        
        
        
}
    
    
    
    
    
}

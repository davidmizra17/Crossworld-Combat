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
    
    private int victoryStarWars = 0;
    
    private int victoryStarTrek = 0;
    
    private JTextField textField;
    private JTextField skillsStarwars;
    private JTextField skillsStartrek;
    private JTextField hpStarwars;
    private JTextField hpStartrek;
    private JTextField agilityStarwars;
    private JTextField agilityStartrek;
    private JTextField strengthStarwars;
    private JTextField strengthStartrek;
    private JTextField idStarwars;
    private JTextField idStartrek;
    private JTextField victoriasStarWars;
    private JTextField victoriasStarTrek;
    private JTextField actividadAI;
    
    private JTextArea SWQ1; 
    private JTextArea SWQ2; 
    private JTextArea SWQ3;
    private JTextArea SWRQ;
    
    private JTextArea STQ1; 
    private JTextArea STQ2; 
    private JTextArea STQ3; 
    private JTextArea STRQ;
    
    
//    private GUI gui;
    
    

    
    public ArtificialIntelligence(){
        
        
        
        this.textField = new JTextField();
        this.skillsStarwars = new JTextField();
        this.skillsStartrek = new JTextField();
        this.hpStarwars = new JTextField();
        this.hpStartrek = new JTextField();
        this.agilityStarwars = new JTextField();
        this.agilityStartrek = new JTextField();
        this.strengthStarwars = new JTextField();
        this.strengthStartrek = new JTextField();
        this.idStarwars = new JTextField();
        this.idStartrek = new JTextField();
        this.victoriasStarWars = new JTextField();
        this.victoriasStarTrek = new JTextField();
        this.actividadAI = new JTextField();
        
        this.SWQ1 = new JTextArea();
        this.SWQ2 = new JTextArea();
        this.SWQ2 = new JTextArea();
        this.SWRQ = new JTextArea();
        
        this.STQ1 = new JTextArea();
        this.STQ2= new JTextArea();
        this.STQ3 = new JTextArea();
        this.STRQ = new JTextArea();
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
        this.skillsStarwars = new JTextField();
        this.skillsStartrek = new JTextField();
        this.hpStarwars = new JTextField();
        this.hpStartrek = new JTextField();
        this.agilityStarwars = new JTextField();
        this.agilityStartrek = new JTextField();
        this.strengthStarwars = new JTextField();
        this.strengthStartrek = new JTextField();
        this.idStarwars = new JTextField();
        this.idStartrek = new JTextField();
        this.victoriasStarWars = new JTextField();
        this.victoriasStarTrek = new JTextField();
        this.actividadAI = new JTextField();
        
        
        
        
        
        
        
    }

    public JTextField getActividadAI() {
        return actividadAI;
    }

    public void setActividadAI(JTextField actividadAI) {
        this.actividadAI = actividadAI;
    }

    public JTextArea getSWRQ() {
        return SWRQ;
    }

    public void setSWRQ(JTextArea SWRQ) {
        this.SWRQ = SWRQ;
    }

    public JTextArea getSTRQ() {
        return STRQ;
    }

    public void setSTRQ(JTextArea STRQ) {
        this.STRQ = STRQ;
    }

    
    
    public JTextField getVictoriasStarWars() {
        return victoriasStarWars;
    }

    public void setVictoriasStarWars(JTextField victoriasStarwars) {
        this.victoriasStarWars = victoriasStarwars;
    }

    public JTextField getVictoriasStarTrek() {
        return victoriasStarTrek;
    }

    public void setVictoriasStarTrek(JTextField victoriasStartrek) {
        this.victoriasStarTrek = victoriasStartrek;
    }

    public int getVictoryStarWars() {
        return victoryStarWars;
    }

    public void setVictoryStarWars(int victoryStarwars) {
        this.victoryStarWars = victoryStarwars;
    }

    public int getVictoryStarTrek() {
        return victoryStarTrek;
    }

    public void setVictoryStarTrek(int victoryStartrek) {
        this.victoryStarTrek = victoryStartrek;
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

    public JTextField getSkillsStarwars() {
        return skillsStarwars;
    }

    public JTextField getSkillsStartrek() {
        return skillsStartrek;
    }

    public JTextField getHpStarwars() {
        return hpStarwars;
    }

    public JTextField getHpStartrek() {
        return hpStartrek;
    }

    public JTextField getAgilityStarwars() {
        return agilityStarwars;
    }

    public JTextField getAgilityStartrek() {
        return agilityStartrek;
    }

    public JTextField getStrengthStarwars() {
        return strengthStarwars;
    }

    public JTextField getStrengthStartrek() {
        return strengthStartrek;
    }

    public JTextField getIdStarwars() {
        return idStarwars;
    }

    public JTextField getIdStartrek() {
        return idStartrek;
    }
    
    
     public JTextArea getSWQ1() {
        return SWQ1;
    }

    public void setSWQ1(JTextArea AVQ1) {
        this.SWQ1 = SWQ1;
    }
    
    
    @Override
    public void run(){
        
        while(true){
            try {
                    
                sleep(TimeSleep);
                actividadAI.setText("Decidiendo");
                sleep(500);
                 getAdmin().setFighters();

                String outcome = fightOutcome();
                
                SwingUtilities.invokeLater(() -> {
                System.out.println("Fight Outcome:\n");
                System.out.println(outcome);
                
                if(outcome == "Winner is Star Wars"){
                    this.victoryStarWars++;
                } else if (outcome == "Winner is Star Trek"){
                    this.victoryStarTrek++;
                }
                actividadAI.setText("Esperando");
                textField.setText(outcome);
                idStarwars.setText(Double.toString(secondFighter.getID()));
                skillsStarwars.setText(String.format("%.2f",secondFighter.getSkills() ));
                hpStarwars.setText(String.format("%.2f",secondFighter.getHealthPoints()));
                agilityStarwars.setText(String.format("%.2f",secondFighter.getAgility()));
                strengthStarwars.setText(String.format("%.2f",secondFighter.getStrength()));
                idStartrek.setText(Double.toString(firstFighter.getID()));
                skillsStartrek.setText(String.format("%.2f",firstFighter.getSkills()));
                hpStartrek.setText(String.format("%.2f",firstFighter.getHealthPoints()));
                agilityStartrek.setText(String.format("%.2f",firstFighter.getAgility()));
                strengthStartrek.setText(String.format("%.2f",firstFighter.getStrength()));
                victoriasStarWars.setText(Integer.toString(victoryStarWars));
                victoriasStarTrek.setText(Integer.toString(victoryStarTrek));
                printQueues();
                
                System.out.println("-------------------");
                
                });
                
                
                this.cycle_counter++;
                
                Random random = new Random();
        
                double rand = random.nextDouble();
                
                getAdmin().setCycle_counter(this.cycle_counter);
                getAdmin().getStarwars().getCharacterFromReinforcement(rand);
                getAdmin().getStartrek().getCharacterFromReinforcement(rand);
                
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(ArtificialIntelligence.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    public JTextArea getSWQ2() {
        return SWQ2;
    }

    public void setSWQ2(JTextArea SWQ2) {
        this.SWQ2 = SWQ2;
    }

    public JTextArea getSWQ3() {
        return SWQ3;
    }

    public void setSWQ3(JTextArea SWQ3) {
        this.SWQ3 = SWQ3;
    }

    public JTextArea getSTQ1() {
        return STQ1;
    }

    public void setSTQ1(JTextArea STQ1) {
        this.STQ1 = STQ1;
    }

    public JTextArea getSTQ2() {
        return STQ2;
    }

    public void setSTQ2(JTextArea STQ2) {
        this.STQ2 = STQ2;
    }

    public JTextArea getSTQ3() {
        return STQ3;
    }

    public void setSTQ3(JTextArea STQ3) {
        this.STQ3 = STQ3;
    }
    
    
    
    public void setTextField(JTextField textField) {
        this.textField = textField;
    }
    
    public void setSkillsStarwars(JTextField textField) {
        this.skillsStarwars = textField;
    }
        
    public void setSkillsStartrek(JTextField textField) {
        this.skillsStartrek = textField;
    }
            
    public void setHpStarwars(JTextField textField) {
        this.hpStarwars = textField;
    }
                
    public void setHpStartrek(JTextField textField) {
        this.hpStartrek = textField;
    }
                    
    public void setAgilityStarwars(JTextField textField) {
        this.agilityStarwars = textField;
    }
                        
    public void setAgilityStartrek(JTextField textField) {
        this.agilityStartrek = textField;
    }
                            
    public void setStrengthStarwars(JTextField textField) {
        this.strengthStarwars = textField;
    }
                                
    public void setStrengthStartrek(JTextField textField) {
        this.strengthStartrek = textField;
    }
    
    public void setIdStarwars(JTextField textField) {
        this.idStarwars = textField;
    }
        
    public void setIdStartrek(JTextField textField) {
        this.idStartrek = textField;
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
            
            this.admin.getStartrek().getPq().getReadyQueues()[firstFighter.getPriorityLevel()-1].enqueue(firstFighter);
            this.admin.getStarwars().getPq().getReadyQueues()[secondFighter.getPriorityLevel()-1].enqueue(secondFighter);
            
//            sem.release();
            
            return "Tie";
            
        }
        
        else{
            //no combat
            this.admin.getStartrek().getReinforcementQueue().enqueue(firstFighter);
                    
            this.admin.getStarwars().getReinforcementQueue().enqueue(secondFighter);
            
            return "No Combat";
        }
        

       
        
    }
    
    public String pickWinner(){
        
        Character StarTrekFighter = new Character();
        Character StarWarsFighter = new Character();
        
        int STCounter = 0;
        int SWCounter = 0;
        
        
        StarTrekFighter = this.firstFighter;
        StarWarsFighter = this.secondFighter;
        
        
        double skillTest = StarWarsFighter.getSkills() - StarTrekFighter.getSkills();
        double healthTest = StarWarsFighter.getHealthPoints() - StarTrekFighter.getHealthPoints();
        double strengthTest = StarWarsFighter.getStrength() - StarTrekFighter.getStrength();
        double agilityTest = StarWarsFighter.getAgility()- StarTrekFighter.getAgility();
        
        if(skillTest < 0) STCounter++;
        else SWCounter++;
        
        
        if(healthTest < 0)STCounter++;
        else SWCounter++;
        
        if(strengthTest < 0)STCounter++;
        else SWCounter++;
        
        if(agilityTest < 0)STCounter++;
        else SWCounter++;
        
        
        return STCounter > SWCounter ? "Winner is Star Trek" : "Winner is Star Wars";
        
        
    }
    
     public void printQueues(){
    
        this.SWQ1.setText((String)this.admin.getStarwars().getPq().getReadyQueues()[0].printQueue());
        this.SWQ2.setText((String)this.admin.getStarwars().getPq().getReadyQueues()[1].printQueue());
        this.SWQ3.setText((String)this.admin.getStarwars().getPq().getReadyQueues()[2].printQueue());
        this.SWRQ.setText((String)this.admin.getStarwars().getReinforcementQueue().printQueue());
        
        this.STQ1.setText((String)this.admin.getStartrek().getPq().getReadyQueues()[0].printQueue());
        this.STQ2.setText((String)this.admin.getStartrek().getPq().getReadyQueues()[1].printQueue());
        this.STQ3.setText((String)this.admin.getStartrek().getPq().getReadyQueues()[2].printQueue());
        this.STRQ.setText((String)this.admin.getStartrek().getReinforcementQueue().printQueue());
        
        
        
        
}
    
    
    
    
    
}

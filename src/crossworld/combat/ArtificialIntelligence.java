/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crossworld.combat;

import Views.GUI;
import java.awt.Image;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Semaphore;
import javax.swing.JTextField;



/**
 *
 * @author davidmizrahi
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class ArtificialIntelligence extends Thread {
    
    private Semaphore sync;
    
    private Semaphore adminSem;
    
    public Character firstFighter;
    
    public Character secondFighter;
    
    public Lista<Character> winners;
    
    public Administrator admin;
    
    public String outcome;
    

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
    
    private JLabel st_image;
    private JLabel sw_image;
    
    public Map<Integer, String[]> characterInformation;
    
    

    
    public ArtificialIntelligence(Map<Integer, String[]> characterInfoMap, Semaphore sync, Semaphore adminSem){
        
        
        
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
        
        this.st_image = new JLabel();
        this.sw_image = new JLabel();
        
        this.SWQ1 = new JTextArea();
        this.SWQ2 = new JTextArea();
        this.SWQ2 = new JTextArea();
        this.SWRQ = new JTextArea();
        
        this.STQ1 = new JTextArea();
        this.STQ2= new JTextArea();
        this.STQ3 = new JTextArea();
        this.STRQ = new JTextArea();

        this.characterInformation = characterInfoMap;
        this.admin = admin;
        this.sync = sync;
        this.adminSem = adminSem;
        
        this.winners = new Lista<Character>();
        
        
        
    };

    public Semaphore getAdminSem() {
        return adminSem;
    }

    public void setAdminSem(Semaphore adminSem) {
        this.adminSem = adminSem;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }
    
    

    public JTextField getActividadAI() {
        return actividadAI;
    }

    public void setActividadAI(JTextField actihealthPointsdAI) {
        this.actividadAI = actihealthPointsdAI;
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

   
    public Semaphore getSync() {
        return sync;
    }

    public void setSync(Semaphore sync) {
        this.sync = sync;
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

    public void setSWQ1(JTextArea SWQ1) {
        this.SWQ1 = SWQ1;
    }

    public JLabel getSt_image() {
        return st_image;
    }

    public void setSt_image(JLabel st_image) {
        this.st_image = st_image;
    }

    public JLabel getSw_image() {
        return sw_image;
    }

    public void setSw_image(JLabel sw_image) {
        this.sw_image = sw_image;
    }
    
    
    
    
    @Override
    public void run(){
        
        while(true){
            try {
                getSync().acquire();
                
                System.out.println("AI THREAD ID: " + Thread.currentThread().getName());
                    
                sleep(TimeSleep);
                actividadAI.setText("Decidiendo");
                sleep(500);
                
                setOutcome(fightOutcome());
                starvationCounters();
                
//                SwingUtilities.invokeLater(() -> {
                
                    String temp = getOutcome();
                    if(temp.equals("Star Wars Wins!")){
                            
                        this.victoryStarWars++;
                            
                    } else if (temp.equals("Star Trek Wins!")){
                            
                        this.victoryStarTrek++;
                            
                    }   
                    
                actividadAI.setText("Esperando");
                textField.setText(temp);
                victoriasStarWars.setText(Integer.toString(victoryStarWars));
                victoriasStarTrek.setText(Integer.toString(victoryStarTrek));
                
                this.cycle_counter++;
                
                
                Random random = new Random();
        
                double rand = random.nextDouble();
                
                getAdmin().setCycle_counter(this.cycle_counter);
                getAdmin().getStarwars().getCharacterFromReinforcement(rand);
                getAdmin().getStartrek().getCharacterFromReinforcement(rand);
                
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(ArtificialIntelligence.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            getAdminSem().release();
//            Thread.yield();
            
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
        
        if(fightProb <= winnerCase){
            String winner = pickWinner();
            return winner;
        }
        else if(fightProb <= winnerCase + tiedCase){
            
            this.admin.getStartrek().getPq().getReadyQueues()[firstFighter.getPriorityLevel()-1].enqueue(firstFighter);
            this.admin.getStarwars().getPq().getReadyQueues()[secondFighter.getPriorityLevel()-1].enqueue(secondFighter);
            

            
            return "Tie";
            
        }
        
        else{
            //no combat
            this.admin.getStartrek().getReinforcementQueue().enqueue(firstFighter);
                    
            this.admin.getStarwars().getReinforcementQueue().enqueue(secondFighter);
            
            return "No Combat";
        }
        

       
        
    }
    
    public void starvationCounters(){
        firstFighter.ID++;
        secondFighter.ID++;
        
        if(firstFighter.ID == 8 && firstFighter.priorityLevel != 0){
            firstFighter.ID = 0;
            getAdmin().getStartrek().getPq().getReadyQueues()[firstFighter.priorityLevel - 1].enqueue(firstFighter);
            
        }
        
        if(secondFighter.ID == 8 && secondFighter.priorityLevel != 0){
            secondFighter.ID = 0;
            getAdmin().getStarwars().getPq().getReadyQueues()[secondFighter.priorityLevel - 1].enqueue(firstFighter);
        }
    }
    
    public String pickWinner(){
        
         int maxRondas = 5;
        Random random = new Random();
        //star trek
        Character p1 = this.firstFighter;
        //star wars
        Character p2 = this.secondFighter;

        for (int ronda = 1; ronda <= maxRondas; ronda++) {
            // Simulamos un pequeño bono aleatorio en strength o agility.
            if (random.nextInt(100) < 15) {
                p1.strength += p1.strength * 0.1; // Bono del 10% en esta ronda
            }
            if (random.nextInt(100) < 15) {
                p2.strength += p2.strength * 0.1;
            }

            // Ataques de ambos personajes
            double danoP1 = p1.strength - p2.agility;
            double danoP2 = p2.strength - p1.agility;

            // Evitar daño negativo
            danoP1 = Math.max(danoP1, 0);
            danoP2 = Math.max(danoP2, 0);

            // Reducción de puntos de healthPoints por el daño infligido
            p1.healthPoints -= danoP2;
            p2.healthPoints -= danoP1;

            // Reducción de strength para simular desgaste
            p1.strength -= p1.strength * 0.05;
            p2.strength -= p2.strength * 0.05;

            // Comprobar si alguno ha perdido por puntos de healthPoints
            if (p1.healthPoints <= 0 && p2.healthPoints <= 0) {
                return null; // Empate técnico
            } else if (p1.healthPoints <= 0) {
                winners.agregarElemento(p2);
                return "Star Wars Wins!"; // P2 gana
            } else if (p2.healthPoints <= 0) {
                winners.agregarElemento(p1);
                return "Star Trek Wins!"; // P1 gana
            }
        }

        // Si llega al final de las rondas, comparar las estadísticas restantes para decidir
        double puntajeP1 = p1.healthPoints + p1.strength + p1.agility;
        double puntajeP2 = p2.healthPoints + p2.strength + p2.agility;

        if (puntajeP1 > puntajeP2) {
            winners.agregarElemento(p1);
            return "Star Trek Wins!";
        } else if (puntajeP2 > puntajeP1) {
            winners.agregarElemento(p2);
            return "Star Wars Wins!";
        }

        return null; // Empate si los puntajes son iguales
        
        
    }
    
    
    
    
    
    
    
}

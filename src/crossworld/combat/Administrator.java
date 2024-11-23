/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crossworld.combat;

import java.awt.Image;
import java.awt.Toolkit;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author davidmizrahi
 */
public class Administrator extends Thread{
    
    private Semaphore sync;
    
    private Semaphore adminSem;
    
    private Studio startrek;
    
    private Studio starwars;
    
    private Character character;
    
    private ArtificialIntelligence ai;
    
    private int cycle_counter;
    
    //JTEXT FIELDS
    private JTextArea SWQ1; 
    private JTextArea SWQ2; 
    private JTextArea SWQ3;
    private JTextArea SWRQ;
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
    private JTextField swNameField;
    private JTextField stNameField;
    private JTextArea STQ1; 
    private JTextArea STQ2; 
    private JTextArea STQ3; 
    private JTextArea STRQ;
    
    private JLabel st_image;
    private JLabel sw_image;
    
    public String swImagePath = "";
    public String stImagePath = "";
    public String characterName = "";
    
    public Queue<String[]> rosterQueue;
    public Map<Integer, String[]> characterInfoMap;
    
    public int global_id;
    
    public Administrator(){};
    
    public Administrator(Map<Integer, String[]> characterInfoMap, Studio startrek, Studio starwars, ArtificialIntelligence ai, Semaphore sync, Semaphore adminSem, int global_id, Queue<String[]> rosterQueue) {
        
        this.sync = sync;
        
        this.character = character;
        
        this.startrek = startrek;
        
        this.starwars = starwars;
        
        this.cycle_counter = 0;
        
        this.adminSem = adminSem;
        
        this.ai = ai;
        
        this.rosterQueue = rosterQueue;
        this.characterInfoMap = characterInfoMap;
        
        this.global_id = global_id;
        
        this.SWQ1 = new JTextArea();
        this.SWQ2 = new JTextArea();
        this.SWQ2 = new JTextArea();
        this.SWRQ = new JTextArea();
        
        this.STQ1 = new JTextArea();
        this.STQ2= new JTextArea();
        this.STQ3 = new JTextArea();
        this.STRQ = new JTextArea();
        
        this.idStarwars = new JTextField();
        
        this.st_image = new JLabel();
        this.sw_image = new JLabel();
        
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

    public JTextField getIdStarwars() {
        return idStarwars;
    }

    public void setIdStarwars(JTextField idStarwars) {
        this.idStarwars = idStarwars;
    }
    
    public Semaphore getAdminSem() {
        return adminSem;
    }

    public void setAdminSem(Semaphore adminSem) {
        this.adminSem = adminSem;
    }

    public JTextArea getSWQ1() {
        return SWQ1;
    }

    public void setSWQ1(JTextArea SWQ1) {
        this.SWQ1 = SWQ1;
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

    public JTextArea getSWRQ() {
        return SWRQ;
    }

    public void setSWRQ(JTextArea SWRQ) {
        this.SWRQ = SWRQ;
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

    public JTextArea getSTRQ() {
        return STRQ;
    }

    public void setSTRQ(JTextArea STRQ) {
        this.STRQ = STRQ;
    }

    public JTextField getSwNameField() {
        return swNameField;
    }

    public void setSwNameField(JTextField swNameField) {
        this.swNameField = swNameField;
    }

    public JTextField getStNameField() {
        return stNameField;
    }

    public void setStNameField(JTextField stNameField) {
        this.stNameField = stNameField;
    }

    public int getGlobal_id() {
        return global_id;
    }

    public void setGlobal_id(int global_id) {
        this.global_id = global_id;
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
    
    public void setSync(Semaphore sync) {
        this.sync = sync;
    }


    public int getCycle_counter() {
        return cycle_counter;
    }

    public void setCycle_counter(int cycle_counter) {
        this.cycle_counter = cycle_counter;
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
                
                getAdminSem().acquire();//   if(getCycle_counter() == 8) setStarvationCounter();
                
                setFighters();
                
                try {
                    SwingUtilities.invokeAndWait(() -> {
                        
                        swNameField.setText(this.ai.characterInformation.get(this.ai.secondFighter.getID())[0]);
                        idStarwars.setText(String.valueOf(this.ai.secondFighter.getID()));
                        
                        getSkillsStarwars().setText(String.format("%.2f",this.ai.secondFighter.getSkills() ));
                        getHpStarwars().setText(String.format("%.2f",this.ai.secondFighter.getHealthPoints() ));
                        getAgilityStarwars().setText(String.format("%.2f",this.ai.secondFighter.getAgility() ));
                        getStrengthStarwars().setText(String.format("%.2f",this.ai.secondFighter.getStrength() ));
                        
                        stNameField.setText(this.ai.characterInformation.get(this.ai.firstFighter.getID())[0]);
                        getIdStartrek().setText(String.valueOf(this.ai.firstFighter.getID()));
                        
                        getSkillsStartrek().setText(String.format("%.2f",this.ai.firstFighter.getSkills() ));
                        getHpStartrek().setText(String.format("%.2f",this.ai.firstFighter.getHealthPoints() ));
                        getAgilityStartrek().setText(String.format("%.2f",this.ai.firstFighter.getAgility() ));
                        getStrengthStartrek().setText(String.format("%.2f",this.ai.firstFighter.getStrength() ));
                        
                        
                        System.out.println("MATCHING CHARACTER: " + this.ai.characterInformation.get(this.ai.secondFighter.getID())[0]);
                        System.out.println("CURRENT IMAGE PATH: " + this.ai.characterInformation.get(this.ai.secondFighter.getID())[1]);
                        
                        
                        // Attempt to load and scale image
                        try {
                            
                            //set star wars image
                            swImagePath = this.ai.characterInformation.get(this.ai.secondFighter.getID())[1];
                            ImageIcon swIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(swImagePath));
                            Image swImg = swIcon.getImage().getScaledInstance(120, 140, Image.SCALE_SMOOTH);
                            swIcon = new ImageIcon(swImg);
                             
                            sw_image.setIcon(swIcon); // Set icon to label
                            
                            //set star trek image
                            stImagePath = this.ai.characterInformation.get(this.ai.firstFighter.getID())[1];
                            ImageIcon stIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(stImagePath));
                            Image stImg = stIcon.getImage().getScaledInstance(120, 140, Image.SCALE_SMOOTH);
                            stIcon = new ImageIcon(stImg);

                            st_image.setIcon(stIcon); // Set icon to label
                        } catch (Exception e) {
                            System.err.println("Error loading image: " + e.getMessage());
                            // Optionally set a default icon if the image fails to load
                        }

                        
                        printQueues();
                        cycle_counter++;
                        if(cycle_counter % 2 == 0)addCharacterToSim();
                    });
                } catch (InvocationTargetException ex) {
                    Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                getSync().release();
               
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
            } 


            
        }
    
    
}
    
    public void addCharacterToSim(){
        
        Random random = new Random();
        double rand = random.nextDouble();
        
        CreateCharacter newCharacter = new CreateCharacter();
        Character newStarWars = new Character();
        Character newStarTrek = new Character();
        
        if(rand <= 0.8){
            
            
            newStarWars = newCharacter.NewCharacter("STAR WARS", global_id);
            this.starwars.setCharacter(newStarWars);
            this.starwars.EnqueueProcess(this.starwars.character);
            characterInfoMap.put(global_id, rosterQueue.dequeue());
            
            global_id+= 1;
            newStarTrek = newCharacter.NewCharacter("STAR TREK", global_id);
            
            this.startrek.setCharacter(newStarTrek);
            this.startrek.EnqueueProcess(this.startrek.character);
            characterInfoMap.put(global_id, rosterQueue.dequeue());
            
            System.out.println("SE AGREGARON 2 PERSONAJES NUEVOS A LA SIMULACION");
            
        }
        
        
        
    }
    
     public void printQueues(){

        this.SWQ1.setText((String)getStarwars().getPq().getReadyQueues()[0].printQueue());
        this.SWQ2.setText((String)getStarwars().getPq().getReadyQueues()[1].printQueue());
        this.SWQ3.setText((String)getStarwars().getPq().getReadyQueues()[2].printQueue());
        this.SWRQ.setText((String)getStarwars().getReinforcementQueue().printQueue());
        
        this.STQ1.setText((String)getStartrek().getPq().getReadyQueues()[0].printQueue());
        this.STQ2.setText((String)getStartrek().getPq().getReadyQueues()[1].printQueue());
        this.STQ3.setText((String)getStartrek().getPq().getReadyQueues()[2].printQueue());
        this.STRQ.setText((String)getStartrek().getReinforcementQueue().printQueue());
        
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

    /**
     * @return the skillsStarwars
     */
    public JTextField getSkillsStarwars() {
        return skillsStarwars;
    }

    /**
     * @param skillsStarwars the skillsStarwars to set
     */
    public void setSkillsStarwars(JTextField skillsStarwars) {
        this.skillsStarwars = skillsStarwars;
    }

    /**
     * @return the skillsStartrek
     */
    public JTextField getSkillsStartrek() {
        return skillsStartrek;
    }

    /**
     * @param skillsStartrek the skillsStartrek to set
     */
    public void setSkillsStartrek(JTextField skillsStartrek) {
        this.skillsStartrek = skillsStartrek;
    }

    /**
     * @return the hpStarwars
     */
    public JTextField getHpStarwars() {
        return hpStarwars;
    }

    /**
     * @param hpStarwars the hpStarwars to set
     */
    public void setHpStarwars(JTextField hpStarwars) {
        this.hpStarwars = hpStarwars;
    }

    /**
     * @return the hpStartrek
     */
    public JTextField getHpStartrek() {
        return hpStartrek;
    }

    /**
     * @param hpStartrek the hpStartrek to set
     */
    public void setHpStartrek(JTextField hpStartrek) {
        this.hpStartrek = hpStartrek;
    }

    /**
     * @return the agilityStarwars
     */
    public JTextField getAgilityStarwars() {
        return agilityStarwars;
    }

    /**
     * @param agilityStarwars the agilityStarwars to set
     */
    public void setAgilityStarwars(JTextField agilityStarwars) {
        this.agilityStarwars = agilityStarwars;
    }

    /**
     * @return the agilityStartrek
     */
    public JTextField getAgilityStartrek() {
        return agilityStartrek;
    }

    /**
     * @param agilityStartrek the agilityStartrek to set
     */
    public void setAgilityStartrek(JTextField agilityStartrek) {
        this.agilityStartrek = agilityStartrek;
    }

    /**
     * @return the strengthStarwars
     */
    public JTextField getStrengthStarwars() {
        return strengthStarwars;
    }

    /**
     * @param strengthStarwars the strengthStarwars to set
     */
    public void setStrengthStarwars(JTextField strengthStarwars) {
        this.strengthStarwars = strengthStarwars;
    }

    /**
     * @return the strengthStartrek
     */
    public JTextField getStrengthStartrek() {
        return strengthStartrek;
    }

    /**
     * @param strengthStartrek the strengthStartrek to set
     */
    public void setStrengthStartrek(JTextField strengthStartrek) {
        this.strengthStartrek = strengthStartrek;
    }

    /**
     * @return the idStartrek
     */
    public JTextField getIdStartrek() {
        return idStartrek;
    }

    /**
     * @param idStartrek the idStartrek to set
     */
    public void setIdStartrek(JTextField idStartrek) {
        this.idStartrek = idStartrek;
    }

}


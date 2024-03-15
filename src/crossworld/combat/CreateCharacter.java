/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossworld.combat;

import java.util.Random;

/**
 *
 * @author juanm
 */
public class CreateCharacter {
    
    private int ID;
    private int priorityLevel;
    private int counter;
    private double skills;
    private double healthPoints;
    private double strength;
    private double agility;
    private Character newcharacter;
    
    public CreateCharacter(){
        
    }
    
    public CreateCharacter(int ID){
        
        this.ID = ID;
        this.counter = 0;
        this.priorityLevel = AssignPriorityLevel();
        
        
    }
    
     public int AssignPriorityLevel(){
        
        //variable to keep track of how many variables are of "quality"
        int qualityElementCounter = 0;
        
        double skills = 0.0;
        double healthPoints = 0.0;
        double strength = 0.0;
        double agility = 0.0;
        
        
        
        Random random = new Random();
        

        
        double ProbSkills = random.nextDouble();
        double ProbHealthPoints = random.nextDouble();
        double ProbStrength = random.nextDouble();
        double ProbAgility = random.nextDouble();
        
        
        if(ProbSkills <= 0.6)
        {
            qualityElementCounter+= 1; 
            
            skills = ProbSkills*10;
            
            this.setSkills(skills);
        }
        
        if(ProbHealthPoints <= 0.7) {
        
            qualityElementCounter+= 1; 
        
            healthPoints = ProbHealthPoints*10;
            
            this.setHealthPoints(healthPoints);
        }
        
        if(ProbStrength <= 0.5) {
            
            qualityElementCounter+= 1; 
        
            strength = ProbStrength*10;
            
            this.setStrength(strength);
        }
        
        if(ProbAgility <= 0.4) {
            
            qualityElementCounter+= 1; 
        
            agility = ProbAgility*10;
            
            this.setAgility(agility);
        }
        
        
        
       switch (qualityElementCounter) {
           
           case 4:
               
               this.setPriorityLevel(1);
        
               break;
    
           case 3:
        
               this.setPriorityLevel(1);
        
               break;
    
           case 2:
        
               this.setPriorityLevel(2);
        
               break;
    
           case 1:
        
               this.setPriorityLevel(3);
        
               break;
           
           default:
        
               if (qualityElementCounter == 0) {
            
                   this.setPriorityLevel(3);
        
               }
        
               break;
}
        
        
        
        return this.getPriorityLevel();
        
    }
     
    public Character NewCharacter(int ID){
        
        this.ID = ID;
        this.counter = 0;
        this.priorityLevel = AssignPriorityLevel();
        newcharacter = new Character(ID,priorityLevel,counter);
        newcharacter.setSkills(skills);
        newcharacter.setHealthPoints(healthPoints);
        newcharacter.setAgility(agility);
        newcharacter.setStrength(strength);
        
        return newcharacter;
    }
    
    public double getSkills() {
        return skills;
    }

    public void setSkills(double skills) {
        this.skills = skills;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getAgility() {
        return agility;
    }

    public void setAgility(double agility) {
        this.agility = agility;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
}

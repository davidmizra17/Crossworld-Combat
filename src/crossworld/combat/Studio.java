/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crossworld.combat;

import java.util.Random;

/**
 *
 * @author davidmizrahi
 */
public class Studio {
    
    private String name;
    
    private Character character;
    
    private PriorityQueue pq;
    
    private Queue<Character> reinforcementQueue;

   
    public Studio(String name, Character character){
        
        this.name = name;
       
        this.character = character;
        
        this.pq = new PriorityQueue();
        
        this.reinforcementQueue = new Queue();
        
        
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public PriorityQueue getPq() {
        return pq;
    }

    public void setPq(PriorityQueue pq) {
        this.pq = pq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public Queue<Character> getReinforcementQueue() {
        return reinforcementQueue;
    }

    public void setReinforcementQueue(Queue<Character> reinforcementQueue) {
        this.reinforcementQueue = reinforcementQueue;
    }
    

    
    
    public int AssignPriorityLevel(Character character){
        
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
            
            character.setSkills(skills);
        }
        
        if(ProbHealthPoints <= 0.7) {
        
            qualityElementCounter+= 1; 
        
            healthPoints = ProbHealthPoints*10;
            
            character.setHealthPoints(healthPoints);
        }
        
        if(ProbStrength <= 0.5) {
            
            qualityElementCounter+= 1; 
        
            strength = ProbStrength*10;
            
            character.setStrength(strength);
        }
        
        if(ProbAgility <= 0.4) {
            
            qualityElementCounter+= 1; 
        
            agility = ProbAgility*10;
            
            character.setAgility(agility);
        }
        
        
        
       switch (qualityElementCounter) {
           
           case 4:
               
               character.setPriorityLevel(1);
        
               break;
    
           case 3:
        
               character.setPriorityLevel(1);
        
               break;
    
           case 2:
        
               character.setPriorityLevel(2);
        
               break;
    
           case 1:
        
               character.setPriorityLevel(3);
        
               break;
           
           default:
        
               if (qualityElementCounter == 0) {
            
                   character.setPriorityLevel(3);
        
               }
        
               break;
}
        
        
        
        return character.getPriorityLevel();
        
    }

   
    
    public void EnqueueProcess(Character character){
        
        
        
        
        int characterLevel = AssignPriorityLevel(character);
        
       try{
           pq.getQueueSemaphores()[characterLevel - 1].acquire();
           pq.getReadyQueues()[characterLevel - 1].enqueue(character);
           
       } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // release the corresponding semaphore
            pq.getQueueSemaphores()[characterLevel - 1].release();
        }
        
        
        
        
    }
    
    
    
    
}

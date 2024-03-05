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
    
    public Studio(String name, Character character){
        
        this.name = name;
       
        this.character = character;
        
        this.pq = new PriorityQueue();
        
        
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

    
    
    public int AssignPriorityLevel(Character character){
        
        //variable to keep track of how many variables are of "quality"
        int elementCounter = 0;
        
        boolean habilidades = false;
        boolean puntosDeVida = false;
        boolean fuerza = false;
        boolean agilidad = false;
        
        
        
        Random random = new Random();
        

        
        double ProbHabilidades = random.nextDouble();
        double ProbPuntosDeVida = random.nextDouble();
        double ProbFuerza = random.nextDouble();
        double ProbAgilidad = random.nextDouble();
        
        
        if(ProbHabilidades <= 0.6)
        {
            elementCounter+= 1; 
            
            habilidades = true;
        }
        if(ProbPuntosDeVida <= 0.7) {
        
            elementCounter+= 1; 
        
            puntosDeVida = true;
        }
        if(ProbFuerza <= 0.5) {
            
            elementCounter+= 1; 
        
            fuerza = true;
        }
        
        if(ProbAgilidad <= 0.4) {
            
            elementCounter+= 1; 
        
            agilidad = true;
        }
        
       switch (elementCounter) {
           
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
        
               if (elementCounter == 0) {
            
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

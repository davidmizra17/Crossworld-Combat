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
public class Character{
    
    private int ID;
    private int priorityLevel;
    private int counter;
    
    
    public Character(int ID, int priorityLevel, int counter){
        
        this.ID = ID;
        this.priorityLevel = priorityLevel;
        this.counter = counter;
        
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
    
//    public int AssignPriorityLevel(Character character){
//        
//        //variable to keep track of how many variables are of "quality"
//        int elementCounter = 0;
//        
//        boolean habilidades = false;
//        boolean puntosDeVida = false;
//        boolean fuerza = false;
//        boolean agilidad = false;
//        
//        
//        
//        Random random = new Random();
//        
//
//        
//        double ProbHabilidades = random.nextDouble();
//        double ProbPuntosDeVida = random.nextDouble();
//        double ProbFuerza = random.nextDouble();
//        double ProbAgilidad = random.nextDouble();
//        
//        
//        if(ProbHabilidades <= 0.6) elementCounter+= 1; habilidades = true;
//        if(ProbPuntosDeVida <= 0.7) elementCounter+= 1; puntosDeVida = true;
//        if(ProbFuerza <= 0.5) elementCounter+= 1; fuerza = true;
//        if(ProbAgilidad <= 0.4) elementCounter+= 1; agilidad = true;
//        
//       switch (elementCounter) {
//    
//           case 3:
//        
//               priorityLevel = 1;
//        
//               break;
//    
//           case 2:
//        
//               priorityLevel = 2;
//        
//               break;
//    
//           case 1:
//        
//               priorityLevel = 3;
//        
//               break;
//           
//           default:
//        
//               if (elementCounter == 0) {
//            
//                   priorityLevel = 3;
//        
//               }
//        
//               break;
//}
//        
//        
//        
//        return priorityLevel;
//        
//    }
//    
//    public void EnqueueProcess(Character character){
//        
//        Queue q1 = new Queue();
//        Queue q2 = new Queue();
//        Queue q3 = new Queue();
//        
//        
//        int characterLevel = AssignPriorityLevel(character);
//        
//        if(characterLevel == 1) q1.enqueue(character);
//        else if(characterLevel == 2) q2.enqueue(character);
//        else if(characterLevel == 3) q3.enqueue(character);
//        
//        
//        
//        
//    }
    
    
    
    
}

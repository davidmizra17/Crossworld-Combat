/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crossworld.combat;

import java.util.Random;

/**
 *
 * @author davidmizrahi
 */
public class CrossWorldCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//          Character charactery= new Character(3,2,4);
//      
            
            Character character= new Character(3,2,4);
            Character character1= new Character(1,0,5);
            Character character2= new Character(4,9,4);
            Character character3= new Character(5,5,2);
            Character character4= new Character(2,3,9);
            Character character5= new Character(9,1,3);
            
            
            Administrator cm = new Administrator();
            
            
  
            
            
            
            cm.EnqueueProcess(character);
            cm.EnqueueProcess(character1);
            cm.EnqueueProcess(character2);
            cm.EnqueueProcess(character3);
            cm.EnqueueProcess(character4);
            cm.EnqueueProcess(character5);
    
    }
    }
    


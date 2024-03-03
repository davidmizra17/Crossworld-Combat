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
        Random random = new Random();
        
        double r = 0.0;
        
        for (int i = 0; i < 10; i++) {
            r = random.nextDouble();
            if(r <= 1) System.out.println("Doing something 40% of the time");
            
            else System.out.println("The rest 60%");
            
            
            
        }
    }
    
}

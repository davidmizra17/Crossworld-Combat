/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crossworld.combat;

import Views.GUI;
import java.io.File;
import java.util.Random;

/**
 *
 * @author davidmizrahi
 */
public class CrossWorldCombat {
    
    private Character avatar;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File file = new File("src/Assets/StarWarsCharacters/BibFortuna_copy.png");
        System.out.println("File exists: " + file.exists());
        System.out.println("File can be read: " + file.canRead());

        
        
        GUI ui = new GUI();

        ui.setVisible(true);
        
    
    }
    }
    


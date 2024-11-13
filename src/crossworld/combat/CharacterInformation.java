/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crossworld.combat;

/**
 *
 * @author davidmizrahi
 */
public class CharacterInformation {
    
    public static final String[] STAR_WARS_NAMES = {
        "Luke Skywalker", 
        "Leia Organa", 
        "Han Solo", 
        "Darth Vader", 
        "Obi-Wan Kenobi", 
        "Yoda", 
        "Chewbacca", 
        "R2-D2", 
        "C-3PO", 
        "Lando Calrissian", 
        "Boba Fett", 
        "Emperor Palpatine", 
        "Wedge Antilles", 
        "Admiral Ackbar", 
        "Jabba the Hutt", 
        "Biggs Darklighter", 
        "Mon Mothma", 
        "Nien Nunb", 
        "Greedo", 
        "Bib Fortuna"
    };
    
    public static final String[] STAR_TREK_NAMES = {
        "James T. Kirk", 
        "Spock", 
        "Leonard 'Bones' McCoy", 
        "Montgomery 'Scotty' Scott", 
        "Hikaru Sulu", 
        "Nyota Uhura", 
        "Pavel Chekov", 
        "Christine Chapel", 
        "Khan Noonien Singh", 
        "T'Pring", 
        "Harry Mudd", 
        "Gorn Captain", 
        "Gary Mitchell", 
        "Sarek", 
        "Janice Rand", 
        "Sybok", 
        "Carol Marcus", 
        "Stonn", 
        "Kor", 
        "Commander Koloth"
};
    
    public static final String[] STAR_WARS_IMAGES = {
        
        "src/Assets/StarWarsCharacters/LukeSkywalker.png",       // Luke Skywalker
        "src/Assets/StarWarsCharacters/Leiaorgana.png",          // Leia Organa
        "src/Assets/StarWarsCharacters/HanSolo.png",             // Han Solo
        "src/Assets/StarWarsCharacters/DarthVader.png",          // Darth Vader
        "src/Assets/StarWarsCharacters/ObiWanKenobi.png",        // Obi-Wan Kenobi
        "src/Assets/StarWarsCharacters/Yoda.png",                // Yoda
        "src/Assets/StarWarsCharacters/Chewbacca.png",           // Chewbacca
        "src/Assets/StarWarsCharacters/r2d2.png",                // R2-D2
        "src/Assets/StarWarsCharacters/C-3PO_.png",              // C-3PO
        "src/Assets/StarWarsCharacters/LandoClarissian.png",     // Lando Calrissian
        "src/Assets/StarWarsCharacters/BobFett.png",             // Boba Fett
        "src/Assets/StarWarsCharacters/EmperorPalpatine.png",    // Emperor Palpatine
        "src/Assets/StarWarsCharacters/WedgeAntilles.png",       // Wedge Antilles
        "https://lumiere-a.akamaihd.net/v1/images/databank_ackbar_01_169_55137220.jpeg?region=0%2C49%2C1560%2C780",       // Admiral Ackbar
        "src/Assets/StarWarsCharacters/JabbaTheHutt.png",        // Jabba the Hutt
        "src/Assets/StarWarsCharacters/BiggsDarklighter.png",    // Biggs Darklighter
        "src/Assets/StarWarsCharacters/MonMothma.png",           // Mon Mothma
        "src/Assets/StarWarsCharacters/NienNunb.png",            // Nien Nunb
        "src/Assets/StarWarsCharacters/Greedo.png",              // Greedo
        "src/Assets/StarWarsCharacters/BibFortuna.png"

    };
            
    public static final String[] STAR_TREK_IMAGES = {
        
      "src/Assets/StarTrekCharacters/CaptainKirk.png",         // James T. Kirk
       "src/Assets/StarTrekCharacters/Spock.png",               // Spock
       "src/Assets/StarTrekCharacters/LeonardMcCoy.png",        // Leonard "Bones" McCoy
       "src/Assets/StarTrekCharacters/MontgomeryScott.png",     // Montgomery "Scotty" Scott
       "src/Assets/StarTrekCharacters/HikaruSulu.png",          // Hikaru Sulu
       "src/Assets/StarTrekCharacters/NyotaUhura.png",          // Nyota Uhura
       "src/Assets/StarTrekCharacters/PavelChekov.png",         // Pavel Chekov
       "src/Assets/StarTrekCharacters/ChristineChapel.png",     // Christine Chapel
       "src/Assets/StarTrekCharacters/KhanSingh.png",           // Khan Noonien Singh
       "src/Assets/StarTrekCharacters/TPring.png",              // T'Pring
       "src/Assets/StarTrekCharacters/HarryMudd.png",           // Harry Mudd
       "src/Assets/StarTrekCharacters/GornCaptain.png",         // Gorn Captain
       "src/Assets/StarTrekCharacters/GaryMitchell.png",        // Gary Mitchell
       "src/Assets/StarTrekCharacters/Sarek.png",               // Sarek
       "src/Assets/StarTrekCharacters/JaniceRand.png",          // Janice Rand
       "src/Assets/StarTrekCharacters/Sybok.png",               // Sybok
       "src/Assets/StarTrekCharacters/CarolMarcus.png",         // Carol Marcus
       "src/Assets/StarTrekCharacters/Stonn.png",               // Stonn
       "src/Assets/StarTrekCharacters/Kor.png",                 // Kor
       "src/Assets/StarTrekCharacters/CommanderKoloth.png" 
            

    };
    
    //THIS FUNCTION RETURNS A 2D ARRAY THAT CREATES A RELATIONSHIP BETWEEN NAME AND IMAGE
    public static String[][] generateCharacterInfo(){
        
        String[][] characterInfo = new String[40][2];
        int j = 0;
        
        for (int i = 0; i < characterInfo.length; i++) {
            
            if(i < 20){
                
                characterInfo[i] = new String[]{STAR_WARS_NAMES[i], STAR_WARS_IMAGES[i]};
                
            }else{
                
                characterInfo[i] = new String[]{STAR_TREK_NAMES[j], STAR_TREK_IMAGES[j]};
                j++;
                
            }
            
        }
        return characterInfo;
    }
    
  
        
}

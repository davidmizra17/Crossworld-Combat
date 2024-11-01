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
        
        "src/Assets/StarWarsCharacters/AdmiralAckbar.png",
        "src/Assets/StarWarsCharacters/BibFortuna.png",
        "src/Assets/StarWarsCharacters/BiggsDarklighter.png",
        "src/Assets/StarWarsCharacters/BobFett.png",
        "src/Assets/StarWarsCharacters/C-3PO_.png",
        
        "src/Assets/StarWarsCharacters/Chewbacca.png",
        "src/Assets/StarWarsCharacters/DarthVader.png",
        "src/Assets/StarWarsCharacters/EmperorPalpatine.png",
        "src/Assets/StarWarsCharacters/Greedo.png",
        "src/Assets/StarWarsCharacters/HanSolo.png",
        
        "src/Assets/StarWarsCharacters/JabbaTheHutt.png",
        "src/Assets/StarWarsCharacters/LandoClarissian.png",
        "src/Assets/StarWarsCharacters/Leiaorgana.png",
        "src/Assets/StarWarsCharacters/LukeSkywalker.png",
        "src/Assets/StarWarsCharacters/MonMothma.png",
        
        "src/Assets/StarWarsCharacters/NienNunb.png",
        "src/Assets/StarWarsCharacters/ObiWanKenobi.png",
        "src/Assets/StarWarsCharacters/WedgeAntilles.png",
        "src/Assets/StarWarsCharacters/Yoda.png",
        "src/Assets/StarWarsCharacters/r2d2.png"

    };
            
    public static final String[] STAR_TREK_IMAGES = {
        
        "src/Assets/StarTrekCharacters/CaptainKirk.png",
        "src/Assets/StarTrekCharacters/CarolMarcus.png",
        "src/Assets/StarTrekCharacters/ChristineChapel.png",
        "src/Assets/StarTrekCharacters/CommanderKoloth.png",
        "src/Assets/StarTrekCharacters/GaryMitchell.png",
        "src/Assets/StarTrekCharacters/GornCaptain.png",
        "src/Assets/StarTrekCharacters/HarryMudd.png",
        "src/Assets/StarTrekCharacters/HikaruSulu.png",
        "src/Assets/StarTrekCharacters/JaniceRand.png",
        "src/Assets/StarTrekCharacters/KhanSingh.png",
        "src/Assets/StarTrekCharacters/Kor.png",
        "src/Assets/StarTrekCharacters/LeonardMcCoy.png",
        "src/Assets/StarTrekCharacters/MontgomeryScott.png",
        "src/Assets/StarTrekCharacters/NyotaUhura.png",
        "src/Assets/StarTrekCharacters/PavelChekov.png",
        "src/Assets/StarTrekCharacters/Sarek.png",
        "src/Assets/StarTrekCharacters/Spock.png",
        "src/Assets/StarTrekCharacters/Stonn.png",
        "src/Assets/StarTrekCharacters/Sybok.png",
        "src/Assets/StarTrekCharacters/TPring.png"
            

    };
    
    //THIS FUNCTION RETURNS A 2D ARRAY THAT CREATES A RELATIONSHIP BETWEEN NAME AND IMAGE
    public static String[][] generateCharacterInfo(){
        
        String[][] characterInfo = new String[40][2];
        int j = 0;
        
        for (int i = 0; i < characterInfo.length; i++) {
            
            if(i < STAR_WARS_IMAGES.length){
                
                characterInfo[i] = new String[]{STAR_WARS_NAMES[i], STAR_WARS_IMAGES[i]};
                
            }else{
                
                characterInfo[i] = new String[]{STAR_TREK_NAMES[j], STAR_TREK_IMAGES[j]};
                j++;
                
            }
            
        }
        return characterInfo;
    }
    
  
        
}

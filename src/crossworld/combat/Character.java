/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crossworld.combat;

/**
 *
 * @author davidmizrahi
 */
public class Character extends Thread{
    
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
    
    
    
    
}

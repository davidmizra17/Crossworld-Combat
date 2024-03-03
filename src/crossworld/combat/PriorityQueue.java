/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crossworld.combat;

import java.util.concurrent.Semaphore;

/**
 *
 * @author davidmizrahi
 */
public class PriorityQueue {
    private Queue<Character>[] readyQueues;
    private Semaphore[] queueSemaphores;
    
    
    
    public PriorityQueue(){
        this.readyQueues = new Queue[3];
        this.queueSemaphores = new Semaphore[3];
        
        
        for (int i = 0; i < 3; i++) {
            readyQueues[i] = new Queue<>();
            queueSemaphores[i] = new Semaphore(1); // Inicialmente permitimos acceso a un solo hilo
        }
    }

    public Queue<Character>[] getReadyQueues() {
        return readyQueues;
    }

    public void setReadyQueues(Queue<Character>[] readyQueues) {
        this.readyQueues = readyQueues;
    }

    public Semaphore[] getQueueSemaphores() {
        return queueSemaphores;
    }

    public void setQueueSemaphores(Semaphore[] queueSemaphores) {
        this.queueSemaphores = queueSemaphores;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import crossworld.combat.Administrator;
import crossworld.combat.ArtificialIntelligence;
import crossworld.combat.CreateCharacter;
import crossworld.combat.Studio;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author davidmizrahi
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    
    private Administrator admin;
    private ArtificialIntelligence AI;
    private Studio avatar;
    private Studio regularShow;
    private CreateCharacter newCharacter;
    private int ID_Counter;
    
    public GUI(){
        
        
        initComponents();
        setLocationRelativeTo(null);
        
        
        this.AI = new ArtificialIntelligence();
        
        
        this.newCharacter = new CreateCharacter();
        
        this.avatar = new Studio();
        this.regularShow = new Studio();
        
        crossworld.combat.Character[] character_avatar = new crossworld.combat.Character[8];
        crossworld.combat.Character[] character_regularShow = new crossworld.combat.Character[8];
        
        
        for (int i = 0; i < character_avatar.length; i++) {
            
            
            
            ID_Counter++;            
            character_avatar[i] = newCharacter.NewCharacter(ID_Counter);
            
        }
        
     for (int i = 0; i < character_regularShow.length; i++) {
            ID_Counter++;
            character_regularShow[i] = newCharacter.NewCharacter(ID_Counter);
            
        }
        
        
                    this.avatar.setCharacter(character_avatar[0]);
                    this.avatar.EnqueueProcess();
                    this.avatar.setCharacter(character_avatar[1]);
                    this.avatar.EnqueueProcess();
                    this.avatar.setCharacter(character_avatar[2]);
                    this.avatar.EnqueueProcess();
                    this.avatar.setCharacter(character_avatar[3]);
                    this.avatar.EnqueueProcess();
                    this.avatar.setCharacter(character_avatar[4]);
                    this.avatar.EnqueueProcess();
                    this.avatar.setCharacter(character_avatar[5]);
                    this.avatar.EnqueueProcess();
                    this.avatar.setCharacter(character_avatar[6]);
                    this.avatar.EnqueueProcess();
                    this.avatar.setCharacter(character_avatar[7]);
                    this.avatar.EnqueueProcess();
                    
                    
                    
                    
                    this.regularShow.setCharacter(character_regularShow[0]);
                    this.regularShow.EnqueueProcess();
                    this.regularShow.setCharacter(character_regularShow[1]);
                    this.regularShow.EnqueueProcess();
                    this.regularShow.setCharacter(character_regularShow[2]);
                    this.regularShow.EnqueueProcess();
                    this.regularShow.setCharacter(character_regularShow[3]);
                    this.regularShow.EnqueueProcess();
                    this.regularShow.setCharacter(character_regularShow[4]);
                    this.regularShow.EnqueueProcess();
                    this.regularShow.setCharacter(character_regularShow[5]);
                    this.regularShow.EnqueueProcess();
                    this.regularShow.setCharacter(character_regularShow[6]);
                    this.regularShow.EnqueueProcess();
                    this.regularShow.setCharacter(character_regularShow[7]);
                    this.regularShow.EnqueueProcess();
                    
                    
                    Semaphore s = new Semaphore(0);
                    Semaphore AI_Sem = new Semaphore(0);
                    
                    this.admin = new Administrator(this.avatar, this.regularShow, this.AI, s);
        
        

        
//        ArtificialIntelligence(crossworld.combat.Character firstFighter, crossworld.combat.Character secondFighter, Administrator admin)


        
        
        
//        getAdmin().start();
        

//        getAdmin().setFighters();

        getAI().setSem(AI_Sem);
        getAI().setAdmin(admin);
        for (int i = 0; i < 15; i++) {
            
            getAdmin().setFighters();
        
            String outcome;
        try {
            outcome = getAI().fightOutcome();
             System.out.println("Fight Outcome:\n");
                System.out.println(outcome);
                System.out.println("-------------------");
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        
//        getAdmin().start();
        
//        
//        getAI().start();
        
        
        
    }
    
    

    public Administrator getAdmin() {
        return admin;
    }

    public void setAdmin(Administrator admin) {
        this.admin = admin;
    }

    public ArtificialIntelligence getAI() {
        return AI;
    }

    public void setAI(ArtificialIntelligence AI) {
        this.AI = AI;
    }

    public Studio getAvatar() {
        return avatar;
    }

    public void setAvatar(Studio avatar) {
        this.avatar = avatar;
    }

    public Studio getRegularShow() {
        return regularShow;
    }

    public void setRegularShow(Studio regularShow) {
        this.regularShow = regularShow;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        simulationStart = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        simulationStart.setText("Iniciar Simulación");
        simulationStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulationStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(simulationStart)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(simulationStart)
                .addContainerGap(410, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 610));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simulationStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulationStartActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_simulationStartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton simulationStart;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import crossworld.combat.Administrator;
import crossworld.combat.ArtificialIntelligence;
import crossworld.combat.CreateCharacter;
import crossworld.combat.Studio;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.concurrent.Semaphore;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.JTextField;

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
        

        crossworld.combat.Character[] character_avatar = new crossworld.combat.Character[20];
        crossworld.combat.Character[] character_regularShow = new crossworld.combat.Character[20];

        
        
        for (int i = 0; i < character_avatar.length; i++) {
            
            
            
            ID_Counter++;            
            character_avatar[i] = newCharacter.NewCharacter("AVATAR", ID_Counter);
            
        }
        
        for (int i = 0; i < character_regularShow.length; i++) {
            ID_Counter++;
            character_regularShow[i] = newCharacter.NewCharacter("REGULAR SHOW", ID_Counter);
            
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
                    this.avatar.setCharacter(character_avatar[8]);
                    this.avatar.EnqueueProcess();
                    this.avatar.setCharacter(character_avatar[9]);
                    this.avatar.EnqueueProcess();
                    this.avatar.setCharacter(character_avatar[10]);
                    this.avatar.EnqueueProcess();
                    this.avatar.setCharacter(character_avatar[11]);
                    this.avatar.EnqueueProcess();
                    this.avatar.setCharacter(character_avatar[12]);
                    this.avatar.EnqueueProcess();
                    this.avatar.setCharacter(character_avatar[13]);
                    this.avatar.EnqueueProcess();
                    this.avatar.setCharacter(character_avatar[14]);
                    this.avatar.EnqueueProcess();
                    this.avatar.setCharacter(character_avatar[15]);
                    this.avatar.EnqueueProcess();
                    this.avatar.setCharacter(character_avatar[16]);
                    this.avatar.EnqueueProcess();
                    this.avatar.setCharacter(character_avatar[17]);
                    this.avatar.EnqueueProcess();
                    this.avatar.setCharacter(character_avatar[18]);
                    this.avatar.EnqueueProcess();
                    this.avatar.setCharacter(character_avatar[19]);
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
                    this.regularShow.setCharacter(character_regularShow[8]);
                    this.regularShow.EnqueueProcess();
                    this.regularShow.setCharacter(character_regularShow[9]);
                    this.regularShow.EnqueueProcess();
                    this.regularShow.setCharacter(character_regularShow[10]);
                    this.regularShow.EnqueueProcess();
                    this.regularShow.setCharacter(character_regularShow[11]);
                    this.regularShow.EnqueueProcess();
                    this.regularShow.setCharacter(character_regularShow[12]);
                    this.regularShow.EnqueueProcess();
                    this.regularShow.setCharacter(character_regularShow[13]);
                    this.regularShow.EnqueueProcess();
                    this.regularShow.setCharacter(character_regularShow[14]);
                    this.regularShow.EnqueueProcess();
                    this.regularShow.setCharacter(character_regularShow[15]);
                    this.regularShow.EnqueueProcess();
                    this.regularShow.setCharacter(character_regularShow[16]);
                    this.regularShow.EnqueueProcess();
                    this.regularShow.setCharacter(character_regularShow[17]);
                    this.regularShow.EnqueueProcess();
                    this.regularShow.setCharacter(character_regularShow[18]);
                    this.regularShow.EnqueueProcess();
                    this.regularShow.setCharacter(character_regularShow[19]);
                    this.regularShow.EnqueueProcess();

                    
                    Semaphore sync = new Semaphore(0);
                    Semaphore AI_Sem = new Semaphore(0);
                    

                    this.admin = new Administrator(this.regularShow, this.avatar, this.AI, sync, AI_Sem);
                    
   
        getAI().setSync(sync);
        getAI().setSyncAI(AI_Sem);
        getAI().setAdmin(admin);
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AVPriorityQ3 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        AVPriorityQ2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        AVPriorityQ1 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        AVReinforcementQ = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        simulationStart = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        RSPriorityQ3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        RSPriorityQ2 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        RSPriorityQ1 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        RSReinforcementQ = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        TimeControl = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        IDavatar = new javax.swing.JTextField();
        SkillsAvatar = new javax.swing.JTextField();
        HPavatar = new javax.swing.JTextField();
        Agilityavatar = new javax.swing.JTextField();
        Strengthavatar = new javax.swing.JTextField();
        ResultadoIA = new javax.swing.JTextField();
        IDrs = new javax.swing.JTextField();
        Skillsrs = new javax.swing.JTextField();
        HPrs = new javax.swing.JTextField();
        Agilityrs = new javax.swing.JTextField();
        Strengthrs = new javax.swing.JTextField();
        ActividadIA = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Victoriasrs = new javax.swing.JTextField();
        Victoriasavatar = new javax.swing.JTextField();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Avatar");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 80, 40));

        jLabel4.setText("Colas");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 80, 40));

        AVPriorityQ3.setColumns(20);
        AVPriorityQ3.setRows(5);
        jScrollPane1.setViewportView(AVPriorityQ3);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, 60));

        AVPriorityQ2.setColumns(20);
        AVPriorityQ2.setRows(5);
        jScrollPane2.setViewportView(AVPriorityQ2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 60));

        AVPriorityQ1.setColumns(20);
        AVPriorityQ1.setRows(5);
        jScrollPane3.setViewportView(AVPriorityQ1);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 60));

        AVReinforcementQ.setColumns(20);
        AVReinforcementQ.setRows(5);
        jScrollPane8.setViewportView(AVReinforcementQ);

        jPanel2.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 610));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        simulationStart.setText("Iniciar Simulación");
        simulationStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulationStartActionPerformed(evt);
            }
        });
        getContentPane().add(simulationStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Colas");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 80, 40));

        jLabel5.setText("Un Show Mas");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 90, 40));

        RSPriorityQ3.setColumns(20);
        RSPriorityQ3.setRows(5);
        jScrollPane4.setViewportView(RSPriorityQ3);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, 60));

        RSPriorityQ2.setColumns(20);
        RSPriorityQ2.setRows(5);
        jScrollPane5.setViewportView(RSPriorityQ2);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, 60));

        RSPriorityQ1.setColumns(20);
        RSPriorityQ1.setRows(5);
        jScrollPane6.setViewportView(RSPriorityQ1);

        jPanel5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, 50));

        RSReinforcementQ.setColumns(20);
        RSReinforcementQ.setRows(5);
        jScrollPane7.setViewportView(RSReinforcementQ);

        jPanel5.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 460, 610));

        jLabel1.setText("Fighter Avatar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 110, 40));

        TimeControl.setText("Tiempo");
        TimeControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeControlActionPerformed(evt);
            }
        });
        getContentPane().add(TimeControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, -1, -1));

        jLabel6.setText("Fighter Un Show Mas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 140, 40));

        jLabel7.setText("Resultado del Combate");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 150, 40));

        jLabel8.setText("ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 20, 40));

        jLabel9.setText("Skills");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 40, 40));

        jLabel10.setText("Health Points");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, 40));

        jLabel11.setText("Agility");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 60, 40));

        jLabel12.setText("Strength");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 60, 40));

        jLabel13.setText("Inteligencia Artificial");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 150, 40));

        IDavatar.setEditable(false);
        IDavatar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IDavatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDavatarActionPerformed(evt);
            }
        });
        getContentPane().add(IDavatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 100, -1));

        SkillsAvatar.setEditable(false);
        SkillsAvatar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SkillsAvatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkillsAvatarActionPerformed(evt);
            }
        });
        getContentPane().add(SkillsAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 100, -1));

        HPavatar.setEditable(false);
        HPavatar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        HPavatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HPavatarActionPerformed(evt);
            }
        });
        getContentPane().add(HPavatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 100, -1));

        Agilityavatar.setEditable(false);
        Agilityavatar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Agilityavatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgilityavatarActionPerformed(evt);
            }
        });
        getContentPane().add(Agilityavatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 100, -1));

        Strengthavatar.setEditable(false);
        Strengthavatar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Strengthavatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrengthavatarActionPerformed(evt);
            }
        });
        getContentPane().add(Strengthavatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 100, -1));

        ResultadoIA.setEditable(false);
        ResultadoIA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ResultadoIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoIAActionPerformed(evt);
            }
        });
        getContentPane().add(ResultadoIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 100, -1));

        IDrs.setEditable(false);
        IDrs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IDrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDrsActionPerformed(evt);
            }
        });
        getContentPane().add(IDrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 100, -1));

        Skillsrs.setEditable(false);
        Skillsrs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Skillsrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkillsrsActionPerformed(evt);
            }
        });
        getContentPane().add(Skillsrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 100, -1));

        HPrs.setEditable(false);
        HPrs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        HPrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HPrsActionPerformed(evt);
            }
        });
        getContentPane().add(HPrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 100, -1));

        Agilityrs.setEditable(false);
        Agilityrs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Agilityrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgilityrsActionPerformed(evt);
            }
        });
        getContentPane().add(Agilityrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 100, -1));

        Strengthrs.setEditable(false);
        Strengthrs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Strengthrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrengthrsActionPerformed(evt);
            }
        });
        getContentPane().add(Strengthrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 100, -1));

        ActividadIA.setEditable(false);
        ActividadIA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ActividadIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActividadIAActionPerformed(evt);
            }
        });
        getContentPane().add(ActividadIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 100, -1));

        jLabel14.setText("Victorias");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, -1, -1));

        Victoriasrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VictoriasrsActionPerformed(evt);
            }
        });
        getContentPane().add(Victoriasrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 100, -1));

        Victoriasavatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VictoriasavatarActionPerformed(evt);
            }
        });
        getContentPane().add(Victoriasavatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simulationStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulationStartActionPerformed
        // TODO add your handling code here:
//        getAdmin().start();
//        getAI().start();
//        getAdmin().start();
        getAI().setAVQ1(AVPriorityQ1);
        getAI().setAVQ2(AVPriorityQ2);
        getAI().setAVQ3(AVPriorityQ3);
        getAI().setAVRQ(AVReinforcementQ);
        
                
        getAI().setRSQ1(RSPriorityQ1);
        getAI().setRSQ2(RSPriorityQ2);
        getAI().setRSQ3(RSPriorityQ3);
        getAI().setRSRQ(RSReinforcementQ);
        
        getAI().setTextField(ResultadoIA);
        getAI().setIdAvatar(IDavatar);
        getAI().setSkillsAvatar(SkillsAvatar);
        getAI().setHpAvatar(HPavatar);
        getAI().setAgilityAvatar(Agilityavatar);
        getAI().setStrengthAvatar(Strengthavatar);
        getAI().setIdRS(IDrs);
        getAI().setSkillsRS(Skillsrs);
        getAI().setHpRS(HPrs);
        getAI().setAgilityRS(Agilityrs);
        getAI().setStrengthRS(Strengthrs);
        getAI().setVictoriasAvatar(Victoriasavatar);
        getAI().setVictoriasRS(Victoriasrs);
        getAI().setActividadAI(ActividadIA);
        
        
        getAdmin().start();
        getAI().start();  
       
          


//          IDavatar.setText(getAI().getIdAvatar().getText());
//          SkillsAvatar.setText(getAI().getSkillsAvatar().getText());
//          HPavatar.setText(getAI().getHpAvatar().getText());
//          Agilityavatar.setText(getAI().getAgilityAvatar().getText());
//          Strengthavatar.setText(getAI().getStrengthAvatar().getText());
          
          
        
        
        
        
        
        
        
//        ActividadAI.setText("Esperandoooo");
    }//GEN-LAST:event_simulationStartActionPerformed

    private void TimeControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeControlActionPerformed
        // TODO add your handling code here:
        String timewanted = JOptionPane.showInputDialog(null, "Introduzca el tiempo (en segundos) que quieres que tarde la Inteligencia Artificial en decidir el resultado de la batalla: ");
        int time = Integer.valueOf(timewanted);
        getAI().setTimeSleep(time*1000);
    }//GEN-LAST:event_TimeControlActionPerformed

    private void IDavatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDavatarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDavatarActionPerformed

    private void SkillsAvatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkillsAvatarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SkillsAvatarActionPerformed

    private void HPavatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HPavatarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HPavatarActionPerformed

    private void AgilityavatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgilityavatarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgilityavatarActionPerformed

    private void StrengthavatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StrengthavatarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StrengthavatarActionPerformed

    private void ResultadoIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultadoIAActionPerformed

    private void IDrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDrsActionPerformed

    private void SkillsrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkillsrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SkillsrsActionPerformed

    private void HPrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HPrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HPrsActionPerformed

    private void AgilityrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgilityrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgilityrsActionPerformed

    private void StrengthrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StrengthrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StrengthrsActionPerformed

    private void ActividadIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActividadIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActividadIAActionPerformed

    private void VictoriasrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VictoriasrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VictoriasrsActionPerformed

    private void VictoriasavatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VictoriasavatarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VictoriasavatarActionPerformed

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
    private javax.swing.JTextArea AVPriorityQ1;
    private javax.swing.JTextArea AVPriorityQ2;
    private javax.swing.JTextArea AVPriorityQ3;
    private javax.swing.JTextArea AVReinforcementQ;
    private javax.swing.JTextField ActividadIA;
    private javax.swing.JTextField Agilityavatar;
    private javax.swing.JTextField Agilityrs;
    private javax.swing.JTextField HPavatar;
    private javax.swing.JTextField HPrs;
    private javax.swing.JTextField IDavatar;
    private javax.swing.JTextField IDrs;
    private javax.swing.JTextArea RSPriorityQ1;
    private javax.swing.JTextArea RSPriorityQ2;
    private javax.swing.JTextArea RSPriorityQ3;
    private javax.swing.JTextArea RSReinforcementQ;
    private javax.swing.JTextField ResultadoIA;
    private javax.swing.JTextField SkillsAvatar;
    private javax.swing.JTextField Skillsrs;
    private javax.swing.JTextField Strengthavatar;
    private javax.swing.JTextField Strengthrs;
    private javax.swing.JButton TimeControl;
    private javax.swing.JTextField Victoriasavatar;
    private javax.swing.JTextField Victoriasrs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JButton simulationStart;
    // End of variables declaration//GEN-END:variables

//    public CreateCharacter getNewCharacter() {
//        return newCharacter;
//    }
//
//    public void setNewCharacter(CreateCharacter newCharacter) {
//        this.newCharacter = newCharacter;
//    }
//
//    public int getID_Counter() {
//        return ID_Counter;
//    }
//
//    public void setID_Counter(int ID_Counter) {
//        this.ID_Counter = ID_Counter;
//    }
//
//    public JTextField getActividadIA() {
//        return ActividadIA;
//    }
//
//    public void setActividadIA(JTextField ActividadIA) {
//        this.ActividadIA = ActividadIA;
//    }
//
//    public JTextField getAgilityavatar() {
//        return Agilityavatar;
//    }
//
//    public void setAgilityavatar(JTextField Agilityavatar) {
//        this.Agilityavatar = Agilityavatar;
//    }
//
//    public JTextField getAgilityrs() {
//        return Agilityrs;
//    }
//
//    public void setAgilityrs(JTextField Agilityrs) {
//        this.Agilityrs = Agilityrs;
//    }
//
//    public JTextField getHPavatar() {
//        return HPavatar;
//    }
//
//    public void setHPavatar(JTextField HPavatar) {
//        this.HPavatar = HPavatar;
//    }
//
//    public JTextField getHPrs() {
//        return HPrs;
//    }
//
//    public void setHPrs(JTextField HPrs) {
//        this.HPrs = HPrs;
//    }
//
//    public JTextField getIDavatar() {
//        return IDavatar;
//    }
//
//    public void setIDavatar(JTextField IDavatar) {
//        this.IDavatar = IDavatar;
//    }
//
//    public JTextField getIDrs() {
//        return IDrs;
//    }
//
//    public void setIDrs(JTextField IDrs) {
//        this.IDrs = IDrs;
//    }
//
//    public JTextField getResultadoIA() {
//        return ResultadoIA;
//    }
//
//    public void setResultadoIA(JTextField ResultadoIA) {
//        this.ResultadoIA = ResultadoIA;
//    }
//
//    public JTextField getSkillsAvatar() {
//        return SkillsAvatar;
//    }
//
//    public void setSkillsAvatar(JTextField SkillsAvatar) {
//        this.SkillsAvatar = SkillsAvatar;
//    }
//
//    public JTextField getSkillsrs() {
//        return Skillsrs;
//    }
//
//    public void setSkillsrs(JTextField Skillsrs) {
//        this.Skillsrs = Skillsrs;
//    }
//
//    public JTextField getStrengthavatar() {
//        return Strengthavatar;
//    }
//
//    public void setStrengthavatar(JTextField Strengthavatar) {
//        this.Strengthavatar = Strengthavatar;
//    }
//
//    public JTextField getStrengthrs() {
//        return Strengthrs;
//    }
//
//    public void setStrengthrs(JTextField Strengthrs) {
//        this.Strengthrs = Strengthrs;
//    }
//
//    public JButton getTimeControl() {
//        return TimeControl;
//    }
//
//    public void setTimeControl(JButton TimeControl) {
//        this.TimeControl = TimeControl;
//    }
}


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
    private Studio starwars;
    private Studio startrek;
    private CreateCharacter newCharacter;
    private int ID_Counter;
    
    public GUI(){
        
        
        initComponents();
        setLocationRelativeTo(null);
        
        
        this.AI = new ArtificialIntelligence();
        
        
        this.newCharacter = new CreateCharacter();
        
        this.starwars = new Studio();
        this.startrek = new Studio();
        

        crossworld.combat.Character[] character_starwars = new crossworld.combat.Character[20];
        crossworld.combat.Character[] character_startrek = new crossworld.combat.Character[20];

        
        
        for (int i = 0; i < character_starwars.length; i++) {
            
            
            
            ID_Counter++;            
            character_starwars[i] = newCharacter.NewCharacter("STAR WARS", ID_Counter);
            
        }
        
        for (int i = 0; i < character_startrek.length; i++) {
            ID_Counter++;
            character_startrek[i] = newCharacter.NewCharacter("STAR TREK", ID_Counter);
            
        }
        
        
                   
                    this.starwars.setCharacter(character_starwars[0]);
                    this.starwars.EnqueueProcess();
                    this.starwars.setCharacter(character_starwars[1]);
                    this.starwars.EnqueueProcess();
                    this.starwars.setCharacter(character_starwars[2]);
                    this.starwars.EnqueueProcess();
                    this.starwars.setCharacter(character_starwars[3]);
                    this.starwars.EnqueueProcess();
                    this.starwars.setCharacter(character_starwars[4]);
                    this.starwars.EnqueueProcess();
                    this.starwars.setCharacter(character_starwars[5]);
                    this.starwars.EnqueueProcess();
                    this.starwars.setCharacter(character_starwars[6]);
                    this.starwars.EnqueueProcess();
                    this.starwars.setCharacter(character_starwars[7]);
                    this.starwars.EnqueueProcess();
                    this.starwars.setCharacter(character_starwars[8]);
                    this.starwars.EnqueueProcess();
                    this.starwars.setCharacter(character_starwars[9]);
                    this.starwars.EnqueueProcess();
                    this.starwars.setCharacter(character_starwars[10]);
                    this.starwars.EnqueueProcess();
                    this.starwars.setCharacter(character_starwars[11]);
                    this.starwars.EnqueueProcess();
                    this.starwars.setCharacter(character_starwars[12]);
                    this.starwars.EnqueueProcess();
                    this.starwars.setCharacter(character_starwars[13]);
                    this.starwars.EnqueueProcess();
                    this.starwars.setCharacter(character_starwars[14]);
                    this.starwars.EnqueueProcess();
                    this.starwars.setCharacter(character_starwars[15]);
                    this.starwars.EnqueueProcess();
                    this.starwars.setCharacter(character_starwars[16]);
                    this.starwars.EnqueueProcess();
                    this.starwars.setCharacter(character_starwars[17]);
                    this.starwars.EnqueueProcess();
                    this.starwars.setCharacter(character_starwars[18]);
                    this.starwars.EnqueueProcess();
                    this.starwars.setCharacter(character_starwars[19]);
                    this.starwars.EnqueueProcess();

                    
                    
                    this.startrek.setCharacter(character_startrek[0]);
                    this.startrek.EnqueueProcess();
                    this.startrek.setCharacter(character_startrek[1]);
                    this.startrek.EnqueueProcess();
                    this.startrek.setCharacter(character_startrek[2]);
                    this.startrek.EnqueueProcess();
                    this.startrek.setCharacter(character_startrek[3]);
                    this.startrek.EnqueueProcess();
                    this.startrek.setCharacter(character_startrek[4]);
                    this.startrek.EnqueueProcess();
                    this.startrek.setCharacter(character_startrek[5]);
                    this.startrek.EnqueueProcess();
                    this.startrek.setCharacter(character_startrek[6]);
                    this.startrek.EnqueueProcess();
                    this.startrek.setCharacter(character_startrek[7]);
                    this.startrek.EnqueueProcess();
                    this.startrek.setCharacter(character_startrek[8]);
                    this.startrek.EnqueueProcess();
                    this.startrek.setCharacter(character_startrek[9]);
                    this.startrek.EnqueueProcess();
                    this.startrek.setCharacter(character_startrek[10]);
                    this.startrek.EnqueueProcess();
                    this.startrek.setCharacter(character_startrek[11]);
                    this.startrek.EnqueueProcess();
                    this.startrek.setCharacter(character_startrek[12]);
                    this.startrek.EnqueueProcess();
                    this.startrek.setCharacter(character_startrek[13]);
                    this.startrek.EnqueueProcess();
                    this.startrek.setCharacter(character_startrek[14]);
                    this.startrek.EnqueueProcess();
                    this.startrek.setCharacter(character_startrek[15]);
                    this.startrek.EnqueueProcess();
                    this.startrek.setCharacter(character_startrek[16]);
                    this.startrek.EnqueueProcess();
                    this.startrek.setCharacter(character_startrek[17]);
                    this.startrek.EnqueueProcess();
                    this.startrek.setCharacter(character_startrek[18]);
                    this.startrek.EnqueueProcess();
                    this.startrek.setCharacter(character_startrek[19]);
                    this.startrek.EnqueueProcess();

                    
                    Semaphore s = new Semaphore(0);
                    Semaphore AI_Sem = new Semaphore(0);
                    
//                    this.AI = new ArtificialIntelligence(avatar.getCharacter(),regularShow.getCharacter(),admin);
                    this.admin = new Administrator(this.startrek, this.starwars, this.AI, s);
                    
        
        

        
//        ArtificialIntelligence(crossworld.combat.Character firstFighter, crossworld.combat.Character secondFighter, Administrator admin)


        
        
        
//        getAdmin().start();
        

        

        getAI().setSem(AI_Sem);
        getAI().setAdmin(admin);
//        getAI().setGui(this);
//        getAdmin().setFighters();
        String outcome = "";
        int cycle_counter = 0;
//        getAdmin().start();
//        getAI().testFunc();
//getAdmin().start();
//getAI().start();

     

        

        
        
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

    public Studio getStarwars() {
        return starwars;
    }

    public void setStarwars(Studio starwars) {
        this.starwars = starwars;
    }

    public Studio getStartrek() {
        return startrek;
    }

    public void setStartrek(Studio startrek) {
        this.startrek = startrek;
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
        SWPriorityQ3 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        SWPriorityQ2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        SWPriorityQ1 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        SWReinforcementQ = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        simulationStart = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        STPriorityQ3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        STPriorityQ2 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        STPriorityQ1 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        STReinforcementQ = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TimeControl = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        IDstarwars = new javax.swing.JTextField();
        SkillsStarwars = new javax.swing.JTextField();
        HPstarwars = new javax.swing.JTextField();
        Agilitystarwars = new javax.swing.JTextField();
        Strengthstarwars = new javax.swing.JTextField();
        ResultadoIA = new javax.swing.JTextField();
        IDstartrek = new javax.swing.JTextField();
        SkillsStartrek = new javax.swing.JTextField();
        HPstartrek = new javax.swing.JTextField();
        Agilitystartrek = new javax.swing.JTextField();
        Strengthstartrek = new javax.swing.JTextField();
        ActividadIA = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        VictoriasStarWars = new javax.swing.JTextField();
        VictoriasStarTrek = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Star Wars");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 80, 40));

        jLabel4.setText("Colas");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 80, 40));

        SWPriorityQ3.setColumns(20);
        SWPriorityQ3.setRows(5);
        jScrollPane1.setViewportView(SWPriorityQ3);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, 70));

        SWPriorityQ2.setColumns(20);
        SWPriorityQ2.setRows(5);
        jScrollPane2.setViewportView(SWPriorityQ2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, 70));

        SWPriorityQ1.setColumns(20);
        SWPriorityQ1.setRows(5);
        jScrollPane3.setViewportView(SWPriorityQ1);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 70));

        SWReinforcementQ.setColumns(20);
        SWReinforcementQ.setRows(5);
        jScrollPane8.setViewportView(SWReinforcementQ);

        jPanel2.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, 70));

        jLabel14.setText("Cola de refuerzo");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 120, 40));

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

        jLabel5.setText("Star Trek");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 90, 40));

        STPriorityQ3.setColumns(20);
        STPriorityQ3.setRows(5);
        jScrollPane4.setViewportView(STPriorityQ3);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, 70));

        STPriorityQ2.setColumns(20);
        STPriorityQ2.setRows(5);
        jScrollPane5.setViewportView(STPriorityQ2);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, 70));

        STPriorityQ1.setColumns(20);
        STPriorityQ1.setRows(5);
        jScrollPane6.setViewportView(STPriorityQ1);

        jPanel5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, 70));

        STReinforcementQ.setColumns(20);
        STReinforcementQ.setRows(5);
        jScrollPane7.setViewportView(STReinforcementQ);

        jPanel5.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, 70));

        jLabel16.setText("Cola de refuerzo");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 120, 40));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 460, 610));

        jLabel1.setText("Fighter Star Wars");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 110, 40));

        TimeControl.setText("Tiempo");
        TimeControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeControlActionPerformed(evt);
            }
        });
        getContentPane().add(TimeControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, -1, -1));

        jLabel6.setText("Fighter Star Trek");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 140, 40));

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
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 100, 40));

        IDstarwars.setEditable(false);
        IDstarwars.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IDstarwars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDstarwarsActionPerformed(evt);
            }
        });
        getContentPane().add(IDstarwars, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 100, -1));

        SkillsStarwars.setEditable(false);
        SkillsStarwars.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SkillsStarwars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkillsStarwarsActionPerformed(evt);
            }
        });
        getContentPane().add(SkillsStarwars, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 100, -1));

        HPstarwars.setEditable(false);
        HPstarwars.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        HPstarwars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HPstarwarsActionPerformed(evt);
            }
        });
        getContentPane().add(HPstarwars, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 100, -1));

        Agilitystarwars.setEditable(false);
        Agilitystarwars.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Agilitystarwars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgilitystarwarsActionPerformed(evt);
            }
        });
        getContentPane().add(Agilitystarwars, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 100, -1));

        Strengthstarwars.setEditable(false);
        Strengthstarwars.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Strengthstarwars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrengthstarwarsActionPerformed(evt);
            }
        });
        getContentPane().add(Strengthstarwars, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 100, -1));

        ResultadoIA.setEditable(false);
        ResultadoIA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ResultadoIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoIAActionPerformed(evt);
            }
        });
        getContentPane().add(ResultadoIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 120, -1));

        IDstartrek.setEditable(false);
        IDstartrek.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IDstartrek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDstartrekActionPerformed(evt);
            }
        });
        getContentPane().add(IDstartrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 100, -1));

        SkillsStartrek.setEditable(false);
        SkillsStartrek.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SkillsStartrek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkillsStartrekActionPerformed(evt);
            }
        });
        getContentPane().add(SkillsStartrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 100, -1));

        HPstartrek.setEditable(false);
        HPstartrek.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        HPstartrek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HPstartrekActionPerformed(evt);
            }
        });
        getContentPane().add(HPstartrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 100, -1));

        Agilitystartrek.setEditable(false);
        Agilitystartrek.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Agilitystartrek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgilitystartrekActionPerformed(evt);
            }
        });
        getContentPane().add(Agilitystartrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 100, -1));

        Strengthstartrek.setEditable(false);
        Strengthstartrek.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Strengthstartrek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrengthstartrekActionPerformed(evt);
            }
        });
        getContentPane().add(Strengthstartrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 100, -1));

        ActividadIA.setEditable(false);
        ActividadIA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ActividadIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActividadIAActionPerformed(evt);
            }
        });
        getContentPane().add(ActividadIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 110, -1));

        jLabel15.setText("Victorias");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 60, 40));

        VictoriasStarWars.setEditable(false);
        VictoriasStarWars.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VictoriasStarWars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VictoriasStarWarsActionPerformed(evt);
            }
        });
        getContentPane().add(VictoriasStarWars, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 100, -1));

        VictoriasStarTrek.setEditable(false);
        VictoriasStarTrek.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VictoriasStarTrek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VictoriasStarTrekActionPerformed(evt);
            }
        });
        VictoriasStarTrek.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                VictoriasStarTrekVetoableChange(evt);
            }
        });
        getContentPane().add(VictoriasStarTrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 100, -1));

        jLabel17.setText("Resultado del Combate");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simulationStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulationStartActionPerformed
        // TODO add your handling code here:
//        getAdmin().start();
//        getAI().start();
//        getAdmin().start();
        getAI().setSWQ1(SWPriorityQ1);
        getAI().setSWQ2(SWPriorityQ2);
        getAI().setSWQ3(SWPriorityQ3);
        getAI().setSWRQ(SWReinforcementQ);
                
        getAI().setSTQ1(STPriorityQ1);
        getAI().setSTQ2(STPriorityQ2);
        getAI().setSTQ3(STPriorityQ3);
        getAI().setSTRQ(STReinforcementQ);
        
        getAI().setTextField(ResultadoIA);
        getAI().setIdStarwars(IDstarwars);
        getAI().setSkillsStarwars(SkillsStarwars);
        getAI().setHpStarwars(HPstarwars);
        getAI().setAgilityStarwars(Agilitystarwars);
        getAI().setStrengthStarwars(Strengthstarwars);
        getAI().setIdStartrek(IDstartrek);
        getAI().setSkillsStartrek(SkillsStartrek);
        getAI().setHpStartrek(HPstartrek);
        getAI().setAgilityStartrek(Agilitystartrek);
        getAI().setStrengthStartrek(Strengthstartrek);
        getAI().setVictoriasStarWars(VictoriasStarWars);
        getAI().setVictoriasStarTrek(VictoriasStarTrek);
        getAI().setActividadAI(ActividadIA);
        
        

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
        getAI().setTimeSleep(time);
    }//GEN-LAST:event_TimeControlActionPerformed

    private void IDstarwarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDstarwarsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDstarwarsActionPerformed

    private void SkillsStarwarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkillsStarwarsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SkillsStarwarsActionPerformed

    private void HPstarwarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HPstarwarsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HPstarwarsActionPerformed

    private void AgilitystarwarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgilitystarwarsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgilitystarwarsActionPerformed

    private void StrengthstarwarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StrengthstarwarsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StrengthstarwarsActionPerformed

    private void ResultadoIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultadoIAActionPerformed

    private void IDstartrekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDstartrekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDstartrekActionPerformed

    private void SkillsStartrekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkillsStartrekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SkillsStartrekActionPerformed

    private void HPstartrekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HPstartrekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HPstartrekActionPerformed

    private void AgilitystartrekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgilitystartrekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgilitystartrekActionPerformed

    private void StrengthstartrekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StrengthstartrekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StrengthstartrekActionPerformed

    private void ActividadIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActividadIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActividadIAActionPerformed

    private void VictoriasStarWarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VictoriasStarWarsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VictoriasStarWarsActionPerformed

    private void VictoriasStarTrekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VictoriasStarTrekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VictoriasStarTrekActionPerformed

    private void VictoriasStarTrekVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_VictoriasStarTrekVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_VictoriasStarTrekVetoableChange

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
    private javax.swing.JTextField ActividadIA;
    private javax.swing.JTextField Agilitystartrek;
    private javax.swing.JTextField Agilitystarwars;
    private javax.swing.JTextField HPstartrek;
    private javax.swing.JTextField HPstarwars;
    private javax.swing.JTextField IDstartrek;
    private javax.swing.JTextField IDstarwars;
    private javax.swing.JTextField ResultadoIA;
    private javax.swing.JTextArea STPriorityQ1;
    private javax.swing.JTextArea STPriorityQ2;
    private javax.swing.JTextArea STPriorityQ3;
    private javax.swing.JTextArea STReinforcementQ;
    private javax.swing.JTextArea SWPriorityQ1;
    private javax.swing.JTextArea SWPriorityQ2;
    private javax.swing.JTextArea SWPriorityQ3;
    private javax.swing.JTextArea SWReinforcementQ;
    private javax.swing.JTextField SkillsStartrek;
    private javax.swing.JTextField SkillsStarwars;
    private javax.swing.JTextField Strengthstartrek;
    private javax.swing.JTextField Strengthstarwars;
    private javax.swing.JButton TimeControl;
    private javax.swing.JTextField VictoriasStarTrek;
    private javax.swing.JTextField VictoriasStarWars;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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



package covidvaccinationapp;

import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @08/03/2021
 * @author Tamara
 */
public class VaccinationGUI extends javax.swing.JFrame {

    
    PQVaccination cpq;
    ArrayList<Patients> patients; //Patients list
    public VaccinationGUI() {
        initComponents();
        cpq = new PQVaccination();
        patients = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MaleFemaleBg = new javax.swing.ButtonGroup();
        nameTf = new javax.swing.JTextField();
        PatientNameLb = new javax.swing.JLabel();
        PatientLastNameLb = new javax.swing.JLabel();
        lastNameTf = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        patientAgeLbl = new javax.swing.JLabel();
        ageTf = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        listBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        feedbTa = new javax.swing.JTextArea();
        numPatients = new javax.swing.JButton();
        priorityBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        scheduleBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        PatientIdTxt = new javax.swing.JLabel();
        idTf = new javax.swing.JTextField();
        medicalConditionsTk = new javax.swing.JCheckBox();
        messageTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTfActionPerformed(evt);
            }
        });

        PatientNameLb.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        PatientNameLb.setText("Name");

        PatientLastNameLb.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        PatientLastNameLb.setText("LastName");

        title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        title.setText("COVID-19 VACCINATION PROGRAMME");

        patientAgeLbl.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        patientAgeLbl.setText("Age");

        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        listBtn.setText("LIST");
        listBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBtnActionPerformed(evt);
            }
        });

        feedbTa.setBackground(new java.awt.Color(217, 235, 253));
        feedbTa.setColumns(20);
        feedbTa.setRows(5);
        jScrollPane1.setViewportView(feedbTa);

        numPatients.setText("N PATIENTS");
        numPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numPatientsActionPerformed(evt);
            }
        });

        priorityBtn.setText("PRIORITY QUEUE");
        priorityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityBtnActionPerformed(evt);
            }
        });

        scheduleBtn.setText("SCHEDULE");
        scheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleBtnActionPerformed(evt);
            }
        });

        exitBtn.setForeground(new java.awt.Color(255, 153, 0));
        exitBtn.setText("EXIT");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        PatientIdTxt.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        PatientIdTxt.setText("Patient ID");

        medicalConditionsTk.setText("Patient with Medical Conditions");
        medicalConditionsTk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalConditionsTkActionPerformed(evt);
            }
        });

        messageTxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        messageTxt.setForeground(new java.awt.Color(255, 153, 51));
        messageTxt.setText("NO DATA ADDED");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(priorityBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(scheduleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(listBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(numPatients))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(PatientNameLb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(PatientIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(PatientLastNameLb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(lastNameTf)
                                                            .addComponent(nameTf)
                                                            .addComponent(ageTf, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                                            .addComponent(idTf)))
                                                    .addComponent(patientAgeLbl)))
                                            .addComponent(messageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(medicalConditionsTk, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messageTxt))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientIdTxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientNameLb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientLastNameLb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientAgeLbl))
                        .addGap(18, 18, 18)
                        .addComponent(medicalConditionsTk)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn)
                            .addComponent(listBtn)
                            .addComponent(numPatients))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priorityBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(scheduleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTfActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        
        //avoid break code when all the fills are not filled
        if(idTf.getText().isEmpty() || nameTf.getText().isEmpty() || lastNameTf.getText().isEmpty() || ageTf.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please make sure you fill out all fields");
        }
        
        //it will show an error if age if bigget than 100 
        if((!idTf.getText().isEmpty() && !nameTf.getText().isEmpty() && !lastNameTf.getText().isEmpty())&&(Integer.parseInt(ageTf.getText()) <=110 && Integer.parseInt(ageTf.getText())>=0) ){
            
        
        //alert if enter wrong data type into the fields int/String 
            try {

            //Add patient from GUI
            Patients p1 = new Patients(Integer.parseInt(idTf.getText()),nameTf.getText(),lastNameTf.getText(),Integer.parseInt(ageTf.getText()),medicalConditionsTk.isSelected());
            
            
                if(patients.contains(p1)){
                    JOptionPane.showMessageDialog(null,"This ID already exist");
                    return;
                }else{
                   //add Patient
            
                patients.add(p1); 
                }
            
            
            
            //reset inputs
            idTf.setText("");
            nameTf.setText("");
            lastNameTf.setText("");
            ageTf.setText("");
            medicalConditionsTk.setSelected(false);
            messageTxt.setText("PATIENT ADDED");

            } catch (NumberFormatException e) {
              JOptionPane.showMessageDialog(null,"ERROR, Invalid Data Type (Wrong-Integer/String)");
            } catch (Exception e) {
              JOptionPane.showMessageDialog(null,"ERROR, Invalid Data Type");
            }
        }else {
            JOptionPane.showMessageDialog(null,"ERROR, Age field issue");
        }
        
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void listBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBtnActionPerformed
        // TODO add your handling code here:
        if(patients.size() == 0){
            feedbTa.setText("No List \n");
            return;
        }
        //show the list in GUI TextArea
        feedbTa.setText("Patients List: \n"+"\n");
        //save in variable
        for (Patients patient: patients) {
            feedbTa.append(patient.toString());
            feedbTa.append("\n");
        }
        
        
        messageTxt.setText("PATIENT LIST SHOWING");
    }//GEN-LAST:event_listBtnActionPerformed

    private void numPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numPatientsActionPerformed
        // TODO add your handling code here:
        //save in variable
        int size = patients.size();
        
        //show num patients in GUI TextArea
        feedbTa.setText("Current Number of Patients = " + size+ "\n");
        messageTxt.setText("PATIENTS NUMBER SHOWING");
    }//GEN-LAST:event_numPatientsActionPerformed

    private void priorityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityBtnActionPerformed
        // TODO add your handling code here:
        //Message GUI
        feedbTa.setText("PRIORITY QUEUE: \n"+"\n");
        
        //No Patients
        if(patients.size() == 0){
            feedbTa.setText("No Patients Added yet \n");
            return;
        }else{
        
            //for each loop enqueue
            for (Patients patient: patients) {
                cpq.enqueue(patient);
                
            }
            //priority Queue
           feedbTa.append(cpq.printPQueue()); 
        }
        priorityBtn.setEnabled(false);
        //show num patients in GUI TextArea
        messageTxt.setText("PRIORITY QUEUE SHOWING");
    }//GEN-LAST:event_priorityBtnActionPerformed

    private void medicalConditionsTkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalConditionsTkActionPerformed
        // TODO add your handling code here:
        if (medicalConditionsTk.isSelected()){
            messageTxt.setText("Medical Condition Selected");
        }else{
            messageTxt.setText("No Medical condition");
        }
    }//GEN-LAST:event_medicalConditionsTkActionPerformed

    private void scheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleBtnActionPerformed
        // TODO add your handling code here:
        if(cpq.size() == 0){
            feedbTa.setText("Nobody to schedule \n");
            return;
        }else{
        
            ArrayList<Patients> group = cpq.dequeueGroup();
            feedbTa.setText("Today's schedule: \n"+"\n");

            for (Patients patient: group) {
                feedbTa.append(patient.toString());
                feedbTa.append("\n");
            } 
        }
        
        
        
        
    }//GEN-LAST:event_scheduleBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        JFrame Frame = new JFrame("Exit");

    if (JOptionPane.showConfirmDialog( Frame,"confirm if you Want to Exit","Name of the Application or Title",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(VaccinationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VaccinationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VaccinationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VaccinationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new VaccinationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup MaleFemaleBg;
    private javax.swing.JLabel PatientIdTxt;
    private javax.swing.JLabel PatientLastNameLb;
    private javax.swing.JLabel PatientNameLb;
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField ageTf;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextArea feedbTa;
    private javax.swing.JTextField idTf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lastNameTf;
    private javax.swing.JButton listBtn;
    private javax.swing.JCheckBox medicalConditionsTk;
    private javax.swing.JLabel messageTxt;
    private javax.swing.JTextField nameTf;
    private javax.swing.JButton numPatients;
    private javax.swing.JLabel patientAgeLbl;
    private javax.swing.JButton priorityBtn;
    private javax.swing.JButton scheduleBtn;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    
}

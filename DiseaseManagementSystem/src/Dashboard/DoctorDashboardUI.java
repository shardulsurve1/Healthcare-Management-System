/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Dashboard;

import Business.Ecosystem;
import Business.Model.Doctor;
import Business.Model.Encounter;
import Business.Model.Laboratory;
import Business.Model.Medicine;
import Business.Model.Patient;
import Business.Model.Treatment;
import Business.Model.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shreya
 */
public class DoctorDashboardUI extends javax.swing.JPanel {

    /**
     * Creates new form DoctorDashboardUI
     */
    
    Doctor doctor;
    Ecosystem ecosystem;
    
    public DoctorDashboardUI() {
        initComponents();
    }
    
    public DoctorDashboardUI(Ecosystem ecosystem,Doctor d) {
        initComponents();
        this.ecosystem=ecosystem;
        this.doctor=d;
        
        populateDoctorPatientTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctorPatientView = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDoctorPatientEncounters = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        txtHeartRate = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        txtTemperature = new javax.swing.JTextField();
        comboTumerType = new javax.swing.JComboBox<>();
        comboSeverity = new javax.swing.JComboBox<>();
        comboCondition = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMed1 = new javax.swing.JTextField();
        txtMed3 = new javax.swing.JTextField();
        txtMed1Quantity = new javax.swing.JTextField();
        txtMed3Quantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMed2 = new javax.swing.JTextField();
        txtMed2Quantity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comboLabTest = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDiagnosis = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        comboStatus = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEncounterName = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDoctorPatientView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Name", "Address", "Date", "Purpose"
            }
        ));
        jScrollPane1.setViewportView(tblDoctorPatientView);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 770, 108));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View Patient Records");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 166, -1));

        tblDoctorPatientEncounters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr. No", "Encounter", "Date"
            }
        ));
        jScrollPane2.setViewportView(tblDoctorPatientEncounters);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 780, 122));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View Encounter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 166, -1));

        txtHeartRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeartRateActionPerformed(evt);
            }
        });
        jPanel1.add(txtHeartRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 190, 30));
        jPanel1.add(txtBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 140, 30));

        txtTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperatureActionPerformed(evt);
            }
        });
        jPanel1.add(txtTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 110, 30));

        comboTumerType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Malignant", "Benign" }));
        comboTumerType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTumerTypeActionPerformed(evt);
            }
        });
        jPanel1.add(comboTumerType, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, 199, 20));

        comboSeverity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "High", "Medium", "Low" }));
        jPanel1.add(comboSeverity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 199, 20));

        comboCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operable", "Inoperable" }));
        jPanel1.add(comboCondition, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 650, 199, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Blood Pressure:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Severity:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tumor Type:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Heart Rate:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Condition:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Temperature:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, 20));
        jPanel1.add(txtMed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 212, 30));
        jPanel1.add(txtMed3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 212, 30));
        jPanel1.add(txtMed1Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 108, -1));
        jPanel1.add(txtMed3Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 108, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Medicine List :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 106, -1));
        jPanel1.add(txtMed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 212, 30));
        jPanel1.add(txtMed2Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 108, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Quantity :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 108, -1));

        comboLabTest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chemo Theorapy", "Radiation Theoray", "Surgery" }));
        jPanel1.add(comboLabTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 151, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Lab Therapy:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 82, -1));

        txtDiagnosis.setColumns(20);
        txtDiagnosis.setRows(5);
        jScrollPane3.setViewportView(txtDiagnosis);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 590, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Diagnosis:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Add Encounter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 720, 150, 30));

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Completed", "On-going", "Pending" }));
        jPanel1.add(comboStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 650, 151, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Status of treatment :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, 119, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Encounter name:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, 20));

        txtEncounterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEncounterNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtEncounterName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 190, 30));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 720, 150, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Medical Details");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 246, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Doctor");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 174, -1));

        jButton5.setBackground(new java.awt.Color(0, 204, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("BACK");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-440, -300, 1090, 910));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard/bg1.jpg"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 910));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        populateDoctorPatientEncounterTable();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRowIndex = tblDoctorPatientEncounters.getSelectedRow();

        if(selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Please select an encounter to view");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblDoctorPatientEncounters.getModel();
        Encounter e = (Encounter) model.getValueAt(selectedRowIndex, 1);

        txtEncounterName.setText(e.getEncounterName());
        txtHeartRate.setText(String.valueOf(e.getVitalSigns().getHeartRate()));
        txtBloodPressure.setText(String.valueOf(e.getVitalSigns().getBloodPressure()));
        txtTemperature.setText(String.valueOf(e.getVitalSigns().getTemperature()));

        txtMed1.setText(e.getTreatment().getMedicineList().get(0).getMedicine());
        txtMed2.setText(e.getTreatment().getMedicineList().get(1).getMedicine());
        txtMed3.setText(e.getTreatment().getMedicineList().get(2).getMedicine());

        txtMed1Quantity.setText(String.valueOf(e.getTreatment().getMedicineList().get(0).getQuantity()));
        txtMed2Quantity.setText(String.valueOf(e.getTreatment().getMedicineList().get(1).getQuantity()));
        txtMed3Quantity.setText(String.valueOf(e.getTreatment().getMedicineList().get(2).getQuantity()));

        txtDiagnosis.setText(e.getDiagnosis());

        comboTumerType.setSelectedItem(e.getVitalSigns().getTumorType());
        comboCondition.setSelectedItem(e.getVitalSigns().getCondition());
        comboSeverity.setSelectedItem(e.getVitalSigns().getSeverity());
        comboLabTest.setSelectedItem(e.getTreatment().getLaboratoryList().get(0).getLabTest());

        comboStatus.setSelectedItem(e.getTreatment().getStatus());

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtHeartRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeartRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeartRateActionPerformed

    private void txtTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperatureActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int heartRate = Integer.parseInt(txtHeartRate.getText());
        int bloodPressure = Integer.parseInt(txtBloodPressure.getText());
        int temperature = Integer.parseInt(txtTemperature.getText());
        String tumorType = comboTumerType.getSelectedItem().toString();
        String severity = comboSeverity.getSelectedItem().toString();
        String condition = comboCondition.getSelectedItem().toString();
        String labTest = comboLabTest.getSelectedItem().toString();
        String status = comboStatus.getSelectedItem().toString();

        String med1= txtMed1.getText();
        String med2= txtMed2.getText();
        String med3= txtMed3.getText();

        int med1Quantity = Integer.parseInt(txtMed1Quantity.getText());
        int med2Quantity = Integer.parseInt(txtMed2Quantity.getText());
        int med3Quantity = Integer.parseInt(txtMed3Quantity.getText());

        String diagnosis = txtDiagnosis.getText();

        VitalSigns v = new VitalSigns(heartRate, bloodPressure, temperature, tumorType, severity, condition);

        Medicine m1 = new Medicine(med1, med1Quantity);
        Medicine m2 = new Medicine(med2, med2Quantity);
        Medicine m3 = new Medicine(med3, med3Quantity);

        Laboratory lab = new Laboratory(labTest);

        Treatment treatment = new Treatment();
        treatment.getLaboratoryList().add(lab);
        treatment.getMedicineList().add(m1);
        treatment.getMedicineList().add(m2);
        treatment.getMedicineList().add(m3);

        treatment.setStatus(status);

        Encounter e = new Encounter(v, treatment, diagnosis,doctor);
        e.setEncounterName(txtEncounterName.getText());

        int selectedRowIndex = tblDoctorPatientView.getSelectedRow();

        if(selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Please Select a Patient to add an encounter");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblDoctorPatientView.getModel();
        Patient p = (Patient) model.getValueAt(selectedRowIndex, 0);
        System.out.println(p.getName());

        p.getEncounterHistory().add(e);

        JOptionPane.showMessageDialog(this, "Encounter added");

        txtEncounterName.setText("");
        txtHeartRate.setText("");
        txtBloodPressure.setText("");
        txtTemperature.setText("");

        txtMed1.setText("");
        txtMed2.setText("");
        txtMed3.setText("");

        txtMed1Quantity.setText("");
        txtMed2Quantity.setText("");
        txtMed3Quantity.setText("");

        txtDiagnosis.setText("");

        populateDoctorPatientEncounterTable();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtEncounterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEncounterNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEncounterNameActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int selectedRowIndex = tblDoctorPatientEncounters.getSelectedRow();

        if(selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Please select an encounter to Update");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblDoctorPatientEncounters.getModel();
        Encounter e = (Encounter) model.getValueAt(selectedRowIndex, 1);

        e.setDiagnosis(txtDiagnosis.getText());
        e.setEncounterName(txtEncounterName.getText());
        e.getVitalSigns().setBloodPressure(Integer.parseInt(txtBloodPressure.getText()));
        e.getVitalSigns().setHeartRate(Integer.parseInt(txtHeartRate.getText()));
        e.getVitalSigns().setTemperature(Integer.parseInt(txtTemperature.getText()));

        e.getVitalSigns().setTumorType(comboTumerType.getSelectedItem().toString());
        e.getVitalSigns().setSeverity(comboSeverity.getSelectedItem().toString());
        e.getVitalSigns().setCondition(comboCondition.getSelectedItem().toString());

        e.getTreatment().getMedicineList().get(0).setMedicine(txtMed1.getText());
        e.getTreatment().getMedicineList().get(1).setMedicine(txtMed2.getText());
        e.getTreatment().getMedicineList().get(2).setMedicine(txtMed3.getText());

        e.getTreatment().getMedicineList().get(0).setQuantity(Integer.parseInt(txtMed1Quantity.getText()));
        e.getTreatment().getMedicineList().get(1).setQuantity(Integer.parseInt(txtMed2Quantity.getText()));
        e.getTreatment().getMedicineList().get(2).setQuantity(Integer.parseInt(txtMed3Quantity.getText()));

        e.getTreatment().getLaboratoryList().get(0).setLabTest(comboLabTest.getSelectedItem().toString());

        e.getTreatment().setStatus(comboStatus.getSelectedItem().toString());

        populateDoctorPatientEncounterTable();
        JOptionPane.showMessageDialog(this, "Encounter is updated");

        txtEncounterName.setText("");
        txtHeartRate.setText("");
        txtBloodPressure.setText("");
        txtTemperature.setText("");

        txtMed1.setText("");
        txtMed2.setText("");
        txtMed3.setText("");

        txtMed1Quantity.setText("");
        txtMed2Quantity.setText("");
        txtMed3Quantity.setText("");

        txtDiagnosis.setText("");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void comboTumerTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTumerTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTumerTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboCondition;
    private javax.swing.JComboBox<String> comboLabTest;
    private javax.swing.JComboBox<String> comboSeverity;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JComboBox<String> comboTumerType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblDoctorPatientEncounters;
    private javax.swing.JTable tblDoctorPatientView;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextArea txtDiagnosis;
    private javax.swing.JTextField txtEncounterName;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtMed1;
    private javax.swing.JTextField txtMed1Quantity;
    private javax.swing.JTextField txtMed2;
    private javax.swing.JTextField txtMed2Quantity;
    private javax.swing.JTextField txtMed3;
    private javax.swing.JTextField txtMed3Quantity;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables

    private void populateDoctorPatientEncounterTable() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
int selectedRowIndex = tblDoctorPatientView.getSelectedRow();
        
        if(selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Please Select a row to view");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblDoctorPatientView.getModel();
        Patient p = (Patient) model.getValueAt(selectedRowIndex, 0);
        
        DefaultTableModel model2 = (DefaultTableModel) tblDoctorPatientEncounters.getModel();

                model2.setRowCount(0);
                
                for(Encounter e :p.getEncounterHistory())
                if(e.getDoctor().equals(doctor)){    
                {
                    Object[] row = new Object[3];
                    row[0]=Encounter.counter;
                    row[1]=e;
                    row[2]=e.getDate();
                    model2.addRow(row);
                }
                }
    }

    private void populateDoctorPatientTable() {
         DefaultTableModel model = (DefaultTableModel) tblDoctorPatientView.getModel();
                model.setRowCount(0);
                for(Patient p :doctor.getDocPatList())   
                {
                    Object[] row = new Object[4];
                    row[0]=p;
                    row[1]=p.getAddress();
                    row[2]=p.getDate();
                    row[3]=p.getPurpose();
                    model.addRow(row);
                }
    }
}
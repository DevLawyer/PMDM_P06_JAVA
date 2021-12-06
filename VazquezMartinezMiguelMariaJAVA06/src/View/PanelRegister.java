/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DateParser;
import Controller.QueryList;
import Controller.QueryUpdate;
import Model.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.util.GregorianCalendar;

/**
 *
 * @author migva
 */
public class PanelRegister extends javax.swing.JPanel {

    /**
     * Creates new form PanelRegister
     */
    public PanelRegister(Connection conn, Lawyer user) {
        initComponents();
        this.conn = conn;
        this.user = user;
        modelClient = new DefaultComboBoxModel();
        modelEntity = new DefaultComboBoxModel();
        
        listClient = QueryList.getColumn(this.conn, "cod_client", "client");
        listEntity = QueryList.getColumn(this.conn, "entity_name", "entity");
        
        comboBoxClient.setModel(chargeClientComboBox());
        comboBoxEntity.setModel(chargeEntityComboBox());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelRegisterIssue = new javax.swing.JLabel();
        labelRegisterDesription = new javax.swing.JLabel();
        labelRegisterEntryDate = new javax.swing.JLabel();
        labelRegisterEndDate = new javax.swing.JLabel();
        labelRegisterHours = new javax.swing.JLabel();
        labelRegisterClient = new javax.swing.JLabel();
        labelRegisterEntity = new javax.swing.JLabel();
        fieldRegisterIssue = new javax.swing.JTextField();
        fieldRegisterDescription = new javax.swing.JTextField();
        fieldRegisterHours = new javax.swing.JTextField();
        dateChooserEndDate = new com.toedter.calendar.JDateChooser();
        dateChooserEntryDate = new com.toedter.calendar.JDateChooser();
        comboBoxClient = new javax.swing.JComboBox<>();
        comboBoxEntity = new javax.swing.JComboBox<>();
        buttonAccept = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 50, 71));
        jLabel1.setText("NUEVO ASUNTO");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 50, 71));

        labelRegisterIssue.setBackground(new java.awt.Color(255, 255, 255));
        labelRegisterIssue.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelRegisterIssue.setForeground(new java.awt.Color(0, 50, 71));
        labelRegisterIssue.setText("Código del Asunto:");

        labelRegisterDesription.setBackground(new java.awt.Color(255, 255, 255));
        labelRegisterDesription.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelRegisterDesription.setForeground(new java.awt.Color(0, 50, 71));
        labelRegisterDesription.setText("Descripción breve:");

        labelRegisterEntryDate.setBackground(new java.awt.Color(255, 255, 255));
        labelRegisterEntryDate.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelRegisterEntryDate.setForeground(new java.awt.Color(0, 50, 71));
        labelRegisterEntryDate.setText("Fecha de alta:");

        labelRegisterEndDate.setBackground(new java.awt.Color(255, 255, 255));
        labelRegisterEndDate.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelRegisterEndDate.setForeground(new java.awt.Color(0, 50, 71));
        labelRegisterEndDate.setText("Fecha de finalización:");

        labelRegisterHours.setBackground(new java.awt.Color(255, 255, 255));
        labelRegisterHours.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelRegisterHours.setForeground(new java.awt.Color(0, 50, 71));
        labelRegisterHours.setText("Horas dedicadas:");

        labelRegisterClient.setBackground(new java.awt.Color(255, 255, 255));
        labelRegisterClient.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelRegisterClient.setForeground(new java.awt.Color(0, 50, 71));
        labelRegisterClient.setText("Cliente:");

        labelRegisterEntity.setBackground(new java.awt.Color(255, 255, 255));
        labelRegisterEntity.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelRegisterEntity.setForeground(new java.awt.Color(0, 50, 71));
        labelRegisterEntity.setText("Órgano:");

        fieldRegisterIssue.setBackground(new java.awt.Color(204, 204, 204));
        fieldRegisterIssue.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        fieldRegisterIssue.setForeground(new java.awt.Color(0, 50, 71));
        fieldRegisterIssue.setText("-");
        fieldRegisterIssue.setDisabledTextColor(new java.awt.Color(0, 50, 71));
        fieldRegisterIssue.setEnabled(false);
        fieldRegisterIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldRegisterIssueActionPerformed(evt);
            }
        });

        fieldRegisterDescription.setBackground(new java.awt.Color(255, 255, 255));
        fieldRegisterDescription.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        fieldRegisterDescription.setForeground(new java.awt.Color(0, 50, 71));
        fieldRegisterDescription.setDisabledTextColor(new java.awt.Color(0, 50, 71));
        fieldRegisterDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldRegisterDescriptionKeyPressed(evt);
            }
        });

        fieldRegisterHours.setBackground(new java.awt.Color(255, 255, 255));
        fieldRegisterHours.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        fieldRegisterHours.setForeground(new java.awt.Color(0, 50, 71));
        fieldRegisterHours.setDisabledTextColor(new java.awt.Color(0, 50, 71));

        dateChooserEndDate.setBackground(new java.awt.Color(255, 255, 255));
        dateChooserEndDate.setForeground(new java.awt.Color(0, 50, 71));
        dateChooserEndDate.setDateFormatString("yyyy-MM-dd");

        dateChooserEntryDate.setBackground(new java.awt.Color(255, 255, 255));
        dateChooserEntryDate.setForeground(new java.awt.Color(0, 50, 71));
        dateChooserEntryDate.setDateFormatString("yyyy-MM-dd");

        comboBoxClient.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxClient.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        comboBoxClient.setForeground(new java.awt.Color(0, 50, 71));
        comboBoxClient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxClient.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxClientItemStateChanged(evt);
            }
        });
        comboBoxClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboBoxClientMousePressed(evt);
            }
        });
        comboBoxClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxClientActionPerformed(evt);
            }
        });

        comboBoxEntity.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxEntity.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        comboBoxEntity.setForeground(new java.awt.Color(0, 50, 71));
        comboBoxEntity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonAccept.setBackground(new java.awt.Color(0, 50, 71));
        buttonAccept.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        buttonAccept.setForeground(new java.awt.Color(255, 255, 255));
        buttonAccept.setText("Aceptar");
        buttonAccept.setBorder(null);
        buttonAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAcceptActionPerformed(evt);
            }
        });

        buttonClear.setBackground(new java.awt.Color(0, 50, 71));
        buttonClear.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        buttonClear.setForeground(new java.awt.Color(255, 255, 255));
        buttonClear.setText("Borrar");
        buttonClear.setBorder(null);
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRegisterEntity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRegisterClient, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelRegisterHours, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(labelRegisterEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelRegisterEntryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelRegisterIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelRegisterDesription, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fieldRegisterDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fieldRegisterIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateChooserEntryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateChooserEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fieldRegisterHours, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBoxClient, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBoxEntity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRegisterIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldRegisterIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRegisterDesription, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldRegisterDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRegisterEntryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooserEntryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelRegisterEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooserEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRegisterHours, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldRegisterHours, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRegisterClient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxClient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRegisterEntity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxEntity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxClientActionPerformed

    }//GEN-LAST:event_comboBoxClientActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        /**
         * This method check if the filter has been selected and reset the information
         * and the combobox option.
         */
        if( fieldRegisterDescription.getText() == ""
            && dateChooserEntryDate.getDate() == null
            && dateChooserEndDate.getDate() == null
            && fieldRegisterHours.getText() == ""
            && comboBoxClient.getSelectedItem().toString() == "CLIENTE"
            && comboBoxEntity.getSelectedItem().toString() == "ÓRGANO"
        ){
            JOptionPane.showMessageDialog(null, "El panel ya está limpio.");
        } else {
            fieldRegisterDescription.setText("");
            dateChooserEntryDate.setDate(null);
            dateChooserEndDate.setDate(null);
            fieldRegisterHours.setText("");
            comboBoxClient.setSelectedIndex(0);
            comboBoxEntity.setSelectedIndex(0);            
        }
       
    }//GEN-LAST:event_buttonClearActionPerformed

    private void fieldRegisterIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldRegisterIssueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldRegisterIssueActionPerformed

    private void comboBoxClientItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxClientItemStateChanged
        if(comboBoxClient.getSelectedItem().toString() != "CLIENTE"){
            cod_issue = QueryList.getValue(this.conn, comboBoxClient.getSelectedItem().toString());
            cod_issue = String.valueOf(Integer.parseInt(cod_issue) + 1);
            fieldRegisterIssue.setText(cod_issue);
        }
    }//GEN-LAST:event_comboBoxClientItemStateChanged

    private void comboBoxClientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxClientMousePressed

    }//GEN-LAST:event_comboBoxClientMousePressed

    private void fieldRegisterDescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldRegisterDescriptionKeyPressed
        if(fieldRegisterDescription.getText().length() > 50){
            fieldRegisterDescription.setBackground(new Color(255, 66, 66));
        }else{
            fieldRegisterDescription.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_fieldRegisterDescriptionKeyPressed

    private void buttonAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAcceptActionPerformed
        if(checkIssueDescription() && checkDates() && checkNumHours() && checkComboBox()){
            Issue issue = new Issue(
                Integer.valueOf(cod_issue),
                fieldRegisterDescription.getText(),
                DateParser.toString(dateChooserEntryDate.getDate()),
                DateParser.toString(dateChooserEndDate.getDate()),
                Integer.valueOf(fieldRegisterHours.getText()),
                Integer.valueOf(comboBoxClient.getSelectedItem().toString()),
                QueryList.getCodEntity(conn, comboBoxEntity.getSelectedItem().toString()),
                (user.getLawyerHoursFee()*Integer.valueOf(fieldRegisterHours.getText()))
            );
            
            QueryUpdate.insertIssue(conn, issue);
        }
    }//GEN-LAST:event_buttonAcceptActionPerformed
    
    private boolean checkIssueDescription(){
        if(fieldRegisterDescription.getText().length() > 50){
            JOptionPane.showMessageDialog(null, "La descripción es demasiado larga.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }
    
    private boolean checkDates(){
        boolean check = true;
        if(dateChooserEntryDate.getDate() == null){
            JOptionPane.showMessageDialog(null, "Debe indicar el menos una fecha de inicio.", "ALERTA", JOptionPane.WARNING_MESSAGE);
            check = false;
        } else if(dateChooserEndDate.getDate() != null && dateChooserEntryDate.getDate().compareTo(dateChooserEndDate.getDate()) > 0){
            JOptionPane.showMessageDialog(null, "La fecha de finalización no puede ser anterior al inicio.", "ALERTA", JOptionPane.WARNING_MESSAGE);
            check = false;
        }
        return check;
    }
    
    private boolean checkNumHours(){
        boolean check = true;
        try{
            if(Integer.valueOf(fieldRegisterHours.getText()) < 0){
                JOptionPane.showMessageDialog(null, "Las horas dedicadas no pueden ser negativas.", "ALERTA", JOptionPane.WARNING_MESSAGE);
                check = false;
            }
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "No ha introducido un número.", "ALERTA", JOptionPane.WARNING_MESSAGE);
            check = false;
        }
        return check;
    }
    
    private boolean checkComboBox(){
        boolean check = true;
        if("CLIENTE".equals(comboBoxClient.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, "No ha seleccionado un cliente.", "ALERTA", JOptionPane.WARNING_MESSAGE);
            check = false;
        } else if ("ÓRGANO".equals(comboBoxEntity.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, "No ha seleccionado un órgano.", "ALERTA", JOptionPane.WARNING_MESSAGE);
            check = false;
        }
        return check;
    }
    
    private DefaultComboBoxModel chargeClientComboBox(){
        /**
         * This method charge in the comboBox model the word EMPTY if the data base
         * does not connect or the table of data base is empty or charge the comboBox
         * with the surnames of the table.
         * 
         * @return the model with the information charged.
         */
        if(listClient == null){
            modelClient.addElement("VACÍO");
        }else{
            modelClient.removeAllElements();
            modelClient.addElement("CLIENTE");
            for(String client : listClient){
                modelClient.addElement(client);
            }
        }
        
        return modelClient;
    }
    
    private DefaultComboBoxModel chargeEntityComboBox(){
        /**
         * This method charge in the comboBox model the word EMPTY if the data base
         * does not connect or the table of data base is empty or charge the comboBox
         * with the surnames of the table.
         * 
         * @return the model with the information charged.
         */
        if(listEntity == null){
            modelEntity.addElement("VACÍO");
        }else{
            modelEntity.removeAllElements();
            modelEntity.addElement("ÓRGANO");
            for(String entity : listEntity){
                modelEntity.addElement(entity);
            }
        }
        
        return modelEntity;
    }
    
    private ArrayList<String> listClient = new ArrayList();
    private ArrayList<String> listEntity = new ArrayList();
    private DefaultComboBoxModel<String> modelClient;
    private DefaultComboBoxModel<String> modelEntity;
    private String cod_issue;
    private Connection conn;
    private static Lawyer user;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAccept;
    private javax.swing.JButton buttonClear;
    private javax.swing.JComboBox<String> comboBoxClient;
    private javax.swing.JComboBox<String> comboBoxEntity;
    private com.toedter.calendar.JDateChooser dateChooserEndDate;
    private com.toedter.calendar.JDateChooser dateChooserEntryDate;
    private javax.swing.JTextField fieldRegisterDescription;
    private javax.swing.JTextField fieldRegisterHours;
    private javax.swing.JTextField fieldRegisterIssue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelRegisterClient;
    private javax.swing.JLabel labelRegisterDesription;
    private javax.swing.JLabel labelRegisterEndDate;
    private javax.swing.JLabel labelRegisterEntity;
    private javax.swing.JLabel labelRegisterEntryDate;
    private javax.swing.JLabel labelRegisterHours;
    private javax.swing.JLabel labelRegisterIssue;
    // End of variables declaration//GEN-END:variables
}

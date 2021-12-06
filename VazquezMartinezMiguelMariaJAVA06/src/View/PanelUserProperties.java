/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template photo, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.QueryUpdate;
import Model.Lawyer;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.JFileChooser;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author migva
 */
public class PanelUserProperties extends javax.swing.JPanel {

    /**
     * Creates new form PanelUserProperties
     */
    public PanelUserProperties(Connection conn, Lawyer user) {
        initComponents();
        this.user = user;
        this.conn = conn;
        showUser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelImage = new javax.swing.JLabel();
        labelUserSurname = new javax.swing.JLabel();
        labelUserName = new javax.swing.JLabel();
        labelUserDNI = new javax.swing.JLabel();
        labelUserEntryDate = new javax.swing.JLabel();
        labelUserPhone = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buttonChangeImage = new javax.swing.JButton();
        fieldUserName = new javax.swing.JTextField();
        fieldUserSurname = new javax.swing.JTextField();
        fieldUserDNI = new javax.swing.JTextField();
        fieldUserEntryDate = new javax.swing.JTextField();
        fieldUserPhone = new javax.swing.JTextField();
        labelUserUserName = new javax.swing.JLabel();
        fieldUserUserName = new javax.swing.JTextField();
        buttonSaveChanges = new javax.swing.JButton();
        labelUserHeader = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        infoDNI = new javax.swing.JLabel();
        infoEntryDate = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(814, 500));
        setMinimumSize(new java.awt.Dimension(814, 500));
        setPreferredSize(new java.awt.Dimension(814, 500));

        labelImage.setBackground(new java.awt.Color(255, 255, 255));
        labelImage.setForeground(new java.awt.Color(0, 50, 71));
        labelImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 50, 71), 2));
        labelImage.setPreferredSize(new java.awt.Dimension(180, 180));

        labelUserSurname.setBackground(new java.awt.Color(255, 255, 255));
        labelUserSurname.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelUserSurname.setForeground(new java.awt.Color(0, 50, 71));
        labelUserSurname.setText("APELLIDO: ");

        labelUserName.setBackground(new java.awt.Color(255, 255, 255));
        labelUserName.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelUserName.setForeground(new java.awt.Color(0, 50, 71));
        labelUserName.setText("NOMBRE: ");

        labelUserDNI.setBackground(new java.awt.Color(255, 255, 255));
        labelUserDNI.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelUserDNI.setForeground(new java.awt.Color(0, 50, 71));
        labelUserDNI.setText("DNI:");

        labelUserEntryDate.setBackground(new java.awt.Color(255, 255, 255));
        labelUserEntryDate.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelUserEntryDate.setForeground(new java.awt.Color(0, 50, 71));
        labelUserEntryDate.setText("FECHA DE ALTA:");

        labelUserPhone.setBackground(new java.awt.Color(255, 255, 255));
        labelUserPhone.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelUserPhone.setForeground(new java.awt.Color(0, 50, 71));
        labelUserPhone.setText("EXT. TELÉFONO:");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        buttonChangeImage.setBackground(new java.awt.Color(0, 50, 71));
        buttonChangeImage.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        buttonChangeImage.setForeground(new java.awt.Color(255, 255, 255));
        buttonChangeImage.setText("Cambiar Imagen");
        buttonChangeImage.setBorder(null);
        buttonChangeImage.setPreferredSize(new java.awt.Dimension(140, 30));
        buttonChangeImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangeImageActionPerformed(evt);
            }
        });

        fieldUserName.setEditable(false);
        fieldUserName.setBackground(new java.awt.Color(255, 255, 255));
        fieldUserName.setForeground(new java.awt.Color(0, 50, 71));
        fieldUserName.setCaretColor(new java.awt.Color(0, 50, 71));

        fieldUserSurname.setEditable(false);
        fieldUserSurname.setBackground(new java.awt.Color(255, 255, 255));
        fieldUserSurname.setForeground(new java.awt.Color(0, 50, 71));
        fieldUserSurname.setCaretColor(new java.awt.Color(0, 50, 71));

        fieldUserDNI.setBackground(new java.awt.Color(255, 255, 255));
        fieldUserDNI.setForeground(new java.awt.Color(0, 50, 71));
        fieldUserDNI.setCaretColor(new java.awt.Color(0, 50, 71));

        fieldUserEntryDate.setBackground(new java.awt.Color(255, 255, 255));
        fieldUserEntryDate.setForeground(new java.awt.Color(0, 50, 71));
        fieldUserEntryDate.setCaretColor(new java.awt.Color(0, 50, 71));

        fieldUserPhone.setEditable(false);
        fieldUserPhone.setBackground(new java.awt.Color(255, 255, 255));
        fieldUserPhone.setForeground(new java.awt.Color(0, 50, 71));
        fieldUserPhone.setCaretColor(new java.awt.Color(0, 50, 71));

        labelUserUserName.setBackground(new java.awt.Color(255, 255, 255));
        labelUserUserName.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelUserUserName.setForeground(new java.awt.Color(0, 50, 71));
        labelUserUserName.setText("USUARIO:");

        fieldUserUserName.setEditable(false);
        fieldUserUserName.setBackground(new java.awt.Color(255, 255, 255));
        fieldUserUserName.setForeground(new java.awt.Color(0, 50, 71));
        fieldUserUserName.setCaretColor(new java.awt.Color(0, 50, 71));

        buttonSaveChanges.setBackground(new java.awt.Color(0, 50, 71));
        buttonSaveChanges.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        buttonSaveChanges.setForeground(new java.awt.Color(255, 255, 255));
        buttonSaveChanges.setText("Guardar Cambios");
        buttonSaveChanges.setBorder(null);
        buttonSaveChanges.setPreferredSize(new java.awt.Dimension(140, 30));
        buttonSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveChangesActionPerformed(evt);
            }
        });

        labelUserHeader.setBackground(new java.awt.Color(255, 255, 255));
        labelUserHeader.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labelUserHeader.setForeground(new java.awt.Color(0, 50, 71));
        labelUserHeader.setText("PERFIL DE USUARIO");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 50, 71));

        infoDNI.setBackground(new java.awt.Color(255, 255, 255));
        infoDNI.setForeground(new java.awt.Color(255, 0, 0));
        infoDNI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fieldInforIcon.png"))); // NOI18N
        infoDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                infoDNIFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                infoDNIFocusLost(evt);
            }
        });
        infoDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoDNIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoDNIMouseExited(evt);
            }
        });

        infoEntryDate.setBackground(new java.awt.Color(255, 255, 255));
        infoEntryDate.setForeground(new java.awt.Color(255, 0, 0));
        infoEntryDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fieldInforIcon.png"))); // NOI18N
        infoEntryDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                infoEntryDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                infoEntryDateFocusLost(evt);
            }
        });
        infoEntryDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoEntryDateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoEntryDateMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(buttonChangeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelUserUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldUserUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelUserSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fieldUserSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelUserDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fieldUserDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelUserEntryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fieldUserEntryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelUserPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fieldUserPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator1)
                            .addComponent(labelUserHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoEntryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(labelUserHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUserSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldUserSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelUserDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fieldUserDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelUserEntryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fieldUserEntryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(infoEntryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUserPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldUserPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonChangeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelUserUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fieldUserUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        labelImage.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void buttonChangeImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangeImageActionPerformed
        try {
            File photo = null;
            int select = fileChooser.showOpenDialog(null);
            
            if(select == JFileChooser.APPROVE_OPTION){
                photo = fileChooser.getSelectedFile();
            }else if (select == JFileChooser.ERROR_OPTION){
                JOptionPane.showMessageDialog(null, "ERROR al cargar la información.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            if(!photo.getName().equals(user.getLawyerPhoto())){           
                    String path = "./src/Images_user/"+photo.getName();
                    Files.copy(photo.toPath(), Paths.get(path), StandardCopyOption.REPLACE_EXISTING);
                    user.setLawyerPhoto(photo.getName());
                    QueryUpdate.updateLawyer(conn, user);
                    showUser();                    
            } else {
                JOptionPane.showMessageDialog(null, "Ha elegido la misma imagen.", "ALERTA", JOptionPane.WARNING_MESSAGE );
            }
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR fichero no encontrado.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(EOFException ex){
            JOptionPane.showMessageDialog(null, "Información cargada.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonChangeImageActionPerformed

    private void buttonSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveChangesActionPerformed
        if(fieldUserDNI.getText() == user.getLawyerNIF() && fieldUserEntryDate.getText() == user.getLawyerEntryDateFormat()){
            user.setLawyerNIF(fieldUserDNI.getText());
            user.setLawyerEntryDate(fieldUserEntryDate.getText());
            QueryUpdate.updateLawyer(conn, user);
            JOptionPane.showMessageDialog(null, "Datos actualizados.","AVISO", JOptionPane.INFORMATION_MESSAGE);
            showUser();
        } else {
            JOptionPane.showMessageDialog(null, "No ha modificado ningún dato.", "ALERTA", JOptionPane.WARNING_MESSAGE );
        }
    }//GEN-LAST:event_buttonSaveChangesActionPerformed

    private void infoDNIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_infoDNIFocusGained
        infoDNI.setText("99999999X");
    }//GEN-LAST:event_infoDNIFocusGained

    private void infoDNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_infoDNIFocusLost
        infoDNI.setText("");
    }//GEN-LAST:event_infoDNIFocusLost

    private void infoEntryDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_infoEntryDateFocusGained
        infoEntryDate.setText("aaaa-mm-dd");
    }//GEN-LAST:event_infoEntryDateFocusGained

    private void infoEntryDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_infoEntryDateFocusLost
        infoEntryDate.setText("");
    }//GEN-LAST:event_infoEntryDateFocusLost

    private void infoDNIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoDNIMouseEntered
        infoDNI.setText("99999999X");
    }//GEN-LAST:event_infoDNIMouseEntered

    private void infoDNIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoDNIMouseExited
        infoDNI.setText("");
    }//GEN-LAST:event_infoDNIMouseExited

    private void infoEntryDateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoEntryDateMouseEntered
        infoEntryDate.setText("aaaa-mm-dd");
    }//GEN-LAST:event_infoEntryDateMouseEntered

    private void infoEntryDateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoEntryDateMouseExited
        infoEntryDate.setText("");
    }//GEN-LAST:event_infoEntryDateMouseExited
    
    private void showUser(){
        fieldUserName.setText(user.getLawyerName());
        fieldUserSurname.setText(user.getLawyerSurname());
        fieldUserDNI.setText(user.getLawyerNIF());
        fieldUserEntryDate.setText(user.getLawyerEntryDateFormat());
        fieldUserPhone.setText(String.valueOf(user.getLawyerPhoneExt()));
        fieldUserUserName.setText(user.getLawyerUserName());
        labelImage.setIcon(new ImageIcon("./src/Images_user/"+user.getLawyerPhoto()));
    }
    
    private static Lawyer user;
    private static JFileChooser fileChooser = new JFileChooser();
    private Connection conn;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonChangeImage;
    private javax.swing.JButton buttonSaveChanges;
    private javax.swing.JTextField fieldUserDNI;
    private javax.swing.JTextField fieldUserEntryDate;
    private javax.swing.JTextField fieldUserName;
    private javax.swing.JTextField fieldUserPhone;
    private javax.swing.JTextField fieldUserSurname;
    private javax.swing.JTextField fieldUserUserName;
    private javax.swing.JLabel infoDNI;
    private javax.swing.JLabel infoEntryDate;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelUserDNI;
    private javax.swing.JLabel labelUserEntryDate;
    private javax.swing.JLabel labelUserHeader;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JLabel labelUserPhone;
    private javax.swing.JLabel labelUserSurname;
    private javax.swing.JLabel labelUserUserName;
    // End of variables declaration//GEN-END:variables
}

package GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import GUI.Reception;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Djumbi
 */
public class Medecin extends javax.swing.JInternalFrame {
Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    /**
     * Creates new form Medecin
     */
    public Medecin() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        selectUser();
    }
    public void selectUser(){
        try {
            String url="jdbc:mysql://localhost/gestionhospitaliere";
            con=DriverManager.getConnection(url,"root","");
            st= con.createStatement();
            rs=st.executeQuery("SELECT * FROM medecin");
            TMed.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNoms = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        txtIdMed = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TMed = new javax.swing.JTable();
        txtAge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSpecialite = new javax.swing.JTextField();
        txtTitre = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        cboSexe = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1486506224-h-sign-hospital-hospital-sign-hospital-medical-road-sign_81459.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(175, 202, 229));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null)));
        jPanel2.setPreferredSize(new java.awt.Dimension(1020, 560));

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel3.setText("Noms");

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel5.setText("Sexe ");

        txtNoms.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(253, 253, 247));

        jButton15.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Enre.png"))); // NOI18N
        jButton15.setText("Enregistrer");
        jButton15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Modif.png"))); // NOI18N
        jButton16.setText("Modifier");
        jButton16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Suppr.png"))); // NOI18N
        jButton17.setText("Supprimer");
        jButton17.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus.png"))); // NOI18N
        jButton18.setText("Nouveau");
        jButton18.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton15)
                .addGap(18, 18, 18)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton17)
                .addGap(18, 18, 18)
                .addComponent(jButton18)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15)
                    .addComponent(jButton16)
                    .addComponent(jButton17)
                    .addComponent(jButton18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtIdMed.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel4.setText("Id  ");

        TMed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TMed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TMedMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TMed);

        txtAge.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel6.setText("Specialité");

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel7.setText("Titre");

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel8.setText("Age");

        jLabel9.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel9.setText("Liste de tous les Médecins ");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel10.setText("Téléphone");

        txtSpecialite.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N

        txtTitre.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N

        txtTelephone.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N

        cboSexe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboSexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculin", "Féminin" }));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1486506224-h-sign-hospital-hospital-sign-hospital-medical-road-sign_81459.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1486506224-h-sign-hospital-hospital-sign-hospital-medical-road-sign_81459.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/medical-29_icon-icons.com_73943.png"))); // NOI18N
        jLabel14.setText("Médecin");
        jLabel14.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(69, 69, 69))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtIdMed, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cboSexe, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNoms, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel10))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSpecialite, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(68, 68, 68))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(69, 69, 69))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtIdMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNoms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtSpecialite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
               if (txtNoms.getText().isEmpty()|| txtIdMed.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Selectionner un Médecin à supprimer");
        }
        else {
             try {
                  String url="jdbc:mysql://localhost/gestionhospitaliere";
                  con=DriverManager.getConnection(url,"root","");
                   st=con.createStatement();
                   st.executeUpdate("DELETE FROM medecin WHERE IdMed ="+txtIdMed.getText());
//                     st.executeUpdate("DELETE FROM malade WHERE Noms ="+ txtNom.getText());
                   JOptionPane.showMessageDialog(this, "Médecin supprimé avec succès");
                   selectUser();
             }catch (Exception e){
                 e.printStackTrace();
             }
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
              
                try {
         String url="jdbc:mysql://localhost/gestionhospitaliere";
         con=DriverManager.getConnection(url,"root","");
          pst =(PreparedStatement) con.prepareStatement ("insert into medecin (Noms,Sexe,Age,Titre,Specialite,Telephone)values(?,?,?,?,?,?)");
          pst.setString(1, txtNoms.getText());
             pst.setString(2, cboSexe.getSelectedItem().toString());
             pst.setString(3, txtAge.getText());
             pst.setString(4, txtTitre.getText());
             pst.setString(5, txtSpecialite.getText());
             pst.setString(6, txtTelephone.getText());
               int row;
              row =pst.executeUpdate();
             JOptionPane.showMessageDialog(null,"Enregistrement reusi avec succès" );
             selectUser();

        } catch (Exception ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
          

        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if (txtIdMed.getText().equals("")) 
           JOptionPane.showMessageDialog(null,"Vous devez selectionner le Médecin à Modifier" );
       else {     try {
         String url="jdbc:mysql://localhost/gestionhospitaliere";
         con=DriverManager.getConnection(url,"root","");
          pst =(PreparedStatement) con.prepareStatement ("Update medecin set Noms='" +txtNoms.getText()+"',Sexe='"+ cboSexe.getSelectedItem().toString()+"',Age='"+txtAge.getText()+"',Titre='"+txtTitre.getText()+"',Specialite='"+txtSpecialite.getText()+"',Telephone='"+txtTelephone.getText()+"' WHERE IdMed='"+txtIdMed.getText() +"'");
               int row;
              row =pst.executeUpdate();
             JOptionPane.showMessageDialog(null,"Modification reusi avec succès" );
             selectUser();

        } catch (Exception ex) {
            Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);    
        }
       }
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void TMedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMedMouseClicked
        DefaultTableModel model = (DefaultTableModel)TMed.getModel();
      int myindex = TMed.getSelectedRow();
        txtIdMed.setText(model.getValueAt(myindex, 0).toString());
        txtNoms.setText(model.getValueAt(myindex, 1).toString());
        cboSexe.setSelectedItem(model.getValueAt(myindex, 2).toString());
        txtAge.setText(model.getValueAt(myindex, 3).toString());
        txtTitre.setText(model.getValueAt(myindex, 4).toString());
        txtSpecialite.setText(model.getValueAt(myindex, 5).toString());
        txtTelephone.setText(model.getValueAt(myindex, 6).toString());
    }//GEN-LAST:event_TMedMouseClicked

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
           txtIdMed.setText("");
        txtNoms.setText("");
        cboSexe.setSelectedItem("");
        txtAge.setText("");
        txtTitre.setText("");
        txtSpecialite.setText("");
        txtTelephone.setText("");
    }//GEN-LAST:event_jButton18ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TMed;
    private javax.swing.JComboBox<String> cboSexe;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtIdMed;
    private javax.swing.JTextField txtNoms;
    private javax.swing.JTextField txtSpecialite;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtTitre;
    // End of variables declaration//GEN-END:variables
}

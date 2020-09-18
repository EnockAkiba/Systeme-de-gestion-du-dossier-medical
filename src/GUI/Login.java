package GUI;

import GUI.Reception;
import GUI.Accueil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akiba
 */
public class Login extends javax.swing.JFrame  {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
   
    Statement st;
   public String type;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        Date d = new Date();
          jLabel7.setText("Heure: "+DateFormat.getDateInstance().format(d));
          type=cboType.getSelectedItem().toString();
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        txtPassWord = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboType = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(131, 145, 148));
        setLocation(new java.awt.Point(250, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 178, 202));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login_icon.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 140));

        jPanel2.setBackground(new java.awt.Color(153, 178, 202));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(254, 246, 160)));

        txtUserName.setFont(new java.awt.Font("Liberation Mono", 0, 18)); // NOI18N
        txtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 206, 113)));

        txtPassWord.setFont(new java.awt.Font("Liberation Mono", 0, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(254, 242, 151));
        jButton1.setFont(new java.awt.Font("Liberation Mono", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(31, 29, 17));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(38, 43, 48));
        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(63, 56, 29));
        jLabel1.setText("Username");

        jLabel4.setBackground(new java.awt.Color(38, 43, 48));
        jLabel4.setFont(new java.awt.Font("Ubuntu Light", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(63, 56, 29));
        jLabel4.setText("Passeword");

        jLabel3.setBackground(new java.awt.Color(38, 43, 48));
        jLabel3.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(63, 56, 29));
        jLabel3.setText("Login here");

        cboType.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        cboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrateur", "Comptable", "Laborantin", "Médecin", "Percepteur", "Pharmacien", "Receptioniste", " " }));
        cboType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTypeItemStateChanged(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(38, 43, 48));
        jLabel9.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(63, 56, 29));
        jLabel9.setText("Vous êtes un   :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserName)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cboType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboType, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 350, 190));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 30)); // NOI18N
        jLabel5.setText("Systeme de Gestion");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1486506224-h-sign-hospital-hospital-sign-hospital-medical-road-sign_81459.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 100, 100));

        jLabel7.setFont(new java.awt.Font("Liberation Mono", 0, 14)); // NOI18N
        jLabel7.setText("Time");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 160, -1));

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(224, 35, 35));
        jLabel8.setText("CBCA/NDOSHO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1486506224-h-sign-hospital-hospital-sign-hospital-medical-road-sign_81459.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          if (txtUserName.getText().equals("")|| txtPassWord.getText().equals("")){
                  JOptionPane.showMessageDialog(this, "Veillez bien completer le nom et le mot de passe");
          }
          else {
        String query ="SELECT * FROM User WHERE UserName=? and PassWord=? And Type=?";
        try {
            String url="jdbc:mysql://localhost/gestionhospitaliere";
            con=DriverManager.getConnection(url,"root","");
//            String query ="SELECT * FROM User WHERE UserName=? and PassWord=? and Type=?";
               pst=con.prepareStatement(query);
               pst.setString(1, txtUserName.getText());
               pst.setString(2, txtPassWord.getText());
               pst.setString(3, String.valueOf(cboType.getSelectedItem()));
               rs=pst.executeQuery();
               if (rs.next()){
                  System.out.print("salut "+type);
                   String t="";
                  t=type;
                    Accueil f = new Accueil();
                    f.setVisible(true);
                    this.setVisible(false);
               }
               else 
                   JOptionPane.showMessageDialog(this, "Nom d'utilisateur ou mot de passe incorrect ");
         
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cboTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTypeItemStateChanged
       type=cboType.getSelectedItem().toString();
    }//GEN-LAST:event_cboTypeItemStateChanged

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPasswordField txtPassWord;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.registration;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.regex.*;

import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;  
import com.mongodb.client.MongoCollection;
import org.bson.Document;


/**
 *
 * @author Student.Admin
 */
public class Signup extends javax.swing.JFrame {
DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form Register
     */
    public Signup() {
        initComponents();
        connect();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
       
    }
    
    MongoClient mongo;
    MongoDatabase dbconnection;
    MongoCollection<org.bson.Document>  collection;
    
    public void connect(){
        
        mongo = new MongoClient("localhost",27017);
        dbconnection = mongo.getDatabase("Login_register");
        collection= dbconnection.getCollection("accounts");
        System.out.println("connect");
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
        Contact = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        role = new javax.swing.JComboBox<>();
        lastname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        password2lab = new javax.swing.JLabel();
        passwordlab = new javax.swing.JLabel();
        addresslab = new javax.swing.JLabel();
        rolelab = new javax.swing.JLabel();
        contactlab = new javax.swing.JLabel();
        usernamelab = new javax.swing.JLabel();
        emaillab = new javax.swing.JLabel();
        lastnamelab = new javax.swing.JLabel();
        Role = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpassword = new javax.swing.JPasswordField();
        jpassword2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        Register = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_lastname = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1020, 800));
        setMinimumSize(new java.awt.Dimension(1020, 800));
        setPreferredSize(new java.awt.Dimension(1020, 800));
        setSize(new java.awt.Dimension(1020, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1009, 655));
        jPanel1.setLayout(null);

        Contact.setText("Contact Number");
        Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactActionPerformed(evt);
            }
        });
        Contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ContactKeyReleased(evt);
            }
        });
        jPanel1.add(Contact);
        Contact.setBounds(30, 360, 410, 40);

        username.setText("Username");
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(30, 240, 200, 40);

        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buyer", "Supplier" }));
        role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleActionPerformed(evt);
            }
        });
        role.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                roleKeyReleased(evt);
            }
        });
        jPanel1.add(role);
        role.setBounds(90, 420, 350, 30);

        lastname.setText("Lastname");
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastnameKeyReleased(evt);
            }
        });
        jPanel1.add(lastname);
        lastname.setBounds(240, 240, 200, 40);

        email.setText("Email");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(30, 300, 410, 40);

        Address.setText("Address");
        Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressActionPerformed(evt);
            }
        });
        Address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AddressKeyReleased(evt);
            }
        });
        jPanel1.add(Address);
        Address.setBounds(30, 470, 410, 40);

        password2lab.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        password2lab.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(password2lab);
        password2lab.setBounds(30, 630, 200, 20);

        passwordlab.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        passwordlab.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(passwordlab);
        passwordlab.setBounds(30, 570, 200, 20);

        addresslab.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        addresslab.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(addresslab);
        addresslab.setBounds(30, 510, 200, 20);

        rolelab.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        rolelab.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(rolelab);
        rolelab.setBounds(90, 450, 200, 20);

        contactlab.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        contactlab.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(contactlab);
        contactlab.setBounds(30, 400, 200, 20);

        usernamelab.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        usernamelab.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(usernamelab);
        usernamelab.setBounds(30, 280, 200, 20);

        emaillab.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        emaillab.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(emaillab);
        emaillab.setBounds(30, 340, 200, 20);

        lastnamelab.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lastnamelab.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lastnamelab);
        lastnamelab.setBounds(240, 280, 200, 20);

        Role.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Role.setText("Role");
        jPanel1.add(Role);
        Role.setBounds(30, 420, 70, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(9, 193, 9));
        jLabel7.setText("LOGIN");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel7MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(220, 730, 60, 20);

        jpassword.setText("jPasswordField1");
        jpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpasswordActionPerformed(evt);
            }
        });
        jpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jpasswordKeyReleased(evt);
            }
        });
        jPanel1.add(jpassword);
        jpassword.setBounds(30, 530, 410, 40);

        jpassword2.setText("jPasswordField2");
        jpassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpassword2ActionPerformed(evt);
            }
        });
        jpassword2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jpassword2KeyReleased(evt);
            }
        });
        jPanel1.add(jpassword2);
        jpassword2.setBounds(30, 590, 410, 40);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Already have an account?");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(170, 700, 150, 20);

        Register.setBackground(new java.awt.Color(82, 117, 82));
        Register.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Register.setForeground(new java.awt.Color(255, 255, 255));
        Register.setText("REGISTER");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        jPanel1.add(Register);
        Register.setBounds(180, 650, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fruits1.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(740, 100, 260, 190);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vintage_and_Classic_Scooter_Community_Logo_2.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 10, 150, 130);

        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(63, 128, 57));
        jLabel2.setText("GREEN VALLEY");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 30, 280, 29);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login 1.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 80, 108, 150);

        lbl_lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbl_lastnameKeyReleased(evt);
            }
        });
        jPanel1.add(lbl_lastname);
        lbl_lastname.setBounds(240, 280, 160, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 9.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 10, 470, 710);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fruits-and-vegetables.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(470, 100, 260, 190);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fruits2.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(470, 300, 260, 190);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fruits3.jpg"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(740, 300, 260, 190);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fruits4.jpg"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(470, 500, 260, 190);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fruits5.jpg"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(740, 500, 260, 190);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressActionPerformed

    private void roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleActionPerformed

    private void jpassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpassword2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpassword2ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Login lg = new Login();
        lg.setVisible(false);
        setVisible(true);
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpasswordActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        
         Document d =new Document("name",username.getText());
        d.append("lastname",lastname.getText());  
        d.append("username",username.getText());
        d.append("password",jpassword.getText());
        d.append( "password",jpassword2.getText());
        d.append("Address",Address.getText());
        d.append("email",email.getText());
        d.append("contact",Contact.getText());
        d.append("role",role.getSelectedItem());
        
        collection.insertOne(d);
        JOptionPane.showMessageDialog(this, "Registered Successfully");
        
        new Login().setVisible(true);
        setVisible(false);
           
    }//GEN-LAST:event_RegisterActionPerformed

    private void lbl_lastnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_lastnameKeyReleased
        
    }//GEN-LAST:event_lbl_lastnameKeyReleased

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
        
        
        
        
    }//GEN-LAST:event_usernameKeyPressed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        
        
        
    }//GEN-LAST:event_usernameActionPerformed

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
        
        String PATTERN = "^[a-zA-Z0-9] {0,30}[,./]$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(username.getText());
    
        if(username.getText().length()<5){
            usernamelab.setText("Username is required!");
        }
        else {
            usernamelab.setText(null);
        }
        
        
    }//GEN-LAST:event_usernameKeyReleased

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void lastnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastnameKeyReleased
        
        String PATTERN = "^[a-zA-Z0-9] {0,30}[,./]$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(lastnamelab.getText());
        
        if(lastnamelab.getText().length()< 5){
            lastnamelab.setText("Lastname is required!");
        }
        else {
            lastnamelab.setText(null);
        }
        
    }//GEN-LAST:event_lastnameKeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        
     String PATTERN = "^^[a-zA-Z0-9]]{2,200} [@][.] {0,10}[.] {0,5}$";
     Pattern patt=Pattern.compile(PATTERN);
     Matcher match=patt.matcher(emaillab.getText());
     
     if(emaillab.getText().length()< 20){
            emaillab.setText("Email is required!");
        }
        else {
            emaillab.setText(null);
        }
     
        
        
    }//GEN-LAST:event_emailKeyReleased

    private void ContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContactKeyReleased
       
     String PATTERN = "^[0-9] {10,12}$";
     Pattern patt=Pattern.compile(PATTERN);
     Matcher match=patt.matcher(contactlab.getText());
     
     if(contactlab.getText().length()< 9){
            contactlab.setText("Contact Number is required!");
        }
        else {
            contactlab.setText(null);
        }
    }//GEN-LAST:event_ContactKeyReleased

    private void roleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roleKeyReleased
        // TODO add your handling code here:
      String PATTERN = "[0]";  
      Pattern patt=Pattern.compile(PATTERN);
     Matcher match=patt.matcher(rolelab.getText());
     
     if(!match.matches()){
            rolelab.setText("Role is required!");
        }
        else {
            rolelab.setText(null);
        }
    }//GEN-LAST:event_roleKeyReleased

    private void AddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddressKeyReleased
        // TODO add your handling code here:
     String PATTERN = "^[a-zA-Z0-9]]{2,200}$";
     Pattern patt=Pattern.compile(PATTERN);
     Matcher match=patt.matcher(addresslab.getText());
     
     if(addresslab.getText().length()<20){
         
            addresslab.setText("Address is required!");
        }
        else {
            addresslab.setText(null);
        }
    }//GEN-LAST:event_AddressKeyReleased

    private void jpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpasswordKeyReleased
        // TODO add your handling code here:
     
     
//     if(passwordlab.getText().length()<10){
//            passwordlab.setText("Password is required!");
//        }
//        else {
//            passwordlab.setText(null);
//        }
    }//GEN-LAST:event_jpasswordKeyReleased

    private void jpassword2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpassword2KeyReleased
        // TODO add your handling code here:
     
     
//     if(password2lab.getText().length()<10){
//            password2lab.setText("Password is required!");
//        }
//        else {
//            password2lab.setText(null);
//        }
    }//GEN-LAST:event_jpassword2KeyReleased

    private void jLabel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseReleased
        Login lg = new Login();
        lg.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel7MouseReleased

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Contact;
    private javax.swing.JButton Register;
    private javax.swing.JLabel Role;
    private javax.swing.JLabel addresslab;
    private javax.swing.JLabel contactlab;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emaillab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JPasswordField jpassword2;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel lastnamelab;
    private javax.swing.JLabel lbl_lastname;
    private javax.swing.JLabel password2lab;
    private javax.swing.JLabel passwordlab;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JLabel rolelab;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernamelab;
    // End of variables declaration//GEN-END:variables
}

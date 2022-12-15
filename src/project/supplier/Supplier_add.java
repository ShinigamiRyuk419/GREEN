/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.supplier;

import project.buyer.chat;
import project.buyer.notifications;
import project.buyer.settings;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.border.Border;
import org.bson.Document;

/**
 *
 * @author Student.Admin
 */
public class Supplier_add extends javax.swing.JFrame {

        Border textField_border = BorderFactory.createMatteBorder(0, 0, 2, 2, Color.black);
        
    public Supplier_add() {
        initComponents();
        showDate();
        showTime();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        
        
        
        nametxt.setBorder(textField_border);
        pricetxt.setBorder(textField_border);
        quantxt.setBorder(textField_border);
        addresstxt.setBorder(textField_border);
        desctxt.setBorder(textField_border);

    }
    
    void showDate() {
        Date dat = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        date.setText(s.format(dat));

    }
    
    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date dat = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                time.setText(s.format(dat));
            }
        }
        ).start();
    }
    
//    void addTransactionDate(){
            SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
            Date dat = new Date();
            String date1 = s.format(dat.getTime());
//            st.setString(4, date1);

            SimpleDateFormat r = new SimpleDateFormat("hh:mm:ss a");
            String det = r.format(dat.getTime());

//            st.setString(5, det);
//    }
    
    //creating database
    MongoClient mongoClient = new MongoClient( "localhost" , 27017 ); 
    MongoDatabase db = mongoClient.getDatabase("GreenValley");
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        typecombo = new javax.swing.JComboBox<>();
        nametxt = new javax.swing.JTextField();
        addresstxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        desctxt = new javax.swing.JTextArea();
        quantxt = new javax.swing.JTextField();
        Addbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nothing = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        tilte = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        sup_ad_home = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        sup_ad_notif = new javax.swing.JButton();
        sup_ad_chat = new javax.swing.JButton();
        sup_ad_profile = new javax.swing.JButton();
        sup_ad_settings = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        pricetxt = new javax.swing.JTextField();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setSize(new java.awt.Dimension(1200, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 650));
        jPanel1.setLayout(null);

        typecombo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        typecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fruits", "Vegetables" }));
        typecombo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 0), new java.awt.Color(0, 51, 0), new java.awt.Color(0, 51, 0), new java.awt.Color(0, 51, 0)));
        typecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typecomboActionPerformed(evt);
            }
        });
        jPanel1.add(typecombo);
        typecombo.setBounds(90, 310, 280, 40);

        nametxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nametxt.setText("NAME");
        nametxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 0), new java.awt.Color(0, 51, 0), new java.awt.Color(0, 51, 0), new java.awt.Color(0, 51, 0)));
        nametxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nametxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nametxtFocusLost(evt);
            }
        });
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        jPanel1.add(nametxt);
        nametxt.setBounds(90, 250, 280, 40);

        addresstxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addresstxt.setText("ADDRESS");
        addresstxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 0), new java.awt.Color(0, 51, 0), new java.awt.Color(0, 51, 0), new java.awt.Color(0, 51, 0)));
        addresstxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addresstxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addresstxtFocusLost(evt);
            }
        });
        addresstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstxtActionPerformed(evt);
            }
        });
        jPanel1.add(addresstxt);
        addresstxt.setBounds(90, 490, 280, 40);

        desctxt.setColumns(20);
        desctxt.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        desctxt.setRows(5);
        desctxt.setText("DESCRIPTION");
        desctxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 0), new java.awt.Color(0, 51, 0), new java.awt.Color(0, 51, 0), new java.awt.Color(0, 51, 0)));
        desctxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                desctxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                desctxtFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(desctxt);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(460, 250, 270, 220);

        quantxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quantxt.setText("QUANTITY");
        quantxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 0), new java.awt.Color(0, 51, 0), new java.awt.Color(0, 51, 0), new java.awt.Color(0, 51, 0)));
        quantxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quantxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantxtFocusLost(evt);
            }
        });
        quantxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantxtActionPerformed(evt);
            }
        });
        jPanel1.add(quantxt);
        quantxt.setBounds(90, 430, 280, 40);

        Addbutton.setBackground(new java.awt.Color(82, 117, 82));
        Addbutton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        Addbutton.setForeground(new java.awt.Color(255, 255, 255));
        Addbutton.setText("Add");
        Addbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(Addbutton);
        Addbutton.setBounds(510, 560, 160, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Supplies");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(460, 160, 260, 32);

        nothing.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        nothing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 9.png"))); // NOI18N
        jPanel1.add(nothing);
        nothing.setBounds(330, -20, 640, 680);

        upload.setBackground(new java.awt.Color(82, 117, 82));
        upload.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        upload.setForeground(new java.awt.Color(255, 255, 255));
        upload.setText("Upload Image");
        upload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        jPanel1.add(upload);
        upload.setBounds(860, 450, 180, 30);

        image.setBackground(new java.awt.Color(204, 204, 204));
        image.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        image.setText("                Add image here");
        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0)));
        jPanel1.add(image);
        image.setBounds(840, 250, 220, 160);

        tilte.setForeground(new java.awt.Color(255, 255, 255));
        tilte.setText("jLabel7");
        jPanel1.add(tilte);
        tilte.setBounds(920, 420, 90, 16);

        jLabel3.setBackground(new java.awt.Color(82, 117, 82));
        jLabel3.setForeground(new java.awt.Color(82, 117, 82));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/green valley.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(65, 65));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 70, 73);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(82, 117, 82));
        jLabel4.setText("GREEN");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 20, 60, 18);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(82, 117, 82));
        jLabel5.setText("VALLEY");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 40, 61, 18);

        jPanel4.setBackground(new java.awt.Color(217, 217, 217));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(82, 117, 82));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Customer Support");
        jButton7.setBorder(null);
        jButton7.setPreferredSize(new java.awt.Dimension(85, 35));
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 130, 40));

        jButton8.setBackground(new java.awt.Color(82, 117, 82));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("All Products");
        jButton8.setBorder(null);
        jButton8.setPreferredSize(new java.awt.Dimension(85, 35));
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        jButton9.setBackground(new java.awt.Color(82, 117, 82));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Fruits");
        jButton9.setBorder(null);
        jButton9.setPreferredSize(new java.awt.Dimension(85, 35));
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 130, 40));

        jButton10.setBackground(new java.awt.Color(82, 117, 82));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Vegetables");
        jButton10.setBorder(null);
        jButton10.setPreferredSize(new java.awt.Dimension(85, 35));
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 130, 40));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setPreferredSize(new java.awt.Dimension(85, 35));
        jPanel4.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 40, 40));

        jButton12.setBackground(new java.awt.Color(82, 117, 82));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("About us");
        jButton12.setBorder(null);
        jButton12.setPreferredSize(new java.awt.Dimension(85, 35));
        jPanel4.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 130, 40));

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 80, 1200, 40);

        jPanel30.setBackground(new java.awt.Color(82, 117, 82));
        jPanel30.setLayout(null);

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("© 2022 Green Valley Ph");
        jPanel30.add(jLabel69);
        jLabel69.setBounds(490, 10, 201, 25);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("All Rights Reserved");
        jPanel30.add(jLabel31);
        jLabel31.setBounds(520, 30, 140, 20);

        jPanel1.add(jPanel30);
        jPanel30.setBounds(0, 690, 1200, 60);

        jPanel5.setBackground(new java.awt.Color(82, 117, 82));

        sup_ad_home.setBackground(new java.awt.Color(82, 117, 82));
        sup_ad_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-2-32.png"))); // NOI18N
        sup_ad_home.setBorder(null);
        sup_ad_home.setContentAreaFilled(false);
        sup_ad_home.setPreferredSize(new java.awt.Dimension(35, 35));
        sup_ad_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sup_ad_homeActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(82, 117, 82));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-14-32.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setPreferredSize(new java.awt.Dimension(35, 35));

        jTextField1.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jTextField1.setText("Search here...");

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));

        sup_ad_notif.setBackground(new java.awt.Color(82, 117, 82));
        sup_ad_notif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bell-2-32.png"))); // NOI18N
        sup_ad_notif.setBorder(null);
        sup_ad_notif.setContentAreaFilled(false);
        sup_ad_notif.setPreferredSize(new java.awt.Dimension(35, 35));
        sup_ad_notif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_ad_notifMouseClicked(evt);
            }
        });
        sup_ad_notif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sup_ad_notifActionPerformed(evt);
            }
        });

        sup_ad_chat.setBackground(new java.awt.Color(82, 117, 82));
        sup_ad_chat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/envelope-closed-32.png"))); // NOI18N
        sup_ad_chat.setBorder(null);
        sup_ad_chat.setContentAreaFilled(false);
        sup_ad_chat.setPreferredSize(new java.awt.Dimension(35, 35));
        sup_ad_chat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_ad_chatMouseClicked(evt);
            }
        });
        sup_ad_chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sup_ad_chatActionPerformed(evt);
            }
        });

        sup_ad_profile.setBackground(new java.awt.Color(82, 117, 82));
        sup_ad_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-32.png"))); // NOI18N
        sup_ad_profile.setBorder(null);
        sup_ad_profile.setContentAreaFilled(false);
        sup_ad_profile.setPreferredSize(new java.awt.Dimension(35, 35));
        sup_ad_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_ad_profileMouseClicked(evt);
            }
        });
        sup_ad_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sup_ad_profileActionPerformed(evt);
            }
        });

        sup_ad_settings.setBackground(new java.awt.Color(82, 117, 82));
        sup_ad_settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings-23-32.png"))); // NOI18N
        sup_ad_settings.setBorder(null);
        sup_ad_settings.setContentAreaFilled(false);
        sup_ad_settings.setPreferredSize(new java.awt.Dimension(35, 35));
        sup_ad_settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_ad_settingsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(sup_ad_notif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sup_ad_chat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sup_ad_profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(sup_ad_settings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sup_ad_profile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sup_ad_chat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sup_ad_notif, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                            .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(sup_ad_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(3, 3, 3)))
        );

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Your Supplies");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(sup_ad_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sup_ad_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(150, 0, 1050, 70);

        pricetxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pricetxt.setText("PRICE");
        pricetxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 0), new java.awt.Color(0, 51, 0), new java.awt.Color(0, 51, 0), new java.awt.Color(0, 51, 0)));
        pricetxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pricetxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pricetxtFocusLost(evt);
            }
        });
        pricetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricetxtActionPerformed(evt);
            }
        });
        jPanel1.add(pricetxt);
        pricetxt.setBounds(90, 370, 280, 40);

        time.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        time.setForeground(new java.awt.Color(0, 102, 51));
        time.setText("Time");
        jPanel1.add(time);
        time.setBounds(260, 150, 120, 30);

        date.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(0, 102, 51));
        date.setText("date");
        jPanel1.add(date);
        date.setBounds(100, 150, 110, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addresstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstxtActionPerformed

    private void quantxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantxtActionPerformed

    private void typecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typecomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typecomboActionPerformed

    private void AddbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbuttonActionPerformed
        MongoCollection<Document>  collection= db.getCollection("Supplies");
        
        Document doc =new Document("Supply_name",nametxt.getText()); 
        doc.append("Category",typecombo.getSelectedItem());
        doc.append("Quantity",quantxt.getText());
        doc.append("Price",pricetxt.getText());
        doc.append("Description",desctxt.getText());
        doc.append("Address",addresstxt.getText());
        doc.append("Date_added", date1);
        doc.append("Time_added", det);
        doc.append("Image_File",photo);
	collection.insertOne(doc);
    }//GEN-LAST:event_AddbuttonActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        JFileChooser choser = new JFileChooser();
        choser.showOpenDialog(jPanel1);
        File f = choser.getSelectedFile();
        image.setIcon(new ImageIcon(f.toString()));
        filename = f.getAbsolutePath();
        tilte.setText(filename);
        
        try{
            File i = new File(filename);
            FileInputStream fis= new FileInputStream(i);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte [1024];
                for(int readNum; (readNum =fis.read(buf)) !=-1;){
                    bos.write(buf,0,readNum);
        }
                photo = bos.toByteArray();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_uploadActionPerformed

    private void sup_ad_notifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sup_ad_notifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sup_ad_notifActionPerformed

    private void sup_ad_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sup_ad_chatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sup_ad_chatActionPerformed

    private void sup_ad_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sup_ad_profileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sup_ad_profileActionPerformed

    private void sup_ad_settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_ad_settingsMouseClicked
        settings sup_ad_set = new settings();
        sup_ad_set.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sup_ad_settingsMouseClicked

    private void sup_ad_profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_ad_profileMouseClicked
        settings sup_ad_prof = new settings();
        sup_ad_prof.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sup_ad_profileMouseClicked

    private void sup_ad_chatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_ad_chatMouseClicked
        chat sup_ad_c = new chat();
        sup_ad_c.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sup_ad_chatMouseClicked

    private void sup_ad_notifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_ad_notifMouseClicked
        notifications sup_ad_notif = new notifications();
        sup_ad_notif.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sup_ad_notifMouseClicked

    private void nametxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nametxtFocusGained
        if (nametxt.getText().trim().toUpperCase().equals("NAME")) {
            nametxt.setText("");
            nametxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_nametxtFocusGained

    private void nametxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nametxtFocusLost
        if (nametxt.getText().trim().equals("")
            || nametxt.getText().trim().toUpperCase().equals("NAME")) {
            nametxt.setText("NAME");
            nametxt.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nametxtFocusLost

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void quantxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantxtFocusLost
        if (quantxt.getText().trim().equals("")
            || quantxt.getText().trim().toUpperCase().equals("QUANTITY")) {
            quantxt.setText("QUANTITY");
            quantxt.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_quantxtFocusLost

    private void quantxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantxtFocusGained
        if (quantxt.getText().trim().toUpperCase().equals("QUANTITY")) {
            quantxt.setText("");
            quantxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_quantxtFocusGained

    private void addresstxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addresstxtFocusLost
        if (addresstxt.getText().trim().equals("")
            || addresstxt.getText().trim().toUpperCase().equals("ADDRESS")) {
            addresstxt.setText("ADDRESS");
            addresstxt.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_addresstxtFocusLost

    private void addresstxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addresstxtFocusGained
        if (addresstxt.getText().trim().toUpperCase().equals("ADDRESS")) {
            addresstxt.setText("");
            addresstxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_addresstxtFocusGained

    private void desctxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_desctxtFocusLost
        if (desctxt.getText().trim().equals("")
            || desctxt.getText().trim().toUpperCase().equals("DESCRIPTION")) {
            desctxt.setText("DESCRIPTION");
            desctxt.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_desctxtFocusLost

    private void desctxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_desctxtFocusGained
        if (desctxt.getText().trim().toUpperCase().equals("DESCRIPTION")) {
            desctxt.setText("");
            desctxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_desctxtFocusGained

    private void pricetxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pricetxtFocusGained
        if (pricetxt.getText().trim().toUpperCase().equals("PRICE")) {
            pricetxt.setText("");
            pricetxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_pricetxtFocusGained

    private void pricetxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pricetxtFocusLost
        if (pricetxt.getText().trim().equals("")
            || pricetxt.getText().trim().toUpperCase().equals("PRICE")) {
            pricetxt.setText("PRICE");
            pricetxt.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_pricetxtFocusLost

    private void pricetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricetxtActionPerformed

    private void sup_ad_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sup_ad_homeActionPerformed
        home_supplier sup_up_set = new home_supplier();
        sup_up_set.setVisible(true);
        setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_sup_ad_homeActionPerformed

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
            java.util.logging.Logger.getLogger(Supplier_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier_add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbutton;
    private javax.swing.JTextField addresstxt;
    private javax.swing.JLabel date;
    private javax.swing.JTextArea desctxt;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel nothing;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JTextField quantxt;
    private javax.swing.JButton sup_ad_chat;
    private javax.swing.JButton sup_ad_home;
    private javax.swing.JButton sup_ad_notif;
    private javax.swing.JButton sup_ad_profile;
    private javax.swing.JButton sup_ad_settings;
    private javax.swing.JLabel tilte;
    private javax.swing.JLabel time;
    private javax.swing.JComboBox<String> typecombo;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
byte[] photo = null;
String filename = null;
}

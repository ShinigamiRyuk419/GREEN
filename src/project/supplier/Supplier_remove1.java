/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.supplier;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import project.buyer.chat;
import project.buyer.notifications;
import project.buyer.settings;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Student.Admin
 */
public class Supplier_remove1 extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Supplier_remove1() {
        initComponents();
        
        showData();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }
    
    MongoClient mongo = null;
    DBCursor cursor = null;
    
    public void showData(){
        
        try {
            mongo = new MongoClient("localhost", 27017);
            DB db = mongo.getDB("GreenValley");
            DBCollection collection = db.getCollection("Supplies");
            cursor = collection.find();

            String[] column = {"Product", "Name", "Price", "Quantity"};
            DefaultTableModel model = new DefaultTableModel(column, 0);
            
            while (cursor.hasNext()) {
                DBObject obj = cursor.next();
                String quan = (String) obj.get("Quantity");
                String price = (String) obj.get("Price");
                String nam = (String) obj.get("Supply_name");
                byte[] pict = (byte[]) obj.get("Image_File");
                ImageIcon imageIcon = new ImageIcon(pict);
                imageIcon.getImage();
                
                imageLabel.setIcon(imageIcon);

                model.addRow(new Object[]{pict, nam, price, quan});
                
             
            }
            suppliesTable.setModel(model);
   
            cursor.close();
            mongo.close();
        }
        catch (Exception a) {
                a.printStackTrace();
            }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        sup_re_home = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        sup_re_notif = new javax.swing.JButton();
        sup_re_chat = new javax.swing.JButton();
        sup_re_profile = new javax.swing.JButton();
        sup_re_settings = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        suppliesTable = new javax.swing.JTable();
        imageLabel = new javax.swing.JLabel();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setSize(new java.awt.Dimension(1200, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 650));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Remove Supplies");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(460, 160, 260, 32);

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
        jLabel4.setBounds(80, 20, 53, 18);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(82, 117, 82));
        jLabel5.setText("VALLEY");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 40, 61, 18);

        jPanel5.setBackground(new java.awt.Color(82, 117, 82));

        sup_re_home.setBackground(new java.awt.Color(82, 117, 82));
        sup_re_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-2-32.png"))); // NOI18N
        sup_re_home.setBorder(null);
        sup_re_home.setContentAreaFilled(false);
        sup_re_home.setPreferredSize(new java.awt.Dimension(35, 35));
        sup_re_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sup_re_homeActionPerformed(evt);
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

        sup_re_notif.setBackground(new java.awt.Color(82, 117, 82));
        sup_re_notif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bell-2-32.png"))); // NOI18N
        sup_re_notif.setBorder(null);
        sup_re_notif.setContentAreaFilled(false);
        sup_re_notif.setPreferredSize(new java.awt.Dimension(35, 35));
        sup_re_notif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_re_notifMouseClicked(evt);
            }
        });
        sup_re_notif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sup_re_notifActionPerformed(evt);
            }
        });

        sup_re_chat.setBackground(new java.awt.Color(82, 117, 82));
        sup_re_chat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/envelope-closed-32.png"))); // NOI18N
        sup_re_chat.setBorder(null);
        sup_re_chat.setContentAreaFilled(false);
        sup_re_chat.setPreferredSize(new java.awt.Dimension(35, 35));
        sup_re_chat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_re_chatMouseClicked(evt);
            }
        });
        sup_re_chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sup_re_chatActionPerformed(evt);
            }
        });

        sup_re_profile.setBackground(new java.awt.Color(82, 117, 82));
        sup_re_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-32.png"))); // NOI18N
        sup_re_profile.setBorder(null);
        sup_re_profile.setContentAreaFilled(false);
        sup_re_profile.setPreferredSize(new java.awt.Dimension(35, 35));
        sup_re_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_re_profileMouseClicked(evt);
            }
        });
        sup_re_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sup_re_profileActionPerformed(evt);
            }
        });

        sup_re_settings.setBackground(new java.awt.Color(82, 117, 82));
        sup_re_settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings-23-32.png"))); // NOI18N
        sup_re_settings.setBorder(null);
        sup_re_settings.setContentAreaFilled(false);
        sup_re_settings.setPreferredSize(new java.awt.Dimension(35, 35));
        sup_re_settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_re_settingsMouseClicked(evt);
            }
        });
        sup_re_settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sup_re_settingsActionPerformed(evt);
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
                            .addComponent(sup_re_notif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sup_re_chat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sup_re_profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(sup_re_settings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(sup_re_profile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sup_re_chat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sup_re_notif, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                            .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(sup_re_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(sup_re_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(sup_re_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(150, 0, 1050, 70);

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

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jPanel7.setBackground(new java.awt.Color(82, 117, 82));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Products");

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Quantity");

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Price");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Name");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10)
                    .addComponent(jLabel18)
                    .addComponent(jLabel6))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        suppliesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        suppliesTable.setRowHeight(50);
        suppliesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suppliesTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(suppliesTable);

        imageLabel.setText("                            Image");

        delete.setBackground(new java.awt.Color(153, 0, 0));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Remove");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 121, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 303, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel6);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 210, 1100, 430);

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

    private void sup_re_notifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sup_re_notifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sup_re_notifActionPerformed

    private void sup_re_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sup_re_chatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sup_re_chatActionPerformed

    private void sup_re_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sup_re_profileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sup_re_profileActionPerformed

    private void sup_re_settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_re_settingsMouseClicked
        settings sup_re_set = new settings();
        sup_re_set.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sup_re_settingsMouseClicked

    private void sup_re_profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_re_profileMouseClicked
        settings sup_re_prof = new settings();
        sup_re_prof.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sup_re_profileMouseClicked

    private void sup_re_chatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_re_chatMouseClicked
        chat sup_re_c = new chat();
        sup_re_c.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sup_re_chatMouseClicked

    private void sup_re_notifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_re_notifMouseClicked
        notifications sup_re_notif = new notifications();
        sup_re_notif.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sup_re_notifMouseClicked

    private void suppliesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppliesTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) suppliesTable.getModel();
        int Myindex = suppliesTable.getSelectedRow();

//        nametxt.setText(model.getValueAt(Myindex, 0).toString());
//        String combo =(model.getValueAt(Myindex, 1).toString());
//        for (int i = 0; i< typecom.getItemCount();i++){
//            if (typecom.getItemAt(i).equalsIgnoreCase(combo)){
//                typecom.setSelectedIndex(i);
//            }
//        }
//        quantxt.setText(model.getValueAt(Myindex, 2).toString());
//        pricetxt.setText(model.getValueAt(Myindex, 3).toString());
//        desctxt.setText(model.getValueAt(Myindex, 4).toString());
//        addtxt.setText(model.getValueAt(Myindex, 5).toString());
//        date.setText(model.getValueAt(Myindex, 6).toString());
//        time.setText(model.getValueAt(Myindex, 7).toString());
//        tilte.setText(model.getValueAt(Myindex, 8).toString());
        
        byte[] byteArray =(byte[]) (model.getValueAt((Myindex),0)); //need to initialize it
        ImageIcon imageIcon = new ImageIcon(byteArray);
        imageIcon.getImage();
        imageLabel.setIcon(imageIcon);
    }//GEN-LAST:event_suppliesTableMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        mongo = new MongoClient("localhost", 27017);
        DB db = mongo.getDB("GreenValley");
        DBCollection collection = db.getCollection("Supplies");

        DefaultTableModel model = (DefaultTableModel) suppliesTable.getModel();
        int Myindex = suppliesTable.getSelectedRow();
        
        String img = (String) (model.getValueAt((Myindex),1));
        BasicDBObject query = new BasicDBObject();
        query.put("Supply_name", img);
        collection.remove(query);
        imageLabel.setText(img);
        showData();

        
    }//GEN-LAST:event_deleteActionPerformed

    private void sup_re_settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sup_re_settingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sup_re_settingsActionPerformed

    private void sup_re_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sup_re_homeActionPerformed
        home_supplier sup_up_set = new home_supplier();
        sup_up_set.setVisible(true);
        setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_sup_re_homeActionPerformed

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
            java.util.logging.Logger.getLogger(Supplier_remove1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier_remove1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier_remove1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier_remove1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier_remove1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton sup_re_chat;
    private javax.swing.JButton sup_re_home;
    private javax.swing.JButton sup_re_notif;
    private javax.swing.JButton sup_re_profile;
    private javax.swing.JButton sup_re_settings;
    private javax.swing.JTable suppliesTable;
    // End of variables declaration//GEN-END:variables
byte[] photo = null;
String filename = null;
}

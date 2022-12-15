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
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;
import supplies.supplies;

/**
 *
 * @author Student.Admin
 */
public class Supplier_update extends javax.swing.JFrame {

    public Supplier_update() {
        initComponents();
        showDate();
        showTime();
        showData();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    MongoClient mongo = null;
    DBCursor cursor = null;
    
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
    
        
//    public ArrayList<supplies> suppList(){
//        ArrayList<supplies> supplist = new ArrayList();
//
//        try {
//            mongo = new MongoClient("localhost", 27017);
//            DB db = mongo.getDB("GreenValley");
//            DBCollection collection = db.getCollection("Supplies");
//            cursor = collection.find();
//
////            String[] column = {"Name", "Type", "Quantity", "Description", "Address"};
////            DefaultTableModel model = new DefaultTableModel(column, 0);
//            supplies sup;
//
//            while (cursor.hasNext()) {
//                DBObject obj = cursor.next();
//                byte[] img = (byte[]) obj.get("Image");
//                String address = (String) obj.get("Address");
//                String desc = (String) obj.get("Description");
//                String quan = (String) obj.get("Quantity");
//                String ty = (String) obj.get("Type");
//                String nam = (String) obj.get("Name");
//                ObjectId id = (ObjectId) obj.get("_id");
//
//                sup = new supplies( img, address, desc, quan, ty, nam, id);
//                supplist.add(sup);
////                model.addRow(new Object[]{nam, ty, quan, desc, address});
//            }
//
//        } catch (Exception a) {
//            a.printStackTrace();
//        }
//        return supplist;
//
//    }
//     
    public void showData(){
        
        try {
            mongo = new MongoClient("localhost", 27017);
            DB db = mongo.getDB("GreenValley");
            DBCollection collection = db.getCollection("Supplies");
            cursor = collection.find();

            String[] column = {"Supply_Name", "Category", "Quantity", "Price","Description", "Address","Date_added","Time_added", "Image_File"};
            DefaultTableModel model = new DefaultTableModel(column, 0);

            while (cursor.hasNext()) {
                DBObject obj = cursor.next();
                byte[] pict = (byte[]) obj.get("Image_File");
                String oras = (String) obj.get("Time_added");
                String dyet = (String) obj.get("Date_added");
                String address = (String) obj.get("Address");
                String desc = (String) obj.get("Description");
                String price = (String) obj.get("Price");
                String quan = (String) obj.get("Quantity");
                String ty = (String) obj.get("Category");
                String nam = (String) obj.get("Supply_name");
                ObjectId id = (ObjectId) obj.get("_id");
                model.addRow(new Object[]{nam, ty, quan, price, desc, address, dyet, oras, pict});
                
             
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
        nametxt = new javax.swing.JTextField();
        typecom = new javax.swing.JComboBox<>();
        quantxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        desctxt = new javax.swing.JTextArea();
        addtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        imgLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        suppliesTable = new javax.swing.JTable();
        updateButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        sup_up_home = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        sup_up_notif = new javax.swing.JButton();
        sup_up_chat = new javax.swing.JButton();
        sup_up_profile = new javax.swing.JButton();
        sup_up_settings = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        nothing = new javax.swing.JLabel();
        pricetxt = new javax.swing.JTextField();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        tilte = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setSize(new java.awt.Dimension(1200, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 650));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Supplies");
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

        nametxt.setEditable(false);
        nametxt.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        nametxt.setText("Name");
        jPanel1.add(nametxt);
        nametxt.setBounds(70, 240, 280, 40);

        typecom.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        typecom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fruits", "Vegetables" }));
        jPanel1.add(typecom);
        typecom.setBounds(70, 300, 280, 40);

        quantxt.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        quantxt.setText("Quantity");
        quantxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantxtActionPerformed(evt);
            }
        });
        jPanel1.add(quantxt);
        quantxt.setBounds(70, 360, 280, 40);

        desctxt.setColumns(20);
        desctxt.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        desctxt.setRows(5);
        desctxt.setText("Description");
        jScrollPane1.setViewportView(desctxt);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 420, 280, 120);

        addtxt.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        addtxt.setText("Address");
        addtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtxtActionPerformed(evt);
            }
        });
        jPanel1.add(addtxt);
        addtxt.setBounds(70, 620, 280, 40);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("List of Available Supplies");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(760, 220, 230, 30);

        imgLabel.setBackground(new java.awt.Color(255, 255, 255));
        imgLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        imgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLabel.setText("Image");
        imgLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imgLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(400, 260, 170, 160);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setText("Change image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(430, 440, 120, 22);

        jScrollPane2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jScrollPane2.setOpaque(false);

        suppliesTable.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        suppliesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Supply_Name", "Category", "Quantity", "Price", "Description", "Address", "Date Added", "Time Added", "Image"
            }
        ));
        suppliesTable.setRowHeight(35);
        suppliesTable.setSelectionBackground(new java.awt.Color(0, 102, 51));
        suppliesTable.setShowVerticalLines(true);
        suppliesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suppliesTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(suppliesTable);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(590, 260, 540, 350);

        updateButton.setBackground(new java.awt.Color(82, 117, 82));
        updateButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update ");
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton);
        updateButton.setBounds(970, 620, 160, 30);

        jPanel5.setBackground(new java.awt.Color(82, 117, 82));

        sup_up_home.setBackground(new java.awt.Color(82, 117, 82));
        sup_up_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-2-32.png"))); // NOI18N
        sup_up_home.setBorder(null);
        sup_up_home.setContentAreaFilled(false);
        sup_up_home.setPreferredSize(new java.awt.Dimension(35, 35));
        sup_up_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_up_homeMouseClicked(evt);
            }
        });
        sup_up_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sup_up_homeActionPerformed(evt);
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

        sup_up_notif.setBackground(new java.awt.Color(82, 117, 82));
        sup_up_notif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bell-2-32.png"))); // NOI18N
        sup_up_notif.setBorder(null);
        sup_up_notif.setContentAreaFilled(false);
        sup_up_notif.setPreferredSize(new java.awt.Dimension(35, 35));
        sup_up_notif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_up_notifMouseClicked(evt);
            }
        });
        sup_up_notif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sup_up_notifActionPerformed(evt);
            }
        });

        sup_up_chat.setBackground(new java.awt.Color(82, 117, 82));
        sup_up_chat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/envelope-closed-32.png"))); // NOI18N
        sup_up_chat.setBorder(null);
        sup_up_chat.setContentAreaFilled(false);
        sup_up_chat.setPreferredSize(new java.awt.Dimension(35, 35));
        sup_up_chat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_up_chatMouseClicked(evt);
            }
        });
        sup_up_chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sup_up_chatActionPerformed(evt);
            }
        });

        sup_up_profile.setBackground(new java.awt.Color(82, 117, 82));
        sup_up_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-32.png"))); // NOI18N
        sup_up_profile.setBorder(null);
        sup_up_profile.setContentAreaFilled(false);
        sup_up_profile.setPreferredSize(new java.awt.Dimension(35, 35));
        sup_up_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_up_profileMouseClicked(evt);
            }
        });
        sup_up_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sup_up_profileActionPerformed(evt);
            }
        });

        sup_up_settings.setBackground(new java.awt.Color(82, 117, 82));
        sup_up_settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings-23-32.png"))); // NOI18N
        sup_up_settings.setBorder(null);
        sup_up_settings.setContentAreaFilled(false);
        sup_up_settings.setPreferredSize(new java.awt.Dimension(35, 35));
        sup_up_settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_up_settingsMouseClicked(evt);
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
                            .addComponent(sup_up_notif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sup_up_chat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sup_up_profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(sup_up_settings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(sup_up_profile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sup_up_chat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sup_up_notif, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                            .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(sup_up_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(sup_up_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(sup_up_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(150, 0, 1050, 70);

        nothing.setBackground(new java.awt.Color(0, 0, 0));
        nothing.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        nothing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 9.png"))); // NOI18N
        jPanel1.add(nothing);
        nothing.setBounds(330, -20, 640, 680);

        pricetxt.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        pricetxt.setText("PRICE");
        pricetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricetxtActionPerformed(evt);
            }
        });
        jPanel1.add(pricetxt);
        pricetxt.setBounds(70, 560, 280, 40);

        date.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(0, 102, 51));
        date.setText("date");
        jPanel1.add(date);
        date.setBounds(100, 150, 110, 30);

        time.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        time.setForeground(new java.awt.Color(0, 102, 51));
        time.setText("Time");
        jPanel1.add(time);
        time.setBounds(260, 150, 120, 30);

        tilte.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tilte);
        tilte.setBounds(450, 490, 0, 0);

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

    private void sup_up_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sup_up_profileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sup_up_profileActionPerformed

    private void sup_up_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sup_up_chatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sup_up_chatActionPerformed

    private void sup_up_notifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sup_up_notifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sup_up_notifActionPerformed

    private void quantxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantxtActionPerformed

    private void addtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addtxtActionPerformed

    private void sup_up_settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_up_settingsMouseClicked
        settings sup_up_set = new settings();
        sup_up_set.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sup_up_settingsMouseClicked

    private void sup_up_profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_up_profileMouseClicked
        settings sup_up_prof = new settings();
        sup_up_prof.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sup_up_profileMouseClicked

    private void sup_up_chatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_up_chatMouseClicked
        chat sup_up_c = new chat();
        sup_up_c.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sup_up_chatMouseClicked

    private void sup_up_notifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_up_notifMouseClicked
        notifications sup_up_notif = new notifications();
        sup_up_notif.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sup_up_notifMouseClicked

    private void sup_up_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_up_homeMouseClicked
        home_supplier sup_up_home = new home_supplier();
        sup_up_home.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sup_up_homeMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        mongo = new MongoClient("localhost", 27017);
        DB db = mongo.getDB("GreenValley");
        DBCollection collection = db.getCollection("Supplies");
     
        cursor = collection.find();
        
        DBObject obj = cursor.next();
        
        BasicDBObject query = new BasicDBObject();
//        query.put("Supply_name", name);
        query.put("Category", (String) obj.get("Category"));
        query.put("Quantity", (String) obj.get("Quantity"));
        query.put("Price", (String) obj.get("Price"));
        query.put("Address", (String) obj.get("Address"));
        query.put("Description", (String) obj.get("Description"));
        query.put("Image_File", (byte[]) obj.get("Image_File"));
        
        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("Category", typecom.getSelectedItem().toString());
        newDocument.put("Quantity", quantxt.getText());
        newDocument.put("Price", pricetxt.getText());
        newDocument.put("Address", addtxt.getText());
        newDocument.put("Description", desctxt.getText());
        newDocument.put("Image_File", photo);
        
        BasicDBObject updateObject = new BasicDBObject();
        updateObject.put("$set", newDocument);
        
        collection.update(query, updateObject);
        JOptionPane.showMessageDialog(null, "Sucessfully Updated");
        showData();
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void suppliesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppliesTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) suppliesTable.getModel();
        int Myindex = suppliesTable.getSelectedRow();

        nametxt.setText(model.getValueAt(Myindex, 0).toString());
        String combo =(model.getValueAt(Myindex, 1).toString());
        for (int i = 0; i< typecom.getItemCount();i++){
            if (typecom.getItemAt(i).equalsIgnoreCase(combo)){
                typecom.setSelectedIndex(i);
            }
        }
        quantxt.setText(model.getValueAt(Myindex, 2).toString());
        pricetxt.setText(model.getValueAt(Myindex, 3).toString());
        desctxt.setText(model.getValueAt(Myindex, 4).toString());
        addtxt.setText(model.getValueAt(Myindex, 5).toString());
//        date.setText(model.getValueAt(Myindex, 6).toString());
//        time.setText(model.getValueAt(Myindex, 7).toString());
        tilte.setText(model.getValueAt(Myindex, 8).toString());
        
        byte[] byteArray =(byte[]) (model.getValueAt((Myindex),8)); //need to initialize it
        ImageIcon imageIcon = new ImageIcon(byteArray);
        imageIcon.getImage();
        imgLabel.setIcon(imageIcon);
        
        
        
 
    }//GEN-LAST:event_suppliesTableMouseClicked

    private void pricetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricetxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser choser = new JFileChooser();
        choser.showOpenDialog(jPanel1);
        File f = choser.getSelectedFile();
        imgLabel.setIcon(new ImageIcon(f.toString()));
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sup_up_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sup_up_homeActionPerformed
        home_supplier sup_up_set = new home_supplier();
        sup_up_set.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sup_up_homeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier_update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addtxt;
    private javax.swing.JLabel date;
    private javax.swing.JTextArea desctxt;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel nothing;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JTextField quantxt;
    private javax.swing.JButton sup_up_chat;
    private javax.swing.JButton sup_up_home;
    private javax.swing.JButton sup_up_notif;
    private javax.swing.JButton sup_up_profile;
    private javax.swing.JButton sup_up_settings;
    private javax.swing.JTable suppliesTable;
    private javax.swing.JLabel tilte;
    private javax.swing.JLabel time;
    private javax.swing.JComboBox<String> typecom;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
byte[] photo = null;
String filename = null;
}

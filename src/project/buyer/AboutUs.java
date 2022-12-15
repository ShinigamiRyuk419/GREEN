
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.buyer;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author PnPh
 */
public class AboutUs extends javax.swing.JFrame {

    /**
   
     */
    public AboutUs() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        about_home = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        about_notif = new javax.swing.JButton();
        about_chat = new javax.swing.JButton();
        about_profile = new javax.swing.JButton();
        about_settings = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
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
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(82, 117, 82));
        jLabel1.setForeground(new java.awt.Color(82, 117, 82));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/green valley.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(65, 65));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 73));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(82, 117, 82));
        jLabel2.setText("GREEN");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(82, 117, 82));
        jLabel3.setText("VALLEY");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jPanel1.setBackground(new java.awt.Color(82, 117, 82));

        about_home.setBackground(new java.awt.Color(82, 117, 82));
        about_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-2-32.png"))); // NOI18N
        about_home.setBorder(null);
        about_home.setContentAreaFilled(false);
        about_home.setPreferredSize(new java.awt.Dimension(35, 35));
        about_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                about_homeMouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(82, 117, 82));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-14-32.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setPreferredSize(new java.awt.Dimension(35, 35));

        jTextField1.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jTextField1.setText("Search here...");

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));

        about_notif.setBackground(new java.awt.Color(82, 117, 82));
        about_notif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bell-2-32.png"))); // NOI18N
        about_notif.setBorder(null);
        about_notif.setContentAreaFilled(false);
        about_notif.setPreferredSize(new java.awt.Dimension(35, 35));
        about_notif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                about_notifMouseClicked(evt);
            }
        });
        about_notif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_notifActionPerformed(evt);
            }
        });

        about_chat.setBackground(new java.awt.Color(82, 117, 82));
        about_chat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/envelope-closed-32.png"))); // NOI18N
        about_chat.setBorder(null);
        about_chat.setContentAreaFilled(false);
        about_chat.setPreferredSize(new java.awt.Dimension(35, 35));
        about_chat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                about_chatMouseClicked(evt);
            }
        });
        about_chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_chatActionPerformed(evt);
            }
        });

        about_profile.setBackground(new java.awt.Color(82, 117, 82));
        about_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-32.png"))); // NOI18N
        about_profile.setBorder(null);
        about_profile.setContentAreaFilled(false);
        about_profile.setPreferredSize(new java.awt.Dimension(35, 35));
        about_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                about_profileMouseClicked(evt);
            }
        });
        about_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_profileActionPerformed(evt);
            }
        });

        about_settings.setBackground(new java.awt.Color(82, 117, 82));
        about_settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings-23-32.png"))); // NOI18N
        about_settings.setBorder(null);
        about_settings.setContentAreaFilled(false);
        about_settings.setPreferredSize(new java.awt.Dimension(35, 35));
        about_settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                about_settingsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(about_notif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(about_chat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(about_profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(about_settings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(about_profile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(about_chat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(about_notif, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(about_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(3, 3, 3)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(about_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(about_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 1050, 70));

        jPanel3.setBackground(new java.awt.Color(217, 217, 217));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(82, 117, 82));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Customer Support");
        jButton7.setBorder(null);
        jButton7.setPreferredSize(new java.awt.Dimension(85, 35));
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 130, 40));

        jButton8.setBackground(new java.awt.Color(82, 117, 82));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("All Products");
        jButton8.setBorder(null);
        jButton8.setPreferredSize(new java.awt.Dimension(85, 35));
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        jButton9.setBackground(new java.awt.Color(82, 117, 82));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Fruits");
        jButton9.setBorder(null);
        jButton9.setPreferredSize(new java.awt.Dimension(85, 35));
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 130, 40));

        jButton10.setBackground(new java.awt.Color(82, 117, 82));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Vegetables");
        jButton10.setBorder(null);
        jButton10.setPreferredSize(new java.awt.Dimension(85, 35));
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 130, 40));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setPreferredSize(new java.awt.Dimension(85, 35));
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 40, 40));

        jButton12.setBackground(new java.awt.Color(82, 117, 82));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("About us");
        jButton12.setBorder(null);
        jButton12.setPreferredSize(new java.awt.Dimension(85, 35));
        jPanel3.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 130, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1200, 40));

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

        jPanel2.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 1200, 58));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel6.setBackground(new java.awt.Color(82, 117, 82));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText(" quality over quantity. And we can help create a culture – imagine this – where ");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("our kids ask for healthy options instead of resisting them.” – Michelle Obama-");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("“We can make a commitment to promote vegetables and fruits and whole grains");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 560, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel14.setText("It’s always better when it’s natural. Eat clean and green. Eat organic. ");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));

        jLabel13.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(33, 74, 75));
        jLabel13.setText("A Farmer’s Touch   ");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        jPanel5.setBackground(new java.awt.Color(184, 255, 154));
        jPanel5.setForeground(new java.awt.Color(82, 117, 82));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel19.setText("WE'RE DIFFERENT THAN THE REST");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel20.setText(" who are enthusiastic about generating marketing and sales results!");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel21.setText(" Green Valley so we could help businesses do the exact same thing. ");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel22.setText("assisted companies in selling more quickly and intelligently.  We");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel23.setText("take pride in utilizing the top resources to make our clients");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel24.setText("successful. Our team is composed of intelligent, gifted individuals");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        jLabel25.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel25.setText("OUR NATURE");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel26.setText("As a sales performance agency, we exist. Since 2020, we have");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel27.setText("We've been where you are. More than a decade ago, when we");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel28.setText("needed to grow and diversify how we generated new business");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel29.setText("we turned to inbound marketing and found huge success after");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel30.setText("launching our sales strategy blog. Once we mastered the art of");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel33.setText("using thought leadership content for lead generation, we launched");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, -1, -1));

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 610, 660));

        jLabel18.setFont(new java.awt.Font("Showcard Gothic", 2, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("GREEN VALLEY");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 350, 70));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image 9.png"))); // NOI18N
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -40, 550, 680));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/veg-removebg-preview.png"))); // NOI18N
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 410, 500));

        jScrollPane1.setViewportView(jPanel6);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1180, 610));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void about_notifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_notifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_about_notifActionPerformed

    private void about_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_chatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_about_chatActionPerformed

    private void about_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_profileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_about_profileActionPerformed

    private void about_settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_about_settingsMouseClicked
        settings about_set = new settings();
        about_set.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_about_settingsMouseClicked

    private void about_profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_about_profileMouseClicked
        settings about_prof = new settings();
        about_prof.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_about_profileMouseClicked

    private void about_chatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_about_chatMouseClicked
        chat cont_c = new chat();
        cont_c.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_about_chatMouseClicked

    private void about_notifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_about_notifMouseClicked
        notifications cont_notif = new notifications();
        cont_notif.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_about_notifMouseClicked

    private void about_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_about_homeMouseClicked
        AboutUs cont_home = new AboutUs();
        cont_home.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_about_homeMouseClicked

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
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AboutUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about_chat;
    private javax.swing.JButton about_home;
    private javax.swing.JButton about_notif;
    private javax.swing.JButton about_profile;
    private javax.swing.JButton about_settings;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

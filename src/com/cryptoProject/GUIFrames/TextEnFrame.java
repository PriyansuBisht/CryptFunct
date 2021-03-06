/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cryptoProject.GUIFrames;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JOptionPane;

/**
 *
 * @author Priyansu
 */
public class TextEnFrame extends javax.swing.JFrame {

    /**
     * Creates new form TextEnDeFrame
     */
    public TextEnFrame() {
        initComponents();
    }

    javax.swing.ImageIcon home_Orange = new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/home_Orange.png"));
    javax.swing.ImageIcon home_Black = new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/home_Black.png"));
    javax.swing.ImageIcon encrypt_1 = new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/encrypt_1.png"));
    javax.swing.ImageIcon encrypt_2 = new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/encrypt_2.png"));
    javax.swing.ImageIcon encrypt_3 = new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/encrypt_3.png"));
    javax.swing.ImageIcon encrypt_4 = new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/encrypt_4.png"));
    javax.swing.ImageIcon refresh_Orange = new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/refresh_orange.png"));
    javax.swing.ImageIcon refresh_Blue = new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/refresh_blue.png"));
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel_TextEnDe = new javax.swing.JPanel();
        cryptFunct_Label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        encryption_label = new javax.swing.JLabel();
        decryption_label = new javax.swing.JLabel();
        home_button = new javax.swing.JButton();
        exit_button = new javax.swing.JButton();
        refresh_button = new javax.swing.JButton();
        EnPanel_basePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        plainCypher_textarea = new javax.swing.JTextArea();
        textKey_label = new javax.swing.JLabel();
        text_label = new javax.swing.JLabel();
        keySize_label = new javax.swing.JLabel();
        key_combobox = new javax.swing.JComboBox<>();
        secretKet_textbox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        encrypt_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CryptFunct - Text");
        setBackground(new java.awt.Color(25, 25, 25));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(230, 90));
        setMinimumSize(new java.awt.Dimension(929, 557));
        setName("textEnDeFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(929, 557));

        basePanel_TextEnDe.setVisible(true);
        basePanel_TextEnDe.setBackground(new java.awt.Color(25, 25, 25));
        basePanel_TextEnDe.setForeground(new java.awt.Color(204, 255, 255));
        basePanel_TextEnDe.setAlignmentX(0.0F);
        basePanel_TextEnDe.setAlignmentY(0.0F);
        basePanel_TextEnDe.setMaximumSize(new java.awt.Dimension(929, 557));
        basePanel_TextEnDe.setMinimumSize(new java.awt.Dimension(929, 557));
        basePanel_TextEnDe.setPreferredSize(new java.awt.Dimension(929, 557));

        cryptFunct_Label.setBackground(new java.awt.Color(25, 25, 25));
        cryptFunct_Label.setFont(new java.awt.Font("Pristina", 1, 48)); // NOI18N
        cryptFunct_Label.setForeground(new java.awt.Color(0, 255, 204));
        cryptFunct_Label.setText("Crypt Funct");
        cryptFunct_Label.setToolTipText("- Developed by PRIYANSU BISHT");
        cryptFunct_Label.setOpaque(true);

        jSeparator1.setBackground(new java.awt.Color(0, 255, 204));
        jSeparator1.setForeground(new java.awt.Color(0, 255, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 204), 3, true));
        jSeparator1.setMaximumSize(new java.awt.Dimension(3, 440));
        jSeparator1.setMinimumSize(new java.awt.Dimension(3, 440));
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(3, 440));

        encryption_label.setBackground(new java.awt.Color(0, 255, 204));
        encryption_label.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        encryption_label.setForeground(new java.awt.Color(255, 153, 0));
        encryption_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encryption_label.setText("ENCRYPTION");
        encryption_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encryption_label.setOpaque(true);
        encryption_label.setPreferredSize(new java.awt.Dimension(270, 75));

        decryption_label.setBackground(new java.awt.Color(255, 153, 0));
        decryption_label.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        decryption_label.setForeground(new java.awt.Color(0, 255, 204));
        decryption_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        decryption_label.setText("DECRYPTION");
        decryption_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        decryption_label.setOpaque(true);
        decryption_label.setPreferredSize(new java.awt.Dimension(270, 75));
        decryption_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decryption_labelMouseClicked(evt);
            }
        });

        home_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/home_Black.png"))); // NOI18N
        home_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home_button.setMaximumSize(new java.awt.Dimension(44, 44));
        home_button.setMinimumSize(new java.awt.Dimension(44, 44));
        home_button.setPreferredSize(new java.awt.Dimension(44, 44));
        home_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_buttonMouseExited(evt);
            }
        });
        home_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_buttonActionPerformed(evt);
            }
        });

        exit_button.setBackground(new java.awt.Color(25, 25, 25));
        exit_button.setForeground(new java.awt.Color(25, 25, 25));
        exit_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/cross_darkgray.png"))); // NOI18N
        exit_button.setToolTipText("EXIT");
        exit_button.setBorder(null);
        exit_button.setContentAreaFilled(false);
        exit_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_button.setPreferredSize(new java.awt.Dimension(82, 75));
        exit_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exit_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit_buttonMouseExited(evt);
            }
        });
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        refresh_button.setBackground(new java.awt.Color(25, 25, 25));
        refresh_button.setForeground(new java.awt.Color(25, 25, 25));
        refresh_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/refresh_blue.png"))); // NOI18N
        refresh_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        refresh_button.setIconTextGap(0);
        refresh_button.setMaximumSize(new java.awt.Dimension(44, 44));
        refresh_button.setMinimumSize(new java.awt.Dimension(44, 44));
        refresh_button.setPreferredSize(new java.awt.Dimension(44, 44));
        refresh_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refresh_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refresh_buttonMouseExited(evt);
            }
        });
        refresh_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_buttonActionPerformed(evt);
            }
        });

        EnPanel_basePanel.setBackground(new java.awt.Color(0, 255, 204));
        EnPanel_basePanel.setPreferredSize(new java.awt.Dimension(825, 482));

        jScrollPane1.setBackground(new java.awt.Color(160, 160, 160));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setMaximumSize(new java.awt.Dimension(316, 300));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(316, 300));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(316, 300));

        plainCypher_textarea.setBackground(new java.awt.Color(162, 162, 162));
        plainCypher_textarea.setColumns(20);
        plainCypher_textarea.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 14)); // NOI18N
        plainCypher_textarea.setLineWrap(true);
        plainCypher_textarea.setRows(45);
        plainCypher_textarea.setText("Plain Text to be Encrypted");
        plainCypher_textarea.setToolTipText("");
        plainCypher_textarea.setWrapStyleWord(true);
        plainCypher_textarea.setMaximumSize(new java.awt.Dimension(300, 300));
        plainCypher_textarea.setMinimumSize(new java.awt.Dimension(300, 300));
        plainCypher_textarea.setPreferredSize(new java.awt.Dimension(320, 300));
        jScrollPane1.setViewportView(plainCypher_textarea);

        textKey_label.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 0, 18)); // NOI18N
        textKey_label.setForeground(new java.awt.Color(255, 153, 0));
        textKey_label.setText("Secret Key :");
        textKey_label.setVisible(false);

        text_label.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 0, 18)); // NOI18N
        text_label.setForeground(new java.awt.Color(255, 153, 0));
        text_label.setText("Enter Plain Text.....");

        keySize_label.setBackground(new java.awt.Color(0, 255, 204));
        keySize_label.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 0, 18)); // NOI18N
        keySize_label.setForeground(new java.awt.Color(255, 153, 0));
        keySize_label.setText("Enter Key Size  : ");

        key_combobox.setBackground(new java.awt.Color(0, 255, 204));
        key_combobox.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 0, 18)); // NOI18N
        key_combobox.setMaximumRowCount(2);
        key_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "128 Bits", "192 Bits", "256 Bits" }));
        key_combobox.setSelectedIndex(2);
        key_combobox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        secretKet_textbox.setBackground(new java.awt.Color(0, 225, 225));
        secretKet_textbox.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 14)); // NOI18N
        secretKet_textbox.setText("Enter Secret Key.....");
        secretKet_textbox.setMaximumSize(new java.awt.Dimension(400, 33));
        secretKet_textbox.setMinimumSize(new java.awt.Dimension(400, 33));
        secretKet_textbox.setPreferredSize(new java.awt.Dimension(400, 33));
        secretKet_textbox.setSelectionEnd(257);
        secretKet_textbox.setVisible(false);

        jLabel8.setBackground(new java.awt.Color(0, 255, 204));
        jLabel8.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(30, 30, 30));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        encrypt_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/encrypt_3.png"))); // NOI18N
        encrypt_button.setBorder(null);
        encrypt_button.setContentAreaFilled(false);
        encrypt_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encrypt_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        encrypt_button.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        encrypt_button.setIconTextGap(0);
        encrypt_button.setMaximumSize(new java.awt.Dimension(200, 80));
        encrypt_button.setMinimumSize(new java.awt.Dimension(200, 80));
        encrypt_button.setPreferredSize(new java.awt.Dimension(151, 70));
        encrypt_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                encrypt_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                encrypt_buttonMouseExited(evt);
            }
        });
        encrypt_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encrypt_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EnPanel_basePanelLayout = new javax.swing.GroupLayout(EnPanel_basePanel);
        EnPanel_basePanel.setLayout(EnPanel_basePanelLayout);
        EnPanel_basePanelLayout.setHorizontalGroup(
            EnPanel_basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnPanel_basePanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(EnPanel_basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EnPanel_basePanelLayout.createSequentialGroup()
                        .addComponent(keySize_label, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(key_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(467, 467, 467))
                    .addGroup(EnPanel_basePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(EnPanel_basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(EnPanel_basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(text_label, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EnPanel_basePanelLayout.createSequentialGroup()
                                .addComponent(textKey_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(secretKet_textbox, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(encrypt_button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        EnPanel_basePanelLayout.setVerticalGroup(
            EnPanel_basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnPanel_basePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(EnPanel_basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnPanel_basePanelLayout.createSequentialGroup()
                        .addComponent(encrypt_button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(EnPanel_basePanelLayout.createSequentialGroup()
                        .addGroup(EnPanel_basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EnPanel_basePanelLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 6, Short.MAX_VALUE)
                                .addGap(39, 39, 39))
                            .addGroup(EnPanel_basePanelLayout.createSequentialGroup()
                                .addGroup(EnPanel_basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(keySize_label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(key_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)))
                        .addGroup(EnPanel_basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textKey_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secretKet_textbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );

        javax.swing.GroupLayout basePanel_TextEnDeLayout = new javax.swing.GroupLayout(basePanel_TextEnDe);
        basePanel_TextEnDe.setLayout(basePanel_TextEnDeLayout);
        basePanel_TextEnDeLayout.setHorizontalGroup(
            basePanel_TextEnDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanel_TextEnDeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(basePanel_TextEnDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(basePanel_TextEnDeLayout.createSequentialGroup()
                        .addGroup(basePanel_TextEnDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(home_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refresh_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EnPanel_basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(basePanel_TextEnDeLayout.createSequentialGroup()
                        .addComponent(cryptFunct_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(decryption_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(encryption_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        basePanel_TextEnDeLayout.setVerticalGroup(
            basePanel_TextEnDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanel_TextEnDeLayout.createSequentialGroup()
                .addGroup(basePanel_TextEnDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(basePanel_TextEnDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(decryption_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(encryption_label, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EnPanel_basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanel_TextEnDeLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(cryptFunct_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(basePanel_TextEnDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(basePanel_TextEnDeLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(home_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refresh_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel_TextEnDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel_TextEnDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void home_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_buttonActionPerformed
        // TODO add your handling code here:
        com.cryptoProject.GUIFrames.HomeFrame homeFrame = new com.cryptoProject.GUIFrames.HomeFrame();
        homeFrame.setVisible(true);
        TextEnFrame.this.dispose();
    }//GEN-LAST:event_home_buttonActionPerformed

    private void home_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_buttonMouseExited
        // TODO add your handling code here:
        home_button.setIcon(home_Black);
    }//GEN-LAST:event_home_buttonMouseExited

    private void home_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_buttonMouseEntered
        // TODO add your handling code here:
        home_button.setIcon(home_Orange);
    }//GEN-LAST:event_home_buttonMouseEntered

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        // TODO add your handling code here:
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Cross_gray.png"));
        int res = javax.swing.JOptionPane.showConfirmDialog(null, "Do you want to Exit ? ", "ALERT !!!", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon);
        if(res == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_exit_buttonActionPerformed

    private void encrypt_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encrypt_buttonMouseEntered
        // TODO add your handling code here:
        encrypt_button.setIcon(encrypt_4);
    }//GEN-LAST:event_encrypt_buttonMouseEntered

    private void encrypt_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encrypt_buttonMouseExited
        // TODO add your handling code here:
        encrypt_button.setIcon(encrypt_3);
    }//GEN-LAST:event_encrypt_buttonMouseExited

    private void encrypt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encrypt_buttonActionPerformed
        // TODO add your handling code here:
        int index = key_combobox.getSelectedIndex();
        size = switch (index) {
            case 1 -> 192;
            case 0 -> 128;
            default -> 256;
        };
        
        plainText = plainCypher_textarea.getText();
        
        byte[] iv = new byte[16];
        java.io.DataInputStream readIV;
        try {
            readIV = new java.io.DataInputStream( new java.io.FileInputStream( new java.io.File("/Users/user/Desktop/GUIJava/MiniProjectSem5/cryptFunct/src/Resources/Temp/IVFile")));
            readIV.readFully(iv);
            readIV.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TextEnFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TextEnFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        IV = new javax.crypto.spec.IvParameterSpec(iv);
        
        try {
            secretKey = com.cryptoProject.FunctionalClasses.TextEnDeFunctions.generateKey(size);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(TextEnFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            cypherText = com.cryptoProject.FunctionalClasses.TextEnDeFunctions.encryptText(plainText, secretKey, size, IV);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidAlgorithmParameterException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(TextEnFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // GOT CYPHER TEXT
        JOptionPane.showMessageDialog(this, "Encryption Successful...   ", "RESULT", JOptionPane.INFORMATION_MESSAGE);
        String secretkey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
        secretKet_textbox.setText(secretkey);
        
        secretKet_textbox.setVisible(true);
        textKey_label.setVisible(true);
        plainCypher_textarea.setText(cypherText);
        plainCypher_textarea.setEditable(false);       
        secretKet_textbox.setEditable(false);
        key_combobox.setEnabled(false);
        text_label.setText("Encrypted Text....");
        encrypt_button.setVisible(false);
        key_combobox.setVisible(true);
    }//GEN-LAST:event_encrypt_buttonActionPerformed

    private void refresh_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh_buttonMouseEntered
        // TODO add your handling code here:
        refresh_button.setIcon(refresh_Orange);
    }//GEN-LAST:event_refresh_buttonMouseEntered

    private void refresh_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh_buttonMouseExited
        // TODO add your handling code here:
        refresh_button.setIcon(refresh_Blue);
    }//GEN-LAST:event_refresh_buttonMouseExited

    private void refresh_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_buttonActionPerformed
        // TODO add your handling code here:
        TextEnFrame textEnDeFrame = new TextEnFrame();
        textEnDeFrame.setVisible(true);
        TextEnFrame.this.dispose();
    }//GEN-LAST:event_refresh_buttonActionPerformed

    private void decryption_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decryption_labelMouseClicked
        // TODO add your handling code here:
        com.cryptoProject.GUIFrames.TextDeFrame textDeFrame = new com.cryptoProject.GUIFrames.TextDeFrame();
        textDeFrame.setVisible(true);
        TextEnFrame.this.dispose();
    }//GEN-LAST:event_decryption_labelMouseClicked

    private void exit_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_buttonMouseEntered
        // TODO add your handling code here:
        exit_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5));
    }//GEN-LAST:event_exit_buttonMouseEntered

    private void exit_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_buttonMouseExited
        // TODO add your handling code here:
        exit_button.setBorder(null);
    }//GEN-LAST:event_exit_buttonMouseExited

   
    
/* *
     * //<editor-fold defaultstate="collapsed" desc=" Main meathod ">
        public static void main(String args[]) {
        
        // Look & Feel setting code 
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(FileEnDeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(FileEnDeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(FileEnDeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(FileEnDeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
           }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextEnFrame().setVisible(true);
            }
        });
        * 
        * */
//</editor-fold>

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EnPanel_basePanel;
    private javax.swing.JPanel basePanel_TextEnDe;
    private javax.swing.JLabel cryptFunct_Label;
    private javax.swing.JLabel decryption_label;
    private javax.swing.JButton encrypt_button;
    private javax.swing.JLabel encryption_label;
    private javax.swing.JButton exit_button;
    private javax.swing.JButton home_button;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel keySize_label;
    private javax.swing.JComboBox<String> key_combobox;
    private javax.swing.JTextArea plainCypher_textarea;
    private javax.swing.JButton refresh_button;
    private javax.swing.JTextField secretKet_textbox;
    private javax.swing.JLabel textKey_label;
    private javax.swing.JLabel text_label;
    // End of variables declaration//GEN-END:variables
    private javax.crypto.SecretKey secretKey;
    private javax.crypto.spec.IvParameterSpec IV;
    private int size;
    private String plainText;
    private String cypherText;
}



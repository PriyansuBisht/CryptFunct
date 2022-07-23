package com.cryptoProject.GUIFrames;


import java.awt.Frame;
import javax.swing.JOptionPane;


/**
 * @author Priyansu
 */
public class BaseFrame extends javax.swing.JFrame {

    /**
     * Creates new form BaseFrame
     */
    public BaseFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signIn_Panel = new javax.swing.JPanel();
        baseFrame_Panel_ExitButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        cryptFunct_Label = new javax.swing.JLabel();
        Signin_Label = new javax.swing.JLabel();
        username_Label = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        username_TextBox = new javax.swing.JTextField(1);
        password_Label = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        password_Feild = new javax.swing.JPasswordField();
        termsAndConditions_Checkbox = new javax.swing.JCheckBox();
        termsAndConditions_label = new javax.swing.JLabel();
        signIn_Button = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        baseFrame_BackgroundLabel = new javax.swing.JLabel();
        termsAndConditions_Panel = new javax.swing.JPanel();
        termsAndConditions_Panel_ExitButton = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        cryptFunct_TremsAndConditionsLabel = new javax.swing.JLabel();
        signIn_Button_TermsAndConditions = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        termsAndConditions_ScrollPane = new javax.swing.JScrollPane();
        TermsAndConditions = new javax.swing.JTextArea();
        termsAndConditions_Label = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        termsAndConditions_BackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CryptFunct");
        setBackground(new java.awt.Color(0, 0, 30));
        setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        setForeground(java.awt.Color.white);
        setLocation(new java.awt.Point(230, 90));
        setMaximumSize(new java.awt.Dimension(929, 557));
        setMinimumSize(new java.awt.Dimension(929, 557));
        setName("baseFrame"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(929, 557));
        setResizable(false);
        setSize(new java.awt.Dimension(929, 557));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        signIn_Panel.setBackground(new java.awt.Color(0, 0, 30));
        signIn_Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 255, 102), new java.awt.Color(0, 255, 204)));
        signIn_Panel.setForeground(new java.awt.Color(0, 0, 30));
        signIn_Panel.setMaximumSize(new java.awt.Dimension(929, 557));
        signIn_Panel.setMinimumSize(new java.awt.Dimension(929, 557));
        signIn_Panel.setPreferredSize(new java.awt.Dimension(929, 557));
        signIn_Panel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signIn_PanelFocusGained(evt);
            }
        });
        signIn_Panel.setLayout(null);

        baseFrame_Panel_ExitButton.setBackground(new java.awt.Color(0, 0, 30));
        baseFrame_Panel_ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Cros_Blue.png"))); // NOI18N
        baseFrame_Panel_ExitButton.setToolTipText("EXIT");
        baseFrame_Panel_ExitButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        baseFrame_Panel_ExitButton.setBorderPainted(false);
        baseFrame_Panel_ExitButton.setContentAreaFilled(false);
        baseFrame_Panel_ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baseFrame_Panel_ExitButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        baseFrame_Panel_ExitButton.setMaximumSize(new java.awt.Dimension(40, 40));
        baseFrame_Panel_ExitButton.setMinimumSize(new java.awt.Dimension(40, 40));
        baseFrame_Panel_ExitButton.setPreferredSize(new java.awt.Dimension(40, 40));
        baseFrame_Panel_ExitButton.setRequestFocusEnabled(false);
        baseFrame_Panel_ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                baseFrame_Panel_ExitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                baseFrame_Panel_ExitButtonMouseExited(evt);
            }
        });
        baseFrame_Panel_ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseFrame_Panel_ExitButtonActionPerformed(evt);
            }
        });
        signIn_Panel.add(baseFrame_Panel_ExitButton);
        baseFrame_Panel_ExitButton.setBounds(870, 10, 50, 50);

        jSeparator1.setBackground(new java.awt.Color(0, 255, 204));
        jSeparator1.setForeground(new java.awt.Color(0, 255, 204));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 0));
        signIn_Panel.add(jSeparator1);
        jSeparator1.setBounds(100, 66, 320, 2);

        jSeparator2.setBackground(new java.awt.Color(0, 255, 204));
        jSeparator2.setForeground(new java.awt.Color(0, 255, 204));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jSeparator2.setOpaque(true);
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 0));
        signIn_Panel.add(jSeparator2);
        jSeparator2.setBounds(70, 84, 2, 360);

        cryptFunct_Label.setBackground(new java.awt.Color(0, 3, 30));
        cryptFunct_Label.setFont(new java.awt.Font("Pristina", 1, 48)); // NOI18N
        cryptFunct_Label.setForeground(new java.awt.Color(0, 255, 204));
        cryptFunct_Label.setText("Crypt Funct");
        cryptFunct_Label.setToolTipText("- Developed by PRIYANSU BISHT");
        cryptFunct_Label.setOpaque(true);
        signIn_Panel.add(cryptFunct_Label);
        cryptFunct_Label.setBounds(20, 0, 340, 90);

        Signin_Label.setBackground(new java.awt.Color(0, 3, 30));
        Signin_Label.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        Signin_Label.setForeground(new java.awt.Color(0, 255, 204));
        Signin_Label.setText("SIGN IN...");
        Signin_Label.setOpaque(true);
        signIn_Panel.add(Signin_Label);
        Signin_Label.setBounds(100, 90, 290, 40);

        username_Label.setBackground(new java.awt.Color(0, 0, 30));
        username_Label.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        username_Label.setForeground(new java.awt.Color(225, 217, 154));
        username_Label.setText("Username");
        signIn_Panel.add(username_Label);
        username_Label.setBounds(140, 150, 150, 30);

        jSeparator3.setBackground(new java.awt.Color(225, 217, 154));
        jSeparator3.setForeground(new java.awt.Color(225, 217, 154));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 217, 154)));
        jSeparator3.setMaximumSize(new java.awt.Dimension(213, 2));
        jSeparator3.setMinimumSize(new java.awt.Dimension(213, 2));
        jSeparator3.setOpaque(true);
        jSeparator3.setPreferredSize(new java.awt.Dimension(213, 2));
        signIn_Panel.add(jSeparator3);
        jSeparator3.setBounds(179, 222, 213, 2);

        jSeparator4.setBackground(new java.awt.Color(225, 217, 154));
        jSeparator4.setForeground(new java.awt.Color(225, 217, 154));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 217, 154)));
        jSeparator4.setMaximumSize(new java.awt.Dimension(2, 33));
        jSeparator4.setMinimumSize(new java.awt.Dimension(2, 33));
        jSeparator4.setOpaque(true);
        jSeparator4.setPreferredSize(new java.awt.Dimension(2, 33));
        signIn_Panel.add(jSeparator4);
        jSeparator4.setBounds(390, 190, 2, 33);

        username_TextBox.setBackground(new java.awt.Color(0, 0, 30));
        username_TextBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        username_TextBox.setForeground(new java.awt.Color(255, 255, 255));
        username_TextBox.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        username_TextBox.setBorder(null);
        signIn_Panel.add(username_TextBox);
        username_TextBox.setBounds(180, 190, 200, 30);

        password_Label.setBackground(new java.awt.Color(0, 0, 30));
        password_Label.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        password_Label.setForeground(new java.awt.Color(225, 217, 154));
        password_Label.setText("Password");
        signIn_Panel.add(password_Label);
        password_Label.setBounds(140, 250, 150, 30);

        jSeparator5.setBackground(new java.awt.Color(225, 217, 154));
        jSeparator5.setForeground(new java.awt.Color(225, 217, 154));
        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 217, 154)));
        jSeparator5.setMaximumSize(new java.awt.Dimension(213, 2));
        jSeparator5.setMinimumSize(new java.awt.Dimension(213, 2));
        jSeparator5.setOpaque(true);
        jSeparator5.setPreferredSize(new java.awt.Dimension(213, 2));
        signIn_Panel.add(jSeparator5);
        jSeparator5.setBounds(179, 332, 213, 2);

        jSeparator6.setBackground(new java.awt.Color(225, 217, 154));
        jSeparator6.setForeground(new java.awt.Color(225, 217, 154));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 217, 154)));
        signIn_Panel.add(jSeparator6);
        jSeparator6.setBounds(392, 301, 2, 33);

        password_Feild.setBackground(new java.awt.Color(0, 0, 30));
        password_Feild.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password_Feild.setForeground(new java.awt.Color(102, 0, 102));
        password_Feild.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        password_Feild.setToolTipText("");
        password_Feild.setBorder(null);
        signIn_Panel.add(password_Feild);
        password_Feild.setBounds(180, 304, 200, 30);

        termsAndConditions_Checkbox.setBackground(new java.awt.Color(0, 0, 30));
        termsAndConditions_Checkbox.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        termsAndConditions_Checkbox.setForeground(new java.awt.Color(225, 217, 154));
        termsAndConditions_Checkbox.setText(" I Agree to the");
        termsAndConditions_Checkbox.setMaximumSize(new java.awt.Dimension(135, 26));
        termsAndConditions_Checkbox.setMinimumSize(new java.awt.Dimension(135, 26));
        termsAndConditions_Checkbox.setPreferredSize(new java.awt.Dimension(135, 26));
        termsAndConditions_Checkbox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                termsAndConditions_CheckboxStateChanged(evt);
            }
        });
        signIn_Panel.add(termsAndConditions_Checkbox);
        termsAndConditions_Checkbox.setBounds(140, 370, 145, 26);

        termsAndConditions_label.setBackground(new java.awt.Color(0, 0, 30));
        termsAndConditions_label.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        termsAndConditions_label.setForeground(new java.awt.Color(0, 255, 204));
        termsAndConditions_label.setText("Terms & Condtions");
        termsAndConditions_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        termsAndConditions_label.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        termsAndConditions_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                termsAndConditions_labelMouseClicked(evt);
            }
        });
        signIn_Panel.add(termsAndConditions_label);
        termsAndConditions_label.setBounds(290, 372, 140, 22);

        signIn_Button.setBackground(new java.awt.Color(0, 0, 30));
        signIn_Button.setForeground(new java.awt.Color(255, 255, 255));
        signIn_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Signin_1.png"))); // NOI18N
        signIn_Button.setBorder(null);
        signIn_Button.setContentAreaFilled(false);
        signIn_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signIn_Button.setEnabled(false);
        signIn_Button.setVisible(false);
        signIn_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signIn_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signIn_ButtonMouseExited(evt);
            }
        });
        signIn_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signIn_ButtonActionPerformed(evt);
            }
        });
        signIn_Panel.add(signIn_Button);
        signIn_Button.setBounds(280, 420, 180, 80);

        jSeparator7.setBackground(new java.awt.Color(0, 255, 204));
        jSeparator7.setForeground(new java.awt.Color(0, 255, 204));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        signIn_Panel.add(jSeparator7);
        jSeparator7.setBounds(438, 350, 2, 70);

        jSeparator8.setBackground(new java.awt.Color(0, 255, 204));
        jSeparator8.setForeground(new java.awt.Color(0, 255, 204));
        jSeparator8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jSeparator8.setMaximumSize(new java.awt.Dimension(147, 2));
        jSeparator8.setMinimumSize(new java.awt.Dimension(147, 2));
        jSeparator8.setPreferredSize(new java.awt.Dimension(147, 2));
        signIn_Panel.add(jSeparator8);
        jSeparator8.setBounds(140, 460, 140, 2);

        baseFrame_BackgroundLabel.setBackground(new java.awt.Color(0, 3, 30));
        baseFrame_BackgroundLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        baseFrame_BackgroundLabel.setForeground(new java.awt.Color(255, 255, 255));
        baseFrame_BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/background.jpg"))); // NOI18N
        baseFrame_BackgroundLabel.setText(" ");
        baseFrame_BackgroundLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        baseFrame_BackgroundLabel.setMaximumSize(new java.awt.Dimension(929, 591));
        baseFrame_BackgroundLabel.setMinimumSize(new java.awt.Dimension(929, 591));
        baseFrame_BackgroundLabel.setOpaque(true);
        baseFrame_BackgroundLabel.setPreferredSize(new java.awt.Dimension(929, 591));
        signIn_Panel.add(baseFrame_BackgroundLabel);
        baseFrame_BackgroundLabel.setBounds(0, 0, 929, 591);

        getContentPane().add(signIn_Panel);
        signIn_Panel.setBounds(0, 0, 929, 557);

        termsAndConditions_Panel.setVisible(false);
        termsAndConditions_Panel.setMaximumSize(new java.awt.Dimension(929, 557));
        termsAndConditions_Panel.setMinimumSize(new java.awt.Dimension(929, 557));
        termsAndConditions_Panel.setPreferredSize(new java.awt.Dimension(929, 557));
        termsAndConditions_Panel.setLayout(null);

        termsAndConditions_Panel_ExitButton.setBackground(new java.awt.Color(0, 0, 30));
        termsAndConditions_Panel_ExitButton.setForeground(new java.awt.Color(225, 217, 154));
        termsAndConditions_Panel_ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Cros_Blue.png"))); // NOI18N
        termsAndConditions_Panel_ExitButton.setToolTipText("EXIT");
        termsAndConditions_Panel_ExitButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        termsAndConditions_Panel_ExitButton.setBorderPainted(false);
        termsAndConditions_Panel_ExitButton.setContentAreaFilled(false);
        termsAndConditions_Panel_ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        termsAndConditions_Panel_ExitButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        termsAndConditions_Panel_ExitButton.setMaximumSize(new java.awt.Dimension(40, 40));
        termsAndConditions_Panel_ExitButton.setMinimumSize(new java.awt.Dimension(40, 40));
        termsAndConditions_Panel_ExitButton.setPreferredSize(new java.awt.Dimension(40, 40));
        termsAndConditions_Panel_ExitButton.setRequestFocusEnabled(false);
        termsAndConditions_Panel_ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                termsAndConditions_Panel_ExitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                termsAndConditions_Panel_ExitButtonMouseExited(evt);
            }
        });
        termsAndConditions_Panel_ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termsAndConditions_Panel_ExitButtonActionPerformed(evt);
            }
        });
        termsAndConditions_Panel.add(termsAndConditions_Panel_ExitButton);
        termsAndConditions_Panel_ExitButton.setBounds(870, 10, 50, 50);

        jSeparator9.setBackground(new java.awt.Color(0, 255, 204));
        jSeparator9.setForeground(new java.awt.Color(0, 255, 204));
        jSeparator9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jSeparator9.setOpaque(true);
        jSeparator9.setPreferredSize(new java.awt.Dimension(50, 0));
        termsAndConditions_Panel.add(jSeparator9);
        jSeparator9.setBounds(100, 66, 320, 2);

        jSeparator10.setBackground(new java.awt.Color(0, 255, 204));
        jSeparator10.setForeground(new java.awt.Color(0, 255, 204));
        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jSeparator10.setOpaque(true);
        jSeparator10.setPreferredSize(new java.awt.Dimension(50, 0));
        termsAndConditions_Panel.add(jSeparator10);
        jSeparator10.setBounds(70, 84, 2, 360);

        cryptFunct_TremsAndConditionsLabel.setBackground(new java.awt.Color(0, 3, 30));
        cryptFunct_TremsAndConditionsLabel.setFont(new java.awt.Font("Pristina", 1, 48)); // NOI18N
        cryptFunct_TremsAndConditionsLabel.setForeground(new java.awt.Color(0, 255, 204));
        cryptFunct_TremsAndConditionsLabel.setText("Crypt Funct");
        termsAndConditions_Panel.add(cryptFunct_TremsAndConditionsLabel);
        cryptFunct_TremsAndConditionsLabel.setBounds(20, 0, 340, 90);

        signIn_Button_TermsAndConditions.setBackground(new java.awt.Color(0, 0, 30));
        signIn_Button_TermsAndConditions.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        signIn_Button_TermsAndConditions.setForeground(new java.awt.Color(225, 217, 154));
        signIn_Button_TermsAndConditions.setText("Return");
        signIn_Button_TermsAndConditions.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 204), 1, true), new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 204), 1, true)));
        signIn_Button_TermsAndConditions.setContentAreaFilled(false);
        signIn_Button_TermsAndConditions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signIn_Button_TermsAndConditions.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signIn_Button_TermsAndConditionsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                signIn_Button_TermsAndConditionsFocusLost(evt);
            }
        });
        signIn_Button_TermsAndConditions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signIn_Button_TermsAndConditionsActionPerformed(evt);
            }
        });
        termsAndConditions_Panel.add(signIn_Button_TermsAndConditions);
        signIn_Button_TermsAndConditions.setBounds(350, 450, 90, 30);

        jSeparator11.setBackground(new java.awt.Color(0, 255, 204));
        jSeparator11.setForeground(new java.awt.Color(0, 255, 204));
        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        termsAndConditions_Panel.add(jSeparator11);
        jSeparator11.setBounds(438, 350, 2, 90);

        jSeparator12.setBackground(new java.awt.Color(0, 255, 204));
        jSeparator12.setForeground(new java.awt.Color(0, 255, 204));
        jSeparator12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jSeparator12.setMaximumSize(new java.awt.Dimension(147, 2));
        jSeparator12.setMinimumSize(new java.awt.Dimension(147, 2));
        jSeparator12.setPreferredSize(new java.awt.Dimension(147, 2));
        termsAndConditions_Panel.add(jSeparator12);
        jSeparator12.setBounds(140, 464, 197, 2);

        termsAndConditions_ScrollPane.setBackground(new java.awt.Color(0, 0, 30));
        termsAndConditions_ScrollPane.setBorder(null);
        termsAndConditions_ScrollPane.setForeground(new java.awt.Color(225, 217, 154));

        TermsAndConditions.setEditable(false);
        TermsAndConditions.setBackground(new java.awt.Color(0, 0, 30));
        TermsAndConditions.setColumns(20);
        TermsAndConditions.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TermsAndConditions.setForeground(new java.awt.Color(225, 217, 154));
        TermsAndConditions.setRows(5);
        TermsAndConditions.setText("END USER LICENSE AGREEMENT\n\nLast updated November 13, 2021\n\n\n\n\n\nCryptFunct is licensed to You (End-User) by Cryptography Functions by Priyansu located at Graphic Era Hill University, Dehradun, Clament Town, Uttrakhand 248002, India (hereinafter Licensor), for use only under the terms of this License Agreement.\n\nBy downloading the Application from the Apple AppStore, and any update thereto (as permitted by this License Agreement) You indicate that You agree to be bound by all of the terms and conditions of this License Agreement, and that You accept this License Agreement\n\nThe parties of this License Agreement acknowledge that Apple is not a Party to this License Agreement and is not bound by any provisions or obligations with regard to the Application, such as warranty, liability, maintenance and support thereof. Cryptography Functions by Priyansu. not Apple, is solely responsible for the licensed Application and the content thereof.\n\nThis License Agreement may not provide for usage rules for the Application that are in conflict with the latest App Store Terms of Service Cryptography Functions by Priyansu acknowledges that it had the opportunity to review said terms and this License Agreement is not conflicting with them.\n\nAll rights not expressly granted to You are reserved.\n\n\n\n1. THE APPLICATION\n\n\n\n\nCryptFunct (hereinafter: Application) is a piece of software created to 5th Semester Mini Project on topic Visual Cryptography (Image Encryption & Decryption) - and customized for Apple mobile devices. It is used to Text Encryption & Decryption File Encryption & Decryption Image Encryption & Decryption Stenography.\n\n\n\n2. SCOPE OF LICENSE\n\n\n\n\n2.1 This license will also govern any updates of the Application provided by Licensor that replace, repair, and/or supplement the first Application, unless a separate license is provided for such update in which case the terms of that new license will govern.\n\n2.2 You may not reverse engineer, translate, disassemble, integrate decompile integrate, remove, modify, combine, create derivative works or updates of adapt or attempt to derive the source code of the Application or any part thereof (except with Cryptography Functions by Priyansu's prior written consent).\n\n2.3 You may not copy (excluding when expressly authorized by this license and the Usage Rules) or alter the Application or portions thereof. You may create and store copies only on devices that You own or control for backup keeping under the terms of this license, the App Store Terms of Service, and any other terms and conditions that apply to the device or software used. You may not remove any intellectual property notices. You acknowledge that no unauthorized third parties may gain access to these copies at any time.\n\n2.4 Violations of the obligations mentioned above, as well as the attempt of such infringement, may be subject to prosecution and damages.\n\n2.5 Licensor reserves the right to modify the terms and conditions of licensing\n\n2.6 Nothing in this license should be interpreted to restrict third-party terms. When using the Application. You must ensure that you comply with\n\napplicable third-party terms and conditions\n\n\n\n3. TECHNICAL REQUIREMENTS\n\n\n\n3.1 The Application requires a firmware version 1.0.0 or higher. Licensor recommends using the latest version of the firmware\n\n3.2 Licensor attempts to keep the Application updated so that it complies with modified/new versions of the firmware and new hardware You are not\n\ngranted rights to claim such an update\n3.3 You acknowledge that it is Your responsibility to confirm and determine that the app end-user device on which You intend to use the Application satisfies the technical specifications mentioned above.\n\n3.4 Licensor reserves the right to modify the technical specifications as it sees appropriate at any time.\n\n\n\n\n4. NO MAINTENANCE OR SUPPORT\n\n\n\n\n4.1 Cryptography Functions by Priyansu is not obligated, expressed or implied, to provide any maintenance, technical or other support for the Application.\n\n4.2 Cryptography Functions by Priyansu and the End-User acknowledge that Apple has no obligation whatsoever to furnish any maintenance and\n\nsupport services with respect to the licensed Application.\n\n\n\n\n5. USER GENERATED CONTRIBUTIONS\n\n\n\n\nThe Application may invite you to chat, contribute to or participate in blogs, message boards, online forums, and other functionality, and may provide you with the opportunity to create, submit post, display transmit perform publish, distribute or broadcast content and materials to us or in the Application, including but not limited to text, writings, video, audio, photographs, graphics, comments, suggestions, or personal information or other material (collectively, \"Contributions\"). Contributions may be viewable by other users of the Application and through third-party websites or applications. As such, any Contributions you transmit may be treated as non-confidential and non-proprietary. When you create or make available any Contributions, you thereby represent and warrant that:\n\n1. The creation, distribution, transmission, public display, or performance, and the accessing, downloading, or copying of your Contributions do not and will not infringe the proprietary rights, including but not limited to the copyright, patent, trademark, trade secret, or moral rights of any third party.\n\n2 You are the creator and owner of or have the necessary licenses, rights, consents, releases, and permissions to use and to authorize us, the Application, and other users of the Application to use your Contributions in any manner contemplated by the Application and these Terms of Use. You have the written consent, release, and/or permission of each and every identifiable individual person in your Contributions to use the name likeness or each and every such identifiable individual person to enable inclusion and use of your Contributions in any manner contemplated by Application and these Terms of Use.\n\nYour Contributions are not false, inaccurate, or misleading.\n\nYour Contributions are not unsolicited or unauthorized advertising, promotional materials, pyramid schemes, chain letters, spam, mass mailings. or other forms of solicitation.\n\n6. Your Contributions are not obscene, lewd, lascivious, filthy, violent, harassing, libelous, slanderous, or othenvise objectionable (as determined by (us)\n\n7 Your Contributions do not ridicule mock disparage intimidate or abuse anyone\n\n8 Your Contributions are not used to harass or threaten (in the legal sense of those terms) any other person and to promote violence against a specific person or class of people.\n\n9. Your Contributions do not violate any applicable law, regulation, or rule.\n\n10. Your Contributions do not violate the privacy or publicity rights of any third party.\n\n11. Your Contributions do not contain any material that solicits personal information from anyone under the age of 18 or exploits people under the age of 18 in a sexual or violent manner.\n\n12. Your Contributions do not violate any applicable law concerning child pornography, or otherwise intended to protect the health or well-being of minors.\n\n13. Your Contributions do not include any offensive comments that are connected to race, national origin, gender, sexual preference, or physical handicap.\n\n14. Your Contributions do not otherwise violate, or link to material that violates, any provision of these Terms of Use, or any applicable law or regulation.\n\nAny use of the Application in violation of the foregoing violates these Terms of Use and may result in, among other things, termination or suspension your rights to use the Application.\n\n\n\n\n6. CONTRIBUTION LICENSE\n\n\n\nBy posting your Contributions to any part of the Application or making Contributions accessible to the Application by linking your account from the Application to any of your social networking accounts, you automatically grant, and you represent and warrant that you have the right to gram an unrestricted, unlimited, irrevocable, perpetual, non-exclusive, transferable, royalty-free, fully-paid, worldwide right, and license to host, use reproduce, disclose, sell, resell, publish, broad cast, retitle, archive, store, cache, publicly display, reformat, translate, transmit, excerpt (in wh part), and distribute such Contributions (including, without limitation, your image and voice) for any purpose, commercial advertising, or other to prepare derivative works of, or incorporate in other works, such as Contributions, and grant and authorize sublicenses of the foregoing. Thi and distribution may occur in any media formats and through any media channels.\n\nThis license will apply to any form, media, or technology now known or hereafter developed, and includes our use of your name, company nam franchise name, as applicable, and any of the trademarks, service marks, trade names, logos, and personal and commercial images you provi waive all moral rights in your Contributions, and you warrant that moral rights have not otherwise been asserted in your Contributions.\n\nWe do not assert any ownership over your Contributions. You retain full ownership of all of your Contributions and any intellectual property rig other proprietary rights associated with your Contributions. We are not liable for any statements or representations in your Contributions provi you in any area in the Application. You are solely responsible for your Contributions to the Application and you expressly agree to exonerate um any and all responsibility and to refrain from any legal action against us regarding your Contributions.\n\nWe have the right, in our sole and absolute discretion, (1) to edit, redact, or otherwise change any Contributions; (2) to re-categorize any Contributions to place them in more appropriate locations in the Application; and (3) to pre-screen or delete any Contributions at any time and reason, without notice. We have no obligation to monitor your Contributions.\n\n\n\n\n7. LIABILITY\n\n\n\n7.1 Licensor takes no accountability or responsibility for any damages caused due to a breach of duties according to Section 2 of this Agreement. To avoid data loss, You are required to make use of backup functions of the Application to the extent allowed by applicable third-party terms and conditions of use. You are aware that in case of alterations or manipulations of the Application, You will not have access to licensed Application.\n\n7.2 Licensor takes no accountability and responsibility in case of ANYTHING i.e. there will be no responsiblity on the company and developer in any case no matter what..\n\n\n\n\n8. WARRANTY\n\n\n\n8.1 Licensor warrants that the Application is free of spyware, trojan horses, viruses, or any other malware at the time of Your download. Licensor warrants that the Application works as described in the user documentation.\n\n8.2 No warranty is provided for the Application that is not executable on the device that has been unauthorizedly modified, handled inappropriately or culpably, combined or installed with inappropriate hardware or software, used with inappropriate accessories, regardless if by Yourself or by third parties, or if there are any other reasons outside of Cryptography Functions by Priyansu's sphere of influence that affect the executability of the Application.\n8.3 You are required to inspect the Application immediately after installing it and notify Cryptography Functions by Priyansu about issues disc without delay by e-mail provided in Product Claims. The defect report will be taken into consideration and further investigated if it has been ma within a period of zero (0) days after discovery.\n\n8.4 If we confirm that the Application is defective, Cryptography Functions by Priyansu reserves a choice to remedy the situation either by me solving the defect or substitute delivery.\n\n8.5 In the event of any failure of the Application to conform to any applicable warranty, You may notify the App-Store-Operator, and Your Appl purchase price will be refunded to You. To the maximum extent permitted by applicable law, the App-Store-Operator will have no other warranty obligation whatsoever with respect to the App, and any other losses, claims, damages, liabilities, expenses and costs attributable to any neglig adhere to any warranty.\n\n8.6 If the user is an entrepreneur, any claim based on faults expires after a statutory period of limitation amounting to twelve (12) months after Application was made available to the user. The statutory periods of limitation given by law apply for users who are consumers.\n\n\n\n\n9. PRODUCT CLAIMS\n\n\n\nCryptography Functions by Priyansu and the End-User acknowledge that Cryptography Functions by Priyansu, and not Apple, is responsible fo\n\naddressing any claims of the End-User or any third party relating to the licensed Application or the End-User's possession and/or use of that lic\n\nApplication, including but not limited to:\n(i) product liability claims;\n\n(ii) any claim that the licensed Application fails to conform to any applicable legal or regulatory requirement, and\n\n(iii) claims arising under consumer protection, privacy, or similar legislation, including in connection with Your Licensed Application's use of the HealthKit and HomeKit.\n\n\n\n\n\n10. LEGAL COMPLIANCE\n\n\n\nYou represent and warrant that You are not located in a country that is subject to a U.S. Government embargo, or that has been designated by the U.S. Government as a \"terrorist supporting\" country, and that You are not listed on any U.S. Government list of prohibited or restricted parties\n\n\n\n\n11. CONTACT INFORMATION\n\n\n\nFor general inquiries, complaints, questions or claims concerning the licensed Application, please contact\n\nPriyansu Bisht\n\nGraphic Era Hill University Dehradun\nClament Town, Uttrakhand 248002\n\nprincebisht4574@gmail.com\n\n\n\n\n12. TERMINATION\n\n\n\nThe license is valid until terminated by Cryptography Functions by Priyansu or by You. Your rights under this license will terminate automatically and without notice from Cryptography Functions by Priyansu if You fail to adhere to any term(s) of this license. Upon License termination. You shall stop all use of the Application, and destroy all copies, full or partial, of the Application.\n\n\n\n\n13. THIRD-PARTY TERMS OF AGREEMENTS AND BENEFICIARY\n\n\n\nCryptography Functions by Priyansu represents and warrants that Cryptography Functions by Priyansu will comply with applicable third-party terms of agreement when using licensed Application\n\nIn Accordance with Section 9 of the \"Instructions for Minimum Terms of Developer's End-User License Agreement Apple and Apple's subsidiaries shall be third-party beneficiaries of this End User License Agreement and -upon Your acceptance of the terms and conditions of this license agreement, Apple will have the right (and will be deemed to have accepted the right) to enforce this End User License Agreement against you as a third-party beneficiary thereof.\n\n\n\n\n14. INTELLECTUAL PROPERTY RIGHTS\n\n\n\nCryptography Functions by Priyansu and the End-User acknowledge that, in the event of any third-party claim that the licensed Application or the End User's possession and use of that licensed Application infringes on the third party's intellectual property rights, Cryptography Functions by Priyansu, and not Apple, will be solely responsible for the investigation, defense, settlement and discharge or any such intellectual property infringement claims\n\n\n\n\n15. APPLICABLE LAW\n\n\n\nexcluding its conflicts of law rules.\n\nThis license agreement is governed by none.\n\n\n\n\n16. MISCELLANEOUS\n\n\n\n\n16.1 If any of the terms of this agreement should be or become invalid, the validity of the remaining provisions shall not be affected. Invalid terms will be replaced by valid ones formulated in a way that will achieve the primary purpose.\n\n16.2 Collateral agreements, changes and amendments are only valid if laid down in writing. The preceding clause can only be waived in writing.\n\n\n\n17. Confession\n\nThis is only a peice of Terms and Conditions, copied from internet for the only purpose of filling up this panel and have nothing to do with this applications exceprt certain things.\n\nThank You !!!!!!"); // NOI18N
        termsAndConditions_ScrollPane.setViewportView(TermsAndConditions);

        termsAndConditions_Panel.add(termsAndConditions_ScrollPane);
        termsAndConditions_ScrollPane.setBounds(90, 120, 330, 320);

        termsAndConditions_Label.setBackground(new java.awt.Color(0, 0, 30));
        termsAndConditions_Label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        termsAndConditions_Label.setForeground(new java.awt.Color(225, 217, 154));
        termsAndConditions_Label.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        termsAndConditions_Label.setText("Terms & Conditions");
        termsAndConditions_Panel.add(termsAndConditions_Label);
        termsAndConditions_Label.setBounds(180, 70, 240, 40);

        jSeparator13.setBackground(new java.awt.Color(225, 217, 154));
        jSeparator13.setForeground(new java.awt.Color(225, 217, 154));
        jSeparator13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 217, 154)));
        jSeparator13.setMaximumSize(new java.awt.Dimension(240, 2));
        jSeparator13.setMinimumSize(new java.awt.Dimension(240, 2));
        jSeparator13.setOpaque(true);
        termsAndConditions_Panel.add(jSeparator13);
        jSeparator13.setBounds(180, 107, 240, 2);

        termsAndConditions_BackgroundLabel.setBackground(new java.awt.Color(0, 3, 30));
        termsAndConditions_BackgroundLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        termsAndConditions_BackgroundLabel.setForeground(new java.awt.Color(225, 217, 154));
        termsAndConditions_BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/background.jpg"))); // NOI18N
        termsAndConditions_BackgroundLabel.setText(" ");
        termsAndConditions_BackgroundLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        termsAndConditions_BackgroundLabel.setMaximumSize(new java.awt.Dimension(929, 591));
        termsAndConditions_BackgroundLabel.setMinimumSize(new java.awt.Dimension(929, 591));
        termsAndConditions_BackgroundLabel.setOpaque(true);
        termsAndConditions_BackgroundLabel.setPreferredSize(new java.awt.Dimension(929, 591));
        termsAndConditions_Panel.add(termsAndConditions_BackgroundLabel);
        termsAndConditions_BackgroundLabel.setBounds(0, 0, 929, 591);

        getContentPane().add(termsAndConditions_Panel);
        termsAndConditions_Panel.setBounds(0, 0, 929, 557);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void baseFrame_Panel_ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseFrame_Panel_ExitButtonActionPerformed
        // TODO add your handling code here:
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Cross_Gray.png"));
        int res = javax.swing.JOptionPane.showConfirmDialog(null, "Do you want to Exit ?", "ALERT !!!", JOptionPane.YES_NO_OPTION , JOptionPane.PLAIN_MESSAGE , icon);
        if( res == 0 ) {
            System.exit(0);
        }
    }//GEN-LAST:event_baseFrame_Panel_ExitButtonActionPerformed

    private void termsAndConditions_Panel_ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termsAndConditions_Panel_ExitButtonActionPerformed
        // TODO add your handling code here:
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Cross_Gray.png"));
        int res = javax.swing.JOptionPane.showConfirmDialog(null, "Do you want to Exit ?", "ALERT !!!", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon);
        if( res == 0 ) {
            System.exit(0);
        }
    }//GEN-LAST:event_termsAndConditions_Panel_ExitButtonActionPerformed

    private void signIn_Button_TermsAndConditionsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signIn_Button_TermsAndConditionsFocusGained
        // TODO add your handling code here:
        signIn_Button_TermsAndConditions.setBackground(new java.awt.Color(225, 217, 154));
        signIn_Button_TermsAndConditions.setForeground(new java.awt.Color(0, 0, 30));      
    }//GEN-LAST:event_signIn_Button_TermsAndConditionsFocusGained

    private void signIn_Button_TermsAndConditionsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signIn_Button_TermsAndConditionsFocusLost
        // TODO add your handling code here:
        signIn_Button_TermsAndConditions.setBackground(new java.awt.Color(0, 0, 30));
        signIn_Button_TermsAndConditions.setForeground(new java.awt.Color(225, 217, 154));
    }//GEN-LAST:event_signIn_Button_TermsAndConditionsFocusLost

    private void signIn_Button_TermsAndConditionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signIn_Button_TermsAndConditionsActionPerformed
        // TODO add your handling code here:
        signIn_Panel.setVisible(true);
        termsAndConditions_Panel.setVisible(false);
    }//GEN-LAST:event_signIn_Button_TermsAndConditionsActionPerformed

    private void signIn_PanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signIn_PanelFocusGained
        // TODO add your handling code here:
        termsAndConditions_Panel.setVisible(false);
    }//GEN-LAST:event_signIn_PanelFocusGained

    private void termsAndConditions_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_termsAndConditions_labelMouseClicked
        // TODO add your handling code here:
        signIn_Panel.setVisible(false);
        termsAndConditions_Panel.setVisible(true);
    }//GEN-LAST:event_termsAndConditions_labelMouseClicked

    private void signIn_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signIn_ButtonActionPerformed
        userName = username_TextBox.getText();
        
        passWord = String.valueOf( password_Feild.getPassword());
        
        if( userName.equals("")){
            if( passWord.equals("") ) {
                
                signIn_Panel.setVisible(false);
                termsAndConditions_Panel.setVisible(false);
                
                com.cryptoProject.GUIFrames.HomeFrame homeFrame = new com.cryptoProject.GUIFrames.HomeFrame();
                homeFrame.setVisible(true);
                BaseFrame.this.dispose();
                
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Incorrect Password !!!!", "Error", JOptionPane.YES_OPTION );
                password_Feild.setText("");
            } 
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Incorrect Username !!!!", "Error", JOptionPane.YES_OPTION );
            username_TextBox.setText("");
            password_Feild.setText("");
        }
    }//GEN-LAST:event_signIn_ButtonActionPerformed

    private void termsAndConditions_CheckboxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_termsAndConditions_CheckboxStateChanged
        // TODO add your handling code here:
        if( termsAndConditions_Checkbox.isSelected() == true ){
            signIn_Button.setVisible(true);
            signIn_Button.setEnabled(true);
        } else {
            signIn_Button.setVisible(false);
            signIn_Button.setEnabled(false);
        }
    }//GEN-LAST:event_termsAndConditions_CheckboxStateChanged

    private void signIn_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signIn_ButtonMouseEntered
        // TODO add your handling code here:
        if( signIn_Button.isEnabled() ) {
            signIn_Button.setBorder( new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 204), 2, true));
            signIn_Button.setBorderPainted(true);
        }
    }//GEN-LAST:event_signIn_ButtonMouseEntered

    private void signIn_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signIn_ButtonMouseExited
        // TODO add your handling code here:
        if( signIn_Button.isEnabled() ) {
            signIn_Button.setBorder( new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 204), 2, true));
            signIn_Button.setBorderPainted(false);
        }
    }//GEN-LAST:event_signIn_ButtonMouseExited

    private void baseFrame_Panel_ExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baseFrame_Panel_ExitButtonMouseEntered
        // TODO add your handling code here:
        if( baseFrame_Panel_ExitButton.isEnabled() ) {
            baseFrame_Panel_ExitButton.setBorderPainted(true);
        }                                          
    }//GEN-LAST:event_baseFrame_Panel_ExitButtonMouseEntered

    private void baseFrame_Panel_ExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baseFrame_Panel_ExitButtonMouseExited
        // TODO add your handling code here:
        if( baseFrame_Panel_ExitButton.isEnabled() ) {
            baseFrame_Panel_ExitButton.setBorderPainted(false);
        }
    }//GEN-LAST:event_baseFrame_Panel_ExitButtonMouseExited

    private void termsAndConditions_Panel_ExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_termsAndConditions_Panel_ExitButtonMouseEntered
        // TODO add your handling code here:
        if( termsAndConditions_Panel_ExitButton.isEnabled() ) {
            termsAndConditions_Panel_ExitButton.setBorderPainted(true);
        }
    }//GEN-LAST:event_termsAndConditions_Panel_ExitButtonMouseEntered

    private void termsAndConditions_Panel_ExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_termsAndConditions_Panel_ExitButtonMouseExited
        // TODO add your handling code here:
        if( termsAndConditions_Panel_ExitButton.isEnabled() ) {
            termsAndConditions_Panel_ExitButton.setBorderPainted(false);
        }
    }//GEN-LAST:event_termsAndConditions_Panel_ExitButtonMouseExited

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == 27) {
            BaseFrame.this.setState(Frame.ICONIFIED);
        }
    }//GEN-LAST:event_formKeyPressed

                                    
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
                new BaseFrame().setVisible(true);
            }
        });

        * 
        * */
//</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Signin_Label;
    private javax.swing.JTextArea TermsAndConditions;
    private javax.swing.JLabel baseFrame_BackgroundLabel;
    private javax.swing.JButton baseFrame_Panel_ExitButton;
    private javax.swing.JLabel cryptFunct_Label;
    private javax.swing.JLabel cryptFunct_TremsAndConditionsLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPasswordField password_Feild;
    private javax.swing.JLabel password_Label;
    private javax.swing.JButton signIn_Button;
    private javax.swing.JButton signIn_Button_TermsAndConditions;
    private javax.swing.JPanel signIn_Panel;
    private javax.swing.JLabel termsAndConditions_BackgroundLabel;
    private javax.swing.JCheckBox termsAndConditions_Checkbox;
    private javax.swing.JLabel termsAndConditions_Label;
    private javax.swing.JPanel termsAndConditions_Panel;
    private javax.swing.JButton termsAndConditions_Panel_ExitButton;
    private javax.swing.JScrollPane termsAndConditions_ScrollPane;
    private javax.swing.JLabel termsAndConditions_label;
    private javax.swing.JLabel username_Label;
    private javax.swing.JTextField username_TextBox;
    // End of variables declaration//GEN-END:variables
    private String userName;
    private String passWord;
    //private com.cryptoProject.GUIFrames.TextEnDePanel textEnDePanel;
}

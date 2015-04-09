/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rcc.student.bwarfield.cis18b.ShootEmUp_v1.Main;

import static edu.rcc.student.bwarfield.cis18b.ShootEmUp_v1.Main.Validator.*;
import java.awt.Color;

/**
 *
 * @author Bee-Jay
 */
public class Main extends javax.swing.JFrame {

    //color vars
    Color valid = new Color(200, 255, 200);
    Color invalid = new Color(255, 200, 200);

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        menuStartButton = new javax.swing.JButton();
        menuTitle = new javax.swing.JLabel();
        menuRegisterButton = new javax.swing.JButton();
        menuLoginButton = new javax.swing.JButton();
        loginPanel = new javax.swing.JPanel();
        loginLoginButton = new javax.swing.JButton();
        loginTitle = new javax.swing.JLabel();
        loginRegisterButton = new javax.swing.JButton();
        loginBackButton = new javax.swing.JButton();
        loginEmailLabel = new javax.swing.JLabel();
        loginPasswordLabel = new javax.swing.JLabel();
        loginEmailField = new javax.swing.JTextField();
        loginPasswordField = new javax.swing.JPasswordField();
        loginEmailCheckBox = new javax.swing.JCheckBox();
        loginPassCheckBox = new javax.swing.JCheckBox();
        loginResetPass = new javax.swing.JLabel();
        regPanel = new javax.swing.JPanel();
        regRegisterButton = new javax.swing.JButton();
        regTitle = new javax.swing.JLabel();
        regBackButton = new javax.swing.JButton();
        regLoginButton = new javax.swing.JButton();
        regEmailLabel = new javax.swing.JLabel();
        regPassLabel1 = new javax.swing.JLabel();
        regEmailField = new javax.swing.JTextField();
        regPassField1 = new javax.swing.JPasswordField();
        regPassLabel2 = new javax.swing.JLabel();
        regPassField2 = new javax.swing.JPasswordField();
        regHandleLabel = new javax.swing.JLabel();
        regHandleField = new javax.swing.JTextField();
        regEmailValidLabel = new javax.swing.JLabel();
        regPassMatch = new javax.swing.JLabel();
        regPassValid = new javax.swing.JLabel();
        regHandleValid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shoot 'Em Up!");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("mainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        cardPanel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cardPanel.setMaximumSize(new java.awt.Dimension(800, 600));
        cardPanel.setMinimumSize(new java.awt.Dimension(800, 600));
        cardPanel.setName(""); // NOI18N
        cardPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        cardPanel.setLayout(new java.awt.CardLayout());

        menuPanel.setMaximumSize(new java.awt.Dimension(800, 600));
        menuPanel.setMinimumSize(new java.awt.Dimension(800, 600));
        menuPanel.setName(""); // NOI18N
        menuPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        menuStartButton.setFont(new java.awt.Font("Freshman", 0, 36)); // NOI18N
        menuStartButton.setText("Play!");
        menuStartButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuStartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuStartButtonMouseReleased(evt);
            }
        });
        menuStartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuStartButtonActionPerformed(evt);
            }
        });

        menuTitle.setBackground(new java.awt.Color(0, 0, 0));
        menuTitle.setFont(new java.awt.Font("Freshman", 0, 72)); // NOI18N
        menuTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuTitle.setText("Shoot 'Em Up!");

        menuRegisterButton.setText("Register");
        menuRegisterButton.setToolTipText("");
        menuRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegisterButtonActionPerformed(evt);
            }
        });

        menuLoginButton.setText("Login");
        menuLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(menuStartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(524, Short.MAX_VALUE)
                .addComponent(menuLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(menuRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuRegisterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(menuStartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        cardPanel.add(menuPanel, "cardMenu");

        loginPanel.setMaximumSize(new java.awt.Dimension(800, 600));
        loginPanel.setMinimumSize(new java.awt.Dimension(800, 600));
        loginPanel.setName(""); // NOI18N

        loginLoginButton.setFont(new java.awt.Font("Freshman", 0, 36)); // NOI18N
        loginLoginButton.setText("Login");
        loginLoginButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginLoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginLoginButtonMouseReleased(evt);
            }
        });
        loginLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginLoginButtonActionPerformed(evt);
            }
        });

        loginTitle.setBackground(new java.awt.Color(0, 0, 0));
        loginTitle.setFont(new java.awt.Font("Freshman", 0, 72)); // NOI18N
        loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle.setText("Shoot 'Em Up!");

        loginRegisterButton.setText("Register");
        loginRegisterButton.setToolTipText("");
        loginRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginRegisterButtonActionPerformed(evt);
            }
        });

        loginBackButton.setText("Back");
        loginBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBackButtonActionPerformed(evt);
            }
        });

        loginEmailLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        loginEmailLabel.setText("Email");

        loginPasswordLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        loginPasswordLabel.setText("Password");

        loginEmailField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        loginPasswordField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        loginEmailCheckBox.setText("Remember Me");

        loginPassCheckBox.setText("Remember Pass");

        loginResetPass.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        loginResetPass.setText("Forgot Password?");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(loginRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(loginEmailCheckBox)
                            .addComponent(loginPassCheckBox)
                            .addComponent(loginLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginResetPass)))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, loginPanelLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, loginPanelLayout.createSequentialGroup()
                                .addComponent(loginPasswordLabel)
                                .addGap(12, 12, 12)
                                .addComponent(loginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, loginPanelLayout.createSequentialGroup()
                                .addComponent(loginEmailLabel)
                                .addGap(49, 49, 49)
                                .addComponent(loginEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(225, 225, 225))
        );

        loginPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {loginEmailCheckBox, loginPassCheckBox});

        loginPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {loginEmailField, loginPasswordField});

        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginBackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginRegisterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginEmailLabel)
                    .addComponent(loginEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginPasswordLabel)
                    .addComponent(loginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginEmailCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginPassCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginLoginButton)
                .addGap(18, 18, 18)
                .addComponent(loginResetPass)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        cardPanel.add(loginPanel, "cardMenu");

        regPanel.setMaximumSize(new java.awt.Dimension(800, 600));
        regPanel.setMinimumSize(new java.awt.Dimension(800, 600));
        regPanel.setName(""); // NOI18N

        regRegisterButton.setFont(new java.awt.Font("Freshman", 0, 36)); // NOI18N
        regRegisterButton.setText("Register");
        regRegisterButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        regRegisterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                regRegisterButtonMouseReleased(evt);
            }
        });
        regRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regRegisterButtonActionPerformed(evt);
            }
        });

        regTitle.setBackground(new java.awt.Color(0, 0, 0));
        regTitle.setFont(new java.awt.Font("Freshman", 0, 72)); // NOI18N
        regTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regTitle.setText("Shoot 'Em Up!");

        regBackButton.setText("Back");
        regBackButton.setToolTipText("");
        regBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBackButtonActionPerformed(evt);
            }
        });

        regLoginButton.setText("Login");
        regLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regLoginButtonActionPerformed(evt);
            }
        });

        regEmailLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        regEmailLabel.setText("Email");

        regPassLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        regPassLabel1.setText("Password");

        regEmailField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        regEmailField.setToolTipText("Please enter a valid email ex: \"example101@student.university.edu\"");
        regEmailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                regEmailFieldFocusLost(evt);
            }
        });

        regPassField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        regPassField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                regPassField1FocusLost(evt);
            }
        });

        regPassLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        regPassLabel2.setText("Confirm");

        regPassField2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        regPassField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                regPassField2FocusLost(evt);
            }
        });

        regHandleLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        regHandleLabel.setText("Handle");

        regHandleField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        regHandleField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                regHandleFieldFocusLost(evt);
            }
        });

        regEmailValidLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        regPassMatch.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout regPanelLayout = new javax.swing.GroupLayout(regPanel);
        regPanel.setLayout(regPanelLayout);
        regPanelLayout.setHorizontalGroup(
            regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(regLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(regBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(regPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(regPanelLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regEmailLabel)
                            .addComponent(regPassLabel1)
                            .addComponent(regPassLabel2)
                            .addComponent(regHandleLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(regEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regPassField1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regPassField2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regHandleField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regPassValid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(regPanelLayout.createSequentialGroup()
                                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(regEmailValidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(regPassMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(regHandleValid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(regRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        regPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {regEmailField, regPassField1, regPassField2});

        regPanelLayout.setVerticalGroup(
            regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regPanelLayout.createSequentialGroup()
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(regLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regBackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regEmailLabel)
                    .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(regEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(regEmailValidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(regPassLabel1)
                    .addComponent(regPassField1)
                    .addComponent(regPassValid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regPassLabel2)
                    .addComponent(regPassField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regPassMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regHandleLabel)
                    .addComponent(regHandleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regHandleValid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regRegisterButton)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        cardPanel.add(regPanel, "cardMenu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void menuStartButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuStartButtonMouseReleased

    }//GEN-LAST:event_menuStartButtonMouseReleased

    private void menuStartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuStartButtonActionPerformed
        // TODO add your handling code here:
        menuPanel.setVisible(false);
    }//GEN-LAST:event_menuStartButtonActionPerformed

    private void menuLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLoginButtonActionPerformed
        cardPanel.removeAll();
        cardPanel.add(loginPanel);
        cardPanel.repaint();
        cardPanel.revalidate();

    }//GEN-LAST:event_menuLoginButtonActionPerformed

    private void loginLoginButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLoginButtonMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_loginLoginButtonMouseReleased

    private void loginLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginLoginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginLoginButtonActionPerformed

    private void loginBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBackButtonActionPerformed
        cardPanel.removeAll();
        cardPanel.add(menuPanel);
        cardPanel.repaint();
        cardPanel.revalidate();
    }//GEN-LAST:event_loginBackButtonActionPerformed

    private void regRegisterButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regRegisterButtonMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_regRegisterButtonMouseReleased

    private void regRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regRegisterButtonActionPerformed

        int errors = 0;

        if (matchEmail(regEmailField.getText())) {
            regEmailField.setBackground(valid);
            regEmailValidLabel.setText("");
        } else {
            regEmailField.setBackground(invalid);
            regEmailValidLabel.setForeground(Color.red);
            regEmailValidLabel.setText("Invalid Email");
            errors++;
        }
        if (matchPassword(regPassField1.getText())) {
            regPassField1.setBackground(valid);
            regPassValid.setText("");
        } else {
            regPassField1.setBackground(invalid);
            regPassValid.setForeground(Color.RED);
            regPassValid.setText("<html>Password must be 6-20 characters long<br/> AlphaNumeric or @ # $ %</html>");
            errors++;
        }
        if (regPassField1.getText().equals(regPassField2.getText())) {
            regPassField1.setBackground(valid);
            regPassField2.setBackground(valid);
            regPassMatch.setText("");
        } else {
            regPassField1.setBackground(invalid);
            regPassField2.setBackground(invalid);
            regPassMatch.setForeground(Color.RED);
            regPassMatch.setText("Passwords do not match");
            errors++;
        }
        if (matchHandle(regHandleField.getText())) {
            regHandleField.setBackground(valid);
            regHandleValid.setText("");
        } else {
            regHandleField.setBackground(invalid);
            regHandleValid.setForeground(Color.RED);
            regHandleValid.setText("<html>Handle must be 3-20 characters long<br/> AlphaNumeric or @ # $ %</html>");
            errors++;
        }

    }//GEN-LAST:event_regRegisterButtonActionPerformed

    private void regLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regLoginButtonActionPerformed
        cardPanel.removeAll();
        cardPanel.add(loginPanel);
        cardPanel.repaint();
        cardPanel.revalidate();
    }//GEN-LAST:event_regLoginButtonActionPerformed

    private void menuRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegisterButtonActionPerformed
        cardPanel.removeAll();
        cardPanel.add(regPanel);
        cardPanel.repaint();
        cardPanel.revalidate();
    }//GEN-LAST:event_menuRegisterButtonActionPerformed

    private void loginRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginRegisterButtonActionPerformed
        cardPanel.removeAll();
        cardPanel.add(regPanel);
        cardPanel.repaint();
        cardPanel.revalidate();
    }//GEN-LAST:event_loginRegisterButtonActionPerformed

    private void regBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBackButtonActionPerformed
        cardPanel.removeAll();
        cardPanel.add(menuPanel);
        cardPanel.repaint();
        cardPanel.revalidate();
    }//GEN-LAST:event_regBackButtonActionPerformed

    private void regEmailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regEmailFieldFocusLost
        if (regEmailField.getText().length() > 0) {
            if (matchEmail(regEmailField.getText())) {
                regEmailField.setBackground(valid);
                regEmailValidLabel.setText("");
            } else {
                regEmailField.setBackground(invalid);
                regEmailValidLabel.setForeground(Color.red);
                regEmailValidLabel.setText("Invalid Email");
            }
        }
    }//GEN-LAST:event_regEmailFieldFocusLost

    private void regPassField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regPassField1FocusLost
        if (regPassField1.getText().length() > 0) {
            if (matchPassword(regPassField1.getText())) {
                regPassField1.setBackground(valid);
                regPassValid.setText("");
            } else {
                regPassField1.setBackground(invalid);
                regPassValid.setForeground(Color.RED);
                regPassValid.setText("<html>Password must be 6-20 characters long<br/> AlphaNumeric or @ # $ %</html>");
            }
        }
        if (regPassField1.getText().length() > 0 && regPassField2.getText().length() > 0) {
            if (regPassField1.getText().equals(regPassField2.getText()) && matchPassword(regPassField1.getText()) ) {
                regPassField1.setBackground(valid);
                regPassField2.setBackground(valid);
                regPassMatch.setText("");
            } else {
                regPassField1.setBackground(invalid);
                regPassField2.setBackground(invalid);
                regPassMatch.setForeground(Color.RED);
                regPassMatch.setText("Passwords do not match");
            }
        }
    }//GEN-LAST:event_regPassField1FocusLost

    private void regPassField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regPassField2FocusLost
        if (regPassField1.getText().length() > 0 && regPassField2.getText().length() > 0) {
            if (regPassField1.getText().equals(regPassField2.getText())) {
                regPassField1.setBackground(valid);
                regPassField2.setBackground(valid);
                regPassMatch.setText("");
            } else {
                regPassField1.setBackground(invalid);
                regPassField2.setBackground(invalid);
                regPassMatch.setForeground(Color.RED);
                regPassMatch.setText("Passwords do not match");
            }
        }
    }//GEN-LAST:event_regPassField2FocusLost

    private void regHandleFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regHandleFieldFocusLost
        if (regHandleField.getText().length() > 0) {
            if (matchHandle(regHandleField.getText())) {
                regHandleField.setBackground(valid);
                regHandleValid.setText("");
            } else {
                regHandleField.setBackground(invalid);
                regHandleValid.setForeground(Color.RED);
                regHandleValid.setText("<html>Handle must be 3-20 characters long<br/> AlphaNumeric or @ # $ %</html>");
            }
        }
    }//GEN-LAST:event_regHandleFieldFocusLost

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardPanel;
    private javax.swing.JButton loginBackButton;
    private javax.swing.JCheckBox loginEmailCheckBox;
    private javax.swing.JTextField loginEmailField;
    private javax.swing.JLabel loginEmailLabel;
    private javax.swing.JButton loginLoginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JCheckBox loginPassCheckBox;
    private javax.swing.JPasswordField loginPasswordField;
    private javax.swing.JLabel loginPasswordLabel;
    private javax.swing.JButton loginRegisterButton;
    private javax.swing.JLabel loginResetPass;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JButton menuLoginButton;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton menuRegisterButton;
    private javax.swing.JButton menuStartButton;
    private javax.swing.JLabel menuTitle;
    private javax.swing.JButton regBackButton;
    private javax.swing.JTextField regEmailField;
    private javax.swing.JLabel regEmailLabel;
    private javax.swing.JLabel regEmailValidLabel;
    private javax.swing.JTextField regHandleField;
    private javax.swing.JLabel regHandleLabel;
    private javax.swing.JLabel regHandleValid;
    private javax.swing.JButton regLoginButton;
    private javax.swing.JPanel regPanel;
    private javax.swing.JPasswordField regPassField1;
    private javax.swing.JPasswordField regPassField2;
    private javax.swing.JLabel regPassLabel1;
    private javax.swing.JLabel regPassLabel2;
    private javax.swing.JLabel regPassMatch;
    private javax.swing.JLabel regPassValid;
    private javax.swing.JButton regRegisterButton;
    private javax.swing.JLabel regTitle;
    // End of variables declaration//GEN-END:variables
}

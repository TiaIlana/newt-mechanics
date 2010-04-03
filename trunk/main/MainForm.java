/*
 Copyright (C) 2010  Levs Ustinovs

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

To contact the author please email to levi.ustinov@gmail.com.
 */


package main;

import SUVAT.Suvat;
import primitive_wrapers.ODouble;
import Forces.Force;

import javax.swing.UIManager;

/**
 *
 * @author  __USER__
 */
public class MainForm extends javax.swing.JFrame {
    Forces.Object object = new Forces.Object(); //the object forces will be applied uppon
    Options options = new Options();  //for setting options
    
	/** Creates new form MainForm */
    public MainForm() {
        //the following  try and catch code set the system's default look
        // and feel (theme) to System's default...
        try {
        UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName());
        }
        catch (javax.swing.UnsupportedLookAndFeelException e) {}
        catch (ClassNotFoundException e) {}
        catch (InstantiationException e) {}
        catch (IllegalAccessException e) {}

        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btngrpAngle = new javax.swing.ButtonGroup();
        btngrpGravity = new javax.swing.ButtonGroup();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        txtT = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        txtS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtV = new javax.swing.JTextField();
        txtU = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnFindAcc = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.DefaultListModel();
        lstForces = new javax.swing.JList(list);
        jLabel6 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtMagnitude = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtAngle = new javax.swing.JTextField();
        lblAngle = new javax.swing.JLabel();
        btnClearAll = new javax.swing.JButton();
        pnlForcesResolved = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnResolveForces = new javax.swing.JButton();
        txtVector = new javax.swing.JTextField();
        txtOverallForce = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        radDegrees = new javax.swing.JRadioButton();
        radRadians = new javax.swing.JRadioButton();
        chkGravity = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        chkFriction = new javax.swing.JCheckBox();
        ftxtFriction = new javax.swing.JFormattedTextField();
        txtMass = new javax.swing.JTextField();
        chkMass = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        canvas = new java.awt.Canvas();
        jMenuBar1 = new javax.swing.JMenuBar();
        menufFile = new javax.swing.JMenu();
        menuItemSave = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        menuItemClearAll = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuItemHelp = new javax.swing.JMenuItem();
        menuItemAbout = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Newtonian Physics");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setText("<html>m/s<sup>2</sup></html>");

        jLabel9.setText("m/s");

        jLabel10.setText("m/s");

        jLabel8.setText("m");

        btnClear.setText("Clear");
        btnClear.setToolTipText("Clear all the ntry fields...");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTKeyPressed(evt);
            }
        });

        btnCalculate.setText("Calculate");
        btnCalculate.setToolTipText("Calculate the missing suvat values...");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        jLabel12.setText("s");

        jLabel2.setText("U:");

        jLabel1.setText("S:");

        txtA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAKeyPressed(evt);
            }
        });

        txtS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSKeyPressed(evt);
            }
        });

        jLabel5.setText("T:");

        jLabel4.setText("A:");

        jLabel3.setText("V:");

        txtV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVKeyPressed(evt);
            }
        });

        txtU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUKeyPressed(evt);
            }
        });

        jLabel17.setText("<html><u>SUVAT variables:</u>");

        btnFindAcc.setText("Find A");
        btnFindAcc.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtT, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtA, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtV, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtU, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(btnFindAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btnCalculate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindAcc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnClear.getAccessibleContext().setAccessibleName("btnClear");
        txtT.getAccessibleContext().setAccessibleName("txtT");
        btnCalculate.getAccessibleContext().setAccessibleName("btnCalculate");
        jLabel2.getAccessibleContext().setAccessibleName("lblU");
        jLabel1.getAccessibleContext().setAccessibleName("lblS");
        txtA.getAccessibleContext().setAccessibleName("txtA");
        txtS.getAccessibleContext().setAccessibleName("txtS");
        jLabel5.getAccessibleContext().setAccessibleName("lblT");
        jLabel4.getAccessibleContext().setAccessibleName("lblA");
        jLabel3.getAccessibleContext().setAccessibleName("lblV");
        txtV.getAccessibleContext().setAccessibleName("txtV");
        txtU.getAccessibleContext().setAccessibleName("txtU");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lstForces.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstForces);
        lstForces.getAccessibleContext().setAccessibleName("lstForces");

        jLabel6.setText("<html><u>Forces:</u>");

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel7.setText("Magnitude:");

        jLabel13.setText("Angle:");

        txtMagnitude.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMagnitudeKeyPressed(evt);
            }
        });

        jLabel14.setText("N");

        txtAngle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAngleKeyPressed(evt);
            }
        });

        lblAngle.setText("<html>&deg");

        btnClearAll.setText("Clear All");
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });

        pnlForcesResolved.setBorder(javax.swing.BorderFactory.createTitledBorder("Resolved forces"));

        jLabel19.setText("Resultant force:");

        jLabel20.setText("In vector form:");

        btnResolveForces.setText("Resolve forces");
        btnResolveForces.setEnabled(false);
        btnResolveForces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolveForcesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlForcesResolvedLayout = new javax.swing.GroupLayout(pnlForcesResolved);
        pnlForcesResolved.setLayout(pnlForcesResolvedLayout);
        pnlForcesResolvedLayout.setHorizontalGroup(
            pnlForcesResolvedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlForcesResolvedLayout.createSequentialGroup()
                .addGroup(pnlForcesResolvedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlForcesResolvedLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlForcesResolvedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addGroup(pnlForcesResolvedLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pnlForcesResolvedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtVector)
                                    .addComponent(txtOverallForce, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))))
                    .addGroup(pnlForcesResolvedLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnResolveForces)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pnlForcesResolvedLayout.setVerticalGroup(
            pnlForcesResolvedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlForcesResolvedLayout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOverallForce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnResolveForces)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnClearAll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRemove, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(73, 73, 73))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAngle, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblAngle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(3, 3, 3)
                                        .addComponent(txtMagnitude, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(pnlForcesResolved, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pnlForcesResolved, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtMagnitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(txtAngle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAngle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(btnAdd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRemove)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnClearAll))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblAngle.getAccessibleContext().setAccessibleName("lblAngle");

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel21.setText("Angle measured in:");

        btngrpAngle.add(radDegrees);
        radDegrees.setSelected(true);
        radDegrees.setText("Degrees");

        btngrpAngle.add(radRadians);
        radRadians.setText("Radians");

        chkGravity.setSelected(true);
        chkGravity.setText("Gravity");

        jLabel15.setText("<html><u>Particle and envoriment options:</u>");

        chkFriction.setText("Friction:");
        chkFriction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFrictionActionPerformed(evt);
            }
        });

        ftxtFriction.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ftxtFriction.setEnabled(false);

        txtMass.setEnabled(false);
        txtMass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMassKeyTyped(evt);
            }
        });

        chkMass.setText("Mass:");
        chkMass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMassActionPerformed(evt);
            }
        });

        jLabel16.setText("kg");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setText("Reset to defaluts");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(chkGravity)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkFriction)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ftxtFriction, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radDegrees)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radRadians))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(chkMass)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMass, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16))))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radDegrees)
                    .addComponent(radRadians)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkGravity)
                    .addComponent(chkFriction)
                    .addComponent(ftxtFriction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMass)
                    .addComponent(txtMass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnReset))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        canvas.setBackground(new java.awt.Color(255, 255, 255));
        canvas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        canvas.setName("canvas"); // NOI18N

        menufFile.setText("File");

        menuItemSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSave.setText("Save");
        menufFile.add(menuItemSave);

        menuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuItemExit.setText("Exit");
        menufFile.add(menuItemExit);

        jMenuBar1.add(menufFile);

        menuEdit.setText("Edit");

        menuItemClearAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuItemClearAll.setText("Clear All");
        menuEdit.add(menuItemClearAll);

        jMenuBar1.add(menuEdit);

        menuHelp.setText("Help");

        menuItemHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuItemHelp.setText("Help");
        menuHelp.add(menuItemHelp);

        menuItemAbout.setText("About");
        menuHelp.add(menuItemAbout);

        jMenuBar1.add(menuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        //retrieve the user selected inndex
        int selected = lstForces.getSelectedIndex();
        //check if anything is selected
        if(selected == -1){ //getSelectedIndex() returns -1 if nothing is selected
            //display message
            javax.swing.JOptionPane.showMessageDialog(null, 
                    "Please select and item to be removed...", "Error",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
        }
        else{
            //remove the selected force from the object
            object.removeForce(selected);
            //remove the item from the list according to selected index
            list.remove(selected);
            
            if(list.isEmpty()){     //check if the list is empty
                //if it is then disable the resolve forces button
                btnResolveForces.setEnabled(false);
            }
        }

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
        //confirm clear all
        int confirm = javax.swing.JOptionPane.showConfirmDialog(null,
                "Are you sure you want to delere all forces?",
                "Confirm deletion",
                javax.swing.JOptionPane.YES_NO_OPTION);
        //if 'Yes' is selected confirm is 0 (the first option)
        if(confirm == 0){
            //clear all the elements in the list
            list.removeAllElements();
            //update lstForces
            lstForces.setModel(list);
            //clear all the forces applied to the object
            object.clearAllForces();
            //disable the resolve button
            btnResolveForces.setEnabled(false);
            //remove all values from the resolved forces pane:
            txtVector.setText("");
            txtOverallForce.setText("");
        }
    }//GEN-LAST:event_btnClearAllActionPerformed

    private void chkMassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMassActionPerformed
        if(chkMass.isSelected()){   //if check box is checked
            txtMass.setEnabled(true);   //enable the entry field for mass
        }
        else{   //if unckeched
            txtMass.setEnabled(false);  //disable it
              //disable reolving forces if there are none in the list...
            if(list.isEmpty()) btnResolveForces.setEnabled(false);
        }
    }//GEN-LAST:event_chkMassActionPerformed

    private void btnResolveForcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolveForcesActionPerformed
        //if mass is set, add it to the object
        if(!txtMass.getText().isEmpty()){  //if txtMass is not empty
            //check if gravity is set...
            if(options.getGravity()){
                object.setMass(Double.parseDouble(txtMass.getText()));  //set mass
            }
            //otherwise mass does nothing, since there is no gravity
        }
        //if mass check box is set, but txtMass contains no value
        //notify user and disable button...
        if(txtMass.getText().isEmpty() && chkMass.isSelected()){
            javax.swing.JOptionPane.showMessageDialog(null, //user notification
                    "Please set mass or uncheck the mass check box!", "Error",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            btnResolveForces.setEnabled(false);
            return;
        }

        object.resolve();   //resolve the forces

        //display resultant force in force format:
        txtOverallForce.setText(object.getOverall().toString(options.getAngle()));
        //and in vector format: (rounding off to 3 decimal places
        java.text.DecimalFormat format = new java.text.DecimalFormat("###.###");
        txtVector.setText(format.format(object.getI())+"i " +
                format.format(object.getJ())+"j");
    }//GEN-LAST:event_btnResolveForcesActionPerformed

    private void txtMassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMassKeyTyped
            //something has been entered, thus...
            btnResolveForces.setEnabled(true);  //since mass produces a force (with gravity)
    }//GEN-LAST:event_txtMassKeyTyped

    private void txtSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSKeyPressed
        if(evt.getKeyCode() == 10){ //if user presed enter
            btnCalculate.doClick();     //initiate the Calcluate button event
        }
    }//GEN-LAST:event_txtSKeyPressed

    private void txtUKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUKeyPressed
        if(evt.getKeyCode() == 10){ //if user presed enter
            btnCalculate.doClick();     //initiate the Calcluate button event
        }
    }//GEN-LAST:event_txtUKeyPressed

    private void txtVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVKeyPressed
        if(evt.getKeyCode() == 10){ //if user presed enter
            btnCalculate.doClick();     //initiate the Calcluate button event
        }
    }//GEN-LAST:event_txtVKeyPressed

    private void txtAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAKeyPressed
        if(evt.getKeyCode() == 10){ //if user presed enter
            btnCalculate.doClick();     //initiate the Calcluate button event
        }
    }//GEN-LAST:event_txtAKeyPressed

    private void txtTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTKeyPressed
        if(evt.getKeyCode() == 10){ //if user presed enter
            btnCalculate.doClick();     //initiate the Calcluate button event
        }
    }//GEN-LAST:event_txtTKeyPressed

    private void txtMagnitudeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMagnitudeKeyPressed
        if(evt.getKeyCode() == 10){ //if user presed enter
            btnAdd.doClick();     //initiate the Calcluate button event
        }
    }//GEN-LAST:event_txtMagnitudeKeyPressed

    private void txtAngleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAngleKeyPressed
        if(evt.getKeyCode() == 10){ //if user presed enter
            btnAdd.doClick();     //initiate the Calcluate button event
        }
    }//GEN-LAST:event_txtAngleKeyPressed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        double values[] = new double[5]; //for values storage
        boolean flags[] = new boolean[5]; //if value is set
        int missing_count = 0;  //counter for unset values
        //build the two arrays
        if (!txtS.getText().isEmpty()) {
                values[0] = Double.parseDouble(txtS.getText());
                flags[0] = true;
        }
        else{
           missing_count++;    //values is not set
        }
        if (!txtU.getText().isEmpty()) {
                values[1] = Double.parseDouble(txtU.getText());
                flags[1] = true;
        }
        else{
           missing_count++;    //values is not set
        }
        if ((!txtV.getText().isEmpty())) {
                values[2] = Double.parseDouble(txtV.getText());
                flags[2] = true;
        }
        else{
           missing_count++;    //values is not set
        }
        if ((!txtA.getText().isEmpty())) {
                values[3] = Double.parseDouble(txtA.getText());
                flags[3] = true;
        }
        else{
           missing_count++;    //values is not set
        }
        if ((!txtT.getText().isEmpty())) {
                values[4] = Double.parseDouble(txtT.getText());
                flags[4] = true;
        }
        else{
           missing_count++;    //values is not set
        }



        //check if there are only 2 suvat missing or less
        if(missing_count <= 2){
            //construct a suvat object
            Suvat suvat = new Suvat(values, flags);
            //resolve the values
            suvat.resolve();

            //update values
            ODouble newValues[] = new ODouble[5];
            for (int i = 0; i < newValues.length; i++) {
                    newValues[i] = new ODouble(); //initialise object
                    suvat.retrieve(Suvat.suvatChar[i], newValues[i]); //retrieve value
                    values[i] = newValues[i].val; //update the value
            }
            //update on screen values
            txtS.setText(Double.toString(values[0]));
            txtU.setText(Double.toString(values[1]));
            txtV.setText(Double.toString(values[2]));
            txtA.setText(Double.toString(values[3]));
            txtT.setText(Double.toString(values[4]));
        }
        else{   //less than 3 variables entered
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Please enter at least 3 SUVAT values!",
                    "Error",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //check if angle and magnitude have been entered
        if(!txtAngle.getText().isEmpty() && !txtMagnitude.getText().isEmpty()){
            //retrieve the entered values
            double magnitude = Double.parseDouble(txtMagnitude.getText());
            double angle = Double.parseDouble(txtAngle.getText());
            Force force = new Force(magnitude, angle, options.getAngle());    //for entered force
            //update the list box (angle is set according to option)
            list.addElement(force.toString());
            //update the list of forces applied to the object
            object.addForces(force);
            //clear the entry fields for new entries
            txtAngle.setText("");
            txtMagnitude.setText("");
            //update the JTable 'lstForces'
            lstForces.setModel(list);
            //enable the calculate forces button
            btnResolveForces.setEnabled(true);
            //set the forcus on the magnitude text box for entering more forces
            txtMagnitude.requestFocus();
        }
        else{   //no values for magnitude and angle have bee entered
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Please enter the magnitude and angle of the force!",
                    "Error", javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtS.setText(null);
        txtU.setText(null);
        txtV.setText(null);
        txtA.setText(null);
        txtT.setText(null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void chkFrictionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFrictionActionPerformed
        //enable text entering field acording to the check box status:
        ftxtFriction.setEnabled(chkFriction.isSelected());
    }//GEN-LAST:event_chkFrictionActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        ////degrees setting:
        if(radDegrees.isSelected()){    //degree are selected
            options.setAngle(true);     //set the options
            //correct the label to display the degres sign:
            lblAngle.setText("<html>&deg");
        }
        else{   //radians are set...
            options.setAngle(false);
            lblAngle.setText("rad");    //display the radians 'sign'
        }

        ////gravity setting:
        //change options according to selection:
        options.setGravity(chkGravity.isSelected());

        ////friction setting:
        //debug:
        try{
            ftxtFriction.commitEdit();
        }
        catch(java.text.ParseException exc){
            System.out.println("Please enter a valid value for friction!" +
                    "\nFriction was not saved!");
        }
        double lol = ((Double)ftxtFriction.getValue()).doubleValue();
        System.out.println(lol);

        ////mass setting:
        object.setMass(Double.parseDouble(txtMass.getText()));  //get the mass
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        //simply reinitialise the Options object:
        options = new Options();
        //set the mass to 0:
        object.setMass(0);

        //set all the controlls to their defaults:
        radDegrees.setSelected(true);
        chkGravity.setSelected(true);
        //note: method doClick runs the on event code as if user had clicked
        //      on the component themselves....
        chkFriction.doClick();
        chkMass.doClick();
        
    }//GEN-LAST:event_btnResetActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnFindAcc;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnResolveForces;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup btngrpAngle;
    private javax.swing.ButtonGroup btngrpGravity;
    private java.awt.Canvas canvas;
    private javax.swing.JCheckBox chkFriction;
    private javax.swing.JCheckBox chkGravity;
    private javax.swing.JCheckBox chkMass;
    private javax.swing.JFormattedTextField ftxtFriction;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAngle;
    private javax.swing.JList lstForces;
    private javax.swing.DefaultListModel list;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem menuItemAbout;
    private javax.swing.JMenuItem menuItemClearAll;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemHelp;
    private javax.swing.JMenuItem menuItemSave;
    private javax.swing.JMenu menufFile;
    private javax.swing.JPanel pnlForcesResolved;
    private javax.swing.JRadioButton radDegrees;
    private javax.swing.JRadioButton radRadians;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtAngle;
    private javax.swing.JTextField txtMagnitude;
    private javax.swing.JTextField txtMass;
    private javax.swing.JTextField txtOverallForce;
    private javax.swing.JTextField txtS;
    private javax.swing.JTextField txtT;
    private javax.swing.JTextField txtU;
    private javax.swing.JTextField txtV;
    private javax.swing.JTextField txtVector;
    // End of variables declaration//GEN-END:variables

}









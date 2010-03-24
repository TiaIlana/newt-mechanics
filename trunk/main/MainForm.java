/*
 * MainForm.java
 *
 * Created on __DATE__, __TIME__
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
	/** Creates new form MainForm */
    public MainForm() {
        try {

        //the following 7 lines of code set the system's default look
        // and feel (theme). The exceptions are not handleled...
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
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        txtT = new javax.swing.JTextField();
        btCalcualte = new javax.swing.JButton();
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
        jPanel3 = new javax.swing.JPanel();
        txtEq1 = new javax.swing.JLabel();
        txtEq2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.DefaultListModel();
        listForces = new java.util.ArrayList<Force>();
        lstForces = new javax.swing.JList(list);
        jLabel6 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtMagnitude = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtAngle = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnClearAll = new javax.swing.JButton();
        chkMass = new javax.swing.JCheckBox();
        txtMass = new javax.swing.JTextField();
        pnlForcesResolved = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtHorResolved = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtVerResolved = new javax.swing.JTextField();
        btnResolveForces = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Newtonian Physics");

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

        btCalcualte.setText("Calculate");
        btCalcualte.setToolTipText("Calculate the missing suvat values...");
        btCalcualte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcualteActionPerformed(evt);
            }
        });

        jLabel12.setText("s");

        jLabel2.setText("U:");

        jLabel1.setText("S:");

        jLabel5.setText("T:");

        jLabel4.setText("A:");

        jLabel3.setText("V:");

        jLabel17.setText("SUVAT variables:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Euqations used:"));

        txtEq1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEq2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEq2)
                    .addComponent(txtEq1))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(txtEq1)
                .addGap(27, 27, 27)
                .addComponent(txtEq2)
                .addContainerGap(60, Short.MAX_VALUE))
        );

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
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCalcualte)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btCalcualte)
                                .addGap(7, 7, 7)
                                .addComponent(btnClear)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addGap(47, 47, 47))
        );

        btnClear.getAccessibleContext().setAccessibleName("btnClear");
        txtT.getAccessibleContext().setAccessibleName("txtT");
        btCalcualte.getAccessibleContext().setAccessibleName("btnCalculate");
        jLabel2.getAccessibleContext().setAccessibleName("lblU");
        jLabel1.getAccessibleContext().setAccessibleName("lblS");
        txtA.getAccessibleContext().setAccessibleName("txtA");
        txtS.getAccessibleContext().setAccessibleName("txtS");
        jLabel5.getAccessibleContext().setAccessibleName("lblT");
        jLabel4.getAccessibleContext().setAccessibleName("lblA");
        jLabel3.getAccessibleContext().setAccessibleName("lblV");
        txtV.getAccessibleContext().setAccessibleName("txtV");
        txtU.getAccessibleContext().setAccessibleName("txtU");

        jTabbedPane2.addTab("SUVAT", jPanel1);

        lstForces.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstForces);
        lstForces.getAccessibleContext().setAccessibleName("lstForces");

        jLabel6.setText("Forces:");

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

        txtMagnitude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMagnitudeActionPerformed(evt);
            }
        });

        jLabel14.setText("N");

        txtAngle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAngleActionPerformed(evt);
            }
        });

        jLabel15.setText("<html>&deg");

        btnClearAll.setText("Clear All");
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });

        chkMass.setText("Mass:");
        chkMass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMassActionPerformed(evt);
            }
        });

        txtMass.setEnabled(false);
        txtMass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMassKeyTyped(evt);
            }
        });

        pnlForcesResolved.setBorder(javax.swing.BorderFactory.createTitledBorder("Resolved forces"));

        jLabel19.setText("Horizontally:");

        jLabel20.setText("Vertically:");

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
                .addContainerGap()
                .addGroup(pnlForcesResolvedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlForcesResolvedLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtVerResolved, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlForcesResolvedLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtHorResolved, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(btnResolveForces))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlForcesResolvedLayout.setVerticalGroup(
            pnlForcesResolvedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlForcesResolvedLayout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHorResolved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVerResolved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAngle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMagnitude, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(chkMass)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMass, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                            .addComponent(btnClearAll)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemove, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addComponent(pnlForcesResolved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pnlForcesResolved, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(chkMass)
                                .addComponent(txtMass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtMagnitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtAngle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnAdd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRemove)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnClearAll))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel15.getAccessibleContext().setAccessibleName("lblAngle");

        jTabbedPane2.addTab("Forces", jPanel2);

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.setToolTipText("Quits the applications.");
        jMenu1.add(jMenuItem1);
        jMenuItem1.getAccessibleContext().setAccessibleDescription("Quits the application.");

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem2.setText("Options");
        jMenuItem2.setToolTipText("Configure settings...");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);
        jMenu2.getAccessibleContext().setAccessibleDescription("");

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
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
            object.removeForce(listForces.get(selected));
            //remove the item from the list according to selected index
            list.remove(selected);
            
            if(list.isEmpty()){     //check if the list is empty
                //if it is then disable the resolve forces button
                btnResolveForces.setEnabled(false);
            }
        }

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void txtMagnitudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMagnitudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMagnitudeActionPerformed

    private void txtAngleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAngleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAngleActionPerformed

    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
        //confirm clear all
        int confirm = javax.swing.JOptionPane.showConfirmDialog(null,
                "Are you sure you want to delere all forces?",
                "Confirm deletion",
                javax.swing.JOptionPane.YES_NO_OPTION);
        //if 'Yes' is selcted confirm is 1
        if(confirm == 1){
            //clear all the elements in the tables
            list.removeAllElements();
            //clear all the forces applied to the object
            object.clearAllForce();
            //disable the resolve button
            btnResolveForces.setEnabled(false);
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
            object.setMass(Double.parseDouble(txtMass.getText()));  //set mass
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
        //display them...
        txtHorResolved.setText(object.getHorizontally().toString());
        txtVerResolved.setText(object.getVertically().toString());
    }//GEN-LAST:event_btnResolveForcesActionPerformed

    private void txtMassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMassKeyTyped
            //something has been entered, thus...
            btnResolveForces.setEnabled(true);  //since mass produces a force (with gravity)
    }//GEN-LAST:event_txtMassKeyTyped
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        //retrieve the entered values
        double magnitude = Double.parseDouble(txtMagnitude.getText());
        double angle = Double.parseDouble(txtAngle.getText());
        //add the force to the object
        Force force = new Force(magnitude, angle);
        //update the list box
        list.addElement(force);     //N/B: seems to automatically invokes toString...
        //update the list of forces
        listForces.add(force);
        //clear the entry fields for new entries
        txtAngle.setText("");
        txtMagnitude.setText("");
        //update the JTable 'lstForces'
        lstForces.setModel(list);
        //enable the calculate forces button
        btnResolveForces.setEnabled(true);
    }

	private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {
		txtS.setText(null);
		txtU.setText(null);
		txtV.setText(null);
		txtA.setText(null);
		txtT.setText(null);
	}

	private void btCalcualteActionPerformed(java.awt.event.ActionEvent evt) {
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
                    System.out.println(suvat.toString());   //debug
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
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcualte;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnResolveForces;
    private javax.swing.JCheckBox chkMass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList lstForces;
    private javax.swing.DefaultListModel list;
    //the following holds forces contained in string 
    //form in list with corresponding indexes
    private java.util.ArrayList<Force> listForces;
    private javax.swing.JPanel pnlForcesResolved;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtAngle;
    private javax.swing.JLabel txtEq1;
    private javax.swing.JLabel txtEq2;
    private javax.swing.JTextField txtHorResolved;
    private javax.swing.JTextField txtMagnitude;
    private javax.swing.JTextField txtMass;
    private javax.swing.JTextField txtS;
    private javax.swing.JTextField txtT;
    private javax.swing.JTextField txtU;
    private javax.swing.JTextField txtV;
    private javax.swing.JTextField txtVerResolved;
    // End of variables declaration//GEN-END:variables

}









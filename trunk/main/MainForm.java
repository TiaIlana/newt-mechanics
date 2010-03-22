/*
 * MainForm.java
 *
 * Created on __DATE__, __TIME__
 */

package main;

import SUVAT.Suvat;
import primitive_wrapers.ODouble;
import Forces.Force;

/**
 *
 * @author  __USER__
 */
public class MainForm extends javax.swing.JFrame {
	Forces.Object object = new Forces.Object(); //the object forces will be applied uppon
        javax.swing.DefaultListModel list = new javax.swing.DefaultListModel();
	/** Creates new form MainForm */
	public MainForm() {
		initComponents();
		//lstForces = new javax.swing.JList(list);
	}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Demo");

        jLabel11.setText("<html>m/s<sup>2</sup></html>");

        jLabel9.setText("m/s");

        jLabel10.setText("m/s");

        jLabel8.setText("m");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btCalcualte.setText("Calculate");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
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
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btCalcualte)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btCalcualte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear))
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addContainerGap(46, Short.MAX_VALUE))
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

        jLabel15.setText("<html>&deg</html>");

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
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemove))))
                    .addComponent(jLabel6))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
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
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void txtMagnitudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMagnitudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMagnitudeActionPerformed

    private void txtAngleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAngleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAngleActionPerformed
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        //retrieve the entered values
        double magnitude = Double.parseDouble(txtMagnitude.getText());
        double angle = Double.parseDouble(txtAngle.getText());
        //add the force to the object
        Force force = new Force(magnitude, angle);
        object.addForces(force);
        //update the list box
        list.addElement(force.toString());
        //clear the entry fields for new entries
        txtAngle.setText("");
        txtMagnitude.setText("");
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

		//build the two arrays
		if (!txtS.getText().isEmpty()) {
			values[0] = Double.parseDouble(txtS.getText());
			flags[0] = true;
		}
		if (!txtU.getText().isEmpty()) {
			values[1] = Double.parseDouble(txtU.getText());
			flags[1] = true;
		}
		if ((!txtV.getText().isEmpty())) {
			values[2] = Double.parseDouble(txtV.getText());
			flags[2] = true;
		}
		if ((!txtA.getText().isEmpty())) {
			values[3] = Double.parseDouble(txtA.getText());
			flags[3] = true;
		}
		if ((!txtT.getText().isEmpty())) {
			values[4] = Double.parseDouble(txtT.getText());
			flags[4] = true;
		}

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

		txtS.setText(Double.toString(values[0]));
		txtU.setText(Double.toString(values[1]));
		txtV.setText(Double.toString(values[2]));
		txtA.setText(Double.toString(values[3]));
		txtT.setText(Double.toString(values[4]));
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcualte;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JList lstForces;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtAngle;
    private javax.swing.JTextField txtMagnitude;
    private javax.swing.JTextField txtS;
    private javax.swing.JTextField txtT;
    private javax.swing.JTextField txtU;
    private javax.swing.JTextField txtV;
    // End of variables declaration//GEN-END:variables

}









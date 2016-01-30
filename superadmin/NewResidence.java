/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superadmin;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.Action;

/**
 *
 * @author franq
 */
public class NewResidence extends javax.swing.JFrame {

    /**
     * Creates new form NewResidence
     */
    
    private static String termname,year;
    private static int termid;
    private static int counter;
    private static Action radio1event,radio2event,radio3event;
    
    
    public NewResidence() {
       constructor();
    }
    private static boolean saved;
    
    private void constructor()
    {
        saved=false;
        initComponents();
        year = selects.QueryMainDetails.getCurrentYear();
        counter = 0;
        
        radio1event = new AbstractAction()
        {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(jrterm1.isSelected() == true)
                {
                    jrterm2.setSelected(false);
                    jrterm3.setSelected(false);
                    termname = "FIRST TERM";
                }
              }
        };
        
        jrterm1.addActionListener(radio1event);
        
        
        radio2event = new AbstractAction()
        {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(jrterm2.isSelected() == true)
                {
                    jrterm1.setSelected(false);
                    jrterm3.setSelected(false);
                    termname = "SECOND TERM";
                }
              }
        };
        
        jrterm2.addActionListener(radio2event);
        
        
         radio3event = new AbstractAction()
        {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(jrterm3.isSelected() == true)
                {
                  jrterm2.setSelected(false);
                jrterm1.setSelected(false);
                 termname = "THIRD TERM";
                }
              }
        };
        
        jrterm3.addActionListener(radio3event);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cmbgender = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spncapacity = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        tffee = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jrterm1 = new javax.swing.JRadioButton();
        jrterm2 = new javax.swing.JRadioButton();
        jrterm3 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnok = new javax.swing.JButton();
        tfresidencename = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Residence Details");
        setIconImage(selects.QueryMainDetails.setIcon());
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(911, 469));

        cmbgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Male", "Female", "Mixed" }));

        jLabel8.setForeground(new java.awt.Color(0, 0, 240));
        jLabel8.setText("Gender");

        jLabel9.setForeground(new java.awt.Color(0, 0, 240));
        jLabel9.setText("Residence Name");

        jLabel10.setForeground(new java.awt.Color(0, 0, 240));
        jLabel10.setText("Capacity");

        spncapacity.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10000, 1));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(0, 0, 240));
        jLabel14.setText("Fee");

        jLabel15.setForeground(new java.awt.Color(0, 0, 240));
        jLabel15.setText("Term");

        jrterm1.setText("Term 1");
        jrterm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrterm1ActionPerformed(evt);
            }
        });

        jrterm2.setText("Term 2");
        jrterm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrterm2ActionPerformed(evt);
            }
        });

        jrterm3.setText("Term 3");
        jrterm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrterm3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 240));
        jLabel6.setText("Enter The Residence Details");

        btnok.setText("Ok");
        btnok.setEnabled(false);
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(64, 64, 64)
                        .addComponent(tfresidencename))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel15))
                                .addGap(108, 108, 108)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrterm1)
                                    .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrterm2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrterm3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jButton4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tffee, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                    .addComponent(spncapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnok)
                                .addGap(249, 249, 249)
                                .addComponent(jButton1)))))
                .addGap(73, 73, 73))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel6)
                .addContainerGap(409, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfresidencename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(spncapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 101, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrterm1)
                            .addComponent(tffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrterm2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrterm3)
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(btnok))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String residencename,gender,capacity,fee;
        residencename = tfresidencename.getText().toUpperCase();
        gender = cmbgender.getSelectedItem().toString();
        capacity =  spncapacity.getValue().toString();
        fee = tffee.getText();
        
        if("".equals(residencename))
        {
            JOptionPane.showMessageDialog(null,
                        "Please Enter Residence Name to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if(jrterm1.isSelected() == false && jrterm2.isSelected() == false && jrterm3.isSelected() == false)
        {
            JOptionPane.showMessageDialog(null,
                "Please Select Term to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if("Select".equals(gender))
        {
            JOptionPane.showMessageDialog(null,
                        "Please Select Gender Details to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if("0".equals(capacity))
        {
            JOptionPane.showMessageDialog(null,
                        "Please Enter Capacity to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if("".equals(fee))
        {
            JOptionPane.showMessageDialog(null,
                        "Please Enter Required Fee ammount to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            try {
                
                termid = selects.QueryTermDetails.getTermID(termname, year);
                sqlinserts.NewResidence.createNewResidence(termid,residencename, Integer.parseInt(capacity), gender, Double.parseDouble(fee));
                 JOptionPane.showMessageDialog(null, "New Residence Details Have been Saved \n" +
                        "Press Ok to Continue", "Success", JOptionPane.INFORMATION_MESSAGE);
                 saved=true;
                 btnok.setEnabled(true);
                 
                 counter++;
                 if(counter>=3)
                 {
                     constructor();
                 }
                 
            } catch (SQLException ex) {
                Logger.getLogger(NewResidence.class.getName()).log(Level.SEVERE, null, ex);
                
                 if(ex.getErrorCode() == 1062)
                {
                JOptionPane.showMessageDialog(null, "The Residence You are Trying to Create Has Already Been Created Before. \n" +
                        "Press Ok to continue", "Warning "+ex.getErrorCode(), JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                JOptionPane.showMessageDialog(null, "Some unexpected error occured \n" +
                        "Please contact the system administrator", "Error ", JOptionPane.ERROR_MESSAGE);
                }
                this.hide();
            }
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jrterm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrterm1ActionPerformed
        // TODO add your handling code here:
        if(jrterm1.isSelected()==true)
        {
            jrterm2.setSelected(false);
            jrterm3.setSelected(false);
        }
    }//GEN-LAST:event_jrterm1ActionPerformed

    private void jrterm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrterm2ActionPerformed
        // TODO add your handling code here:
        if(jrterm2.isSelected()==true)
        {
        jrterm1.setSelected(false);
        jrterm3.setSelected(false);
        }
    }//GEN-LAST:event_jrterm2ActionPerformed

    private void jrterm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrterm3ActionPerformed
        // TODO add your handling code here:
        if(jrterm3.isSelected()==true)
        {
         jrterm1.setSelected(false);
         jrterm2.setSelected(false);
        }
    }//GEN-LAST:event_jrterm3ActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        // TODO add your handling code here:
         if(saved==true)
        {
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "" +
                        "Please Save Residence Details to Exit", "Success", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnokActionPerformed

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
            java.util.logging.Logger.getLogger(NewResidence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewResidence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewResidence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewResidence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewResidence().setVisible(true);
            }
        });
    }
   //Thread to update the form once the class has been created
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnok;
    private javax.swing.JComboBox cmbgender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jrterm1;
    private javax.swing.JRadioButton jrterm2;
    private javax.swing.JRadioButton jrterm3;
    private javax.swing.JSpinner spncapacity;
    private javax.swing.JFormattedTextField tffee;
    private javax.swing.JTextField tfresidencename;
    // End of variables declaration//GEN-END:variables
}
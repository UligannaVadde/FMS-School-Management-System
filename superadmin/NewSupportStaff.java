/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superadmin;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author franq
 */


public class NewSupportStaff extends javax.swing.JFrame {

    /**
     * Creates new form NewSupportStaff
     */
    private java.util.Date today;
    private static int userid;
    
    public NewSupportStaff(int usrd) {
        initComponents();
        userid = usrd;
        today = new java.util.Date();
        this.setTitle("New Support Staff");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        staffdetailspanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbstaffgender = new javax.swing.JComboBox();
        cmbstafftitle = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jtfsurname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtffirstname = new javax.swing.JTextField();
        jtflastname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtfjobtitle = new javax.swing.JTextField();
        jbtcancel = new javax.swing.JButton();
        jbtsave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtarole = new javax.swing.JTextArea();
        jtfnationalid = new javax.swing.JFormattedTextField();
        jXDOB = new com.toedter.calendar.JDateChooser();
        btncontinue = new javax.swing.JButton();
        btnok = new javax.swing.JButton();
        lblsaved = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Support staff");
        setIconImage(selects.QueryMainDetails.setIcon());
        setResizable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 240));
        jLabel6.setText("Enter The Support Staff Details");

        staffdetailspanel.setForeground(new java.awt.Color(0, 0, 240));

        jLabel1.setForeground(new java.awt.Color(0, 0, 240));
        jLabel1.setText("National ID");

        jLabel2.setForeground(new java.awt.Color(0, 0, 240));
        jLabel2.setText("Gender");

        jLabel10.setForeground(new java.awt.Color(0, 0, 240));
        jLabel10.setText("Title");

        cmbstaffgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Male", "Female" }));

        cmbstafftitle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Mr", "Mrs", "Miss", "Dr", "Prof" }));
        cmbstafftitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbstafftitleActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(0, 0, 240));
        jLabel11.setText("Surname");

        jLabel12.setForeground(new java.awt.Color(0, 0, 240));
        jLabel12.setText("First Name");

        jLabel13.setForeground(new java.awt.Color(0, 0, 240));
        jLabel13.setText("Last Name");

        jLabel14.setForeground(new java.awt.Color(0, 0, 240));
        jLabel14.setText("Date of Birth");

        jLabel15.setForeground(new java.awt.Color(0, 0, 240));
        jLabel15.setText("Job Title");

        jLabel16.setForeground(new java.awt.Color(0, 0, 240));
        jLabel16.setText("Role");

        jbtcancel.setText("Cancel");
        jbtcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtcancelActionPerformed(evt);
            }
        });

        jbtsave.setText("Save");
        jbtsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtsaveActionPerformed(evt);
            }
        });

        jtarole.setColumns(20);
        jtarole.setRows(5);
        jScrollPane2.setViewportView(jtarole);

        try {
            jtfnationalid.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfnationalid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfnationalidActionPerformed(evt);
            }
        });

        btncontinue.setText("Continue");
        btncontinue.setEnabled(false);
        btncontinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinueActionPerformed(evt);
            }
        });

        btnok.setText("Ok");
        btnok.setEnabled(false);
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout staffdetailspanelLayout = new javax.swing.GroupLayout(staffdetailspanel);
        staffdetailspanel.setLayout(staffdetailspanelLayout);
        staffdetailspanelLayout.setHorizontalGroup(
            staffdetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffdetailspanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(staffdetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffdetailspanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jXDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffdetailspanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfnationalid, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffdetailspanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbstaffgender, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffdetailspanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(staffdetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtcancel)
                            .addComponent(cmbstafftitle, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(staffdetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(staffdetailspanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(staffdetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffdetailspanelLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtflastname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffdetailspanelLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(jtffirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffdetailspanelLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffdetailspanelLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfjobtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(staffdetailspanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtsave)
                        .addGap(48, 48, 48)
                        .addComponent(btnok)
                        .addGap(21, 21, 21)))
                .addGap(32, 32, 32)
                .addGroup(staffdetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffdetailspanelLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffdetailspanelLayout.createSequentialGroup()
                        .addComponent(btncontinue)
                        .addGap(82, 82, 82))))
        );
        staffdetailspanelLayout.setVerticalGroup(
            staffdetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffdetailspanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(staffdetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(staffdetailspanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(staffdetailspanelLayout.createSequentialGroup()
                        .addGroup(staffdetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbstaffgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jtfsurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(51, 51, 51)
                        .addGroup(staffdetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jXDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(staffdetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(jtffirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)
                        .addGroup(staffdetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfnationalid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel13)
                            .addComponent(jtflastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(staffdetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfjobtitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel10)
                            .addComponent(cmbstafftitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(staffdetailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtcancel)
                            .addComponent(jbtsave)
                            .addComponent(btncontinue)
                            .addComponent(btnok))
                        .addGap(27, 27, 27))))
        );

        lblsaved.setForeground(new java.awt.Color(204, 0, 51));
        lblsaved.setText("Contacts Saved");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(staffdetailspanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel6)
                .addGap(44, 44, 44)
                .addComponent(lblsaved)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsaved))
                .addGap(18, 18, 18)
                .addComponent(staffdetailspanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbstafftitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbstafftitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbstafftitleActionPerformed

    private void jbtcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtcancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtcancelActionPerformed

    private void jbtsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsaveActionPerformed
        // TODO add your handling code here:
        String gender,title,nationalid,surname,fname,lname,dob,jobtitle,role;

        java.util.Date utildate = jXDOB.getDate();

        java.sql.Date sqldate = new java.sql.Date(utildate.getYear(),utildate.getMonth(),utildate.getDate());
        java.sql.Date todaysqldate = new java.sql.Date(today.getYear(), today.getMonth(), today.getDate());

        gender = cmbstaffgender.getSelectedItem().toString().toUpperCase();
        title = cmbstafftitle.getSelectedItem().toString().toUpperCase();
        nationalid = jtfnationalid.getText().toUpperCase();
        dob = sqldate.toString().toUpperCase();

        surname = jtfsurname.getText().toUpperCase();
        fname = jtffirstname.getText().toUpperCase();
        lname = jtflastname.getText().toUpperCase();
        jobtitle = jtfjobtitle.getText().toUpperCase();
        role = jtarole.getText().toUpperCase();

        if("SELECT".equals(gender)||gender == null||"".equals(gender))
        {
            JOptionPane.showMessageDialog(null,
                "Please Select Staffs' Gender to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if("".equals(dob)||dob==null||sqldate==todaysqldate)
        {
            JOptionPane.showMessageDialog(null,
                "Please Enter  Staffs' Date of Birth to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }

        else if(nationalid==null||"".equals(nationalid)||"        ".equals(nationalid))
        {
            JOptionPane.showMessageDialog(null,
                "Please Enter  Staffs' National ID number to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }

        else if("SELECT".equals(title)||title == null ||"".equals(title))
        {
            JOptionPane.showMessageDialog(null,
                "Please Select Staffs' Title to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }

        else if("".equals(surname)||surname == null)
        {
            JOptionPane.showMessageDialog(null,
                "Please Enter  Staffs' Surname to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if("".equals(fname)||fname == null)
        {
            JOptionPane.showMessageDialog(null,
                "Please Enter  Staffs' First Name to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if("".equals(lname)||lname == null)
        {
            JOptionPane.showMessageDialog(null,
                "Please Enter  Staffs' Last Name to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if("".equals(jobtitle)||jobtitle == null)
        {
            JOptionPane.showMessageDialog(null,
                "Please Enter  Staffs' Job Title to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            try {
                // System.out.println(+" "+title+" "+nationalid+" "+dob+" "+surname+" "+fname+" "+lname+" "+jobtitle+" "+role);
                
                sqlinserts.NewSupportStaff.registerSupport_staff(nationalid, gender, title, surname, fname, lname, dob, jobtitle, role);          
                JOptionPane.showMessageDialog(null, "Support Staff Details Successfully Saved\n","Success", JOptionPane.INFORMATION_MESSAGE);
                this.lblsaved.setText("Details Saved");
                this.btnok.setEnabled(true);
                this.btncontinue.setEnabled(true);
            }
            catch (SQLException ex) {
                Logger.getLogger(SuperAdmin.class.getName()).log(Level.SEVERE, null, ex);
                if(ex.getErrorCode() == 1062)
                {
                JOptionPane.showMessageDialog(null, "The Support Staff Information   Has Already Been Saved Before. \n" +
                        "Press Ok to continue", "Warning "+ex.getErrorCode(), JOptionPane.WARNING_MESSAGE);
                }
                else
                JOptionPane.showMessageDialog(null, "Some unexpected error occured \n" +
                    "Please contact the system administrator", "Error "+ex.getErrorCode(), JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_jbtsaveActionPerformed

    private void jtfnationalidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfnationalidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfnationalidActionPerformed

    private void btncontinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinueActionPerformed
        // TODO add your handling code here:
        if(selects.QuerySupportStaffDetails.getLastContact() != selects.QuerySupportStaffDetails.getCurrentContactID())
        {
            JOptionPane.showMessageDialog(null,
                "Please Save Details First\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            NewSupportStaffContact newcontacts = new NewSupportStaffContact(userid);
            newcontacts.main(new String[9]);
            this.hide();
        }

    }//GEN-LAST:event_btncontinueActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
         if(selects.QuerySupportStaffDetails.getLastContact() != selects.QuerySupportStaffDetails.getCurrentContactID())
        {
            JOptionPane.showMessageDialog(null,
                "Please Save Details First\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
           this.dispose();
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
            java.util.logging.Logger.getLogger(NewSupportStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewSupportStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewSupportStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewSupportStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewSupportStaff(userid).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncontinue;
    private javax.swing.JButton btnok;
    private javax.swing.JComboBox cmbstaffgender;
    private javax.swing.JComboBox cmbstafftitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jXDOB;
    private javax.swing.JButton jbtcancel;
    private javax.swing.JButton jbtsave;
    private javax.swing.JTextArea jtarole;
    private javax.swing.JTextField jtffirstname;
    private javax.swing.JTextField jtfjobtitle;
    private javax.swing.JTextField jtflastname;
    private javax.swing.JFormattedTextField jtfnationalid;
    private javax.swing.JTextField jtfsurname;
    public javax.swing.JLabel lblsaved;
    private javax.swing.JPanel staffdetailspanel;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem.courseregistration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import studentmanagementsystem.dbconnect;

/**
 *
 * @author dess
 */
public class course_registration extends javax.swing.JInternalFrame {
PreparedStatement pst=null;
Connection conn=null;
ResultSet rs=null;
    /**
     * Creates new form course_registration
     */
    public course_registration() {
        initComponents();
        fillcombo();
        fillcombo2();
    }
    private void fillcombo()
    {
        conn=dbconnect.ConnectDB();
        
        try
        {
          String sql="select * from student_course_registration";
          pst=conn.prepareStatement(sql);
          rs=pst.executeQuery();
          
          while(rs.next())
          {
              String name=rs.getString("student_id");
              jComboBox1.addItem(name);
          }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    private void fillcombo2()
    {
        conn=dbconnect.ConnectDB();
        
        try
        {
          String sql="select * from courses";
          pst=conn.prepareStatement(sql);
          rs=pst.executeQuery();
          
          while(rs.next())
          {
              String name=rs.getString("course_name");
              jcoursename.addItem(name);
          }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public void executeQuery(String query,String message)
{
    Connection conn=dbconnect.ConnectDB();
    Statement st;
    try
    {
        st=conn.createStatement();
        if((st.executeUpdate(query)) ==1)
        {
            JOptionPane.showMessageDialog(null, "Data"+message+"Successfully");
        }
        else{
            JOptionPane.showMessageDialog(null, "Data Not"+message);
        }
        
    }
    catch(Exception ex){
        ex.printStackTrace();
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jregistrationid = new javax.swing.JTextField();
        jfeespercourse = new javax.swing.JTextField();
        jstartdate = new javax.swing.JTextField();
        jenddate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jcoursename = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Course Registration");
        setToolTipText("");

        jButton2.setText("Clear");

        jLabel1.setText("Registration ID");

        jLabel2.setText("Student ID");
        jLabel2.setToolTipText("");

        jLabel3.setText("Course Name");

        jLabel4.setText("Fees Per Course");

        jLabel5.setText("Start Date");

        jLabel6.setText("End Date");

        jregistrationid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jregistrationidActionPerformed(evt);
            }
        });

        jfeespercourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jfeespercourseMouseClicked(evt);
            }
        });
        jfeespercourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfeespercourseActionPerformed(evt);
            }
        });

        jstartdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jstartdateMouseClicked(evt);
            }
        });

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setToolTipText("");

        jcoursename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcoursenameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jenddate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jstartdate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jfeespercourse, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jregistrationid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcoursename, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jregistrationid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcoursename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jfeespercourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jstartdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jenddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jregistrationidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jregistrationidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jregistrationidActionPerformed

    private void jfeespercourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfeespercourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfeespercourseActionPerformed

    private void jstartdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jstartdateMouseClicked
        // TODO add your handling code here:
        Date d=new Date();
        jstartdate.setText(d.toString());
    }//GEN-LAST:event_jstartdateMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String query="UPDATE sms.student_course_registration SET registration_id='"+jregistrationid.getText()+"',"
                + "course_name='"+jcoursename.getSelectedItem()+"', start_date='"+jstartdate.getText()+"',"
        + "end_date='"+jenddate.getText()+"' WHERE student_id="+jComboBox1.getSelectedItem();
        executeQuery(query,"Updated");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcoursenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcoursenameActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jcoursenameActionPerformed

    private void jfeespercourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jfeespercourseMouseClicked
        // TODO add your handling code here:
        // conn=dbconnect.ConnectDB();
        //String query="Select fee from courses where course_name="+jcoursename.getSelectedItem();
       
    }//GEN-LAST:event_jfeespercourseMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> jcoursename;
    private javax.swing.JTextField jenddate;
    private javax.swing.JTextField jfeespercourse;
    private javax.swing.JTextField jregistrationid;
    private javax.swing.JTextField jstartdate;
    // End of variables declaration//GEN-END:variables
}

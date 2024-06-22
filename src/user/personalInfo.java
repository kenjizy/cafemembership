
package user;

import config.Session;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class personalInfo extends javax.swing.JFrame {

 
    public personalInfo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        email = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 125, -1, -1));

        email.setBackground(new java.awt.Color(51, 51, 51));
        email.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        email.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 191, 233, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Username: ");
        email.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 50));
        email.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 97, 236, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Email:");
        email.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 40, 40));

        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        email.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 145, 236, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Name:");
        email.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 40, 27));
        email.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 49, 236, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("ID:");
        email.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 56, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Password:");
        email.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        email.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 230, 30));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("UPDATE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        email.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 304, 98, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Change Password");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        email.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 278, 98, 20));

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        email.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 304, 99, -1));

        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 360, 340));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ACCOUNT DETAILS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public String emaill,usern;
    public boolean Check(){
    dbConnector dbc = new dbConnector();
    try{
        String query="SELECT* FROM acctbl WHERE (u_username = '"+username.getText()+"' OR u_email = '"+em.getText()+"') AND u_id!= '"+id.getText()+"'";
     ResultSet rs = dbc.getData(query);
     if(rs.next()){     
       emaill=rs.getString("Email");      
         if(emaill.equals(em.getText())){
             JOptionPane.showMessageDialog(null,"Email is already used");
              em.setText("");
         }
        
       usern=rs.getString("Username");
     if(usern.equals(username.getText())){
               JOptionPane.showMessageDialog(null,"Username is already used");
               username.setText("");
         }   
       
          return true;
     }else{
         return false;
     }
   
    }catch(SQLException ex){
        System.out.println(""+ex);
        return false;
    }
}
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
  Session ses =  Session.getInstance();
         name.setText(""+ses.getName());
         id.setText(""+ses.getId());
         username.setText(""+ses.getUsername());
        em.setText(""+ses.getEmail());
        password.setText(""+ses.getPassword()); 
       
    }//GEN-LAST:event_formWindowActivated

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dbConnector dbc = new dbConnector();

        if(Check()){
            System.out.println("Duplicated Information");
        }else{
            dbc.updateData("UPDATE tbl_user SET u_name='"+name.getText()+"',u_username='"+username.getText()+"',u_password='"+password.getText()+"',"
                + "u_email='"+em.getText()+"' WHERE u_id='"+id.getText()+"'");

            id.setText("");
            name.setText("");
            em.setText("");
            username.setText("");
            password.setText("");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        changepassword cp=new changepassword();
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

  
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
            java.util.logging.Logger.getLogger(personalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personalInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField em;
    private javax.swing.JPanel email;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}

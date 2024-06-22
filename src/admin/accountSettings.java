
package admin;

import config.Session;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import user.changepassword;

public class accountSettings extends javax.swing.JInternalFrame {

  
    public accountSettings() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi=(BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
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
        jLabel1 = new javax.swing.JLabel();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Username: ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Email:");

        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Name:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("ID:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Password:");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setText("UPDATE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Change Password");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout emailLayout = new javax.swing.GroupLayout(email);
        email.setLayout(emailLayout);
        emailLayout.setHorizontalGroup(
            emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailLayout.createSequentialGroup()
                .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emailLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(emailLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emailLayout.createSequentialGroup()
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emailLayout.createSequentialGroup()
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4))))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(emailLayout.createSequentialGroup()
                        .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(emailLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(emailLayout.createSequentialGroup()
                                .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emailLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(emailLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(emailLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel13)))
                                .addGap(35, 35, 35)))
                        .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(username)
                            .addComponent(em, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(6, 6, 6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        emailLayout.setVerticalGroup(
            emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emailLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 340, 350));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ACCOUNT DETAILS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        pack();
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
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
         Session ses =  Session.getInstance();
         name.setText(""+ses.getName());
         id.setText(""+ses.getId());
         username.setText(""+ses.getUsername());
        em.setText(""+ses.getEmail());
        password.setText(""+ses.getPassword());    
    }//GEN-LAST:event_formInternalFrameActivated

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        changepassword cp=new changepassword();
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField em;
    private javax.swing.JPanel email;
    private javax.swing.JTextField id;
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

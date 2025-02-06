import java.awt.Color;
public class loginform extends javax.swing.JFrame {

  
    public loginform() {
        initComponents();
    }

    Color bodycolor = new Color(255,204,102);
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bodycolor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userfield = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        loginbtm = new javax.swing.JButton();
        createbtm = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        passfield = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/small.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -30, 500, 640));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 610));

        bodycolor.setBackground(new java.awt.Color(255, 204, 102));
        bodycolor.setForeground(new java.awt.Color(255, 204, 102));
        bodycolor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel2.setText("BILLS PAYMENT SYSTEM");
        bodycolor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 380, 60));

        userfield.setBackground(new java.awt.Color(255, 204, 102));
        userfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        userfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userfieldActionPerformed(evt);
            }
        });
        bodycolor.add(userfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 280, 40));

        username.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        username.setText("USERNAME");
        bodycolor.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 80, -1));

        password.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        password.setText("PASSWORD");
        bodycolor.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 80, -1));

        loginbtm.setBackground(new java.awt.Color(255, 255, 255));
        loginbtm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loginbtm.setText("LOGIN");
        loginbtm.setBorder(null);
        loginbtm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginbtmMouseEntered(evt);
            }
        });
        loginbtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtmActionPerformed(evt);
            }
        });
        bodycolor.add(loginbtm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 140, 40));

        createbtm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        createbtm.setText("CREATE ACCOUNT");
        bodycolor.add(createbtm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 230, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("PAY YOUR BILLS ON TIME!");
        bodycolor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 260, -1));

        passfield.setBackground(new java.awt.Color(255, 204, 102));
        passfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        bodycolor.add(passfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 280, 40));

        jPanel4.add(bodycolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 440, 610));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userfieldActionPerformed

    private void loginbtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginbtmActionPerformed

    private void loginbtmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtmMouseEntered
        loginbtm.setBackground(bodycolor);
    }//GEN-LAST:event_loginbtmMouseEntered

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
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodycolor;
    private javax.swing.JButton createbtm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton loginbtm;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JLabel password;
    private javax.swing.JTextField userfield;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;

public class Operations extends javax.swing.JFrame {

   
    public Operations() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRollno = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Enter Roll No. ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("City");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Age");

        txtRollno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRollno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRollnoKeyReleased(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCityKeyReleased(evt);
            }
        });

        txtAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRollno)
                            .addComponent(txtName)
                            .addComponent(txtCity)
                            .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addGap(59, 59, 59)
                        .addComponent(btnUpdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRollno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnAdd))
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
         try{
        String url="jdbc:mysql://localhost:3306/college";
        Connection con=DriverManager.getConnection(url,"root","javacore");
        PreparedStatement ps= con.prepareStatement("Select *from student"+ " where rollno=? ");
        ps.setInt(1,Integer.parseInt(txtRollno.getText()));
        
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()){
            JOptionPane.showMessageDialog(this,"Record Found!!");
            
            //txtCity.setText(rs.getObject(3).toString());
            txtName.setText(rs.getString(2));
            txtCity.setText(rs.getString(3));
            txtAge.setText(String.valueOf(rs.getString(4)));
        }
        else{
            txtName.setText(" ");
            txtCity.setText(" ");
            txtAge.setText(" ");
            JOptionPane.showMessageDialog(this,"Record not found!!");
        }
        
        rs.close();
        ps.close();
        con.close();
       } 
        
        catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error : "+ex.getMessage());
    }//GEN-LAST:event_btnSearchActionPerformed
    }
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        try{
        String url="jdbc:mysql://localhost:3306/college";
        Connection con=DriverManager.getConnection(url,"root","javacore");
        PreparedStatement ps= con.prepareStatement("delete from student"+ " where rollno=? ");
        ps.setInt(1,Integer.parseInt(txtRollno.getText()));
        
        txtName.setText(" ");
        txtCity.setText(" ");
        txtAge.setText(" ");
        ps.executeUpdate();
         JOptionPane.showMessageDialog(this,"Record Deleted!!");
        
        }
         
      catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error : "+ex.getMessage());
      }    
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try{
        String url="jdbc:mysql://localhost:3306/college";
        Connection con=DriverManager.getConnection(url,"root","javacore");
        PreparedStatement ps= con.prepareStatement("update student"+" set name = ? , city = ? , age = ?"
                                                   + " where rollno = ? ");
        
        ps.setString(1,txtName.getText());
        ps.setString(2,txtCity.getText());
        ps.setInt(3,Integer.parseInt(txtAge.getText()));
        ps.setInt(4,Integer.parseInt(txtRollno.getText()));
        
        ps.executeUpdate();
        JOptionPane.showMessageDialog(this,"Record Updated !!");
    }//GEN-LAST:event_btnUpdateActionPerformed

        catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error : "+ex.getMessage());
        }    
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try{
            String url="jdbc:mysql://localhost:3306/college";
            Connection con=DriverManager.getConnection(url,"root","javacore");
            PreparedStatement ps= con.prepareStatement("insert into student values(?,?,?,?)");
              
            ps.setString(2,txtName.getText());
            ps.setString(3,txtCity.getText());
            ps.setInt(4,Integer.parseInt(txtAge.getText()));
            ps.setInt(1,Integer.parseInt(txtRollno.getText()));
             
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record Added !!");
  
        }
        
        catch(Exception ex){
           JOptionPane.showMessageDialog(this,"Error : "+ex.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtRollnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRollnoKeyReleased
        // TODO add your handling code here:
        
        switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                txtName.requestFocusInWindow();
                break;
        }
    }//GEN-LAST:event_txtRollnoKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                txtCity.requestFocusInWindow();
                break;
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyReleased
        // TODO add your handling code here:
        switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                txtAge.requestFocusInWindow();
                break;
        }
    }//GEN-LAST:event_txtCityKeyReleased
       
        
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
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRollno;
    // End of variables declaration//GEN-END:variables
}

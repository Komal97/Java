
import java.sql.*;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Update extends javax.swing.JFrame {

    public Update() {
        initComponents();
         LocalDate dd=LocalDate.now();
         txtOut.setText(String.valueOf(dd));
         
         txtOut.setEditable(false);
      //   txtTotal.setEditable(false);
         btnSearch.setIcon(new ImageIcon(getClass().getResource("search-button - Copy.png")));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtOut = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDue = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtPaid = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FINAL UPDATE");

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel4.setText("Day OUT ");

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jLabel5.setText("(yyyy/mm/dd)");

        txtOut.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel6.setText("Room No.");

        txtNo.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel7.setText("Name");

        txtName.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel8.setText("Total (in Rs.)");

        txtTotal.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel9.setText("Due (in Rs.)");

        txtDue.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel10.setText("Paid (in Rs.)");

        TxtPaid.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N

        btnUpdate.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel2.setText("Status");

        txtStatus.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N

        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(131, 131, 131))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel2))
                .addGap(69, 69, 69)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNo)
                    .addComponent(txtName)
                    .addComponent(txtOut)
                    .addComponent(txtTotal)
                    .addComponent(txtDue)
                    .addComponent(TxtPaid, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(txtStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(txtDue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtPaid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnUpdate)
                .addGap(22, 22, 22))
        );

        btnBack.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("      UPDATE STATUS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        Administrator ad=new Administrator();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        String url="jdbc:mysql://localhost:3306/hotel";
        Connection con=null;
     try{
          con=DriverManager.getConnection(url,"root","javacore");
          con.setAutoCommit(false);
          
          PreparedStatement ps=con.prepareStatement("Update rooms set RoomStatus=?"
                                                  +" where RoomNo=? ");
          ps.setString(1,txtStatus.getText());
          ps.setInt(2, Integer.parseInt(txtNo.getText()));
          ps.executeUpdate();
         
          PreparedStatement ps1=con.prepareStatement("update reservation set total=?,Due=?,Paid=?"
                                                   + " where RoomNo=? ");
          ps1.setInt(1, Integer.parseInt(txtTotal.getText()));
          ps1.setInt(2,Integer.parseInt(txtDue.getText()));
          ps1.setInt(3,Integer.parseInt(TxtPaid.getText()));
          ps1.setInt(4, Integer.parseInt(txtNo.getText()));
          ps1.executeUpdate();
          
          con.commit();
          JOptionPane.showMessageDialog(this,"Record Updated");
                  
        }
        
        catch(Exception ex){
            try{
               con.rollback();
            }
            catch(Exception ee){
                JOptionPane.showMessageDialog(this,"Error : "+ee.getMessage());
            }
            JOptionPane.showMessageDialog(this,"Error : "+ex.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       
       String url="jdbc:mysql://localhost:3306/hotel"; 
       Connection con=null;
        
       try{
         con=DriverManager.getConnection(url,"root","javacore");
         con.setAutoCommit(false);
         
         int paid=0,tariff=0;
         int total=0,Due=0;
         LocalDate ld=null; 
         
          PreparedStatement ps=con.prepareStatement("Select FirstName,rooms.RoomStatus, "
                                                  + "DayIn,Paid,rooms.tariff from  "
                                                  + "reservation inner join rooms on "
                                                  + "rooms.RoomNo=Reservation.RoomNo "
                                                  + "and rooms.RoomNo=? ");
          ps.setInt(1, Integer.parseInt(txtNo.getText()));
          
          ResultSet rs=ps.executeQuery();
            while(rs.next()) {
              txtName.setText(rs.getString(1));
              txtStatus.setText(rs.getString(2));
              ld=LocalDate.parse(rs.getString(3));
              paid=rs.getInt(4);
              TxtPaid.setText(String.valueOf(paid));
              tariff=rs.getInt(5);
            }
           
        PreparedStatement ps2=con.prepareStatement("Update reservation set DayOUT=? "
                                                 + " where RoomNo=? ");
                                               
       
             
            LocalDate ld1=LocalDate.now();
            Date dt=Date.valueOf(ld1);
            ps2.setDate(1, dt);
            Period p=Period.between(ld, ld1);
            total=(p.getDays()*tariff);
            txtTotal.setText(String.valueOf(total));
            
            Due=(total-paid);
            txtDue.setText(String.valueOf(Due));
            
            ps2.setInt(2,Integer.parseInt(txtNo.getText()));
            ps2.executeUpdate();
    
        con.commit();
       }
        
        catch(Exception ex){
            try{
                con.rollback();
            }
            catch(Exception ee){
                JOptionPane.showMessageDialog(this,"Error :"+ee.getMessage());
            }
            JOptionPane.showMessageDialog(this,"Error : "+ex.getMessage());
        }
    }//GEN-LAST:event_btnSearchActionPerformed
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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtPaid;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtDue;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtOut;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}

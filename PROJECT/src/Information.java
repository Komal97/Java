
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Information extends javax.swing.JFrame {

     Vector data = new Vector();
     Vector cols = new Vector();
     String url="jdbc:mysql://localhost:3306/hotel";
     
    public Information() {
        initComponents();
        
        tblData.setRowHeight(30);
        loadtable("");
    }
    
    void loadtable(String txt){
        DefaultTableModel model=(DefaultTableModel)tblData.getModel();
        model.setRowCount(0);
        
        try {
           Connection con = DriverManager.getConnection(url,"root","javacore");
           
           Statement st=con.createStatement();
           ResultSet rs;
           if(txt.equals("")){
                rs=st.executeQuery("Select rooms.RoomNo,FirstName,LastName,Address,City,"
                                      + " IdType,Adults,Children,DayIN,DayOUT,rooms.RoomStatus"
                                      + " from reservation inner join rooms"
                                      + " on rooms.roomno=reservation.roomno"); 
           }
           else{
               rs=st.executeQuery("Select rooms.RoomNo,FirstName,LastName,Address,City,"
                                      + " IdType,Adults,Children,DayIN,DayOUT,rooms.RoomStatus"
                                      + " from reservation inner join rooms"
                                      + " on rooms.roomno=reservation.roomno"
                                      + " where FirstName like '%" +txt+ "%'");
           }
          
           if(tblData.getColumnCount()==0){
               ResultSetMetaData rsm=rs.getMetaData();    
           
               for(int i=1;i<=rsm.getColumnCount();i++){
                  cols.addElement(rsm.getColumnName(i).toUpperCase());
               }
           }
           
           while(rs.next()){
               Vector row = new Vector();
               
                row.addElement(rs.getObject(1));  
                row.addElement(rs.getObject(2));
                row.addElement(rs.getObject(3));
                row.addElement(rs.getObject(4));
                row.addElement(rs.getObject(5));
                row.addElement(rs.getObject(6));
                row.addElement(rs.getObject(7));
                row.addElement(rs.getObject(8));
                row.addElement(rs.getObject(9));
                row.addElement(rs.getObject(10));
                row.addElement(rs.getObject(11));
                data.addElement(row);
           }
           tblData.setShowGrid(true);
           tblData.setModel(new DefaultTableModel(data,cols));
        }
        
        catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error : "+ex.getMessage());
        }
        
        tblData.setModel(new DefaultTableModel(data, cols));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("GUEST INFORMATION");

        btnBack.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(tblData);

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel2.setText("Enter Name ");

        txtName.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(381, 381, 381))
            .addGroup(layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        Administrator ad=new Administrator();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        
        String str=txtName.getText();
        loadtable(str);
    }//GEN-LAST:event_txtNameKeyReleased
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
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

}

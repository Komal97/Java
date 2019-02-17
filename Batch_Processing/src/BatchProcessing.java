import java.sql.*;
import javax.swing.JOptionPane;
public class BatchProcessing extends javax.swing.JFrame {

    public BatchProcessing() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDo.setText("Do Batch Processing");
        btnDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(btnDo)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(btnDo)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoActionPerformed
        // TODO add your handling code here:
        String url="jdbc:mysql://localhost:3306/college";
        Connection con=null;
        try{
           con=DriverManager.getConnection(url,"root","javacore");
           con.setAutoCommit(false);
           
           PreparedStatement ps=con.prepareStatement("insert into course values(60,'C language',3500)");
           ps.executeUpdate();
           JOptionPane.showMessageDialog(this,"Executed !!");
           
           ps=con.prepareStatement("insert into course values(70,'Core java',4000)");
           ps.executeUpdate();
           JOptionPane.showMessageDialog(this,"Executed !!");
           
           ps=con.prepareStatement("insert into course values(80,'php',4300)");
           ps.executeUpdate();
           JOptionPane.showMessageDialog(this,"Executed !!");
           
           con.commit();
           JOptionPane.showMessageDialog(this,"Committed !!");
        }
        
        catch(Exception ex){
            try{
              con.rollback();
              JOptionPane.showMessageDialog(this,"Action Rolled");
            }
            catch(Exception ee){
                JOptionPane.showMessageDialog(this,"Error : "+ee.getMessage());
            }
            JOptionPane.showMessageDialog(this,"Error : "+ex.getMessage());
        }
    }//GEN-LAST:event_btnDoActionPerformed
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
            java.util.logging.Logger.getLogger(BatchProcessing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BatchProcessing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BatchProcessing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BatchProcessing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BatchProcessing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDo;
    // End of variables declaration//GEN-END:variables

}


import java.sql.*;
import java.time.LocalDate;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Booking extends javax.swing.JFrame {

    public Booking() {
        initComponents();
        LocalDate dd=LocalDate.now();
        txtIn.setText(String.valueOf(dd));
        
        txtType.setEditable(false);
        txtBed.setEditable(false);
        txtIn.setEditable(false);
        
        cbId.setModel(new DefaultComboBoxModel<>(type));
        txtNo.setModel(new DefaultComboBoxModel<>(number));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFirst = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLast = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddr = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtAdults = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtChild = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtIn = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtPaid = new javax.swing.JTextField();
        btnBook = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        cbId = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        txtNo = new javax.swing.JComboBox<>();
        txtType = new javax.swing.JTextField();
        txtBed = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRATION");

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("RESERVATION DETAILS");

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        jLabel2.setText("First Name");

        txtFirst.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        jLabel3.setText("Last Name");

        txtLast.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        jLabel4.setText("Address");

        txtAddr.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel5.setText("Guest Information");

        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        jLabel6.setText("City ");

        txtCity.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        jLabel7.setText("State");

        txtState.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        jLabel8.setText("Country");

        txtCountry.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel9.setText("Room Information");

        jLabel10.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        jLabel10.setText("Room No.");

        jLabel11.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        jLabel11.setText("Room Type");

        jLabel12.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        jLabel12.setText("No. Of Adults");

        txtAdults.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        jLabel13.setText("No. Of Children");

        txtChild.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        jLabel14.setText("Bed Type");

        jLabel15.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        jLabel15.setText("Day IN ");

        txtIn.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        jLabel18.setText("Paid(in Rs.)");

        txtPaid.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N

        btnBook.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnBook.setText("Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel16.setText("Identification");

        lblType.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        lblType.setText("ID Type");

        cbId.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        cbId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        jLabel19.setText("ID Number");

        txtId.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N

        jLabel20.setText("(yyyy/mm/dd)");

        btnNew.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        btnNew.setText("NEW BOOKING ");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        jLabel17.setText("Status ");

        txtStatus.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N

        txtNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtNo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtNoItemStateChanged(evt);
            }
        });

        txtType.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N

        txtBed.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N

        btnCheck.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        btnCheck.setText("Check Status");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLast, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblType, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel17))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCheck)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtAdults, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                        .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPaid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                        .addComponent(txtChild, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtStatus, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                        .addComponent(txtNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtType, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtBed, javax.swing.GroupLayout.Alignment.LEADING))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnNew)))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnNew))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCheck)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(7, 7, 7))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAdults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtChild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblType)
                            .addComponent(cbId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 121, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtBed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20))
                            .addComponent(txtIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBook)
                            .addComponent(btnBack))
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    String[] type={"pancard","passport","voterid","adhaar","others"};
    String[] number={"101","102","103","104","105","106","107","108","109","110","111","112"};    
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        Administrator ad=new Administrator();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
       
        String url="jdbc:mysql://localhost:3306/hotel";
        Connection con=null;
        try{
        con=DriverManager.getConnection(url,"root","javacore");
        
        con.setAutoCommit(false);
        
        PreparedStatement ps=con.prepareStatement("insert into reservation(FirstName,LastName,"
                                                 + "Address,City,State,Country,IdType,IdNumber,"
                                                 + "RoomNo,Adults,Children,DayIN,Paid)"
                                                 + "values (?,?,?,?,?,?,"
                                                 + "?,?,?,?,?,?,?)");
     
        
            ps.setObject(1,txtFirst.getText());
            ps.setObject(2,txtLast.getText());
            ps.setObject(3,txtAddr.getText());
            ps.setObject(4,txtCity.getText());
            ps.setObject(5,txtState.getText());
            ps.setObject(6,txtCountry.getText());
            ps.setObject(7,cbId.getSelectedItem().toString());
            ps.setObject(8,txtId.getText());
            ps.setObject(9,txtNo.getSelectedItem().toString());
            ps.setObject(10,txtAdults.getText());
            ps.setObject(11,txtChild.getText());
            
            LocalDate ld=LocalDate.now();
            Date dt=Date.valueOf(ld);
            ps.setObject(12,dt);
            
            ps.setObject(13,txtPaid.getText());
       
            ps.executeUpdate();
        
            int RoomNo=Integer.parseInt(txtNo.getSelectedItem().toString());
            
            PreparedStatement ps1=con.prepareStatement("update rooms set RoomStatus=? "
                                                     + "where RoomNo= "+RoomNo);
            ps1.setObject(1,txtStatus.getText());
            ps1.executeUpdate();
            con.commit();
            
            JOptionPane.showMessageDialog(this,"Your room is Booked");
        
        }
        catch(Exception ex){
            try{
                con.rollback();
            }
            catch(Exception ee){
                JOptionPane.showMessageDialog(this,"Error :"+ee.getMessage());
            }
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_btnBookActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
     
        txtFirst.setText(" ");
        txtLast.setText(" ");
        txtAddr.setText(" ");
        txtCity.setText(" ");
        txtState.setText(" ");
        txtCountry.setText(" ");
        txtId.setText(" ");
        txtAdults.setText(" ");
        txtChild.setText(" ");
        txtIn.setText(" ");
        txtPaid.setText(" ");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        
        Available aa=new Available();
        aa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCheckActionPerformed

    private void txtNoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtNoItemStateChanged
       
        int RoomNo=Integer.parseInt(txtNo.getSelectedItem().toString());
        try{
           String url="jdbc:mysql://localhost:3306/hotel";
           Connection con=DriverManager.getConnection(url,"root","javacore"); 
           
           PreparedStatement ps=con.prepareStatement("Select RoomType,BedType from rooms "
                                                   + "where rooms.RoomNo= "+RoomNo);
           ResultSet rs=ps.executeQuery();
           
           if(rs.next()){
               txtType.setText(rs.getObject(1).toString());
               txtBed.setText(rs.getObject(2).toString());
               
           }
         }
        
        catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error : "+ex.getMessage());
        }
    }//GEN-LAST:event_txtNoItemStateChanged
    
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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnNew;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblType;
    private javax.swing.JTextField txtAddr;
    private javax.swing.JTextField txtAdults;
    private javax.swing.JTextField txtBed;
    private javax.swing.JTextField txtChild;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtFirst;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIn;
    private javax.swing.JTextField txtLast;
    private javax.swing.JComboBox<String> txtNo;
    private javax.swing.JTextField txtPaid;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables

    private void executeUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}

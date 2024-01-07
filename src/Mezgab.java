

import java.sql.*;
import java.util.Vector;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Mezgab extends javax.swing.JPanel {
    
    private static String userName = "root";
    private static String password = "01234tits";
    private static String dataconn = "jdbc:mysql://localhost:3306/Edir";
    private String Name,phonenumber ;
            
    Connection sqlconn = null;
    PreparedStatement pst = null;
    ResultSet  rst = null;
    int i,q,id,deletItem;
    private boolean motion;
    public void setName(String name){
        Name = name;
    }
     public String getName(){
        return Name;
    }
     public void setPhoneNumber(String name){
        phonenumber = name;
    }
     public String getPhoneNumber(){
        return phonenumber;
    }
     public void setMotion(boolean name){
        motion = name;
    }
     public boolean getMotion(){
        return motion;
    }
    public Mezgab() {
        initComponents();
    }

   
    public void addEventRigiter2(ActionListener e){
       famBtn.addActionListener(e);
    }
    public void addEventRigiter3(ActionListener e){
       paymentBtn.addActionListener(e);
    }
    void addEventRigiter4(ActionListener e) {
       punishmentBtn.addActionListener(e);
    }
    //=================================================start function=============================================
    
    public void upDate() {
        
        try{
         Class.forName("com.mysql.jdbc.Driver");
         sqlconn = DriverManager.getConnection(dataconn, userName, password);
         pst = sqlconn.prepareStatement("select * from members");
         rst = pst.executeQuery();
         ResultSetMetaData stData = rst.getMetaData();
         
         q = stData.getColumnCount();
         DefaultTableModel RecordTable =(DefaultTableModel)jTable1.getModel();
         RecordTable.setRowCount(0);
         
         while(rst.next()){
             Vector columnData = new Vector();
             for(i=1;i<=q;i++){
                 columnData.add(rst.getString("rono"));
                 columnData.add(rst.getString("firstName"));
                 columnData.add(rst.getString("lastName"));
                 columnData.add(rst.getString("PhoneNumber"));
                 columnData.add(rst.getString("Kebele"));
                 columnData.add(rst.getString("Deposite"));
                 columnData.add(rst.getString("RegDate"));
                 
             }
             RecordTable.addRow(columnData);
         }
        }
        catch(SQLException ex){
           JOptionPane.showMessageDialog(null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Mezgab.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    //=================================================end function=============================================
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        famBtn = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnaddNew = new javax.swing.JButton();
        paymentBtn = new javax.swing.JButton();
        punishmentBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ro.no", "First Name", "Last Name", "Phone Number", "Kebele", "Deposit", "Date of Reg.(yy-mm-dd)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 670, 142));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 110, 25));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 110, 25));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 110, 25));

        famBtn.setText("To Family Mezgab");
        add(famBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 147, 25));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 110, 25));

        jLabel1.setText("First Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, 80, 21));
        add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 53, 259, -1));
        add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 84, 259, -1));

        jLabel3.setText("Kebele");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 21));
        add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 113, 259, -1));

        jLabel4.setText("Deposite");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 167, 80, 21));
        add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 140, 259, -1));

        jLabel6.setText("P.Num +251");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 113, 80, 21));

        jLabel7.setText("Last Name");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, 80, 21));
        add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 167, 259, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mezgab");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 0, 302, 47));

        btnaddNew.setText("Add New");
        btnaddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddNewActionPerformed(evt);
            }
        });
        add(btnaddNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 110, 25));

        paymentBtn.setText("To Payment Mezgab");
        add(paymentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 147, 25));

        punishmentBtn.setText("To Punishment Mezgab");
        add(punishmentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 147, 25));

        jLabel5.setText("Date of Reg.");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 80, 21));
        add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 200, 259, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
        setMotion(false);
        upDate();
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnaddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddNewActionPerformed
        
        try{
            
         Class.forName("com.mysql.jdbc.Driver");
         sqlconn = DriverManager.getConnection(dataconn, userName, password);
         pst = sqlconn.prepareStatement("Select * From members where PhoneNumber = ?");
         pst.setString(1,txt3.getText());
         rst = pst.executeQuery();
         if(rst.next()){
             JOptionPane.showMessageDialog(null, "The Phone number already exists");
             txt3.setText("");
         }
         else{
         pst = sqlconn.prepareStatement("insert into members(firstName,lastName,PhoneNumber,Kebele,Deposite,RegDate) value (?,?,?,?,?,?)");
         pst.setString(1,txt1.getText());
         pst.setString(2,txt2.getText());
         pst.setString(3,txt3.getText());
         pst.setString(4,txt4.getText());
         pst.setString(5,txt5.getText());
         Date n = Date.valueOf(txt6.getText());
         pst.setDate(6,n);
         pst.executeUpdate();
         JOptionPane.showMessageDialog(null, "New record successfully added");
         upDate();}
        }
        catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_btnaddNewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try{
         
             sqlconn = DriverManager.getConnection(dataconn, userName, password);
         pst = sqlconn.prepareStatement("Select * From members where PhoneNumber = ?");
         pst = sqlconn.prepareStatement("update members set firstName = ?,lastName=?,PhoneNumber=?,Kebele=?,Deposite=?,RegDate=? where PhoneNumber="+getPhoneNumber());
         pst.setString(1,txt1.getText());
         pst.setString(2,txt2.getText());
         pst.setString(3,txt3.getText());
         pst.setString(4,txt4.getText());
         pst.setString(5,txt5.getText());
         Date n = Date.valueOf(txt6.getText());
         pst.setDate(6,n);
         pst.executeUpdate();
         
         JOptionPane.showMessageDialog(null, "New record successfully updated");
         upDate();
         setMotion(false);
        }
        catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        setMotion(true);
        DefaultTableModel RecordTable =(DefaultTableModel)jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        
        txt1.setText(RecordTable.getValueAt(selectedRow, 1).toString());
        txt2.setText(RecordTable.getValueAt(selectedRow, 2).toString());
        phonenumber = RecordTable.getValueAt(selectedRow, 3).toString();
        txt3.setText(phonenumber);
        txt4.setText(RecordTable.getValueAt(selectedRow, 4).toString());
        txt5.setText(RecordTable.getValueAt(selectedRow, 5).toString());
        txt6.setText(RecordTable.getValueAt(selectedRow, 6).toString());
        String name = RecordTable.getValueAt(selectedRow, 1).toString().concat(" "+RecordTable.getValueAt(selectedRow, 2).toString());
        //String phonumber = RecordTable.getValueAt(selectedRow, 3).toString();
        setName(name);
        //setPhoneNumber(phonumber);
        setMotion(true);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       try{
           if(!txt1.getText().isEmpty()){
               try{
         Class.forName("com.mysql.jdbc.Driver");
         sqlconn = DriverManager.getConnection(dataconn, userName, password);
         pst = sqlconn.prepareStatement("select * from members where firstName = ? ");
         pst.setString(1,txt1.getText());
         rst = pst.executeQuery();
         ResultSetMetaData stData = rst.getMetaData();
         
         q = stData.getColumnCount();
         DefaultTableModel RecordTable =(DefaultTableModel)jTable1.getModel();
         RecordTable.setRowCount(0);
         
         while(rst.next()){
             Vector columnData = new Vector();
             for(i=1;i<=q;i++){
                 columnData.add(rst.getString("rono"));
                 columnData.add(rst.getString("firstName"));
                 columnData.add(rst.getString("lastName"));
                 columnData.add(rst.getString("PhoneNumber"));
                 columnData.add(rst.getString("Kebele"));
                 columnData.add(rst.getString("Deposite"));
                 columnData.add(rst.getString("RegDate"));
             }
             RecordTable.addRow(columnData);
         }
        }
        catch(SQLException ex){
           JOptionPane.showMessageDialog(null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Mezgab.class.getName()).log(Level.SEVERE, null, ex);
        }  
           }
           else{
              JOptionPane.showMessageDialog(null, "please fill firstname"); 
           }
       } 
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }       
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try        { 
         Class.forName("com.mysql.jdbc.Driver");
         sqlconn = DriverManager.getConnection(dataconn, userName, password);         
         pst = sqlconn.prepareStatement("delete from members where PhoneNumber="+getPhoneNumber());        
         pst.executeUpdate();        
         
         JOptionPane.showMessageDialog(null, "Sleceted record have been successfully Deleted");
         upDate();
         setMotion(false);
        }
        catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnaddNew;
    private javax.swing.JButton famBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton paymentBtn;
    private javax.swing.JButton punishmentBtn;
    public javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    public javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    // End of variables declaration//GEN-END:variables

    
}

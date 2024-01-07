
import java.sql.*;
import java.util.Vector;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Payment extends javax.swing.JPanel {
    private static String userName = "root";
    private static String password = "01234tits";
    private static String dataconn = "jdbc:mysql://localhost:3306/Edir";
    private String phonenumber,rollnumber;
    
    Connection sqlconn = null;
    PreparedStatement pst = null;
    ResultSet  rst = null;
    int i,q,id,deletItem;

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
    }
    public void addEventRigiter(ActionListener e){
        btm.addActionListener(e);
    }
    public void setPhoneNumber(String phonenumber){
        this.phonenumber = phonenumber;
    }
    public String getPhoneNumber(){
        return phonenumber;
    }
    public void setRollNumber(String phonenumber){
        this.rollnumber = phonenumber;
    }
    public String getRollNumber(){
        return rollnumber;
    }
    public void setFullName(String name){
        txtFullName.setText(name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        btnAddnew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payment");

        jLabel7.setText("Amount");

        jLabel9.setText("Date");

        jLabel11.setText("Payer's Full Name");

        txtFullName.setEditable(false);

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        btnAddnew.setText("Add New");
        btnAddnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddnewActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btm.setText("Back to Mezgab");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ro.no", "Amount", "Date(yy-mm-dd)"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btm)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnAddnew, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnAddnew)
                        .addGap(15, 15, 15)
                        .addComponent(btnUpdate)
                        .addGap(15, 15, 15)
                        .addComponent(btnDelete)
                        .addGap(15, 15, 15)
                        .addComponent(btnReset)
                        .addGap(15, 15, 15)
                        .addComponent(btm)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void upDate() {
        
        try{
         Class.forName("com.mysql.jdbc.Driver");
         sqlconn = DriverManager.getConnection(dataconn, userName, password);
         pst = sqlconn.prepareStatement("select * from payment where PhoneNumber="+getPhoneNumber());
         rst = pst.executeQuery();
         ResultSetMetaData stData = rst.getMetaData();
         
         q = stData.getColumnCount();
         DefaultTableModel RecordTable =(DefaultTableModel)jTable1.getModel();
         RecordTable.setRowCount(0);
         
         while(rst.next()){
             Vector columnData = new Vector();
             for(i=1;i<=q;i++){
                 columnData.add(rst.getString("Rono"));
                 columnData.add(rst.getString("Amount"));
                 columnData.add(rst.getString("Date"));                 
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
    
    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try{
         Class.forName("com.mysql.jdbc.Driver");
         sqlconn = DriverManager.getConnection(dataconn, userName, password);
         pst = sqlconn.prepareStatement("update payment set Amount = ?,Date=? where Rono="+getRollNumber());
         Date n = Date.valueOf(txt2.getText());
         pst.setString(1,txt1.getText());
         pst.setDate(2,n);         
         
         pst.executeUpdate();
         JOptionPane.showMessageDialog(null, "New record successfully updated");
         upDate();
        }
        catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txt1.setText("");
        txt2.setText("");
        upDate();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddnewActionPerformed
        try{
         Class.forName("com.mysql.jdbc.Driver");
         sqlconn = DriverManager.getConnection(dataconn, userName, password);
         pst = sqlconn.prepareStatement("insert into payment(Amount,Date,PhoneNumber) value (?,?,?)");
         //pst.setString(1,txt1.getText());
         //Date n = Date.valueOf(txt2.getText());
         pst.setString(1,txt1.getText());
         pst.setString(2,txt2.getText());  
         pst.setString(3, getPhoneNumber());
         pst.executeUpdate();
         
         JOptionPane.showMessageDialog(null, "New record successfully added");
         upDate();
        }
        catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnAddnewActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       DefaultTableModel RecordTable =(DefaultTableModel)jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        
        txt1.setText(RecordTable.getValueAt(selectedRow, 1).toString());
        txt2.setText(RecordTable.getValueAt(selectedRow, 2).toString());
        
        String rn = RecordTable.getValueAt(selectedRow, 0).toString();
        setRollNumber(rn);
        System.out.println(rn);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try        { 
         Class.forName("com.mysql.jdbc.Driver");
         sqlconn = DriverManager.getConnection(dataconn, userName, password);         
         pst = sqlconn.prepareStatement("delete from payment where Rono="+getRollNumber());        
         pst.executeUpdate();
         
         JOptionPane.showMessageDialog(null, "Sleceted record have been successfully Deleted");
         upDate();
         
        }
        catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btm;
    private javax.swing.JButton btnAddnew;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txtFullName;
    // End of variables declaration//GEN-END:variables
}

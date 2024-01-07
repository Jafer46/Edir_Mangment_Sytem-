import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        //this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setResizable(false);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       Login login = new Login();
       register reg = new register();
       newPanel panel = new newPanel();
       Mezgab mezgab = new Mezgab();
       FamMezgab famMezgab = new FamMezgab();
       Payment payment = new Payment();
       Punishment punishment = new Punishment();
       
       slide.setAnimate(10);
       slide.init(login , reg, panel, mezgab,famMezgab,payment,punishment);
       //from mezgab to payment
       mezgab.addEventRigiter3(new ActionListener(){
           @Override
           
           public void actionPerformed(ActionEvent e){
               if(mezgab.getMotion()){
               slide.show(5);  
               payment.setPhoneNumber(mezgab.getPhoneNumber());
               payment.setFullName(mezgab.getName());
               payment.upDate();
               }
               else{
                    JOptionPane.showMessageDialog(null, "Please Select the rquired targate");
               }
           }
       });
       //from mezgab to punishment
       mezgab.addEventRigiter4(new ActionListener(){
           @Override
           
           public void actionPerformed(ActionEvent e){
               if(mezgab.getMotion()){
               slide.show(6);  
               punishment.setPhoneNumber(mezgab.getPhoneNumber());
               punishment.setFullName(mezgab.getName());
               punishment.upDate();
               }
               else{
                    JOptionPane.showMessageDialog(null, "Please Selecte the rquired targate");
               }
           }
       });
       
       //From Login to Mezgab
       login.addEventRigiter2(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){  
               //System.out.println(login.getMotion()+" nm");
               if(login.getMotion()){
               slide.show(3); 
               mezgab.upDate(); 
               }
               
           }
       });
       
       panel.addEventRigiter2(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               slide.show(3);                             
           }
       });
       
       
        mezgab.addEventRigiter2(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               if(mezgab.getMotion()){
               slide.show(4);               
               famMezgab.memberFullName(mezgab.getName(),mezgab.getPhoneNumber());
               famMezgab.upDate();}
                else{
                   JOptionPane.showMessageDialog(null, "Please Selecte the rquired targate");
               }               
           }
       });  
        //from FamilyMezgab to Mezgab
       famMezgab.addEventRigiter(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               slide.show(3);               
           }
       });
       //from PunishmentMezgab to Mezgab
       punishment.addEventRigiter(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               slide.show(3);               
           }
       });
       payment.addEventRigiter(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               slide.show(3);               
           }
       });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        newSlide1 = new Swing.NewSlide();
        newSlide2 = new Swing.NewSlide();
        jPanel1 = new javax.swing.JPanel();
        panelBorder1 = new Swing.panelBorder();
        slide = new Swing.PanelSlide();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 248, 118));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        slide.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout slideLayout = new javax.swing.GroupLayout(slide);
        slide.setLayout(slideLayout);
        slideLayout.setHorizontalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );
        slideLayout.setVerticalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        panelBorder1.setLayer(slide, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Swing.NewSlide newSlide1;
    private Swing.NewSlide newSlide2;
    private Swing.panelBorder panelBorder1;
    private Swing.PanelSlide slide;
    // End of variables declaration//GEN-END:variables
}

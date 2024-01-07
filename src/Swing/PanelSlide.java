
package Swing;

import java.awt.Component;
import java.util.List;
import java.util.ArrayList;
import javax.swing.Timer;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class PanelSlide extends javax.swing.JPanel {
    public PanelSlide() {
        initComponents();
        list = new ArrayList<>();
        timer = new Timer(0, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            animate();
        }});
                
    }
    private final List<Component> list;
    private final Timer timer;
     private Component comExit;
     private Component comShow;
     private int animate = 1;
     private int currentShowing;
     private boolean animateRight;
     
     public void setAnimate(int animate){
         this.animate = animate;
     }
     public int getAnimate(){
         return this.animate;
     }
     public void init(Component... com){
         if(com.length > 0){
             for(Component c : com){
                 list.add(c);
                 c.setSize(getSize());
                 c.setVisible(false);
                 this.add(c);
             }
             Component show = list.get(0);
             show.setVisible(true);
             show.setLocation(0,0);
         }
     }
     
     public void show(int index){
         if(!timer.isRunning()){
             if(list.size() > 0 && index < list.size() && index != currentShowing){
                 comShow = list.get(index);
                 comExit = list.get(currentShowing);
                 animateRight = index < currentShowing;
                 currentShowing = index;
                 comShow.setVisible(true);
                 if(animateRight){
                     comShow.setLocation(-comShow.getWidth(),0);
                 }
                 else{
                     comShow.setLocation(getWidth(),0);
                 }
                 timer.start();
             }
         }
     }
             
     
     private void animate(){
         if(animateRight){
             if(comShow.getLocation().x < 0){
                 comShow.setLocation(comShow.getLocation().x + animate,0);
                 comExit.setLocation(comExit.getLocation().x + animate,0);
             }
             else{
                 comShow.setLocation(0,0);
                 timer.stop();
                 comExit.setVisible(false);
             }
         }
         
         else{
             if(comShow.getLocation().x > 0){
                 comShow.setLocation(comShow.getLocation().x - animate,0);
                 comExit.setLocation(comExit.getLocation().x - animate,0);
             }
             else{
                 comShow.setLocation(0,0);
                 timer.stop();
                 comExit.setVisible(false);
             }
         }
     }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

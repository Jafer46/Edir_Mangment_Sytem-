/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swing;


import java.awt.Component;
import java.util.List;
import java.util.ArrayList;
import javax.swing.Timer;
import javax.swing.JLayeredPane;
class Slide extends JLayeredPane {

    public Slide() {
        list = new ArrayList<>();
    }
    
    private Timer timer;
     private Component comExit;
     private Component comShow;
     private List<Component> list;
     
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
}
